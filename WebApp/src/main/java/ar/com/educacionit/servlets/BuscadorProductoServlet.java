package ar.com.educacionit.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.ProductoServiceImpl;
import ar.com.educacionit.service.exception.ServiceException;

@WebServlet("/buscarProducto")
public class BuscadorProductoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9149842349530447373L;
	private ProductoService psi= new ProductoServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//El parametro que recibo del Request es la propiedad NAME
		Integer codigo= Integer.parseInt( req.getParameter("id"));
		
		try {
			Producto producto =	psi.obtenerProductoPorId(codigo);
			Collection<Producto> productos=new ArrayList<Producto>();
			
			
			
			//GUARDAMOS EN SESION-----------------------------------------------
			//-------------------------------------------------------------------
			//--------------------------------------------------------------------
			//---------------------------------------------------------------------
			//Si es true la crea
			if (producto!=null) {		
				productos.add(producto);
			}
			
			HttpSession session=req.getSession();
			session.setAttribute("productos", productos);
			
			//Redireccionamos a la pagina que queremos
			//Dispacher
			RequestDispatcher redirect= req.getRequestDispatcher("/resultadosBusqueda.jsp");
			redirect.forward(req, resp);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		
	}
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Obtener todos los productos y los productoscreados en Nuevo procuto
		try {
			Collection<Producto> productos= psi.obtenerTodosProductos();
			
			//Guardamos en Session
			//Determinamos la Session previamente
			req.getSession().setAttribute("productos", productos);
			
			RequestDispatcher rd= req.getRequestDispatcher("resultadosBusqueda.jsp");
			rd.forward(req, resp);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
