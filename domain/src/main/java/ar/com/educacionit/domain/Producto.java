package ar.com.educacionit.domain;
/*
 * 
 * Representa la tabla PRODUCTO
 * 
 * 
 * */
public class Producto implements Comparable<Producto> {
	private int id;
	private String descripcion;
	private Float precio;
	private String codigo;
	
	//Constructores en el caso que venga con ID  o sin ID
	public Producto(int id, String descripcion, Float precio, String codigo) {
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
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
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
	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + ", codigo=" + codigo
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + id;
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public int compareTo(Producto o) {
		int id1=this.getId();
		int id2= o.getId();
		return  (id1-id2);
		//return this.getId().compareTo(o.getId());;
	}


/*	
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if (obj == null) {
			return result;
		}
		//Definir cuando es igual
		if (!obj.getClass().isAssignableFrom(Producto.class)) {
			return result;
			
		}
		Producto producto1= this;
		
		result = producto1.getId()== ((Producto)obj).getId() ;
		return result;
	
	}	*/
	
	
	
		
	
	
}
