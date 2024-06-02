<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Profile</title>
<link rel="stylesheet" type="text/css" href="css/RegTeacher.css">
</head>
<body class="body">


<ul class="menubar">
		<li><a href="Home.jsp">Home</a></li>
		<li><a href="AboutUs.jsp">About Us</a></li>
		<li><a href="reg.jsp">Register</a></li>
		<li><a href="loginhome.jsp">Login</a></li>
		<li><a href="feedback.jsp">FeedBack</a></li>
	</ul>
	
	<div class="treg">
	<center><b>Teacher Registration</b></center>
	 <form action="RegistrationServlet" method="post">
    
        Full Name <input type="text" name="name"><br>
        Last Name <input type="text" name="lname"><br>
        Email <input type="text" name="email"><br>
        Number <input type="text" name="pnum"><br>
        Address <input type="text" name="address"><br>
        DOB <input type="text" name="dob"><br>
        User Name <input type="text" name="uid"><br>
        Password <input type="text" name="pass"><br>
        
        
        <input type="submit" name="Registration" value="Create Teacher"><br>
        
    </form>
	</div>
</body>
</html>