<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
                <a class="nav-link" href="ReadindividualProps.jsp">Consulta</a>
            </li>
        </ul>
    </nav>
    <header><h2>Consultar</h2></header>
    <form method="POST" class="px-4 py-3" action="MostrarServlet">
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
    		<c:forEach var="myValue" items="${list}">
	     		 <tr>
                <td scope="row"><c:out value="${myValue.idProducto}"></c:out></td>
                <td scope="row"><c:out value="${myValue.nombreProducto}"></c:out></td>
                <td scope="row"><c:out value="${myValue.precioProducto}"></c:out></td>
            </tr>
			</c:forEach>
    	</tbody>
    </table>
    
    <footer></footer>
    <script src="../script/jquery-3.3.1.js"></script>
    <script src="../script/bootstrap.min.js"></script>
</body>

</html>