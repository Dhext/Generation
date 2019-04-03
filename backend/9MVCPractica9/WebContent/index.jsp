<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alumno</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<h2>Alumno</h2>
	
	<form action="index.jsp" method="POST">
	
		<div class="form-group">
			<label class="control-label col-sm-2" for="txtNombre">Nombre:</label>
			<div class="col-sm-10"> 
				<input type="text" name="txtNombre" id="txtNombre" class="form-control">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="txtApellido">Apellido:</label>
			<div class="col-sm-10">
				<input type="text" name="txtApellido" id="txtApellido" class="form-control">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="txtCa1">Calificación 1:</label>
			<div class="col-sm-10">
				<input type="number" name="txtCa1" id="txtCa1" class="form-control" >
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="txtCa2">Calificación 2:</label>
			<div class="col-sm-10">
				<input type="number" name="txtCa2" id="txtCa2" class="form-control">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" value="Registrar" class="btn btn-warning">
			</div>
		</div>
	
	</form>
	
	<jsp:useBean id="objAlumno" class="com.MVCPractica9.model.Alumno"></jsp:useBean>

	<c:set target="${objAlumno}" property="calificacion1" value="${param.txtCa1}"></c:set>
	<c:set target="${objAlumno}" property="calificacion2" value="${param.txtCa2}"></c:set>
	
	El valor es:<c:out value="o"></c:out>
	

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
crossorigin="anonymous"></script>

<script src="scripts/script.js"></script>
</body>
</html>