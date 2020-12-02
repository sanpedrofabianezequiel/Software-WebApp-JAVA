package ar.com.educacionit.main;

import ar.com.educacionit.buscador.BuscadorBase;
import ar.com.educacionit.buscador.BuscadorLibro;
import ar.com.educacionit.buscador.BusquedaException;

public class MainClaseAbstracta {

	public static void main(String[] args) {

		//crar un buscador de libro
		BuscadorBase b = new BuscadorLibro("sapo pepe");
		
		BuscadorBase b2 = new BuscadorBase("sapo") {
			
			public String getSQLHija() {
				return null;
			}
		};
		
		try {
			b2.buscar();
		} catch (BusquedaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
