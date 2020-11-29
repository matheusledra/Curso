<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<title>ERRO 404!</title>
<script src="https://kit.fontawesome.com/939df34509.js" crossorigin="anonymous"> </script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<div style="width: 100%; text-align: center; margin-top: 10em;">
		<h1><b>OOPS!</b></h1>
		<h2 style="color: red;">ERRO 404!</h2>
		<p>
			Ação de página não encontrada <br>(<c:out value="${ action }"/>)
		</p>
		<a class="btn btn-success" href="http://localhost:8080/serie-votos/inicio"><i class="fas fa-home"></i></a>
	</div>
</body>
</html>