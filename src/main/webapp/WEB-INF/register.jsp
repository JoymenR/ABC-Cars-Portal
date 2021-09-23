<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<form:form modelAttribute="user" action="save" method="POST">
<form:input type="text" placeholder="Full Name" path="name"></form:input><br><br>
<form:input type="text" placeholder="Email" path="email"></form:input><br><br>
<form:input type="text" placeholder="Username" path="userName"></form:input><br><br>
<form:input type="password" placeholder="Password" id="pass" path="password"></form:input><br>
<br>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>