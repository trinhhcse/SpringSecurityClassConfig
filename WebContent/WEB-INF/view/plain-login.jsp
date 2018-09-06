<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<form:form
		action="${pageContext.request.contextPath}/authenticateTheUser"
		method="POST">
		<c:if test="${param.error !=null }">
			<i>Sorry! You Enter username/password invavlid</i>
		</c:if><br/>
		User name : <input type="text" name="username" />
		<br/>
		Password : <input type="password" name="password" />
		<br/>
		<input type="submit" value="Submit" class="save" />
	</form:form>
</body>
</html>