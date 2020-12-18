package ar.com.educacionit.webapp.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import ar.com.educacionit.domain.Producto;

public class HasSet {

	public static void main(String[] args) {

		Long valor = 100L;
		Collection<Long> duplicado= new ArrayList<Long>();
		duplicado.add(valor);
		duplicado.add(valor);
		duplicado.add(valor);

		System.out.println(duplicado);
		//reinstanciamos para filtrar
		duplicado = new HashSet<Long>(duplicado);
		System.out.println(duplicado);
		
	}

}
