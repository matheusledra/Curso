<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Editar Pessoa</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <link rel="stylesheet" href="_css/style.css">
</head>

<body>
</body>
<nav class="navbar navbar-expand-lg navbar-dark bg-quantum">
    <a class="navbar-brand border-nav-title" href="#">Study <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-pencil-square" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456l-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
  <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
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
                <a class="nav-link" href="#">Editar Pessoa <span class="sr-only">(current)</span></a>
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
		<h1>Editar Pessoa</h1><br/>
		<c:if test="${ erro == true }">
			<h5 style="color: red;">Erro ao editar a pessoa</h5>
			<br>
		</c:if>
		<form class="form-nova-pessoa" method="post" action="pessoa">
			<ul style="list-style: none;">
				<li>
					<h4><b>ID: ${ pessoa.id }</b></h4>
				</li>
				<li>
                    <label for="Nome">Nome: <input type="text" name="nome" id="nome" value="${ pessoa.nome }" class="nome"></label>
				</li>
				<li>
					<label>Nascimento: <input id="nascimento" type="date" name="nascimento" value="${ pessoa.dtNascimento }"></label>
				</li>
                <li>
					<c:choose>
						<c:when test="${ pessoa.sexo == 'MASCULINO' }">
                   			<label for="femi" class="radio"><input type="radio" name="sexo" id="femi" value="F"> Feminino</label>
                   			<label for="masc" class="radio"><input type="radio" name="sexo" id="masc" value="M" checked> Masculino</label> 
						</c:when>
						<c:when test="${ pessoa.sexo == 'FEMININO' }">
                   			<label for="femi" class="radio"><input type="radio" name="sexo" id="femi" value="F" checked> Feminino</label>
                   			<label for="masc" class="radio"><input type="radio" name="sexo" id="masc" value="M"> Masculino</label> 
						</c:when>
					</c:choose>
                </li>
                <li class="btns">
                    <button type="submit" class="btn-enviar" id="btn-enviar">Enviar</button>
					<input type="hidden" name="acao" value="editPessoa" />
					<input type="hidden" name="id" value="${ pessoa.id }" />
                </li>
			</ul>
		</form>
	</div>

</main>


<script src="_js/JQuery.js" type="text/javascript"></script>
<script src="_js/script.js" type="text/javascript"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>

</html>