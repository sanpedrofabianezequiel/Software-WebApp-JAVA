package ar.com.educacionit.cine;

import ar.com.educacionit.cine.interfaces.IEntrada;

public class CineMain {

	public static void main(String[] args) {
		
		//lista de persona
		Object[] alquienConEntradas = new Object[4];
		
		Cliente c1 = new Cliente("lucas");
		IEntrada p1 = new Cliente("javier");
		Colado col1 = new Colado("Sol");
		Alien a = new Alien();
		
		alquienConEntradas[0] = c1;
		alquienConEntradas[1] = p1;
		alquienConEntradas[2] = a;
		alquienConEntradas[3] = col1;
		
		for(Object alguien : alquienConEntradas) {
			
			//si la persona cumple el contrato 
			//si implementa la interfaz
			if(alguien instanceof IEntrada) {
				
				Entrada entrada = ((IEntrada)alguien).getEntrada();
				
				System.out.println("Entrada:" + entrada.getLugar() + " -" + entrada.getTipo() );
			} else {
				System.out.println("NO entra al cine NO tiene entrada");
			}
		}
	}

}
