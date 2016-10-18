package it.alfasoft.martina;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletBenvenuto
 */
@WebServlet("/ServletBenvenuto")
public class ServletBenvenuto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String username = (request.getParameter("username")+"<br>");
		String password = (request.getParameter("password")+"<br>");
		
		PrintWriter wr = response.getWriter();
		
		if(password.equals("123")){
			wr.println("Benvenuto"+username);
		} else {
			response.sendRedirect("login.html");
		}
		
	}
}
