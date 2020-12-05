package ar.com.educacionit.domain;
/*
 * 
 * Representa la tabla PRODUCTO
 * 
 * 
 * */
public class Producto {
	private Long id;
	private String descripcion;
	private Float precio;
	private String codigo;
	
	//Constructores en el caso que venga con ID  o sin ID
	public Producto(Long id, String descripcion, Float precio, String codigo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigo = codigo;
	}
	public Producto(String descripcion, Float precio, String codigo) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigo = codigo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	
}
