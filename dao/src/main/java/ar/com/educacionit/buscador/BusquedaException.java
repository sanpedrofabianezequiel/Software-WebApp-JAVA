package ar.com.educacionit.buscador;

import ar.com.educacionit.exeptions.checked.CredencialesInvalidasException;

public class BusquedaException extends Exception {

	public BusquedaException(String msj,CredencialesInvalidasException ex) {
		super(msj,ex);
	}
}
