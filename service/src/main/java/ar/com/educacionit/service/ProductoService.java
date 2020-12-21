package ar.com.educacionit.service;

import java.util.Collection;
import java.util.List;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.exception.ServiceException;

public interface ProductoService {

	public Collection<Producto> obtenerTodosProductos() throws ServiceException;
	public Producto obtenerProductoPorId(int id) throws ServiceException;
	public Producto actualizarProducto(Producto producto) throws ServiceException;
	public Producto	crearProducto(Producto producto) throws ServiceException;
	public Producto eliminar(int id)throws ServiceException;
}
	