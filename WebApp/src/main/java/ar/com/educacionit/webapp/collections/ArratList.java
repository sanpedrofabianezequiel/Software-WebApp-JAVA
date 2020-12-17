package ar.com.educacionit.webapp.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import ar.com.educacionit.domain.Producto;

public class ArratList {

	public static void main(String[] args) {

		Producto item1 = new Producto(1,"", 100f, "");

		Collection<Producto> obj= new ArrayList<Producto>();
		obj.add(item1);
	    item1 = new Producto(1,"", 100f, "");
		obj.add(item1);
		//Eliminar en un ForEcah
		//Para eliminar utilizamos la interfaz Iterator
		//Determina el proximo elemento => Next()
		//Determina si tiene productos siguientes => hasNext()
		
		/*Iterator<Producto> delete = obj.iterator();
		while(delete.hasNext()) {
			Producto result=delete.next();
			result.setDescripcion("Borrado");
		}*/
		
		//Determinamos si la collecion esta vacia
		Iterator<Producto> it= obj.iterator();
		
		while (it.hasNext()) {
			it.next();//Siempre hay que mover,el ITERATOR
			it.remove();
		}
		System.out.println(obj.isEmpty()) ;
	}

}
