<%@ page language="java" contentType="text/html; UTF=8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>

<body>
<ul class="nav  nav-pills nav-fill nav-tabs">
        <li class="nav-item">
            <a class="nav-link" href="index.jsp">Index</a>
        </li>
    </ul>
     <h2>Create</h2>
    <form method="POST" action="create" class="px-4 py-3">
        <div class="form-group">
            <label for="nombreProducto">Nombre Producto</label>
            <input type="text" class="form-control" name="nombreProducto" id="nombreProducto">
        </div>
        <div class="form-group">
            <label for="precioProducto">Precio Producto</label>
            <input type="number" class="form-control" name="precioProducto" id="precioProducto">
        </div>
        
        <input type="submit"  class="btn btn-primary btn-lg btn-block" value="Enviar">
    </form>
    <c:choose>
    <c:when test="${bandera==true}">
    	<h2>Correcto</h2>
    </c:when>
    <c:when test="${bandera==false}">
    	<h2>Falló</h2>
    </c:when>
    </c:choose>
    <script src="script/jquery-3.3.1.js"></script>
    <script src="script/bootstrap.min.js"></script>
</body>

</html>