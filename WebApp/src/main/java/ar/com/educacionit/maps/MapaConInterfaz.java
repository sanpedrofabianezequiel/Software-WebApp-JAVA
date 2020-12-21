package ar.com.educacionit.maps;

import java.util.HashMap;
import java.util.Map;

import ar.com.educacionit.domain.Producto;

public class MapaConInterfaz {

	public static void main(String[] args) {

		
		//Selecciona el combo de Accion a realizar
		/*Map<String, Class> mapaAccion= new HashMap<String, Class>();
		mapaAccion.put("Crear", Crear.class);
		mapaAccion.put("Eliminar",Eliminar.class);
		
		Map<Class, Ejecutable> mapaAcciones=new HashMap<Class, Ejecutable>();		
		mapaAcciones.put(Crear.class, new Crear());
		mapaAcciones.put(Eliminar.class, new Eliminar());
		 
		String accion= "Crear";
		
		if (mapaAccion.containsKey(accion)) {
			Class clase=mapaAccion.get(accion);//Devuelve la clase CREAR|ELIMINAR
			Ejecutable accionD = mapaAcciones.get(clase);//Recibe una CLASE.CLASS
			
			Producto p= new Producto("Maps", 100f, "022");
			accionD.ejecutar(p);
			
		}*/
		
		//----------------------OPCION OPTIMIZADA
		String opcion= "Crear";
		Producto p = new Producto("HasMap", 150f, "0146");//Producto a crear
		Map<String, Ejecutable> mapAccion= new HashMap<String, Ejecutable>();
		
		mapAccion.put("Crear", new Crear());
		mapAccion.put("Eliminar", new Eliminar());
		
		if (mapAccion.containsKey(opcion)) {
			Ejecutable result=	mapAccion.get(opcion);//Le enviamos la KEY| OPCION
			result.ejecutar(p);
			System.out.println("Producto creado");
			
		}else {
			System.out.println("No existe la accion seleccionada");
		}
		
		
		
		
		
		
	}

}
