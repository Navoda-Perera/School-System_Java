<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feed back</title>
<link rel="stylesheet" type="text/css" href="css/RegTeacher.css">
</head>
<body>

<ul class="menubar">
		<li><a href="Home.jsp">Home</a></li>
		<li><a href="AboutUs.jsp">About Us</a></li>
		<li><a href="reg.jsp">Register</a></li>
		<li><a href="loginhome.jsp">Login</a></li>
		<li><a href="feedback.jsp">FeedBack</a></li>
	</ul>
	
<div class="treg">
	 <h1>Feedback Page</h1>
    <form action="feddbackServlet" method="post">
       
        <label for="email">Email:</label>
        <input type="email" name="email" id="email" required><br>
        
        <label for="message">Feedback:</label>
        <textarea name="message" id="message" required></textarea><br>
        
        <input type="submit" value="Submit Feedback">
        
    </form>
</div>
</body>
</html>
