package ar.com.educacionit.service;

import java.util.List;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.impl.ProductoDAOIJDBCImpl;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.exception.ServiceException;

public class ProductoServiceImpl implements ProductoService {

	private ProductoDAO prductoDao;
	
	public ProductoServiceImpl() {
		this.prductoDao =null;
		if (true) {
			 new ProductoDAOIJDBCImpl();
		}
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
	public List<Producto> obtenerTodosProductos() {
		// TODO Auto-generated method stub
		return null;
	}
}
