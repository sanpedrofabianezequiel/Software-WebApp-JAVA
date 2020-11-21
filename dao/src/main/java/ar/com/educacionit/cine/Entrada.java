package ar.com.educacionit.cine;

public class Entrada {

	private String lugar;
	private String tipo;
	
	public Entrada() {
		this.lugar = "aleatorio";
		this.tipo = "comun";
	}
	
	public Entrada(String lugar, String tipo) {
		this.lugar = lugar;
		this.tipo = tipo;
	}

	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
