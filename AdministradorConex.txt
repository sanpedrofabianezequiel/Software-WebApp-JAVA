package ar.com.educacionit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {

	//Metodo que Obtiene la conexion
	public static Connection obtenerConexion() throws Exception {
		
		//Estable el nombre del driver a utilizar
		String dbDriver = "com.mysql.jdbc.Driver";
		
		//Estable la url y la base de datos a utilizar
		String dbConnString= "jdbc:mysql://localhost:3306/javaweb?serverTimezone=UTC";
		
		//Estable el Usuario de la base de datos
		String dbUser="root";
		
		String dbPassword="";
		
		//Dame una nueva instancia de la conexion DRIVER
		Class.forName(dbDriver).newInstance();
		
		//Retornamos la Conexion

		Connection conn= DriverManager.getConnection(dbConnString, dbUser, dbPassword);
		return conn;
		
	}
}
