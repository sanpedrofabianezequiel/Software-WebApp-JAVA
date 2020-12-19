package ar.com.educacionit.webapp;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import ar.com.educacionit.dao.comparadores.Ascendente;
import ar.com.educacionit.dao.comparadores.Descendente;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoServiceImpl;
import ar.com.educacionit.service.exception.ServiceException;

public class MainBusqueda {

	public static void main(String[] args) throws ServiceException {

		Set<String> orden = new HashSet<String>();
		orden.add("A");//Ascendente
		orden.add("D");//Descendente
		
		Collection<Producto> pds= new ProductoServiceImpl().obtenerTodosProductos();
		
		String ordenSeleccionado ="A";
		Collection<Producto> result=null;
		if (orden.contains(ordenSeleccionado)) {
			
			
			
			if (ordenSeleccionado.equalsIgnoreCase("A")) {
				result = new TreeSet<Producto>(new Ascendente());
			}else if (!ordenSeleccionado.equalsIgnoreCase("A")) {
				result = new TreeSet<Producto>(new Descendente());
			}
			
			result.addAll(pds);
		}
		System.out.println("Lista ordenada por precio "+ ordenSeleccionado + "scendente");
		for (Producto item : result) {
			System.out.println(item);
		}
		
	}

}
