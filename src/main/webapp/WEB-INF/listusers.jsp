<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>

	<a href="http://localhost:8080/AbcCars/dash">Dashboard</a>
	<br><br>
<div align="center">
	<h2>Search Result</h2>
<table border="1" cellpadding="5">
		<tr>
			<th>Username</th>
			<th>Name</th>
			<th>Email</th>
			<th>Delete</th>
		</tr>
	<c:forEach items="${userlist}" var="userlist">
		<tr>
		
			<td>${userlist.userName}</td>
			<td>${userlist.name}</td>
			<td>${userlist.email}</td>
			<td><a href="deleteprofile?id=${userlist.id}" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</div>

</body>
</html>