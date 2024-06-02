package com.Student;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdatestudentServlet")
public class UpdatestudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("idStudent");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String number = request.getParameter("number");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = StudentDB.updatestudent(id, name, email, number, address, dob, username, password);
		
		if(isTrue == true) {
			
			List<Student> stuD = StudentDB.getStudentDetails(id);
			request.setAttribute("stuD",stuD);
			RequestDispatcher dis = request.getRequestDispatcher("UserProfile.jsp");
			dis.forward(request, response);
			
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("Unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
