package ar.com.educacionit.buscador;

import ar.com.educacionit.buscador.interfaces.Ordenable;
import ar.com.educacionit.model.Articulo;
import ar.com.educacionit.model.Libro;

public abstract class BuscadorBase implements Ordenable {

	//encapsulamiento
	protected String clave;

	public BuscadorBase(String clave) {
		this.clave = clave;
	}
	
	//deja que las clases hijas definan la "query" o consulta
	//firma del metodo
	public abstract String getSQLHija();
	
	public final Articulo[] buscar() {
		
		String consultaBase = "SELECT * FROM ARTICULO ";
		
		//delega en el hijo 
		String sqlHija = getSQLHija();
		
		String consultaFinal = consultaBase + sqlHija;
		
		//ejecutar consultaFinal 
		Articulo[] resultados = ejecutarConsulta(consultaFinal);
		
		return resultados;
	}
	
	public Articulo[] ejecutarConsulta(String sql) {
		// base de datos....
		
		Articulo libro1 = new Libro(this.clave, 1219f, " ROWLING, J. K.", false);
		Articulo libro2 = new Libro("HARRY POTTER Y LAS RELIQU...", 2229f, " ROWLING, J. K.", false);
		Articulo libro3 = new Libro("HARRY POTTER Y EL LEGADO MALDITO", 2390f, " ROWLING, J. K.", false);
		
		return new Articulo[] {libro1, libro2, libro3};
	}

	public String getClave() {
		return clave;
	}
	
	//alt+shift+s
	public String getOrden() {
		return "order by 1";
	}
}
