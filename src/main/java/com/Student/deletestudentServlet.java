package com.Student;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deletestudentServlet")
public class deletestudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("idStudent");
		boolean isTrue;
		
		isTrue = StudentDB.deleteStudent(id);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("Registration.jsp");
			dis.forward(request, response);
			
		}
		else {
			
			List<Student> stuD = StudentDB.getStudentDetails(id);
			request.setAttribute("stuD",stuD);
			
			RequestDispatcher dis = request.getRequestDispatcher("UserProfile.jsp");
			dis.forward(request, response);
			
		}
			
			
	}

	

}
