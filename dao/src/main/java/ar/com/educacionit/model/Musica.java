package ar.com.educacionit.model;

public class Musica extends Articulo {

	private float duracion;

	//ctrl + shift +s
	public Musica(String titulo, Float precio, String autor) {
		super(titulo, precio, autor);
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	
}
