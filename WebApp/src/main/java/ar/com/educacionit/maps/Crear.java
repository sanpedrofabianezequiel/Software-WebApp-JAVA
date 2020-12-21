package ar.com.educacionit.maps;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.exception.ServiceException;

public class Crear extends AccionBase implements Ejecutable {

	@Override
	public void ejecutar(Producto p) {
		
		//Obtenemos las METODOS|PROPIEDADES de la clase PADRE | ACCION BASE
		try {
			super.ps.crearProducto(p);
		} catch (ServiceException e) {
	
			e.printStackTrace();
		}
	}
	
	

}
