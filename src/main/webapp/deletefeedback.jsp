<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Feedback</title>
<link rel="stylesheet" type="text/css" href="css/delete.css">
</head>
<body>

	<%
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
	%>
	
	<div class="del">
	<form action="DeletefeedbackServlet" method="post">
	
	Student ID <input type="text" name="id" value="<%= id %>" readonly><br>
	Email <input type="text" name="email" value="<%= email %>" readonly><br>
	Message <input type="text" name="message" value="<%= message %>" readonly><br>

	
	<input type="submit" name="submit" value="Delete Feedback"><br>
	
	</form>
	</div>
</body>
</html>