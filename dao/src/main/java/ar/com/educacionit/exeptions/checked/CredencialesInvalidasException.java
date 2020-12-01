package ar.com.educacionit.exeptions.checked;

public class CredencialesInvalidasException extends Exception{

	private static final long serialVersionUID = 3380023016255191619L;
	private String msjPersonalizado;
	 
	 public CredencialesInvalidasException(String msj) {
		// TODO Auto-generated constructor stub
		 super(msj);
		 this.msjPersonalizado=msj;
	}

	public String getMsjPersonalizado() {
		//APPEND SE UTILIZA PARA ADICIONAR TEXTO EN EL STRINGBUFFER
		StringBuffer stringBuffer = new StringBuffer("Las credenciales no son validas").append(this.msjPersonalizado);
		//msjPersonalizado=stringBuffer.toString();
		return stringBuffer.toString();
	}

	public void setMsjPersonalizado(String msjPersonalizado) {
		this.msjPersonalizado = msjPersonalizado;
	}
	 
}
