<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>

<body>
    <ul class="nav  nav-pills nav-fill nav-tabs">
        <li class="nav-item">
            <a class="nav-link" href="index.jsp">Index</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="Delete.jsp">Delete</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="create.jsp">Create</a>
        </li>
        <li class="nav-item"><a class="nav-link" href="readGeneral.jsp">Read General</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="Readindividual.jsp">Read Individual</a>
        </li>
    </ul>
     <form method="POST" class="px-4 py-3">
      <div class="form-group">
            <label for="idProducto">Id Producto</label>
            <input type="text" class="form-control" name="idProducto" id="idProducto">
        </div>
        <input type="submit"  class="btn btn-primary btn-lg btn-block" value="Enviar">
    </form>
    <h2>update</h2>
    <script src="script/jquery-3.3.1.js"></script>
    <script src="script/bootstrap.min.js"></script>
</body>

</html>