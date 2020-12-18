package ar.com.educacionit.webapp.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

import ar.com.educacionit.domain.Producto;

public class TreeSetMain {
	//Treeset necesita que la clase PRODUCTO/etc implementar la interfaz
	//COMPARABLE

	//En el treeSet con el ComparteTo, determina si son duplicados o no
	//EVITA AGREGAR DUPLICADOS, YA QUE EN COMAPRETO DE LA CLASE
	//SE COMPARA LOS ID
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto= new Producto(1,"mate2", 100f, "003");
		Producto producto2= new Producto(3,"mate2", 100f, "003");
		Producto producto3= new Producto(3,"mate2", 100f, "003");
		Collection<Producto> productos= new TreeSet<Producto>();
		productos.add(producto);
		productos.add(producto2);
		productos.add(producto3);
		for (Producto item : productos) {
			System.out.println(item);
		}
	}

}
