<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Feedback</title>
<link rel="stylesheet" type="text/css" href="css/update.css">
</head>
<body>

	<%
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		String message = request.getParameter("message");

	%>
	
	<div class="up">
	<center><b><h1>Update Feedback</h1></b></center>
	
	<form action="UpdatefeedbackServlet" method="post">
	ID <input type="text" name="id" value="<%= id %>" readonly><br>
	Email <input type="text" name="email" value="<%= email %>"><br>
	Message <input type="text" name="message" value="<%= message %>"><br>
	
	<input type="submit" name="submit" value="Update Feedback"><br>
	</form>
	</div>
</body>
</html>