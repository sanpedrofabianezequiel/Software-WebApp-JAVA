package ar.com.educationir.dao.poo;

public class AutoPruebaMain {

	public static void main(String[] args) {
		
		//instanciar un objeto de la clase auto
		System.out.println("Creando un auto");
		
		Auto clio = new Auto();//f3
		
		//aca esta vivo el auto....
		
		//mostrar el color del auto
		String colorDelAuto = clio.getColor();
		
		System.out.println("El color es:" + colorDelAuto);
	}

}
