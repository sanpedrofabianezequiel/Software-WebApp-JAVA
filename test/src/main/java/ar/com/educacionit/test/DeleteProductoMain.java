package ar.com.educacionit.test;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.impl.ProductoDAOIJDBCImpl;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.exeptions.DaoException;
import ar.com.educacionit.exeptions.ProductoNoExisteException;

public class DeleteProductoMain {

	public static void main(String[] args) {
		ProductoDAO pdao= new ProductoDAOIJDBCImpl();
		
		Producto prod=null;
		try {
			prod = pdao.deleteProducto(4);
			System.out.println("Producto con "+prod.toString() +" a sido eliminado ");
		} catch (DaoException e) {
			e.printStackTrace();
		} catch (ProductoNoExisteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
	}

}
