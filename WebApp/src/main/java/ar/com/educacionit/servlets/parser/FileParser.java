package ar.com.educacionit.servlets.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.IIOException;

import ar.com.educacionit.domain.Producto;

public abstract class FileParser {

	protected String path;
	public FileParser(String filePath) {

		this.path= filePath;
	}
	public abstract List<Producto> parseArchivo() throws  IOException;
	/*
	public List<Producto> parseArchivo() throws IOException{
	
		List<Producto> result= new ArrayList<Producto>();
		//Abrir
		File file= new File(this.path);
		//leer y procesar
		FileReader fr= new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
		
		//Linea Leida
		String lineaLeida=null;
		
		//Leemos mientras no este vacio
		
		Boolean primerLinea= true;
		while((lineaLeida = br.readLine()) !=null) {
			//debemos omitir la  linea de cabeceras con la primer liniea
			if (!primerLinea) {
				String[] array= lineaLeida.split(";");  //Split separa por un valor o coma o lo que sea
				
				/*
				 * [0]=a002
				 * [1]=motog7
				 * [2]=15500
				 * [3]=1
				 * */
		/*		String codigo=array[0];
				String descripcion=array[1];
				String precio= array[2];
				
				Producto producto= new Producto(descripcion, Float.parseFloat(precio), codigo);
				result.add(producto);
			}else {
				
				primerLinea=false;
			}
			
		}
		//cerrar
		br.close();
		
		return result;
	}*/

}
