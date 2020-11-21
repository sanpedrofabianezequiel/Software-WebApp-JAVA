package ar.com.educacionit.model;

public class Libro extends Articulo {

	private boolean texto;

	//crear un contructor parametrizado
	public Libro(String titulo, Float precio, String autor, boolean isTexto) {
		//invoco al contrutor del padre
		super(titulo, precio, autor);
		
		this.texto = isTexto;
	}
	
	public boolean isTexto() {
		return texto;
	}

	public void setTexto(boolean texto) {
		this.texto = texto;
	}
	
}
