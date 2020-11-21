<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Lista Pessoas</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <link rel="stylesheet" href="_css/style.css">
</head>

<body>
</body>
<nav class="navbar navbar-expand-lg navbar-dark bg-quantum">
    <a class="navbar-brand border-nav-title" href="#">Study <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-card-list" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M14.5 3h-13a.5.5 0 0 0-.5.5v9a.5.5 0 0 0 .5.5h13a.5.5 0 0 0 .5-.5v-9a.5.5 0 0 0-.5-.5zm-13-1A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-13z"/>
  <path fill-rule="evenodd" d="M5 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 5 8zm0-2.5a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7a.5.5 0 0 1-.5-.5zm0 5a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7a.5.5 0 0 1-.5-.5z"/>
  <circle cx="3.5" cy="5.5" r=".5"/>
  <circle cx="3.5" cy="8" r=".5"/>
  <circle cx="3.5" cy="10.5" r=".5"/>
</svg></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="http://localhost:8080/study-project">Página Inicial</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="http://localhost:8080/study-project/pessoa?action=listPessoas">Lista Pessoas <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="http://localhost:8080/study-project/pessoa?action=cadPessoa">Cadastrar Pessoa</a>
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
		<c:if test="${ param.ae == 'newPerson' }">
			<h6 style="color: blue"> Nova pessoa criada!</h6>
		</c:if>
		<c:if test="${ param.ae == 'editPerson' }">
			<h6 style="color: blue"> Pessoa editada!</h6>
		</c:if>
		<c:if test="${ param.ae == 'delPerson' }">
			<h6 style="color: red"> Pessoa deletada!</h6>
		</c:if>
		<table>
		<thead>
		<tr>
			<td> ID </td>
			<td> Nome </td>
			<td> Nascimento </td>
			<td> Sexo </td>
			<td> Acões </td>
		 </tr>
		</thead>
		<tbody>
		<c:forEach var="pessoa" items="${listPessoas }">
		<tr>
			<td> <c:out value="${ pessoa.id }" /> </td>
			<td> <c:out value="${ pessoa.nome }" /> </td>
			<td> <c:out value="${ pessoa.dtNascimento }" /> </td>
			<td> <c:out value="${ pessoa.sexo }" /> </td>
			<td> 
				<button onclick="window.location.href = 'http://localhost:8080/study-project/pessoa?action=editPessoa&id=${ pessoa.id }'">Editar</button> |
				<button onclick="window.location.href = 'http://localhost:8080/study-project/pessoa?action=verPessoa&id=${ pessoa.id }'">Ver</button> |
				<button onclick="window.location.href = 'http://localhost:8080/study-project/pessoa?action=delPessoa&id=${ pessoa.id }'">Deletar</button> 
			</td>
		 </tr>
		</c:forEach>
		</tbody> 
		</table>
		<br/>
		<div>
		<button class="btnCadPessoa" onclick="window.location.href = 'http://localhost:8080/study-project/pessoa?action=cadPessoa'">Nova Pessoa</button>
		</div>
	</div>
</main>


<script src="_js/JQuery.js" type="text/javascript"></script>
<script src="_js/script.js" type="text/javascript"></script>
<script type="text/javascript">
	if(performance.navigation.type == 1) {
		window.location.assign("http://localhost:8080/study-project/pessoa?action=listPessoas");
	}
</script>
<c:if test="${ redirectNewPerson == true }"><script type="text/javascript">window.location.assign("http://localhost:8080/study-project/pessoa?action=listPessoas&ae=newPerson");</script></c:if>
<c:if test="${ redirectEditPerson == true }"><script type="text/javascript">window.location.assign("http://localhost:8080/study-project/pessoa?action=listPessoas&ae=editPerson");</script></c:if>
<c:if test="${ redirectDelPerson == true }"><script type="text/javascript">window.location.assign("http://localhost:8080/study-project/pessoa?action=listPessoas&ae=delPerson");</script></c:if>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>

</html>