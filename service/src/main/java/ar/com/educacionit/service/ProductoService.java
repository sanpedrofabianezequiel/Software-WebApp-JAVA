package ar.com.educacionit.service;

import java.util.List;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.exception.ServiceException;

public interface ProductoService {

	public List<Producto> obtenerTodosProductos();
	public Producto obtenerProductoPorId(int id) throws ServiceException;
}
