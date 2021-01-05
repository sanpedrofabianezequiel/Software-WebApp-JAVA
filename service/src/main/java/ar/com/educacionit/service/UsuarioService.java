package ar.com.educacionit.service;

import ar.com.educacionit.domain.Usuario;
import ar.com.educacionit.service.exception.ServiceException;

public interface UsuarioService {

	public Usuario login(String username,String password) throws ServiceException;
	
}
