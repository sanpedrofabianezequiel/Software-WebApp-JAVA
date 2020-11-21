package ar.com.educacionit.buscador;

import ar.com.educacionit.buscador.interfaces.Mostrable;
import ar.com.educacionit.buscador.interfaces.Paginable;

// encapsulamiento

//herencia 
public class BuscadorMusica extends BuscadorBase implements Mostrable, Paginable{

	public BuscadorMusica(String claveBuscada) {
		//primero el hijo llama al constructor del padre
		super(claveBuscada);
	}
	
	//y
	/*
	//polimorfismo con redefenicion
	public Articulo[] buscar() {
		
		//busca solo en tipo libro, o sea en tipo=1
		// SELECT * FROM ARTICULO WHERE TIPO = 1 AND TITULO LIKE ''
		// CREARA SOLO OBJETOS DE LIBRO
		// dejo filo el size en 3
		
		Articulo resultado = new Musica("LUIS MIGUEL LA SERIE",915.99f, "Varios");
		
		return new Articulo[] {resultado};
	}
	*/
	
	//implementaomos el metodo abstracto del padre
	//ctrl+space
	@Override
	public String getSQLHija() {
		
		StringBuffer consulta = new StringBuffer(" where tipo_articulo = 2");
		consulta.append(" and ");
		consulta.append(" titulo like %");
		consulta.append(this.clave);
		consulta.append("%");

		return consulta.toString();
	}
	
	public String mostrar() {
		return "Mostrando BuscadorMusica";
	}
	
	public void paginar() {
		System.out.println("Paginando resultados BuscadorMusica");
	}
}
