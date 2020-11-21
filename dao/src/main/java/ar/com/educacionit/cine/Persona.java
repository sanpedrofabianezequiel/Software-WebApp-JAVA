package ar.com.educacionit.cine;

public abstract class Persona {

	protected String nombre;
	public final Integer cantidadOjos = 2;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
