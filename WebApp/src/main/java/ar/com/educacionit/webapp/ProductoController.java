package ar.com.educacionit.webapp;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.ProductoServiceImpl;
import ar.com.educacionit.service.exception.ServiceException;

public class ProductoController {

	public static void Main(String[] args) {
		ProductoService ps = new ProductoServiceImpl();
		try {
			Producto producto =ps.obtenerProductoPorId(4);
			System.out.println(producto);
		} catch (ServiceException e) {
			System.err.println(e);
		}
	}
}
