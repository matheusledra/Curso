<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title><c:out value="${ serie.nome }"/></title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="https://kit.fontawesome.com/939df34509.js" crossorigin="anonymous"> </script>
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
					<li class="nav-item"><a class="nav-link" href="http://localhost:8080/serie-votos/inicio">Início</a></li>
					<li class="nav-item"><a class="nav-link" href="http://localhost:8080/serie-votos/serie?action=listSeries">Lista de Séries</a></li>
					<li class="nav-item active"><a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Vendo: <c:out value="${ serie.nome }"></c:out></a></li>
				</ul>
			</div>
		</nav>
		<c:if test="${ serie == null }">
			<script type="text/javascript">window.location.assign("http://localhost:8080/serie-votos/serie?action=listSeries");</script>
		</c:if>
		<div class="jumbotron">
			<h1> <c:out value="${ serie.nome }"/> </h1>
			<h5 style="color: grey">Temporadas: Em breve</h5>
			<a class="btn btn-sm btn-danger" style="float: right; margin-left: 5px;" onclick="delSerie('${ serie.getID() }', '${ serie.nome }')">
				Deletar
			</a>
			<a class="btn btn-sm btn-warning" style="float: right; margin-left: 5px;" href="serie?action=editSerie&id=${ serie.getID() }">
				Editar
			</a>
			<a class="btn btn-sm btn-success" style="float: right;" onclick="addVoto('${ serie.getID() }')">
				Votar | <c:out value="${ serie.votos }"/> <i class="fas fa-heart" ></i> 
			</a>
			
			<a style="color: grey; float: left;"><c:out value="${ redirectMessage }"/></a>
		</div>
		
		
		<hr>
		<h4 style="margin-left: 15vw; ">Top 5 Mais Votadas</h4>
		<div class="row align-items-center" style="width: 80vw; margin: 0 auto;">
			<ul class="list-group col">
				<c:forEach var="topCinco" items="${ topCinco }">
					<li class="list-group-item">
					<a class="btn btn-sm btn-success" style="position: absolute; margin-left: 50%;" href="serie?action=verSerie&id=${ topCinco.getID() }">Ver Série</a>
					<a style="position: absolute; margin-left: 40%; color: grey;">#${ topCinco.getID() }</a>
					<c:out value="${ topCinco.nome }" />
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
		<c:if test="${ redirectByEditSerie == true }">
			<script type="text/javascript">
				window.location.assign("http://localhost:8080/serie-votos/serie?action=verSerie&id=" + ${ serie.getID() } + "&ae=editSerie");
			</script>
		</c:if>
		<script type="text/javascript">
			if(performance.navigation.type == 1) {
				window.location.assign("http://localhost:8080/serie-votos/serie?action=verSerie&id=" + ${ serie.getID() });
			}
		</script>
</body>
</html>