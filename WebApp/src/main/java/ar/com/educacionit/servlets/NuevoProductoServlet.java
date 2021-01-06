package ar.com.educacionit.servlets;

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

public class NuevoProductoServlet  extends HttpServlet {

	
	private ProductoService ps;
	 public NuevoProductoServlet() {
		 System.out.println("Creando " +getClass().getSimpleName());
		 ps = new ProductoServiceImpl();
		 System.out.println("Creado OK");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//Codigo
		String codigo= req.getParameter("codigo");
		//Descripcion
		String descripcion= req.getParameter("descripcion");
		//Precio
		String precio = req.getParameter("precio");
		
		
		boolean hasError=false;
		//Validamos Archiv.properties
		if (codigo == null) {
			req.setAttribute("errorCodigo", "Debe ingresar el codigo valido");
			hasError=true;
		}
		if (precio == null) {
			req.setAttribute("errorPrecio", "Debe ingresa el precio valido");
			hasError=true;
		}
		if (descripcion == null) {
			req.setAttribute("errorDescripcion", "Ingresa una descripcion valida");
			hasError=true;
		}
		RequestDispatcher rd= req.getRequestDispatcher("/nuevoProducto.jsp");
		if (hasError) {
			//Redirigimos la pagina  CARGAR DE NUEVO EL NUEVO PRODUCTO
			rd.forward(req, resp);
		}else {
			//Alta de producto
			Producto nuevoProducto= new Producto(descripcion,Float.parseFloat(precio), codigo);
			try {
				//En caso de que este bien envimos ese Nuevo producto a la PAGINA LSTADO
				
				Producto pd=ps.crearProducto(nuevoProducto);
				rd = req.getRequestDispatcher("/buscarProducto");//t@WebServlet("/buscarProducto")
				
			} catch (ServiceException e) {
				
				e.printStackTrace();
				req.setAttribute("errorGenerarl", e.getMessage());
				//Por el Catch me voy por la intancia que ya tiene le RD.FORWARD(REQ,RESP)
				rd= req.getRequestDispatcher("nuevoProducto.jsp");
				rd.forward(req, resp);
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}
