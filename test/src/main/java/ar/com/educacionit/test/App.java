package ar.com.educacionit.test;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.impl.ProductoDAOIJDBCImpl;
import ar.com.educacionit.domain.Producto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //interfaz I = new Clase que implementa la interfaz
    	ProductoDAO pdao= new ProductoDAOIJDBCImpl();
    	
    	//Invocar uno de los metodos de la interaz
    	Producto nuevoProducto= new Producto("mate listo", 100f, "a0005");
    	
    	try {
			Producto productoCreado=pdao.create(nuevoProducto);
			System.out.println("Se ha creado el producto con id: " +productoCreado.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	
    }
}
