package ar.com.educacionit.servlets;

import java.io.IOException;
import java.util.Collection;

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

@WebServlet("/productoServlet")
public class ProductoServlet  extends HttpServlet{

	ProductoService ps= new ProductoServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			Collection<Producto> productos=	ps.obtenerTodosProductos();
			
			
			//Maping K V
			req.setAttribute("key", productos);//en Razor =>request.getAtribute("Key");
			
			
			RequestDispatcher rd=req.getRequestDispatcher("productos.jsp");//---URL
			rd.forward(req, resp);
			
			
		} catch (ServiceException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
