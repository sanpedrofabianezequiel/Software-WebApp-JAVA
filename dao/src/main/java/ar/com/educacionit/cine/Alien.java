package ar.com.educacionit.cine;

import ar.com.educacionit.cine.interfaces.IEntrada;

public class Alien implements IEntrada {

	public String getPlanetaOrigen() {
		return "Marte";
	}
	
	public Entrada getEntrada() {
		Entrada entradaAlien = new Entrada("VIP", "Abajo");
		return entradaAlien;
	}
}
