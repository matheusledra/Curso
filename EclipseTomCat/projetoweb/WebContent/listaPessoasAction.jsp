<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Pessoas</title>
<link rel="stylesheet" href="_css/style.css">
</head>
<body>
	<header>
		<h1> Lista de Pessoas</h1>
		<hr>
	</header>
	<main>
		<div class="fundo-tabela">
			<table>
				<thead>
					<tr>
						<td>#</td>
						<td>Nome</td>
						<td>Nascimento</td>
						<td>Sexo</td>
						<td>Ações</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="pessoa" items="${listaPessoas}">
						<tr>
							<td> <c:out value="${ pessoa.id }" /> </td>
							<td> <c:out value="${ pessoa.nome }" /> </td>
							<td> <c:out value="${ pessoa.dtNascimento }" /> </td>
							<td> <c:out value="${ pessoa.sexo }" /> </td>
							<td> 
							<button>
							<a href="pessoa?action=verPessoa&id=${pessoa.id}">Ver</a>
							</button> | <button onclick="apagarPessoa(${pessoa.id})">Apagar</button> </td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</main>
</body>
</html>