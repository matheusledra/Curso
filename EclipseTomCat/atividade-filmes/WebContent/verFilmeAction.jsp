<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title><c:out value="${ filme.titulo }"></c:out></title>
<script src="https://kit.fontawesome.com/939df34509.js" crossorigin="anonymous"> </script>
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
				<li class="nav-item"><a class="nav-link" href="filme?action=listFilmes">Lista de Filmes </a></li>
			</ul>
		</div>
	</nav>
	<main>
		<div class="jumbotron">
			<h1><c:out value="${ filme.titulo }" /></h1>
			<p style="font-size: 20px;"><c:out value="${ filme.genero }" /> •  
				<c:if test="${ filme.classificacao == 'Livre' }"> <span class="badge badge-success">Livre</span></c:if>
				<c:if test="${ filme.classificacao == '10' }"> <span class="badge badge-info">10+</span></c:if>
				<c:if test="${ filme.classificacao == '12' }"> <span class="badge badge-warning btn-yellow">12+</span></c:if>
				<c:if test="${ filme.classificacao == '14' }"> <span class="badge badge-warning">14+</span></c:if>
				<c:if test="${ filme.classificacao == '16' }"> <span class="badge badge-danger">16+</span></c:if>
				<c:if test="${ filme.classificacao == '18' }"> <span class="badge badge-dark">18+</span></c:if></p>
			<p style="font-size: 15px;">${ filme.descricao }</p>
			<div class="btnsActions" style="width: 30%; float: right; text-align: right;">
				<a class="btn btn-info" href="filme?action=editFilme&id=${ filme.getID() }">Editar Filme</a>
				<a class="btn btn-danger" onclick="deleteFilme('${ filme.getID() }', '${ filme.titulo }')">Deletar Filme</a>
			</div>
		</div>
	
		<h4 style="margin-left: 1em;">Top Filmes</h4>
		<c:if test="${ qntdTopFilmes < 1 }">
			<p style="color: red; margin-left: 0.5em; font-size: 15px"><b>Não há top filmes para mostrar aqui</b></p>
		</c:if>
		<div class="row" style="margin: 5px auto;">
				<c:forEach var="topFilmes" items="${ topFilmes }">
					<div class="card" style="width: 18rem; margin: 5px;">
						<div class="card-body">
							<p style="text-align: right; float: right;">#<c:out value="${ topFilmes.getID() }" /></p>
							<h5 class="card-title">
								<c:out value="${ topFilmes.titulo }" />
							</h5>
							<h6 class="card-subtitle mb-2 text-muted">
								<c:out value="${ topFilmes.genero }" /> • 
								<c:if test="${ topFilmes.classificacao == 'Livre' }"> <span class="badge btn-success">Livre</span></c:if>
								<c:if test="${ topFilmes.classificacao == '10' }"> <span class="badge btn-info">10+</span></c:if>
								<c:if test="${ topFilmes.classificacao == '12' }"> <span class="badge btn-warning btn-yellow">12+</span></c:if>
								<c:if test="${ topFilmes.classificacao == '14' }"> <span class="badge btn-warning">14+</span></c:if>
								<c:if test="${ topFilmes.classificacao == '16' }"> <span class="badge btn-danger">16+</span></c:if>
								<c:if test="${ topFilmes.classificacao == '18' }"> <span class="badge btn-dark">18+</span></c:if>
							</h6>
							<p class="card-text"><c:out value="${ topFilmes.descricao }"></c:out></p>
							<i class="fas fa-star" id="star-top-filme" style="color: orange; float: right;"></i>
							<a href="filme?action=verFilme&id=${ topFilmes.getID() }" class="btn btn-sm btn-info">Ver</a>
						</div> 
					</div>
				</c:forEach>
			</div>
	</main>
	
	<!-- Redirect para retirar reenvio de formulário quando apertar F5 -->
<c:if test="${ redirect == true }">
	<script type="text/javascript">window.location.assign("http://localhost:8080/atividade-filmes/filme?action=listFilmes"); 
</script></c:if>
	

	<script src="js/jquery.js" type="text/javascript"></script>
	<script src="js/script.js" type="text/javascript"></script>
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