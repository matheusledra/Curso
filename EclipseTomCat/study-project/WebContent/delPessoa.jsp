<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deletar Pessoa...</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <link rel="stylesheet" href="_css/style.css">
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-quantum">
    <a class="navbar-brand border-nav-title" href="#">Study <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-person-x-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M1 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm6.146-2.854a.5.5 0 0 1 .708 0L14 6.293l1.146-1.147a.5.5 0 0 1 .708.708L14.707 7l1.147 1.146a.5.5 0 0 1-.708.708L14 7.707l-1.146 1.147a.5.5 0 0 1-.708-.708L13.293 7l-1.147-1.146a.5.5 0 0 1 0-.708z"/>
</svg></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="http://localhost:8080/study-project">Página Inicial</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="http://localhost:8080/study-project/pessoa?action=listPessoas">Lista Pessoas</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="http://localhost:8080/study-project/pessoa?action=cadPessoa">Cadastrar Pessoa</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="#">Deletar Pessoa <span class="sr-only">(current)</span></a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Pesquisar" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Pesquisar</button>
        </form>
    </div>
</nav>

<main>
	<div class="conteudo nova-pessoa">
		<h1>Deletar Pessoa</h1><br/>
		<c:if test="${ erro == true }">
			<h5 style="color: red;">Erro ao deletar a pessoa</h5>
			<br>
		</c:if>
		<c:if test="${ senhaIncorreta == true }">
			<h5 style="color: red;">Senha Incorreta!</h5>
			<br>
		</c:if>
		<form class="form-nova-pessoa" method="post" action="pessoa">
			<ul style="list-style: none;">
				<li>
					<h6><b>Pessoa a ser deletada:</b></h6>
				</li>
				<li>
					<h6><b>Nome:</b> ${ pessoa.nome } </h6>
				</li>
				<li>
					<h6><b>Nascimento:</b> ${ pessoa.dtNascimento } </h6>
				</li>
				<li>
					<h6><b>Sexo:</b> ${ pessoa.sexo } </h6>
					<br>
				</li>
				<li>
					<h6><b>Você digitar uma senha para poder deletar a pessoa "${ pessoa.nome }"</b></h6>
					<br>
				</li>
				<li>
                    <label for="senha">Senha:
                    <input type="password" name="senha" id="senha" placeholder="" class="senha"> <svg id="olho" width="1.2em" height="1.2em" viewBox="0 0 16 16" class="bi bi-eye-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path d="M10.5 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 0 1 5 0z"/>
  <path fill-rule="evenodd" d="M0 8s3-5.5 8-5.5S16 8 16 8s-3 5.5-8 5.5S0 8 0 8zm8 3.5a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7z"/>
</svg></label>
				</li>
                <li class="btns">
                <br>
					<input type="hidden" name="acao" value="delPessoa" />
					<input type="hidden" name="id" value="${ pessoa.id }" />
                    <button type="submit" class="btn-deletar" id="btn-deletar">Deletar</button>
                </li>
			</ul>
		</form>
	</div>

</main>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
<script src="_js/JQuery.js" type="text/javascript"></script>
<script src="_js/script.js" type="text/javascript"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>

</body>
</html>