package ar.com.educacionit.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.comparadores.Ascendente;
import ar.com.educacionit.dao.impl.ProductoDAOIJDBCImpl;
import ar.com.educacionit.domain.Producto;

public class FindProductoByIdMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ProductoDAO pdao= new ProductoDAOIJDBCImpl();
		
		Collection<Producto> productos=pdao.findAll();
		//pdao.create(new Producto("MOUSE", 150F, "002"));
		/*if (productos.size() > 0 || !productos.isEmpty() ) {
			
			//Una vez que recorremos todos los produtos, buscamos el especifico por id
			//En este caso el primer Resultado
			int id= productos.get(0).getId();
			System.out.println("Buscando por ID "+ pdao.getProductoById(id).getCodigo() +" "+ pdao.getProductoById(id).getDescripcion());
			System.out.println(productos);
		}*/
		
		//Updaate del precio en 10%
		for (Producto item : productos) {
			Float nuevoPrecio=item.getPrecio() ;
			nuevoPrecio *= 1.1f;
			item.setPrecio(nuevoPrecio);
		}
		
		
		
		
		Iterator<Producto> it= productos.iterator();
		
		
		
		while(it.hasNext()) {
			
			//Update de producto
			Producto prdUpdate= pdao.updateProducto(it.next());
			
			
			/*int idProducto = it.next().getId();
			Producto prod= pdao.getProductoById(idProducto);
			System.out.println(prod);*/
		}
		
		
		//----------------------- COMPARATOR COMPARATOR COMPARATOR COMPARATOR
		
		//CREAMOS LA CLASE COMPARATOR
		//LA INSTANCIAMOS EN UN TREESET
		//DEVUELVE UNA COLECTION
		//ESA COLLECCION LE ENVIAMOS LA COLLECION A ORDENAR CON EL MEDOTOD ADDALL
		
		
		
		//ORDENAMIENTO DE PRODUCTO
		//EL TREESET SE LE PUEDE PONER UNA CLASE COMPARATOR
		//QUE DEVEUVLE UNA COLLECTION
		//A ESA VARIABLE COLLECTION LE ASIGNAMOS ADD ALL DE LA COLEECTION A ORDENAR
		Collection<Producto> resultAscendente	 = new TreeSet<Producto>(new Ascendente());
		
		//LLENAMOS LA COLECCION con los porductos de finAll
		resultAscendente.addAll(productos);
		
		
		
		
	}

}
