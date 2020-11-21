<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <link rel="stylesheet" href="_css/style.css">
</head>

<body>
</body>
<nav class="navbar navbar-expand-lg navbar-dark bg-quantum">
    <a class="navbar-brand border-nav-title" href="#">Study <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-person-lines-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M1 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm7 1.5a.5.5 0 0 1 .5-.5h2a.5.5 0 0 1 0 1h-2a.5.5 0 0 1-.5-.5zm-2-3a.5.5 0 0 1 .5-.5h4a.5.5 0 0 1 0 1h-4a.5.5 0 0 1-.5-.5zm0-3a.5.5 0 0 1 .5-.5h4a.5.5 0 0 1 0 1h-4a.5.5 0 0 1-.5-.5zm2 9a.5.5 0 0 1 .5-.5h2a.5.5 0 0 1 0 1h-2a.5.5 0 0 1-.5-.5z"/>
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
            <li class="nav-item active">
                <a class="nav-link" href="#">Cadastrar Pessoa <span class="sr-only">(current)</span></a>
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
		<h1>Nova Pessoa</h1><br/>
		<c:if test="${ erro == true }">
			<h5 style="color: red;">Erro ao criar a pessoa</h5>
			<br>
		</c:if>
		<form class="form-nova-pessoa" method="post" action="pessoa">
			<ul style="list-style: none;">
				<li>
				<c:choose>
					<c:when test="${ erro == true }">
                    	<label for="Nome">Nome: <input type="text" name="nome" id="nome" value="${ pessoa.nome }" class="nome"></label>
					</c:when>
					<c:otherwise>
                    	<label for="Nome">Nome: <input type="text" name="nome" id="nome" placeholder="Insira seu nome" class="nome"></label>
					</c:otherwise>
				</c:choose>
				</li>
				<li>
				<c:choose>
					<c:when test="${ erro == true }">
						<label>Nascimento: <input id="nascimento" type="date" name="nascimento" value="${ pessoa.dtNascimento }"></label>
					</c:when>
					<c:otherwise>
						<label>Nascimento: <input id="nascimento" type="date" name="nascimento"></label>
					</c:otherwise>
				</c:choose>
				</li>
                <li>
					<c:choose>
						<c:when test="${ erro == true }">
							<c:choose>
								<c:when test="${ pessoa.sexo == 'M' }">
                   					<label for="femi" class="radio"><input type="radio" name="sexo" id="femi" value="F"> Feminino</label>
                   					<label for="masc" class="radio"><input type="radio" name="sexo" id="masc" value="M" checked> Masculino</label> 
								</c:when>
								<c:when test="${ pessoa.sexo == 'F' }">
                   					<label for="femi" class="radio"><input type="radio" name="sexo" id="femi" value="F" checked> Feminino</label>
                   					<label for="masc" class="radio"><input type="radio" name="sexo" id="masc" value="M"> Masculino</label> 
								</c:when>
								<c:otherwise>
                   					<label for="femi" class="radio"><input type="radio" name="sexo" id="femi" value="F"> Feminino</label>
                   					<label for="masc" class="radio"><input type="radio" name="sexo" id="masc" value="M"> Masculino</label> 
								</c:otherwise>
							</c:choose>
						</c:when>
						<c:otherwise>
                   			<label for="femi" class="radio"><input type="radio" name="sexo" id="femi" value="F"> Feminino</label>
                   			<label for="masc" class="radio"><input type="radio" name="sexo" id="masc" value="M"> Masculino</label> 
						</c:otherwise>
					</c:choose>
                </li>
                <li class="btns">
                    <button type="reset" class="btn-reset" id="btn-reset">Limpar</button>
                    <button type="submit" class="btn-enviar" id="btn-enviar">Enviar</button>
                </li>
				<li>
					<input type="hidden" name="acao" value="novaPessoa" />
				</li>	
			</ul>
		</form>
	</div>

</main>


<script src="_js/JQuery.js" type="text/javascript"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>

</html>