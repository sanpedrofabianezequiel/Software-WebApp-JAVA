package ar.com.educacionit.dao;

import ar.com.educacionit.domain.Producto;

/*
 * 
 * Aquie vamos a tener el ABM - CRUD
 * 
 * 
 * */
public interface ProductoDAO {

	public Producto create(Producto producto) throws Exception;
	public Producto getProductoById(Long id);
	public Producto[] findAll();
	public Producto updateProducto(Producto producto);
	public Producto deleteProducto(Long id);
	public Producto deleteProducto(String codiStringcodigo);
	
}
