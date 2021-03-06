package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.User;

@WebServlet("/dang-nhap")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("msg", " ");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Login.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User testUser = (User) request.getSession(false).getAttribute("testUser");
		if(email.equalsIgnoreCase(testUser.getEmail()) && password.equalsIgnoreCase(testUser.getPassword())){
			response.sendRedirect("welcome");
		}
		else{
			request.setAttribute("msg", "Thong tin tai khoan khong chinh xac");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Login.jsp");
			rd.forward(request, response);
		}

	}

}
