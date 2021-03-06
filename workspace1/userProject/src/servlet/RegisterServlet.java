package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BEAN.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Validate o day
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String birthday = request.getParameter("birthday");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		User user = new User(name,email,birthday,password,address);
		
		HttpSession session = request.getSession(false);
		
		session.setAttribute("testUser",user);
		
		List<User> userList = null;
		if(session.getAttribute("userList") !=null){
			userList = (List<User>) session.getAttribute("userList");
		}
		else{
			userList = new ArrayList<>();
		}
		userList.add(user);
		
		session.setAttribute("userList", userList);
		
		response.sendRedirect("dang-nhap");

	}

}
