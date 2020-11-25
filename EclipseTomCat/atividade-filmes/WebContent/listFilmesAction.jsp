<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Lista de Filmes</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-quantum">
		<a class="navbar-brand" href="#">Filmes</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="inicio">Início

				</a></li>
				<li class="nav-item active"><a class="nav-link" href="#">Lista
						de Filmes<span class="sr-only">(current)</span>
				</a></li>
			</ul>
		</div>
	</nav>
	<main>
		<div class="jumbotron">
			<h1>Top Filmes</h1>
			<div class="btnsActions" style="width: 30%; float: right; text-align: right;">
				<a class="btn btn-success" href="filme?action=novoFilme">Adicionar Filme</a>
			</div>
		</div>

		<div class="row" style="margin: 5px auto;">
			<c:forEach var="listFilmes" items="${ listFilmes }">
				<div class="card" style="width: 18rem; margin-left: 10px;">
					<div class="card-body">
						<h5 class="card-title">
							<c:out value="${ listFilmes.titulo }" />
						</h5>
						<h6 class="card-subtitle mb-2 text-muted">
							<c:out value="${ listFilmes.genero }" /> • 
							<c:if test="${ listFilmes.classificacao == 'Livre' }"> <span class="badge badge-success">Livre</span></c:if>
							<c:if test="${ listFilmes.classificacao == '10' }"> <span class="badge badge-info">10+</span></c:if>
							<c:if test="${ listFilmes.classificacao == '12' }"> <span class="badge badge-warning btn-yellow">12+</span></c:if>
							<c:if test="${ listFilmes.classificacao == '14' }"> <span class="badge badge-warning">14+</span></c:if>
							<c:if test="${ listFilmes.classificacao == '16' }"> <span class="badge badge-danger">16+</span></c:if>
							<c:if test="${ listFilmes.classificacao == '18' }"> <span class="badge badge-dark">18+</span></c:if>
						</h6>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-sm btn-info">Ver</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</main>




	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
		integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
		crossorigin="anonymous"></script>

</body>
</html>