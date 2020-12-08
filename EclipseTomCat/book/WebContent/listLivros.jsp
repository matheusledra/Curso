<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
<script src="scripts/font-awasome.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-quantum">
		<a class="navbar-brand" href="#">Livros</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="inicio">Início<span
						class="sr-only">(current)</span></a></li>
			</ul>
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-sair"
					style="float: right; margin-left: 4px;" href="login?action=logout">
						Sair</a> <a class="nav-nome" style="float: right;"><c:out
							value="${ primeiroNome }" /> | </a></li>
			</ul>
		</div>
	</nav>
	<div class="jumbotron">
		<div class="form-group ml-4">
			<h1>Lista de Livros</h1>
			<label for="titulo">Pesquisar Livro </label> 
			<input type="text" id="titulo" name="titulo" placeholder="Insira o titulo do livro">
			<input type="radio" name="rel" id="rel-lido" value="1" class="form-control col" hidden> 
			<label class="btn btn-success" for="rel-lido" data-toggle="tooltip" data-placement="top" title="Já li" style="margin-left: 5px !important;"> 
				<i class="fas fa-book"></i>
			</label> 
			<input type="radio" name="rel" id="rel-interesse" value="2" class="form-control col ml-2" hidden> 
			<label for="rel-interesse" class="btn btn-warning ml-4" data-toggle="tooltip" data-placement="top" title="Tenho Interesse" style="margin-left: 5px !important;">
				<i class="far fa-star"></i>
			</label> 
			<input type="radio" name="rel" id="rel-lendo" value="3" class="form-control col ml-2" hidden> 
			<label for="rel-lendo" class="btn btn-info ml-4" data-toggle="tooltip" data-placement="top" title="Estou Lendo" style="margin-left: 5px !important;"> 
				<i class="fas fa-book-reader"></i>
			</label>
		</div>
	</div>

	<div class="list-livros">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Titulo</th>
					<th scope="col">Autor</th>
					<th scope="col">Categoria</th>
					<th scope="col">Opções</th>
				</tr>
			</thead>
			<tbody id="listaLivrosTable">
			</tbody>
		</table>
	</div>
	
	<!-- SCRIPT -->
	<script src="scripts/jquery.min.js"></script>
	<script src="scripts/script.js"></script>

	<!-- BOOTSTRAP -->
	<script src="scripts/bootstrap.min.js"></script>
	<script src="scripts/popper.min.js"></script>

</body>
</html>