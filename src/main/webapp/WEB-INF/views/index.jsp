<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var = 'root' value='${pageContext.request.contextPath}'></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
	<c:if test="${!empty user}">
		<h1>${user.id}</h1>
		<h1>${user.pw}</h1>
	</c:if>

	<a href = "${root}/user?id='ssafy'">click</a>
</body>
</html>