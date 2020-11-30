package ar.com.educacionit.exeptions;

import ar.com.educacionit.buscador.BuscadorBase;
import ar.com.educacionit.buscador.BuscadorLibro;
import ar.com.educacionit.buscador.BuscadorPelicula;

public class ClassCastExceptionMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Padre p = new Hijo();
		//Dinamic Binding
		//CTRL+T Determinamos todas las clases 
		BuscadorBase b= new BuscadorLibro("mouse");
		BuscadorLibro bl= (BuscadorLibro) b;
		
		
		//Lo comparo con la clase que quiero asignarla en u futuro
		if (BuscadorPelicula.class.isAssignableFrom(b.getClass())) {
			
			BuscadorPelicula bp= (BuscadorPelicula)b;//No se puede convertir de LIbro a pelicula

		}
		
		
	}

}
