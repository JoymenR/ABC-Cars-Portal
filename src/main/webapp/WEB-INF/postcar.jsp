<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Post Car</title>
</head>
<body>
<a href="http://localhost:8080/AbcCars/dash">Dashboard</a>
<br>
<br>

	<form:form modelAttribute="car" action="savecar	" method="POST">

		<form:input type="text" placeholder="Make" path="make"></form:input>
		<br>
		<br>
		<form:input type="text" placeholder="Company" id="company"
			path="company"></form:input>
		<br>
		<br>
		<form:input type="text" placeholder="Model" path="model"></form:input>
		<br>
		<br>
		<form:input type="text" placeholder="Name" path="name"></form:input>
		<br>
		<br>

		<input type="submit" value="Submit" />
	</form:form>


</body>
</html>