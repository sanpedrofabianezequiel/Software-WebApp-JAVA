package ar.com.educacionit.service;

import java.sql.SQLException;

import ar.com.educacionit.dao.UsuarioDao;
import ar.com.educacionit.dao.impl.UsuarioDaoJDBCImpl;
import ar.com.educacionit.domain.Usuario;
import ar.com.educacionit.exeptions.InvalidUserException;
import ar.com.educacionit.service.exception.ServiceException;

public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioDao usuarioDao;
	
	 public UsuarioServiceImpl() {
		this.usuarioDao = new UsuarioDaoJDBCImpl();
	}
	
	@Override
	public Usuario login(String username, String password) throws ServiceException {
		try {
			return this.usuarioDao.getByUserNameAndPassword(username, password);
		} catch (Exception e) {
			throw new ServiceException("error",e);
		}
	}

}
