<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student List</title>
    <link rel="stylesheet" type="text/css" href="css/profile.css">
</head>
<body>
    <h1>Student List</h1>
    <div class="info">
    <table class="table">
   
        <c:forEach var="stu" items="${stuD}">
        
        	<c:set var = "id" value ="${stu.idStudent}"/>
        	<c:set var = "name" value ="${stu.name}"/>
        	<c:set var = "email" value ="${stu.email}"/>
        	<c:set var = "number" value ="${stu.number}"/>
        	<c:set var = "address" value ="${stu.address}"/>
        	<c:set var = "dob" value ="${stu.dob}"/>
        	<c:set var = "uname" value ="${stu.uname}"/>
        	<c:set var = "password" value ="${stu.password}"/>
        	
        	
    <tr>
		<td> ID - </td>
		<td>${stu.idStudent}</td>
	</tr>
	
	    <tr>
		<td> Name  </td>
		<td>${stu.name}</td>
	</tr>
	
	    <tr>
		<td> Email  </td>
		<td>${stu.email}</td>
	</tr>
	
	    <tr>
		<td> Number  </td>
		<td>${stu.number}</td>
	</tr>
	
	    <tr>
		<td> Address  </td>
		<td>${stu.address}</td>
	</tr>
	
	    <tr>
		<td> DOB  </td>
		<td>${stu.dob}</td>
	</tr>
	
	    <tr>
		<td> UserName  </td>
		<td>${stu.uname}</td>
	</tr>
	
	    <tr>
		<td> Password  </td>
		<td>${stu.password}</td>
	</tr>
         
        </c:forEach>
    </table>
    
    <c:url value = "Updatestudent.jsp" var = "stuupdate">
    
    	<c:param name="id" value ="${id}" />
    	<c:param name="name" value ="${name}" />
    	<c:param name="email" value ="${email}" />
    	<c:param name="number" value ="${number}" />
    	<c:param name="address" value ="${address}" />
    	<c:param name="dob" value ="${dob}" />
    	<c:param name="uname" value ="${uname}" />
    	<c:param name="password" value ="${password}" />
    	
    </c:url>
    
    <a href = "${stuupdate}">
    <input type="button" name ="update" value ="update Data">
    </a>
    
    <c:url value="deletestudent.jsp" var="studelete">
    	
    	<c:param name="id" value ="${id}" />
    	<c:param name="name" value ="${name}" />
    	<c:param name="email" value ="${email}" />
    	<c:param name="number" value ="${number}" />
    	<c:param name="address" value ="${address}" />
    	<c:param name="dob" value ="${dob}" />
    	<c:param name="uname" value ="${uname}" />
    	<c:param name="password" value ="${password}" />
    	
    </c:url>
    <a href="${studelete}">
    <input type="button" name="delete" value="Delete Account">
    </a>
    
    </div>
</body>
</html>
