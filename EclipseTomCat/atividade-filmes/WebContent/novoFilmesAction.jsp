<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Novo Filme</title>
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
				<li class="nav-item"><a class="nav-link" href="filme?action=listFilmes">Lista de
						Filmes<span class="sr-only">(current)</span>
				</a></li>
				<li><a class="nav-link active" href="#">Novo Filme<span
						class="sr-only">(current)</span>
				</a></li>
			</ul>
		</div>
	</nav>
	<main>
		<div class="jumbotron">
			<h1>Adicionar novo Filme</h1>
		</div>

		<div style="width:70%; margin: 5px auto;">
			<form action="filme?action=listFilmes" method="post">
				<div class="form-group">
					<label for="titulo">Titulo</label>
					<input type="text" name="titulo" class="form-control" placeholder="Insira o titulo do filme">
				</div>
				<div class="form-group">
					<label for="genero">Gênero</label>
					<input type="text" name="genero" class="form-control" placeholder="Insira o gênero do filme">
				</div>
					<label for="classificacao">Classificação Indicativa</label>
				<div class="row" style="margin: 5px auto;">
					<label for="Livre" class="cls-btn badge badge-success" style="margin-left: 5px;"><input type="radio" name="classificacao" id="classificacao" value="Livre"> Livre </label>
					<label for="10" class="cls-btn badge badge-info" style="margin-left: 5px;"><input type="radio" name="classificacao" id="classificacao" value="10"> 10+ </label>
					<label for="12" class="cls-btn badge badge-warning btn-yellow" style="margin-left: 5px;"><input type="radio" name="classificacao" id="classificacao" value="12"> 12+ </label>
					<label for="14" class="cls-btn badge badge-warning" style="margin-left: 5px;"><input type="radio" name="classificacao" id="classificacao" value="14"> 14+ </label>
					<label for="16" class="cls-btn badge badge-danger" style="margin-left: 5px;"><input type="radio" name="classificacao" id="classificacao" value="16"> 16+ </label>
					<label for="18" class="cls-btn badge badge-dark" style="margin-left: 5px;"><input type="radio" name="classificacao" id="classificacao" value="18"> 18+ </label>
				</div>
					<div class="top-filme from-group" id="top-filme">
					<label for="titulo">Top Filme</label>
                        <label for="top-filme" class="badge badge-success" style="margin-left: 5px;"><input type="radio" name="topfilme" id="classificacao" value="sim"> Sim </label>
                        <label for="top-filme" class="badge badge-danger" style="margin-left: 5px;"><input type="radio" name="topfilme" id="classificacao" value="não"> Não </label>
                    </div>
				<div class="from-group">
					<input type="hidden" id="acao" name="acao" value="novoFilme">
					<button type="submit" class="btn-submit">Enviar</button>
				</div>
			</form>
		
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