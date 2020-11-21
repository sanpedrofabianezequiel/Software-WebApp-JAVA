package ar.com.educacionit.main;

import ar.com.educacionit.buscador.BuscadorBase;
import ar.com.educacionit.buscador.BuscadorPelicula;
import ar.com.educacionit.model.Articulo;

public class BuscadorMain {

	public static void main(String[] args) {
		
		String claveBuscadaEnLaPantalla = "Harry Potter";

		BuscadorBase buscador = new BuscadorPelicula(claveBuscadaEnLaPantalla);
		
		Articulo[] resultados = buscador.buscar();
		
		System.out.println("Mostrando...");
		
		for (Articulo articulo : resultados) {
			System.out.println(articulo.getAutor());
			System.out.println(articulo.getTitulo());
			System.out.println(articulo.getPrecio());
		}
	}

}
