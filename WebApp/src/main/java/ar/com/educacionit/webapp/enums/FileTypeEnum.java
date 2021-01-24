package ar.com.educacionit.webapp.enums;

public enum FileTypeEnum {

	CSV("csv"),TXT("txt"),XLS("xls");

	
	private String type;
	//Si queremos asignarele un valor al enum, debeo crear un Constructor
	private FileTypeEnum(String fyleTipe) {
		this.type=fyleTipe;
	}
	public String getType() {
		return type;
	}
	
	
	
}
