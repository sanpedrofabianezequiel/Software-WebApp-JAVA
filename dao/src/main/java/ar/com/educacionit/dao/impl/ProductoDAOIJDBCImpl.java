package ar.com.educacionit.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
	public Producto[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto deleteProducto(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto deleteProducto(String codiStringcodigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
