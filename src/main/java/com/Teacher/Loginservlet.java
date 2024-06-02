package com.Teacher;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uid");
        String password = request.getParameter("pass");

        try {
        	//validate
        	
            List<Teacher> teaD = TeacherDB.validate(username, password);

            if (teaD != null && !teaD.isEmpty()) {
            	
                request.setAttribute("teaD", teaD);
                RequestDispatcher dis = request.getRequestDispatcher("teacherprofile.jsp");
                dis.forward(request, response);
                
            } 
            else {
                request.setAttribute("loginError", "Invalid username or password");
                RequestDispatcher dis = request.getRequestDispatcher("Tlogin.jsp");
                dis.forward(request, response);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}