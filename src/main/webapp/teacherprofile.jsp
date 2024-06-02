<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Teacher List</title>
    <link rel="stylesheet" type="text/css" href="css/profile.css">
</head>
<body>

<ul class="menubar">
		<li><a href="Home.jsp">Home</a></li>
		<li><a href="AboutUs.jsp">About Us</a></li>
		<li><a href="reg.jsp">Register</a></li>
		<li><a href="loginhome.jsp">Login</a></li>
		<li><a href="feedback.jsp">FeedBack</a></li>
	</ul>
	
    <h1>Teacher List</h1>
    
    <div class="info">
    <table class="table">
    
        <c:forEach var="tea" items="${teaD}">
        
        	<c:set var = "id" value ="${tea.id}"/>
        	<c:set var = "name" value ="${tea.name}"/>
        	<c:set var = "email" value ="${tea.email}"/>
        	<c:set var = "number" value ="${tea.number}"/>
        	<c:set var = "address" value ="${tea.address}"/>
        	<c:set var = "dob" value ="${tea.dob}"/>
        	<c:set var = "uname" value ="${tea.uname}"/>
        	<c:set var = "password" value ="${tea.password}"/>
        	
    <tr>
		<td> ID  </td>
		<td>${tea.id}</td>
	</tr>
	
	<tr>
		<td> Name  </td>
		<td>${tea.name}</td>
	</tr>
	
	<tr>
		<td> Email  </td>
		<td>${tea.email}</td>
	</tr>
	
	<tr>
		<td> Number  </td>
		<td>${tea.number}</td>
	</tr>
	
	<tr>
		<td> Address  </td>
		<td>${tea.address}</td>
	</tr>
	
	<tr>
		<td> DOB  </td>
		<td>${tea.dob}</td>
	</tr>
	
	<tr>
		<td> UserName  </td>
		<td>${tea.uname}</td>
	</tr>
	
	<tr>
		<td> Password  </td>
		<td>${tea.password}</td>
	</tr>
         
        </c:forEach>
    </table>
        
        <c:url value = "updateteacher.jsp" var = "teaupdate">
    
    	<c:param name="id" value ="${id}" />
    	<c:param name="name" value ="${name}" />
    	<c:param name="email" value ="${email}" />
    	<c:param name="number" value ="${number}" />
    	<c:param name="address" value ="${address}" />
    	<c:param name="dob" value ="${dob}" />
    	<c:param name="uname" value ="${uname}" />
    	<c:param name="password" value ="${password}" />
    	
    </c:url>
    
    <a href = "${teaupdate}">
    
    <input type="button" name ="update" value ="update Data">
    </a>
    
    <c:url value="deleteteacher.jsp" var="teadelete">
    	
    	<c:param name="id" value ="${id}" />
    	<c:param name="name" value ="${name}" />
    	<c:param name="email" value ="${email}" />
    	<c:param name="number" value ="${number}" />
    	<c:param name="address" value ="${address}" />
    	<c:param name="dob" value ="${dob}" />
    	<c:param name="uname" value ="${uname}" />
    	<c:param name="password" value ="${password}" />
    	
    </c:url>
    
    <a href="${teadelete}">
    
    <input type="button" name="delete" value="Delete Account">
    
    </a>
    
    
   </div>
</body>
</html>
