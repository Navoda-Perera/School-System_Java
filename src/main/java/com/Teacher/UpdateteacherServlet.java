package com.Teacher;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateteacherServlet")
public class UpdateteacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String number = request.getParameter("number");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = TeacherDB.updateteacher(id, name, email, number, address, dob, username, password);
		
		if(isTrue == true) {
			
			List<Teacher> teaD = TeacherDB.getteacherDetails(id);
			request.setAttribute("teaD",teaD);
			RequestDispatcher dis = request.getRequestDispatcher("teacherprofile.jsp");
			dis.forward(request, response);
			
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("Unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

		
	}


