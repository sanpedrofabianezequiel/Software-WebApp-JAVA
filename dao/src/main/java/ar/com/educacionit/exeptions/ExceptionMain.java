package ar.com.educacionit.exeptions;

import ar.com.educacionit.buscador.BuscadorBase;
import ar.com.educacionit.buscador.BuscadorGeneral;
import ar.com.educacionit.buscador.BuscadorLibro;
import ar.com.educacionit.buscador.BuscadorPelicula;
import ar.com.educacionit.model.Articulo;
import java.lang.*;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Checkd clases que herdan de EXCEPTION

		BuscadorBase b = null;
		
		try {
			
			Articulo[] valor = b.buscar();
			
		} catch (NullPointerException | ClassCastException | ArithmeticException ex) {
			
			System.err.print(ex);
			b= new BuscadorGeneral("clave");
			System.out.println("Recupero");
		}finally {
			
		}
		
		

	}

}
