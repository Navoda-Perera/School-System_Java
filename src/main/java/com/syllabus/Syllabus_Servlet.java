package com.syllabus;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Syllabus_Servlet")
public class Syllabus_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String subject = request.getParameter("sub");
        String description = request.getParameter("description");

        Syllabus syllabus = new Syllabus(subject, description);
        SyllabusController.addSyllabus(syllabus);

        response.sendRedirect("view.jsp");
	        
	}

}
