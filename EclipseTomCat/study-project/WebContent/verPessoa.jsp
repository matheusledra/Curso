<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Infos ${ pessoa.nome }</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <link rel="stylesheet" href="_css/style.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-quantum">
    <a class="navbar-brand border-nav-title" href="#">Study <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-person-circle" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path d="M13.468 12.37C12.758 11.226 11.195 10 8 10s-4.757 1.225-5.468 2.37A6.987 6.987 0 0 0 8 15a6.987 6.987 0 0 0 5.468-2.63z"/>
  <path fill-rule="evenodd" d="M8 9a3 3 0 1 0 0-6 3 3 0 0 0 0 6z"/>
  <path fill-rule="evenodd" d="M8 1a7 7 0 1 0 0 14A7 7 0 0 0 8 1zM0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8z"/>
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
                <a class="nav-link" href="http://localhost:8080/study-project/pessoa?action=listPessoas">Lista Pessoas <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="http://localhost:8080/study-project/pessoa?action=cadPessoa">Cadastrar Pessoa</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="#">Ver Pessoa <span class="sr-only">(current)</span></a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Pesquisar" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Pesquisar</button>
        </form>
    </div>
</nav>

<main>
	<div class="conteudo lista">
		<ul style="list-style: none;">
			<li>
				ID: <b>${ pessoa.id }</b>
			</li>
			<li>
				Nome: <b>${ pessoa.nome }</b>
			</li>
			<li>
				Data de Nascimento: <b>${ pessoa.dtNascimento }</b>
			</li>
			<li>
				Sexo: <b>${ pessoa.sexo }</b>
			</li>
			<li class="btns">
			 	<button class="btn-enviar" onclick="window.location.assign('http://localhost:8080/study-project/pessoa?action=listPessoas')">Voltar</button>
			</li>
		</ul>
	</div>
</main>
</body>
</html>