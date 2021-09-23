<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<h4>Login successful</h4>
	<br>
	<a href="postcar">Post</a><br><br>
	<a href="viewprofile">View Profile</a><br><br>
	<sec:authorize access="hasRole('Admin')">
		<a href="listusers">User List</a><br><br>
	</sec:authorize>
	<sec:authorize access="hasRole('Admin')">
		<a href="listcars">List Cars</a><br><br>
	</sec:authorize>
	
	<a href="carform">Search Cars</a><br><br>


<form action="logout" method="post">
       <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" name="logout" value="Logout"></input>
    </form>
    
</body>
</html>