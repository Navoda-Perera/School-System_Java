<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Login</title>
<link rel="stylesheet" type="text/css" href="css/loginStudent.css">
<script>

function validateForm() {
	
    var username = document.forms["loginForm"]["uid"].value;
    var password = document.forms["loginForm"]["pass"].value;

    if (username === "" || password === "") {
        alert("Username and password are required");
        return false; 
    }

    

    return true; 
}
</script>

</head>
<body>

<ul class="menubar">
		<li><a href="Home.jsp">Home</a></li>
		<li><a href="AboutUs.jsp">About Us</a></li>
		<li><a href="reg.jsp">Register</a></li>
		<li><a href="loginhome.jsp">Login</a></li>
		<li><a href="feedback.jsp">FeedBack</a></li>
	</ul>
	
	<div class="log">
		<form action="Login" method = "post" onsubmit="return validateForm()">
		
			User Name <input type = "text" name = "uid"><br>
			Password <input type = "password" name = "pass"><br>
			
			<input type = "submit" name = "submit" value = "Login"><br>
			
		</form>
	</div>
		
		
</body>
</html>