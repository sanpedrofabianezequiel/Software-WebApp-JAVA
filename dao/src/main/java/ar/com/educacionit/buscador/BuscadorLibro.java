package ar.com.educacionit.buscador;

import ar.com.educacionit.model.Articulo;

// encapsulamiento

//herencia de clase abstracta
public class BuscadorLibro extends BuscadorBase {

	private Integer cantTotRes;
	
	public BuscadorLibro(String claveBuscada) {
		//primero el hijo llama al constructor del padre
		super(claveBuscada);
	}
	
	//y
	
	//polimorfismo con redefenicion
	/*public Articulo[] buscar() {
		
		//busca solo en tipo libro, o sea en tipo=1
		// SELECT * FROM ARTICULO WHERE TIPO = 1 AND TITULO LIKE ''
		// CREARA SOLO OBJETOS DE LIBRO
		// dejo filo el size en 3
		
		Articulo libro1 = new Libro(super.clave, 1219f, " ROWLING, J. K.", false);
		Articulo libro2 = new Libro("HARRY POTTER Y LAS RELIQU...", 2229f, " ROWLING, J. K.", false);
		Articulo libro3 = new Libro("HARRY POTTER Y EL LEGADO MALDITO", 2390f, " ROWLING, J. K.", false);
		
		Articulo[] resultados = new Articulo[] {libro1, libro2, libro3};
		
		this.cantTotRes = resultados.length;
		
		return resultados;
	}*/

	public Articulo[] buscar(boolean flag) {
		return null;
	}
	
	
	public Integer getCantTotRes() {
		return cantTotRes;
	}
	
	//implementaomos el metodo abstracto del padre
	//ctrl+space
	@Override
	public String getSQLHija() {
		
		StringBuffer consulta = new StringBuffer(" where tipo_articulo = 1");
		consulta.append(" and ");
		consulta.append(" titulo like %");
		consulta.append(this.clave);
		consulta.append("%");

		return consulta.toString();
	}
}
