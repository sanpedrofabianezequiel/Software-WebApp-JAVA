package ar.com.educacionit.exeptions;

import ar.com.educacionit.buscador.BuscadorBase;

public class NullPointerExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BuscadorBase  buscador= null;
		buscador.buscar();
		System.out.println("Fin....");
	}

}
