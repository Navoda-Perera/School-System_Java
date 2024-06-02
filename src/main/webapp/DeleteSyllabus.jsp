<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Syllabus</title>
<link rel="stylesheet" type="text/css" href="css/delete.css">
</head>
<body>
<div class="del">
	<center><b><h1>Delete Syllabus</h1></b></center>
    <form action="Delete_Syllabus_Servlet" method="post">
        <input type="hidden" name="subject" value="${param.subject}">
        Are you sure you want to delete the syllabus with subject: <strong>${param.subject}</strong>?
        <input type="submit" value="Yes, Delete Syllabus">
    </form>
    </div>
</body>
</html>