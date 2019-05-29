readGeneral.jsp<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
</head>

<body>
    <nav>
        <ul class="nav  nav-pills nav-fill nav-tabs">
            <li class="nav-item">
                <a class="nav-link" href="readProps.jsp">Regresar</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="readGeneralProps.jsp">Consulta General</a>
            </li>
        </ul>
    </nav>
    <h2>Read Individual</h2>
    <form method="POST" class="px-4 py-3" action="ReadIndividualsServlet">
        <div class="form-group">
            <label for="idProducto">Id Producto</label>
            <input type="text" class="form-control" name="idProducto" id="idProducto">
        </div>
        <input type="submit"  class="btn btn-primary btn-lg btn-block" value="Enviar">
    </form>
    <table class="table">
        <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Producto</th>
                <th scope="col">Precio</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td scope="row"><c:out value="${idProducto}"></c:out></td>
                <td scope="row"><c:out value="${nombreProducto}"></c:out></td>
                <td scope="row"><c:out value="${precioProducto}"></c:out></td>
            </tr>
        </tbody>
    </table>
    <script src="../script/jquery-3.3.1.js"></script>
    <script src="../script/bootstrap.min.js"></script>
</body>

</html>