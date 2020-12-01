package ar.com.educacionit.main;

import ar.com.educacionit.buscador.BuscadorBase;
import ar.com.educacionit.buscador.BuscadorLibro;
import ar.com.educacionit.buscador.BuscadorMusica;
import ar.com.educacionit.buscador.BuscadorPelicula;
import ar.com.educacionit.buscador.interfaces.Mostrable;
import ar.com.educacionit.buscador.interfaces.Ordenable;
import ar.com.educacionit.buscador.interfaces.Paginable;
import ar.com.educacionit.model.Articulo;

public class SelectorDeBuscadoresConException {

	public static void main(String[] args) {
		
		// libro -> 1
		// musica -> 2
		Integer[] tiposBuscadores = {1,2};
		//f5/f6/f7/f8
		String claveBuscada = "Gladiador";
		//ctrl+t
		BuscadorBase[] buscadores = new BuscadorBase[tiposBuscadores.length];
		
		for(int i = 0;i < tiposBuscadores.length; i++) {
			switch (tiposBuscadores[i]) {
				case 1:
					buscadores[i] = new BuscadorLibro(claveBuscada);
					break;
				case 2: 
					buscadores[i] = new BuscadorMusica(claveBuscada);
					break;
				case 3: 
					buscadores[i] = new BuscadorPelicula(claveBuscada);
					break;
				default:
					break;
			}
		}
		
		//ejecutar la busqueda y obtener los Articulos
		Articulo[] todosLosArticulos = new Articulo[5];
		int idxArticulo = 0;
		for(BuscadorBase buscador : buscadores) {
			
			Articulo[] resultados = buscador.buscar();
			
			for(Articulo resulado : resultados) {
				todosLosArticulos[idxArticulo] = resulado;
				idxArticulo++;
			}
		}
		
		//muestro los resultados
		for (Articulo articulo : todosLosArticulos) {
			if(articulo != null) {
				System.out.println(articulo.getAutor());
				System.out.println(articulo.getTitulo());
				System.out.println(articulo.getPrecio());
			}
		}
		
		//up/down con objetos
		for(BuscadorBase buscador : buscadores) {
			
			if(buscador instanceof Paginable) {
				
			}
			if(buscador instanceof Ordenable) {
				
			}
			if(buscador instanceof Mostrable) {
				
			}
			
			if(buscador instanceof BuscadorLibro) {
				//down casting
				
				((BuscadorLibro)buscador).getCantTotRes();
				
				BuscadorLibro bl = (BuscadorLibro)buscador;
				System.err.println(bl.getCantTotRes());
				
				//upcasting
				String claveEnPadre = ((BuscadorBase)bl).getClave();
			}
		}
	}

}
