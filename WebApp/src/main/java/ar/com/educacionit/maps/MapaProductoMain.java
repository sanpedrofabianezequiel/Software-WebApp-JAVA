package ar.com.educacionit.maps;

import java.util.HashMap;
import java.util.Map;

import ar.com.educacionit.domain.Producto;

public class MapaProductoMain {

	public static void main(String[] args) {
		//Creacion de MAPA
		Map<Integer, Producto> mapaProductos= new HashMap<Integer, Producto>();
		
		//Metodos del MAPA
		//PUT(K,V)=>:VOID || GET(K): V
		
		//Agregar elemento al mapa
		Integer clave=1;
		Producto valor= new Producto("Mate hasMpa", 1500f, "a200");
		mapaProductos.put(clave	, valor);
		
		//mostramos la informacion
		System.out.println(	mapaProductos.toString());
		
		//obtener valor
		Producto valorMap=	mapaProductos.get(clave);
		System.out.println(valorMap);
		
		
	}

}
