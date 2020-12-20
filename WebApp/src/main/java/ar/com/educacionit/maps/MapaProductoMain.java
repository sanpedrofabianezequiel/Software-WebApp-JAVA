package ar.com.educacionit.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		Integer clave2=2;
		Producto valor2= new Producto("Mate hasMpa2", 1500f, "a200");
		mapaProductos.put(clave	, valor);
		mapaProductos.put(clave2	, valor2);
		
	/*	//mostramos la informacion
		System.out.println(	mapaProductos.toString());
		
		//obtener valor
		Producto valorMap=	mapaProductos.get(clave);
		System.out.println(valorMap);
		
		//Eliminar un valor del mapa
		Producto prodDelete=mapaProductos.remove(1);
		System.out.println("El HashMap esta vacio : " + mapaProductos +"\nSe elimino: "+prodDelete);
	*/
		//Metodos para obtener todas las clases
		Set<Integer> keys=	mapaProductos.keySet();
		/*for (Integer item : keys) {
			System.out.println(item);
		}*/
		
		Iterator<Integer> result= keys.iterator();
		
		while(result.hasNext()) {
			Integer valor3 =	result.next();
			System.out.println(valor3);
		}
		
		//DETERMINAMOS SI CONTIENE CLAVE, CON CONTAINS
		boolean contieneClave=	mapaProductos.containsKey(2);
		if (contieneClave) {

			System.out.println("El mapa contien la clave: "+2);	
		}else {
			System.out.println("El mapa no conetiene clave: "+2);
		}
		
	
		//Obtener valores del MAPA
		Collection<Producto> valores= mapaProductos.values();
		for (Producto item : valores) {
			System.out.println("ID:" +item.getId() +" .. "+item.getCodigo() + item.getDescripcion());
		}
	}

}
