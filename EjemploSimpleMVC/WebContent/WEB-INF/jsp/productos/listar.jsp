<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<sec:authorize access="isAuthenticated()">
		<h1>Usuario <sec:authentication property="principal.username"/></h1>
	</sec:authorize>	

	<h2>Productos</h2>
	<a href="nuevo.html">Nuevo</a>

	<form action="listar.html" method="POST">
		Buscar por nombre <input name="nombre" placeholder="Ej:. Mouse"
			type="text" />
		<button type="submit">Buscar</button>
	</form>
	<a href="listar.html">Reset</a>


	<table>
		<tr>
			<th>Id</th>
			<th>Nombre</th>
			<th>Categoria</th>
			<th>Precio</th>
			<th colspan="3">Opciones</th>
		</tr>
		<c:forEach var="producto" items="${ productos }">
			<tr>
				<td>${ producto.id }</td>
				<td>${ producto.nombre }</td>
				<td>${ producto.categoria.nombre }</td>
				<td>${ producto.precio }</td>
				<td><a href="detalle.html?id=${ producto.id }">Ver</a></td>
				<td><a href="editar.html?id=${ producto.id }">Editar</a></td>
				<sec:authorize access="hasAuthority('Administrator') or hasAuthority('Owner')">
					<td><a href="borrar.html?id=${ producto.id }">Borrar</a></td>
				</sec:authorize>				
			</tr>
		</c:forEach>
	</table>

</body>
</html>