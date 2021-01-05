package ar.com.educacionit.dao;

import java.sql.SQLException;

import ar.com.educacionit.domain.Usuario;
import ar.com.educacionit.exeptions.InvalidUserException;

public interface UsuarioDao {

	public  Usuario getByUserNameAndPassword(String username,String Password) throws InvalidUserException, SQLException;
	
	
}
