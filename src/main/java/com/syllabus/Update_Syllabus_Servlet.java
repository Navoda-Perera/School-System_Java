package com.syllabus;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Update_Syllabus_Servlet")
public class Update_Syllabus_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String subject = request.getParameter("nme");
        String description = request.getParameter("des");

        Syllabus syllabus = new Syllabus(subject, description);
        SyllabusController.updateSyllabus(subject, syllabus);

        response.sendRedirect("ViewSyllabus.jsp");
	}

}
