<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
<link rel="stylesheet" type="text/css" href="css/RegTeacher.css">
</head>
<body>


    <form action="Registration" method="post">
    
        Full Name <input type="text" name="name"><br>
        Parent Name <input type="text" name="pname"><br>
        Parent Email <input type="text" name="email"><br>
        Parent Number <input type="text" name="pnum"><br>
        Address <input type="text" name="address"><br>
        DOB <input type="text" name="dob"><br>
        User Name <input type="text" name="uid"><br>
        Password <input type="text" name="pass"><br>
        
        
        <input type="submit" name="Registration" value="Create Student"><br>
        
    </form>
    
</body>
</html>
