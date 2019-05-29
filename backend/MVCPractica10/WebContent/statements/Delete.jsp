<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <a  class="nav-link" href="Update.jsp">Update</a>
        </li>
        <li class="nav-item">
        <a  class="nav-link" href="index.jsp">Index</a>
        </li>
        <li class="nav-item">
        <a  class="nav-link" href="create.jsp">Create</a>
        </li>
        <li class="nav-item"><a  class="nav-link" href="readGeneral.jsp">Read General</a>
        </li>
        <li class="nav-item">
        <a  class="nav-link" href="Readindividual.jsp">Read Individual</a>
        </li>
    </ul>
    <h2>delete</h2>
    <form method="POST" action="DeleteServlet" class="px-4 py-3">
        <div class="form-group">
            <label for="idProducto">Id Producto</label>
            <input type="text" class="form-control" name="idProducto" id="idProducto">
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