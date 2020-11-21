package ar.com.educacionit.cine;

import ar.com.educacionit.cine.interfaces.IEntrada;

public class Cliente extends Persona implements IEntrada {

	public Cliente(String nombre) {
		super(nombre);
	}

	public Entrada getEntrada() {
		return new Entrada();
	}
}
