package ar.com.educacionit.maps;

import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.ProductoServiceImpl;

public abstract  class AccionBase {

	protected ProductoService ps;
	public AccionBase() {
		this.ps= new ProductoServiceImpl();
	}
}
