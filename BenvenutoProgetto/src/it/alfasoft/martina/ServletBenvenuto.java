package it.alfasoft.martina;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		if(password.equals("123")){
			RequestDispatcher rd1 = request.getRequestDispatcher("Servlet2");
			rd1.forward(request, response);
		} else {
			RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
			PrintWriter wr = response.getWriter();
			wr.println("Username o Password ERRATO!");
			rd2.include(request, response);
		}
		
	}
}
