<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome to our company website
	<form:form  action="${pageContext.request.contextPath}/logout">
	<br>
	<input type="submit"  value="Logout"> 
	</form:form>
</body>
</html>