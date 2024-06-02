<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display Syllabus</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);
        }
        .syllabus-item {
            margin-bottom: 20px;
            padding: 10px;
            border: 1px solid #ddd;
            background-color: #fff;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Syllabus</h1>
        <div id="syllabus-list">
            <%
            	String name = request.getParameter("name");
            	String description = request.getParameter("description");            	
             %>       
             		<form method="POST" class="syllabus-item" action="Update_Syllabus_Servlet">
		                <input value="<%= name %>" name="nme">
		                <input value="<%= description %>" name="des">
		                <button type="submit">Submit</button>
		            </form>		            		                        
        </div>
    </div>
</body>
</html>
