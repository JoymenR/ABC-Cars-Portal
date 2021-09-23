<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
    	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
	<div align="center">
		<h2>Edit Profile</h2>
		
		
		
<form:form modelAttribute="user" action="saveprofile" method="post">
<form:input type="hidden" placeholder="ID" path="id"></form:input>
<form:input type="hidden" placeholder="Password" path="password"></form:input><br>
<form:input type="hidden" placeholder="Username" path="userName"></form:input><br>
<form:input type="text" placeholder="Name" path="name"></form:input><br><br>
<form:input type="text" placeholder="Name" path="email"></form:input><br><br>
<input type="submit" value="Submit"/>	
</form:form>
		
	</div>
</body>
</html>