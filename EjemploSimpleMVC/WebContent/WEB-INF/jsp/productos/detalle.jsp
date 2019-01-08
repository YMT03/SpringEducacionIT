<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Producto <c:out value ="${producto.nombre}"></c:out></h1>
	<h2>Descripcion del producto</h2>
	<p>Precio: <fmt:formatNumber value = "${ producto.precio }" type="number"></fmt:formatNumber></p>
	<p>Precio con IVA: <fmt:formatNumber value = "${ producto.precioConIVA }" type="number"></fmt:formatNumber></p>

</body>
</html>