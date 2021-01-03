package ar.com.educacionit.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.Response;

@WebServlet("/logoutServlet")
public class LogoutServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().invalidate();//Eliminaos/Limpiamos la session
		
		//No uso RequestDispacher, basta con resp
		//resp.sendRedirect("/");//Esto nos envia al raiz TOMCAT
		resp.sendRedirect(req.getContextPath());
	}
}
