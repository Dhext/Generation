<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<h2>Practica 7</h2>
	<c:out value="Texto"></c:out>
	<c:set var="miMensajito" value="Hola"></c:set>
	<h2>
		<c:out value="${miMensajito}"></c:out>
	</h2>
	<c:forEach var="j" begin="1" end="10">
		<c:out value="numero: ${j}"></c:out>
	</c:forEach>
    <script src="script/jquery-3.3.1.min.js"></script>
    <script src="script/bootstrap.bundle.min.js"></script>
    <script src="script/script.js"></script>
</body>
</html>