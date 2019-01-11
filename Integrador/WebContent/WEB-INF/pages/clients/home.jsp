<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../sources/css/style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<title>Presentation</title>
</head>
<body>
	<!-- NAVBAR-->

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand col-12 col-lg-1 d-flex justify-content-center"
			href=""><img src="../sources/img/logo.png" alt="Java"
			height="80px"></a>

		<ul
			class="navbar-nav justify-content-xl-center flex-fill col-xl-7 align-items-center ">
			<li class="nav-item d-inline-flex"><a class="nav-link" href=""
				id="home">Home</a></li>
			<li class="nav-item "><a class="nav-link" id="scroller1"
				href="clients/home.html">Clientes</a></li>
			<li class="nav-item"><a class="nav-link" id="scroller2"
				href="issues">Reclamos</a></li>
			<li class="nav-item "><a class="nav-link" id="scroller3"
				href="contact">Contacto</a></li>
			<li class="nav-item "><a class="nav-link" id="scroller4"
				href="about">Acerca de nosotros</a></li>

		</ul>
		<form
			class="form-inline col-12 col-lg-4 align-items-center d-flex justify-content-center">
			<input
				class="form-control col-lg-3 col-xl-4 col-4 mr-md-1 mr-lg-1 col-12 col-sm-4 mr-sm-1"
				type="text" placeholder="username"> <input
				class="form-control col-lg-3 col-xl-4 col-4 mr-md-1 mr-lg-1 col-12 col-sm-4 mr-sm-1"
				type="text" placeholder="password">
			<button
				class="btn btn-success col-lg-3 col-xl-2 col-md-1 col-4 col-12 col-sm-3 mr-sm-1"
				type="button">Login</button>
		</form>
	</nav>

	<!-- END NAVBAR -->


	<!-- TITLE AND MAIN DESCRIPTION -->

	<header>
		<div class="row display-4 justify-content-center mb-5 mt-5" id="title">
			Listado de clientes</div>

		<div class="container">

			<button type="button" class="btn btn-success fas fa-user-plus"
				data-toggle="modal" data-target="#exampleModalCenter"></button>
			<!-- POPUP -->

			<!-- Modal -->
			<div class="modal fade" id="exampleModalCenter" tabindex="-1"
				role="dialog" aria-labelledby="exampleModalCenterTitle"
				aria-hidden="true">
				<div class="modal-dialog modal-dialog-centered" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="exampleModalCenterTitle">Alta
								Cliente</h5>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<form method="POST" action="home.html">
						<div class="modal-body">
								<div class="form-group">
									<label for="exampleInputEmail1">Email address</label> <input
										type="email" class="form-control" id="exampleInputEmail1"
										aria-describedby="emailHelp" placeholder="Enter email">
									<small id="emailHelp" class="form-text text-muted">No sera compartido con nadie.</small>
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Password</label> <input
										type="password" class="form-control"
										id="exampleInputPassword1" placeholder="Password">
								</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Cancelar</button>
							<button type="submit" class="btn btn-primary">Guardar</button>
						</div>
						</form>
					</div>
				</div>
			</div>

			<!-- fin POPUP -->
			<table class="table table-striped">

				<thead>
					<tr>
						<th scope="col">id</th>
						<th scope="col">Nombre</th>
						<th scope="col">Apellido</th>
						<th scope="col">Email</th>
						<th scope="col">Plan</th>
						<th scope="col" colspan="3" style="text-align: center;">Opciones</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ clientes }" var="cliente">
						<tr>
							<th scope="row">${ cliente.id }</th>
							<td>${ cliente.nombre }</td>
							<td>${ cliente.apellido }</td>
							<td>${ cliente.email }</td>
							<td>${ cliente.plan }</td>
							<td><i class="fas fa-eye"></i></td>
							<td><i class="fas fa-user-edit"></i></td>
							<td><i class="fas fa-user-times"></i></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</header>




	<div class="container mt-5 pt-5 mb-5 pb-5"></div>

	<script src="sources/js/script.js"></script>
</body>
</html>