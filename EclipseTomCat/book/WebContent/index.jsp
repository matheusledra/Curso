<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="https://cdn.statically.io/gh/Math1307/css/main/style.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
</head>
	<div class="login">
		<c:if test="${ registrado == true }">
			<h6 style="color: green;">Registrado com sucesso!</h6>
		</c:if>
		<c:if test="${ error == true }">
			<h6 style="color: red;">Erro ao logar-se</h6>
		</c:if>
		<form action="login" method="post">
			<div class="form-group">
				<label for="nome">User: </label> <input type="text" name="login"
					class="form-control" placeholder="Insira seu Usuario"> <label
					for="nome">Senha: </label> <input type="text" name="senha"
					class="form-control" placeholder="Insira sua senha">
			</div>
			<div class="from-group">
				<input type="hidden" name="action" value="login">
				<button type="submit" class="btn btn-success">Logar</button>
				<a href="login?action=register" class="btn btn-danger">Registrar</a>
			</div>
		</form>
	</div>

	<!-- SCRIPT -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

	<!-- BOOTSTRAP -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
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