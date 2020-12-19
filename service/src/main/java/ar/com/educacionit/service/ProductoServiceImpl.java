package ar.com.educacionit.service;

import java.util.Collection;
import java.util.List;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.impl.ProductoDAOIJDBCImpl;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.exception.ServiceException;

public class ProductoServiceImpl implements ProductoService {

	private ProductoDAO prductoDao;
	
	public ProductoServiceImpl() {
		
		this.prductoDao= new ProductoDAOIJDBCImpl();
		
	}

	@Override
	public Producto obtenerProductoPorId(int id) throws ServiceException {
		
		try {
			return this.prductoDao.getProductoById(id);
		} catch (Exception e) {
		
			throw new ServiceException("Error en la consulta del producto"+ id,e);
		}
	}

	@Override
	public Collection<Producto> obtenerTodosProductos() throws ServiceException {
		// TODO Auto-generated method stub
		try {
			return prductoDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServiceException("obteniendo todos los producto"+ e);
		}
	}
}
