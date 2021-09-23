<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
     <%@ page isELIgnored="false" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
</head>
<body>

	<a href="http://localhost:8080/AbcCars/dash">Dashboard</a>
	<br><br>
<div align="center">		
	<h2>Personal Profile</h2>
<table border="1" cellpadding="5">
		<tr>
			<th>Username</th>
			<th>Name</th>
			<th>Email</th>
			<th>Edit</th>
		</tr>
	
		<tr>
			<td>${user.userName}</td>
			<td>${user.name}</td>
			<td>${user.email}</td>
			<td><a href="editprofile" >Edit Profile</a></td>
		</tr>
	
	</table>
</div>	

</body>
</html>