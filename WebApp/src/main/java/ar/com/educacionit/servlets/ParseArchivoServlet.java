package ar.com.educacionit.servlets;

import java.util.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.ProductoServiceImpl;
import ar.com.educacionit.service.exception.ServiceException;
import ar.com.educacionit.servlets.parser.FileParser;
import ar.com.educacionit.webapp.enums.CSVFileParser;

@WebServlet("/parseArchivoServlet")
public class ParseArchivoServlet extends HttpServlet {

	
	ProductoService ps= new ProductoServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//Obtenemos el archivo
		String filePath= getServletContext().getRealPath("nuevos-productos.csv");
		
		FileParser fileParse= new CSVFileParser(filePath);
		
		List<Producto> result= fileParse.parseArchivo();
		
		//Separa en dos lista en OK Y FAIL
		List<Producto> listOk= new ArrayList<Producto>();
		List<Producto> listFail= new ArrayList<Producto>();
		
		
		//Procesamos nuestra lista
		for(Producto item : listOk) {
			try {
				item = ps.crearProducto(item);			//Si es OK guardamos ese resultadao del producto enviado para crear un alista de OK
				listOk.add(item);
			} catch (ServiceException e) {
				listFail.add(item);
				e.printStackTrace();
			}
		}
		
		
		//Guardar en Request el listado OK o el FAIL
		
		req.setAttribute("listadoOK",listOk);

		req.getSession().setAttribute("listadoFail",listFail);
		
		RequestDispatcher rd= req.getRequestDispatcher("listadoGeneral.jsp");
		rd.forward(req, resp);
		
	}
	
	
	
	
	
	
}
