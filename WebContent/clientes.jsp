<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Clientes</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<form name="frmClientes" action="insert">
		<h1>Novo cliente</h1>
		
		<table id="estilo">
			<tr>
				<td><input type="text" name="nomecliente" placeholder="Nome"></td>
			</tr>

			<tr>
				<td><input type="text" name="cpf" placeholder="Cpf"></td>
			</tr>

			<tr>
				<td><input type="text" name="sexo" placeholder="Sexo"></td>
			</tr>

			<tr>
				<td><input type="text" name="email" placeholder="E-mail"></td>
			</tr>

			<tr>
				<td><input type="text" name="telefone" placeholder="Telefone"></td>
			</tr>

			<tr>
				<td><input type="text" name="tipo" placeholder="Tipo"></td>
			</tr>


			<tr>
				<td><input type="text" name="logradouro"
					placeholder="Logradouro"></td>
			</tr>

			<tr>
				<td><input type="text" name="numero" placeholder="Numero"></td>
			</tr>



			<tr>
				<td><input type="text" name="complemento"
					placeholder="Complemento"></td>
			</tr>


			<tr>
				<td><input type="text" name="bairro" placeholder="Bairro"></td>
			</tr>


			<tr>
				<td><input type="text" name="cep" placeholder="Cep"></td>
			</tr>



			<tr>
				<td><input type="text" name="nomeusuario"
					placeholder="Nome usuário"></td>
			</tr>

			<tr>
				<td><input type="text" name="senha" placeholder="Senha"></td>
			</tr>

		</table>
		<input  class="Botao1" type="button" value="Adicionar"  onclick="validar()">
		<script src="validador.js"></script>
	</form>
</body>
</html>