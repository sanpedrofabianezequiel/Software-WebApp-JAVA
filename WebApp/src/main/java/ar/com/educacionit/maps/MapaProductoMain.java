package ar.com.educacionit.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.ProductoServiceImpl;
import ar.com.educacionit.service.exception.ServiceException;

public class MapaProductoMain {
	
	private static ProductoService ps= new ProductoServiceImpl();
	
	
	
	
	public static void main(String[] args) throws ServiceException {
		//Creacion de MAPA
		Map<Integer, Producto> mapaProductos= new HashMap<Integer, Producto>();
		
		//Determinamos si el mapa es vacio
		boolean isMapaVacio= mapaProductos.isEmpty();
		
		
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
		
		
		
		
		System.out.println("---------------------------------");
		
		//Claves
		Set<Integer> llaves=mapaProductos.keySet();
		//Recoremos las claves y  los valores del mismo
		for (Integer item : llaves) {
			
			Producto update= mapaProductos.get(item);
			
			if (item.equals(2)) {
				//Segun la clave obtenemos el valor
				Float values=	(float) (mapaProductos.get(item).getPrecio() * 1.1);
				//Setiamos el valor
				mapaProductos.get(item).setPrecio(values);
				System.out.println("Precio actual: "+values);
				
				//Actualizamos en la base de datos
				System.out.print("El producto que se actualiza es: => ");
				ps.actualizarProducto(update);
				
			}
			
		}
		
		//MAP.ENTRY<> DEVUELVE EL PAR K| V
		//Devuelve un Entry de CLAVE + VALOR
		//Set<Entry<Integer,Producto>> mapEntry=	mapaProductos.entrySet();
		
		//Con Iterator recorro el Iterator
		//Iterator<Entry<Integer, Producto>> itEntry=	mapEntry.iterator();
		
		Iterator<Entry<Integer, Producto>> itEntry=	mapaProductos.entrySet().iterator();
		while(itEntry.hasNext()) {
			Entry<Integer, Producto> rEntry = itEntry.next();
			int key= rEntry.getKey();
			Producto value= rEntry.getValue();
			
		}
		
		
	
		
	}

}
