package ar.com.educacionit.main;

import ar.com.educacionit.exeptions.checked.CredencialesInvalidasException;

public class AdministradorConexiones {

	private String userName;
	private String password;
	public void setUserName(String name) {
		// TODO Auto-generated method stub
		this.userName=name;
		
	}
	
	
public AdministradorConexiones(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}


//Para ir para atras es ALT +  <- 
	public void setPassword(String pass) {
		// TODO Auto-generated method stub
		this.password=pass;
	}
	//Se le adicionan las clase que Maneja o Podria Lanzar
	public Conexion obtenerConexion() throws CredencialesInvalidasException/*,ConexionesNoDisponiblesException*/{
		// Este metodo Puede lanzar este tipo de Exeption
		
		//Logica de CONEXION  a la BD
		if (!this.userName.equalsIgnoreCase("eduit") || !this.password.equalsIgnoreCase("eduit")) {
			//Lanzamos manualmente una Exceptions
			//Con Trows
			throw new CredencialesInvalidasException("Usuario/Password Invalidos");
		}
		return new Conexion();//Si sale bien envio una nueva Conexion
	}

}
