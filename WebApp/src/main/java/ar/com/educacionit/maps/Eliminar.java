package ar.com.educacionit.maps;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.exception.ServiceException;

public class Eliminar extends AccionBase implements Ejecutable{

	@Override
	public void ejecutar(Producto p) {

		try {
			Producto pdEliminado= super.ps.eliminar(p.getId());
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
