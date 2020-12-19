package ar.com.educacionit.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.exeptions.DaoException;
import ar.com.educacionit.exeptions.ProductoNoExisteException;

/*
 * 
 * Aquie vamos a tener el ABM - CRUD
 * 
 * 
 * */
public interface ProductoDAO {

	public Producto create(Producto producto) throws Exception;
	public Producto getProductoById(int id) throws Exception;
	public Collection<Producto> findAll() throws Exception;
	public Producto updateProducto(Producto producto) throws Exception;
	public Producto deleteProducto(int id) throws DaoException,Exception,ProductoNoExisteException;
	public Producto deleteProducto(String codiStringcodigo) throws SQLException, Exception;
	public Producto deleteByCodigo(String cod) throws SQLException, Exception;
	
}
