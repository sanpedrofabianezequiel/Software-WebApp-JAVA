package ar.com.educacionit.dao.comparadores;

import java.util.Comparator;

import ar.com.educacionit.domain.Producto;

public class Descendente implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
	
		return o2.getPrecio().compareTo(o1.getPrecio());
	}

}
