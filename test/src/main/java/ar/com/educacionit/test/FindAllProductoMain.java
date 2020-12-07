package ar.com.educacionit.test;

import java.util.ArrayList;

import ar.com.educacionit.dao.impl.ProductoDAOIJDBCImpl;
import ar.com.educacionit.domain.Producto;

public class FindAllProductoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductoDAOIJDBCImpl pdao= new ProductoDAOIJDBCImpl();
		
    	try {
			ArrayList<Producto> productos = pdao.findAll();
			
			for (Producto item : productos) {
				System.out.println("El producto con id: "+	item.getId() +" Codigo" + item.getCodigo() +" Descripcion: "+item.getDescripcion() + " Precio "+item.getPrecio());
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    	
	}

}
