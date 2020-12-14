package ar.com.educacionit.test;

import java.sql.SQLException;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.impl.ProductoDAOIJDBCImpl;
import ar.com.educacionit.domain.Producto;

public class DeleteProductoByCodigoMain {

	public static void main(String[] args) {
		ProductoDAO pda= new ProductoDAOIJDBCImpl();
 
		Producto pdDelete =null;
		try {
			pdDelete =pda.deleteProducto("a0001");
			System.out.println("Se borro el producto " + pdDelete.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
