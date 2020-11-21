package ar.com.educacionit.cine;

import ar.com.educacionit.cine.interfaces.IEntrada;

public class CineMain {

	public static void main(String[] args) {
		
		//lista de persona
		Object[] alguienConEntradas  = new Object[4];
		
		Cliente c1= new Cliente("Lucas");
		IEntrada p1= new Cliente("Javier");
		Colado col1= new Colado("Sol");
		Alien a= new Alien();
		
		alguienConEntradas[0]=c1;
		alguienConEntradas[1]=p1;
		alguienConEntradas[2]=a;
		alguienConEntradas[3]=col1;
		//personas[2]=col1;
		
		for (Object item : alguienConEntradas) {
			
			Entrada entrada=((IEntrada)item).getEntrada();//UPDOWN Casting
			
			if (item instanceof IEntrada) {//Determinamos is la persona Implementa la IEntrada
				if (item instanceof Persona) {
					System.out.println("Entrando al cine: "+ ((Persona)item).getNombre());
				}else if(item instanceof Alien) {
					System.out.println("Planeta de origien: " + ((Alien)item).getPlanetaOrigen());
				}else {
					System.out.println("Entrada al cine Desconocido");
				}				
			}
		}
	}

}
