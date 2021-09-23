<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Car</title>
</head>
<body>
<h4>Search Any Car</h4>


	<a href="http://localhost:8080/AbcCars/dash">Dashboard</a>
	<br><br>

<form method="get" action="searchcar">
		<input type="text" placeholder="Make, Model, Company.."name="keyword" /> &nbsp;
		<input type="submit" value="Search" />
	</form>
</body>
</html>