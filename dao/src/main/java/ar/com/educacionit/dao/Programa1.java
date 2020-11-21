package ar.com.educacionit.dao;

public class Programa1 {

	//inicio
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora(10,25.5f);
		
		calc.setOperacion("+");
		
		float res = calc.calcular();
		
		System.out.println("Resultado de " + calc.valor1  + " - " + calc.valor2 + " es =" + res);
	}

}
