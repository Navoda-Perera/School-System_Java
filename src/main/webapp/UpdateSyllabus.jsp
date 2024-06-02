<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Syllabus</title>
<link rel="stylesheet" type="text/css" href="css/update.css">
</head>
<body>
<div class="up">
	 <h1>Update Syllabus</h1>
    <form action="Update_Syllabus_Servlet" method="post">
        <input type="hidden" name="action" value="update">
        <input type="hidden" name="oldSubject" value="${param.subject}">
        Subject: <input type="text" name="subject" value="${param.subject}" required><br>
        Description: <textarea name="description" required></textarea><br>
        <input type="submit" value="Update Syllabus">
    </form>
   </div>
</body>
</html>