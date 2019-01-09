<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="guardar.html" commandName="productoForm"
		method="POST">
		<form:hidden path="id" />
		<table>
			<tr>
				<td>Nombre</td>
				<td>
					<form:input path="nombre" />
					<form:errors path="nombre" />
				</td>
			</tr>
			<tr>
				<td>Categoria</td>
				<td>
					<form:select path="categoriaId" items="${ categorias }" 
					itemLabel="nombre" itemValue="id"/>
				</td>
			</tr>
			<tr>
				<td>Precio</td>
				<td>
					<form:input path="precio" />
					<form:errors path="precio" />
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit">Guardar</button>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>