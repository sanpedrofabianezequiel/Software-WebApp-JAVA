package ar.com.educacionit.exeptions;

public class ClassCastExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Padre p = new Hijo();
		//Dinamic Binding
		
		Object saludo= 1;
		
		if (saludo != null) {
			/*String valorStr= (String) saludo;//ctrl+shit+i
			System.out.println(valorStr);*/
			
			//Integer valor =  Integer.parseInt(saludo.toString());
			System.out.println(saludo);
		}
	}

}
