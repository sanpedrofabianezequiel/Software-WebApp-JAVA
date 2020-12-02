package ar.com.educacionit.exeptions;

import ar.com.educacionit.buscador.BuscadorBase;
import ar.com.educacionit.buscador.BusquedaException;

public class NullPointerExceptionMain {

	public static void main(String[] args) throws BusquedaException {
		// TODO Auto-generated method stub

		BuscadorBase  buscador= null;
		buscador.buscar();
		System.out.println("Fin....");
	}

}
