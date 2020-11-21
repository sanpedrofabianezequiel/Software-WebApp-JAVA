package ar.com.educationir.dao.poo;
//ctrl+s
public class VehiculoTestMain {

	public static void main(String[] args) {
		
		Auto clio = new Auto();//f6
		clio.setColor("Clio azul");//f5
		
		Auto astra = new Auto();
		astra.setColor("Astra Verde");
		
		Moto zanella = new Moto();
		System.out.println(zanella.getColor());
		
		Moto honda = new Moto();
		System.out.println(honda.getColor());
		
		Auto[] autos = {clio, astra};
		Moto[] motos = {zanella, honda};
		
		Vehiculo[] vehiculos = new Vehiculo[ autos.length + motos.length ];
		vehiculos[0] = clio;
		vehiculos[1] = astra;
		vehiculos[2] = zanella;
		vehiculos[3] = honda;
		
		//todos los vehiculos
		for(Vehiculo vehiculo : vehiculos) {
			System.err.println(vehiculo.getColor());
		}
	}

}
