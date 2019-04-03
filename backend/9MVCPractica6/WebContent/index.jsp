<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>

<body>
	<h2>Practica 6 MVC - scriptlets</h2>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Nombre</th>
			</tr>
		</thead>
		<% 
		for(int i=0;i<100;i++){
			out.println("<tr><td>"+i+"</td>"+"<td>Prueba</td></tr>");
		}
	
	%>
	</table>
	<%
	
	%>
</body>

</html>