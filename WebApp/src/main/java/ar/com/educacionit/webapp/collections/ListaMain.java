package ar.com.educacionit.webapp.collections;

import java.util.ArrayList;
import java.util.Collection;

import ar.com.educacionit.domain.Producto;

public class ListaMain {

	public static void main(String[] args) {

		Producto item1 = new Producto(1,"", 100f, "");
		Collection<Producto> obj= new ArrayList<Producto>();
		obj.add(item1);
		//Eliminar en un ForEcah
		//Para eliminar utilizamos la interfaz Iterator
	}

}
