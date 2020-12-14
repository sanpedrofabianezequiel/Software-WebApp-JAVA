package ar.com.educacionit.exeptions;

public class DaoException extends Exception {

	public DaoException(String message, Throwable cause) {
		super(message, cause);
		// estamos reconvirtiendo una clase de Excepcion
	}

	
}
