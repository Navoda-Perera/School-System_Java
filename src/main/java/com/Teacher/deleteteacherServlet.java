package com.Teacher;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteteacherServlet")
public class deleteteacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		String id = request.getParameter("id");
		boolean isTrue;
		
		isTrue = TeacherDB.deleteteacher(id);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("Registrationteacher.jsp");
			dis.forward(request, response);
			
		}
		else {
			
			List<Teacher> teaD = TeacherDB.getteacherDetails(id);
			request.setAttribute("teaD",teaD);
			
			RequestDispatcher dis = request.getRequestDispatcher("teacherprofile.jsp");
			dis.forward(request, response);
			
		}
			
			
	}
	

}
