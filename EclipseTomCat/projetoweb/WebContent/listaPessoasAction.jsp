<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="inc/header.jsp"></jsp:include>
	
	<main>
		<div class="fundo-tabela">
			<div class="container">
				<div class="row" id="cad-pessoa-container">
					<a class ="btn btn-success" href="pessoa?action=cadPessoa"><i class="fas fa-plus"></i>  Cadastrar Pessoa</a>
				</div>
			</div>
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
							<a class="btn btn-sm btn-success" href="pessoa?action=verPessoa&id=${ pessoa.id }"><i class="fas fa-info"></i></a> |
							<a class="btn btn-sm btn-warning" href="pessoa?action=edtPessoa&id=${ pessoa.id }"><i class="fas fa-edit"></i></a> |
							<a class="btn btn-sm btn-danger" href="pessoa?action=delPessoa&id=${ pessoa.id }"><i class="fas fa-trash"></i></a> 
							 </td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</main>
	</div>
</body>
</html>