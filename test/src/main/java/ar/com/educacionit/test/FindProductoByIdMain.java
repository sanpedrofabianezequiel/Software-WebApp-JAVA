package ar.com.educacionit.test;

import java.util.ArrayList;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.impl.ProductoDAOIJDBCImpl;
import ar.com.educacionit.domain.Producto;

public class FindProductoByIdMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ProductoDAO pdao= new ProductoDAOIJDBCImpl();
		
		ArrayList<Producto> productos=pdao.findAll();
		
		if (productos.size() > 0) {
			
			//Una vez que recorremos todos los produtos, buscamos el especifico por id
			//En este caso el primer Resultado
			int id= productos.get(0).getId();
			System.out.println("Buscando por ID "+ pdao.getProductoById(id).getCodigo() +" "+ pdao.getProductoById(id).getDescripcion());
			System.out.println(productos);
		}
		
	}

}
