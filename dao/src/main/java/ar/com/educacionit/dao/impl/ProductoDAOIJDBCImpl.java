package ar.com.educacionit.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.domain.Producto;
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
		Long idGenerado=null;
		if (rs.next()) {
			idGenerado = rs.getLong(1);
		}
		producto.setId(idGenerado);
		return producto;
	}

	@Override
	public Producto getProductoById(Long id) {
		// TODO Auto-generated method stub
		return null;
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
			Long id= rs.getLong(1);
			String descripcion = rs.getString(2);
			Float precio= rs.getFloat(3);
			String codigo = rs.getString(4);
			Producto producto = new Producto(id, descripcion, precio, codigo);
			productos.add(producto);
		}
		
		return productos;
	}

	@Override
	public Producto updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto deleteProducto(Long id) {
		
		return null;
	}

	@Override
	public Producto deleteProducto(String codiStringcodigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
