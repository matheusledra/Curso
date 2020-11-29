<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Início - Séries</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="https://kit.fontawesome.com/939df34509.js"
	crossorigin="anonymous">
	
</script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<main>
		<nav class="navbar navbar-expand-lg navbar-dark bg-quantum">
			<a class="navbar-brand" href="#">Séries</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="#">Início<span class="sr-only">(current)</span></a></li>
					<li class="nav-item"><a class="nav-link" href="http://localhost:8080/serie-votos/serie?action=listSeries">Lista de Séries</a></li>
				</ul>
			</div>
		</nav>
		<div class="jumbotron">
			<h1>Séries - Início</h1>
			<h6>
				<a href="serie?action=listSeries" class="btn btn-sm btn-success">Todas
					as Séries</a>
			</h6>
		</div>

		<h4 style="margin-left: 15vw; ">Top 5 Mais Votadas</h4>
		<div class="row align-items-center" style="width: 80vw; margin: 0 auto;">
			<ul class="list-group col">
				<c:forEach var="topCinco" items="${ topCinco }">
					<li class="list-group-item">
					<a class="btn btn-sm btn-success" style="position: absolute; margin-left: 50%;" href="serie?action=verSerie&id=${ topCinco.getID() }">Ver Série</a>
						<p style="float: left;">
							<c:out value="${ topCinco.nome }" />
							<a style="margin-left: 3em; color: grey;">#${ topCinco.getID() }</a>
						</p> 
						<a style="float: right; margin-right: 10px;">
							<c:out value="${ topCinco.votos }" />
							<i class="fas fa-heart"></i>
						</a>
					</li>
				</c:forEach>
			</ul>
		</div>
	</main>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
		integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
		crossorigin="anonymous"></script>
	<script type="text/javascript" src="js/script.js"></script>
</body>
</html>