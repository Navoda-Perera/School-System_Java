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
                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet = null;
                
                try {
                    // Load the database driver
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    // Establish a database connection
                    String url = "jdbc:mysql://localhost:3306/school_info";
                    String username = "root";
                    String password = "2210";
                    connection = DriverManager.getConnection(url, username, password);
                    
                    // Create a SQL statement
                    statement = connection.createStatement();
                    
                    // Execute a SQL query (e.g., a SELECT statement)
                    String query = "SELECT * FROM syllabus";
                    resultSet = statement.executeQuery(query);
                    
                    // Process the query result
                    while (resultSet.next()) {
                    	int id = resultSet.getInt("syllabus_id");
                        String name = resultSet.getString("subject");
                        String description = resultSet.getString("description");
            %>
            <div class="syllabus-item">
                <h2><%= name %></h2>
                <p><%= description %></p>
                <a href="update.jsp?name=<%=name %>&description=<%=description %>">
                	Update
                </a>
                <a href="action=delete">
                	Delete
                </a>
            </div>
            <%
                }
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            } finally {
                // Close resources in reverse order of acquisition
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            }
            %>
        </div>
    </div>
</body>
</html>
