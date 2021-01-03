package ar.com.educacionit.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.exeptions.DaoException;
import ar.com.educacionit.exeptions.ProductoNoExisteException;
import ar.com.educacionit.jdbc.AdministradorDeConexiones;

public class ProductoDAOIJDBCImpl implements ProductoDAO {

	@Override
	public Producto create(Producto producto) throws Exception {
		System.out.println("Creando producto..." + producto.getDescripcion());
		Connection con = AdministradorDeConexiones.obtenerConexion();
		
		//sql que voy a ejecutar
		String sql="INSERT INTO PRODUCTO (DESCRIPCION,PRECIO,CODIGO) VALUES ( '"+ producto.getDescripcion() +"', '"+ producto.getPrecio() +"' ,'"+ producto.getCodigo()+" ');";
		Statement st =con.createStatement();
		//Si se ejecuta bien la consulta y determina que ID se ingreso ultimo
		
		boolean success = st.execute(sql,Statement.RETURN_GENERATED_KEYS);
		ResultSet rs = st.getGeneratedKeys();
		
		//Si se pudo ejecutar la sentencia, dame el numero de Id
		int idGenerado=0;
		if (rs.next()) {
			idGenerado = rs.getInt(1);
		}
		producto.setId(idGenerado);
		return producto;
	}

	@Override
	public Producto getProductoById(int idaux) throws Exception {
		System.out.println("Obteniendo el producto con id :... " + idaux);
		Connection conn=null;
		Statement st =null;
		ResultSet rs=null;
		Producto producto=null;
		try {
			conn=AdministradorDeConexiones.obtenerConexion();
			conn.setAutoCommit(false);
			String sql ="SELECT * FROM PRODUCTO WHERE ID = "+ idaux;
			
			st=conn.createStatement();
		    rs= st.executeQuery(sql);
		
			if (rs.next()) {
				//alt+shif +m
				 producto = extracted(rs);
			}
			//si esta todo bien commitiamos
			conn.commit();
		}catch (Exception e) {
			conn.rollback();
			throw e;
		}finally {
			if (conn != null && !conn.isClosed()) {//Si la conexion sigue abierta
				conn.close();
			}			
			if (st != null &&  !st.isClosed()) {
				st.close();
			}
			if (rs!= null && !rs.isClosed()) {
				rs.close();
			}		
				
			
			
		}
	
		return producto;
		
		
	}

	private Producto extracted(ResultSet rs) throws SQLException {//Metodo autogenerado con ALT+SHIFT+M
		Producto producto;
		int id= rs.getInt(1);
		String descripcion = rs.getString(2);
		Float precio= rs.getFloat(3);
		String codigo = rs.getString(4);
		producto = new Producto(id, descripcion, precio, codigo);
		return producto;
	}

	@Override
	public ArrayList<Producto> findAll() throws Exception {
		System.out.println("Obteniendo todos los productos...");
		Connection con= AdministradorDeConexiones.obtenerConexion();
		
		String sql= "SELECT * FROM PRODUCTO;";
		
		Statement st= con.createStatement();
		
		ResultSet rs= st.executeQuery(sql);//Ejecuta la consulta y guarda los resultados en el RS
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		while(rs.next()) {
			//Comienza siempre desde el 1 en RESULTSET LA COLUMNA
			int id= rs.getInt(1);
			String descripcion = rs.getString(2);
			Float precio= rs.getFloat(3);
			String codigo = rs.getString(4);
			Producto producto = new Producto(id, descripcion, precio, codigo);
			productos.add(producto);
		}
		
		return productos;
	}

	@Override
	public Producto updateProducto(Producto producto) throws Exception {
		Connection con =null;
		PreparedStatement pst = null;
		ResultSet rs= null;
		Producto result =null;
		
		String sql = "UPDATE PRODUCTO SET DESCRIPCION = ?, PRECIO = ?  WHERE ID = ?";
		try {
			con = AdministradorDeConexiones.obtenerConexion();
			con.setAutoCommit(false);
			pst = con.prepareStatement(sql);
			pst.setString(1, producto.getDescripcion());
			pst.setFloat(2, producto.getPrecio());
			//pst.setString(3, producto.getCodigo());
			pst.setLong(3, producto.getId());
			pst.execute();
			con.commit();
			return getProductoById(producto.getId());
			
			
		} catch (Exception e) {
			con.rollback();
		}
		
		
		
		return result;
	}

	@Override
	public Producto deleteProducto(int id) throws DaoException,Exception,ProductoNoExisteException {
		System.out.println("Borrando Producto..");
		Producto pAElimiProducto= getProductoById(id);
		if (pAElimiProducto == null) {
			throw new ProductoNoExisteException("El producto con id: "+ id+ " no existe");
		}
		
		Connection conn=null;
		ResultSet rs= null;
		Statement st=null;
		String sql = "DELETE FROM PRODUCTO  WHERE ID = "+ id;
		try {
			conn= AdministradorDeConexiones.obtenerConexion();
			conn.setAutoCommit(false);
			
		    st = conn.createStatement();
			st.execute(sql);
			
			conn.commit();
		} catch (SQLException e) {
			conn.rollback();
			throw new DaoException("No se pudo ejecutar la consulta SQL "+ sql +" "+ e.getMessage(),e);
		}catch (Exception e) {
			conn.rollback();
			throw e;
			
		}finally {
			if (conn != null && !conn.isClosed()) {//Si la conexion sigue abierta
				conn.close();
			}			
			if (st != null &&  !st.isClosed()) {
				st.close();
			}
			if (rs!= null && !rs.isClosed()) {
				rs.close();
			}		
		}
		
		
		
		return pAElimiProducto;
	}

	//PreparedStatement
	@Override
	public Producto deleteProducto(String codigo) throws SQLException, Exception {//Delete por Codigo
		System.out.println("Borrando Producto..");
		Producto paEliminar= deleteByCodigo(codigo);
		if (paEliminar == null) {
			throw new ProductoNoExisteException("El producto con codigo: "+ codigo+ " no existe");
		}
		
		Connection conn=null;
		ResultSet rs= null;
		PreparedStatement pst=null;
		String sql = "DELETE FROM PRODUCTO  WHERE CODIGO =  ? ";
		try {
			conn= AdministradorDeConexiones.obtenerConexion();
			conn.setAutoCommit(false);			
		    pst = conn.prepareStatement(sql);
		    pst.setString(1, codigo);
		    pst.execute();
			
			conn.commit();
		} catch (SQLException e) {
			conn.rollback();
			throw new DaoException("No se pudo ejecutar la consulta SQL " +"El producto con codigo: "+ codigo+ " no existe" + sql +" "+ e.getMessage(),e);
		}catch (Exception e) {
			conn.rollback();
			throw e;
			
		}finally {
			if (conn != null && !conn.isClosed()) {//Si la conexion sigue abierta
				conn.close();
			}			
			if (pst != null &&  !pst.isClosed()) {
				pst.close();
			}
			if (rs!= null && !rs.isClosed()) {
				rs.close();
			}		
		}
		
		
		
		return paEliminar;
	}

	@Override
	public Producto deleteByCodigo(String cod) throws SQLException,Exception {
		Producto pdDelete = null;
		Connection con = null;
		PreparedStatement pst =null;
		ResultSet rs=null;
		String sql = "SELECT * FROM PRODUCTO WHERE CODIGO = ?";
		try {
			con = AdministradorDeConexiones.obtenerConexion();
			con.setAutoCommit(false);			
			pst = con.prepareStatement(sql);
			pst.setString(1, cod);			
			rs = pst.executeQuery();
			if (rs != null) {
				while(rs.next()) {
					pdDelete = new Producto(rs.getString(2), rs.getFloat(3), rs.getString(4));
				}
			}
			con.commit();
		} catch (SQLException e) {
			con.rollback();
		}catch (Exception e) {
			con.rollback();
		}
		
		
		return pdDelete;
	}

	@Override
	public Producto getProductoPorCodigo(String cod) throws SQLException, Exception {

		System.out.println("Obteniendo el producto por Codigo :... " + cod);
		Connection conn=null;
		Statement st =null;
		ResultSet rs=null;
		Producto producto=null;
		try {
			conn=AdministradorDeConexiones.obtenerConexion();
			conn.setAutoCommit(false);
			String sql ="SELECT * FROM PRODUCTO WHERE CODIGO = "+ cod;
			
			st=conn.createStatement();
		    rs= st.executeQuery(sql);
		
			if (rs.next()) {
				//alt+shif +m
				 producto = extracted(rs);
			}
			//si esta todo bien commitiamos
			conn.commit();
		}catch (Exception e) {
			conn.rollback();
			throw e;
		}finally {
			if (conn != null && !conn.isClosed()) {//Si la conexion sigue abierta
				conn.close();
			}			
			if (st != null &&  !st.isClosed()) {
				st.close();
			}
			if (rs!= null && !rs.isClosed()) {
				rs.close();
			}	
		
		}
		
		
		return producto;	
		
	}

}
