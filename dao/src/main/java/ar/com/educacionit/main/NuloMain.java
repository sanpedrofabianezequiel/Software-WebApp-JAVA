package ar.com.educacionit.main;

public class NuloMain {

	public static void main(String[] args) {
		
		//byte < short < int < long < float < double
		
		// casteo implicito
		int a = 10;
		float f = a;
		
		//wide casting
		float altura = 175.25f;
		int parteEntera = (int)altura;
		
		double anchura = 15.5;
		parteEntera = (int)anchura;
		
	}

}
