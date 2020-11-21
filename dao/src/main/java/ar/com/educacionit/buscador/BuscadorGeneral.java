package ar.com.educacionit.buscador;

public class BuscadorGeneral extends BuscadorBase {

	public BuscadorGeneral(String clave) {
		super(clave);
	}

	@Override
	public String getSQLHija() {
		
		///busca en todos los articulos
		
		StringBuffer consulta = new StringBuffer(" where tipo_articulo in(1,2,3,4)");
		consulta.append(" and ");
		consulta.append(" titulo like %");
		consulta.append(this.clave);
		consulta.append("%");

		return consulta.toString();
	}

	@Override
	public String getOrden() {
		return "order by titulo desc";
	}
}
