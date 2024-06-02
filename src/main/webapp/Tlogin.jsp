<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Login</title>
<link rel="stylesheet" type="text/css" href="css/loginStudent.css">
</head>
<body>

<ul class="menubar">
		<li><a href="Home.jsp">Home</a></li>
		<li><a href="AboutUs.jsp">About Us</a></li>
		<li><a href="reg.jsp">Register</a></li>
		<li><a href="loginhome.jsp">Login</a></li>
		<li><a href="feedback.jsp">FeedBack</a></li>
	</ul>
	
<h1>Login page</h1>
<div class="log">
		<form action="Loginservlet" method = "post">
		
			User Name <input type = "text" name = "uid" placeholder="Enter username"><br>
			Password <input type = "password" name = "pass" placeholder="Enter password"><br>
			
			<input type = "submit" name = "submit" value = "Login"><br>
			
		</form>
</div>
</body>
</html>