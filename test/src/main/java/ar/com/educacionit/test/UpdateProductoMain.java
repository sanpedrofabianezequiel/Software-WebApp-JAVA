package ar.com.educacionit.test;

import java.util.Scanner;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.impl.ProductoDAOIJDBCImpl;
import ar.com.educacionit.domain.Producto;

public class UpdateProductoMain {

	public static void main(String[] args) {
		ProductoDAO obj= new ProductoDAOIJDBCImpl();
		
		Producto p;//En Memoria
		Producto p2;//En BD
		try {
			//Obtenemos un producto, por ID o Codigo para actualizar
			
			p = obj.getProductoById(5);			
			Scanner txt= new Scanner(System.in);
			System.out.println("Ingrese nueva descripcion");
			String nuevoDescripio = txt.nextLine();
			System.out.println("Ingrese nuevo precio");
			Float nuevoPrecio = txt.nextFloat();
		
			//Setiamos/Actualizamos el producto en memoria
			p.setDescripcion(nuevoDescripio);
			p.setPrecio(nuevoPrecio);
			System.out.println("Actualizando ... ");
			//Setiamos/Actualizamos el producto en BD
			p2= obj.updateProducto(p);
			System.out.println("Se actualizo el producto " + p2);
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
	}

}
