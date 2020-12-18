package ar.com.educacionit.webapp.collections;

import java.util.Collection;
import java.util.HashSet;

import ar.com.educacionit.domain.Producto;

public class SetMain {

	public static void main(String[] args) {

		Producto producto= new Producto(1,"mate2", 100f, "003");
		Producto producto2= new Producto(1,"mate2", 100f, "003");
		Collection<Producto> productos= new HashSet<Producto>();
		productos.add(producto);
		productos.add(producto2);
	}

}
