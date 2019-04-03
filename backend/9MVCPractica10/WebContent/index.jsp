<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
	<body>
		<h2>Practica 9 - sessiones</h2>
		<form method="post" action="authenticateServlet">
			<div class="form-group">
				<label for="txtUsuario">usuario</label>
				<input class="form-control" type="text" id="txtUsuario" name="txtUsuario">
			</div>
			<div class="form-group">
				<label for="txtPass">password</label>
				<input  class="form-control" type="password" id="txtPass" name="txtPass">
			</div>
			<input type="submit" value="iniciar" class="btn btn-primary">
		</form>
		<script src="script/jquery-3.3.1.min.js"></script>
		<script src="script/bootstrap.bundle.min.js"></script>
		<script src="script/script.js"></script>
	</body>
</html>