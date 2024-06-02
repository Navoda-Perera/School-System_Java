<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Syllabus</title>
<link rel="stylesheet" type="text/css" href="css/RegTeacher.css">
</head>
<body>
	
<div class="treg">
    <h1>Add A New Syllabus</h1>
    <form action="Syllabus_Servlet" method="post">
        Subject: <input type="text" name="sub" required><br>
        Description: <textarea name="description" required></textarea><br>
        <input type="submit" value="Add New Syllabus">
    </form>
    </div>
</body>
</html>