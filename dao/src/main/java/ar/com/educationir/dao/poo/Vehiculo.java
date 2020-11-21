package ar.com.educationir.dao.poo;

/**
 * Clase base de los vehiculos
 * @author CX PC
 *
 */
public class Vehiculo {

	//atributos comunes
	protected String color; // ""
	protected boolean encendido;   //true|false
	protected float velocidadMaxima; // 250.100f|F
	protected double velocidadTuningMaxima;
	protected int anio;// 2020
	private String marca;
	private String modelo;
	
	//constructores
	public Vehiculo() {
		this.anio = 2020;
		this.velocidadMaxima = 110;
		this.color = "rojo";
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public double getVelocidadTuningMaxima() {
		return velocidadTuningMaxima;
	}
	public void setVelocidadTuningMaxima(double velocidadTuningMaxima) {
		this.velocidadTuningMaxima = velocidadTuningMaxima;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	//ctrl+shift+s


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
