<%@ page contentType="text/html; charset=US-ASCII"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

 <%@ page isELIgnored="false" %>

<html>

<head>
<title>Login</title>
</head>

<body>
    <c:if test="${error_string != null}">
        <p>
            <span> ${error_string} </span>
        </p>
    </c:if>

    <c:url var="post_url" value="/login"/>
    <form action="${post_url}" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <p>
      <label for="username">Username:</label>
      <input type="text" name="username" id="username"></input>
    </p>
    <p>
      <label for="password">Password:</label>
      <input type="password" name="password" id="password"></input>
    </p>
      <input type="submit" name="Login" value="Login"></input>
    </form>
</body>
</html>
