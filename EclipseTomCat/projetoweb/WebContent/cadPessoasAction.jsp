<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Pessoas</title>
</head>
<body>
	<header>
		<h1>Cadastro de Pessoas</h1>
		<hr>
	</header>
	<main>
		<fieldset>
			<legend>Cadastro</legend>
			<div>
				<form action="pessoa?action=cadNovaPessoa" method="post">
					<ul style="list-style: none;">
						<li>
							<label>Nome:</label>
							<input type="text" name="nome" placeholder="Informe seu nome">
							<span id="nomeValidate"></span>
						</li>
						<li>
							<label>Nascimento:</label>
							<input type="date" name="nascimento">
							<span id="nascimentoValidate"></span>
						</li>
						<li>
							<label>Sexo: </label>
							<input type="radio" name="masc">
							<label for="masc">Masc</label>
							<input type="radio" name="fem">
							<label for="fem">Fem</label>
						</li>
						<li> 
							<button type="submit">Cadastrar</button>
						</li>
					</ul>
				</form>
			</div>
		</fieldset>
	</main>

</body>
</html>