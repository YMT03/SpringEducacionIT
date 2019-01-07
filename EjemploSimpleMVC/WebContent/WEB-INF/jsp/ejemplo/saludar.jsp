<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${ texto }</h1>
	<form method ="POST" action="saludar9.html">
		<input type="text" name="nombre" placeholder="nombre">
		<input type="text" name="edad" placeholder="edad">
		<button type="submit"> Enviar </button>
	</form>
</body>
</html>