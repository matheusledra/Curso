<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pessoa</title>
<link rel="stylesheet" href="_css/style.css">
</head>
<body>
	<header>
		<h1>Dados de <b><c:out value="${ pessoa.nome }"/></b>:</h1>
		<hr>
	</header>
	<main>
	<div class="infos-pessoa">
		<ul class="lista-infos">
			<li><b>ID:</b> <c:out value="${ pessoa.id }"/></li>
			<li><b>Nome:</b> <c:out value="${ pessoa.nome }"/></li>
			<li><b>Nascimento:</b> <c:out value="${ pessoa.dtNascimento }"/></li>
			<li><b>Sexo:</b> 
				<c:if test="${ pessoa.sexo == 'M' }">Masculino</c:if>
				<c:if test="${ pessoa.sexo == 'F' }">Feminino</c:if>
			</li>
			<li><button onclick="window.history.back();">Voltar</button></li>
		</ul>
	</div>
	</main>
</body>
</html>