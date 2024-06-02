<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Syllabus</title>
<link rel="stylesheet" type="text/css" href="css/profile.css">
</head>
<body>

<div class="info">

	<h1>View Syllabus</h1>
    <ul>
        <c:forEach var="syllabus" items="${syllabusList}">
            <li>
                <strong>${syllabus.subject}</strong>: ${syllabus.description}
                <a href="UpdateSyllabus.jsp?subject=${syllabus.subject}">Update</a>
                <a href="DeleteSyllabus.jsp?syllabus?delete=true&subject=${syllabus.subject}">Delete</a>
            </li>
        </c:forEach>
    </ul>
    </div>
</body>
</html>
