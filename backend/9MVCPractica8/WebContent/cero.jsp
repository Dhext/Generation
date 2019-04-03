<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <title>Insert title here</title>
</head>

<body>
    <h1 class="text-center text-primary">Resultado</h1>
    <% int suma=(int) request.getAttribute("resultado"); %>
    <h2 class="text-center"><%out.println(suma);%></h2>
	<script src="scripts/jquery-3.3.1.min.js"></script>
    <script src="scripts/bootstrap.bundle.min.js"></script>
</body>  
</html>