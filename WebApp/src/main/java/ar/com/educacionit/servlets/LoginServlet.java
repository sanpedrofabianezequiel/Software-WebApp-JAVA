package ar.com.educacionit.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Usuario;
import ar.com.educacionit.service.UsuarioService;
import ar.com.educacionit.service.UsuarioServiceImpl;
import ar.com.educacionit.service.exception.ServiceException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private UsuarioService us=  new UsuarioServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		String userName= req.getParameter("userNameId");
		String password= req.getParameter("passwordId");
		//Determinamos sihay una session
		try {
			Usuario usuario = us.login(userName, password);
			
			//Grabamos en a session el usuario
			req.getSession().setAttribute("usuario", usuario);
			resp.sendRedirect(req.getContextPath());//HOMEEE
			
		} catch (ServiceException e) {
			req.setAttribute("error", e.getMessage());
			
			resp.sendRedirect(req.getContextPath()+"/error.jsp");
		}
		//req.getSession().invalidate();
	}
}
