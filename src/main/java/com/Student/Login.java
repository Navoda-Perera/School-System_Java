package com.Student;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		
		try {
		List <Student> stuD = StudentDB.validate(username, password);
		
		if(stuD!= null && !stuD.isEmpty()) {
			
			request.setAttribute("stuD", stuD);
			
			RequestDispatcher dis = request.getRequestDispatcher("UserProfile.jsp");
			 dis.forward(request, response);
		}
		else {
			
			 request.setAttribute("loginError", "Invalid username or password");
             RequestDispatcher dis = request.getRequestDispatcher("Login.jsp");
             dis.forward(request, response);
		}
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		 
		 
	}

}
