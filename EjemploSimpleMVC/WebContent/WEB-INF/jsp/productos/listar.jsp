<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr><th>Id</th><th>Nombre</th><th>Precio</th></tr>
		<c:forEach var="producto" items="${ productos }">
			<tr>
				<td>${ producto.id }</td>
				<td>${ producto.nombre }</td>
				<td>${ producto.precio }</td>
				<td><a href="detalle.html?id=${ producto.id }">Ver</a></td>
			</tr>		
		</c:forEach>
	</table>

</body>
</html>