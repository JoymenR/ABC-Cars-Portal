<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car List</title>
</head>
<body>

	<a href="http://localhost:8080/AbcCars/dash">Dashboard</a>
	<br><br>

	<div align="center">
		<h2>Search Result</h2>
		<table border="1" cellpadding="5">
			<tr>
				<th>Car Owner</th>
				<th>Make</th>
				<th>Company</th>
				<th>Model</th>
				<th>Name</th>
				<th>Delete</th>
			</tr>
			<c:forEach items="${carlist}" var="carlist">
				<tr>

					<td>${carlist.carowner}</td>
					<td>${carlist.make}</td>
					<td>${carlist.company}</td>
					<td>${carlist.model}</td>
					<td>${carlist.name}</td>
					<td><a href="deletecar?id=${carlist.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>