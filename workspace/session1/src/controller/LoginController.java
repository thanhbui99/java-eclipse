package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.LoginDAO;

@WebServlet("/LoginServlet")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		boolean kt = LoginDAO.Validate(name, pass);
        if(kt){
        	//create new seesion
        	HttpSession  s1 =  request.getSession(true);
        	// save session
        	s1.setAttribute("name", name);
        	//forward Home
    		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
    		rd.forward(request, response);
        	
        }
        else{
        request.setAttribute("mess", "Login fail");	
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Login.jsp");
		rd.forward(request, response);
        }
	}

}
