package ar.com.educacionit.servlets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;

@WebServlet("/generarArchivoErrorServlet")
public class GenerarArchivoErrorServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Tenemos los datos de la lista FAIL en SESSION
		
		List<Producto> listado= (List<Producto>)req.getSession().getAttribute("listadoFail");
		//armar el patch donde voya  grabar el file
		
		//En que PATCH del directorio voy a guardarlo
		
		String filePatchOutput= "c:"+File.separator+"sanpe"+File.separator+"OneDrive"+File.separator+"Escritorio"+File.separator+"Developer"+File.separator+"listado-producto.error.csv";
		//crear el File
		File outPutFile= new File(filePatchOutput);
		if (outPutFile.exists()) {//Determinamos si existe el archivo para pisar
			Files.createFile(outPutFile.toPath());
		}
		//cada producto Convertirlo  a STRING. CSV;
		FileWriter fileWriter= new FileWriter(outPutFile);
		
		StringBuffer linea= new StringBuffer("id;codigo;descripcio;precio;tipo_producto");
		fileWriter.write(linea.toString());
		
		//Convertirlo en string
		for (Producto item : listado) {
			//obtengo els tirng dado el objto
			String lineaCSV=getStringFromProducto(item);
			fileWriter.write(lineaCSV);
			
		}
		
		fileWriter.close();
		
		
		//Descargar el archivo GENERADO
		resp.setContentType("text/csv");
		resp.setHeader("Content-Disposition", "attachment; file=\"listado-producto.error.csv\"");
		
		try {

			OutputStream out= resp.getOutputStream();
			out.write(Files.readAllBytes(outPutFile.toPath()));
			
			out.close();
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private String getStringFromProducto(Producto producto) {
		StringBuffer linea = new StringBuffer("");
		linea.append(producto.getId() != 0 ? producto.getCodigo() : "");
		linea.append(";");
		linea.append(producto.getCodigo()).append(";");
		linea.append(producto.getDescripcion()).append(";");
		linea.append(producto.getPrecio()).append("\n");
	//	linea.append(producto.getCodigo()).append(";");
		return linea.toString();
	}
	
}
