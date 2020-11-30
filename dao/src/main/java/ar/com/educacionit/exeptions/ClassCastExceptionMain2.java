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
		BuscadorPelicula bp= (BuscadorPelicula)b;
		
	}

}
