package ar.com.educacionit.main;

import ar.com.educacionit.exeptions.checked.CredencialesInvalidasException;

public class ConexionDBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Conectamos a la DB
		AdministradorConexiones ac= new AdministradorConexiones("invalido","invalido");
		Conexion con ;
		
		
		try {
			
			con = ac.obtenerConexion();
			System.out.println("Intentando Conexion ....");
		} catch (CredencialesInvalidasException cie) {
			
			System.out.println("No se ha podido conectar a la db: " +cie.getMessage());

			System.out.println("No se ha podido conectar a la db: " +cie.getMsjPersonalizado());
		}
	}

}
