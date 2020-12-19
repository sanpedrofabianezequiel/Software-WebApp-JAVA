package ar.com.educacionit.dao.comparadores;

import java.util.Comparator;

import ar.com.educacionit.domain.Producto;

public class Ascendente implements Comparator<Producto> {

	@Override
	public int compare(Producto arg0, Producto arg1) {
	
		return arg0.getPrecio().compareTo(arg1.getPrecio());
	}

}
