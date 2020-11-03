package myPack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormProcess")
public class FormProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormProcess() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         response.setContentType("text/html");
         String str =  request.getParameter("username");
         request.setAttribute("name", str);
         RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
         rd.forward(request, response);
	}

}
