<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	//recebimento do conteúdo JavaBeans encaminhado pelo (Controller)
String idcliente = (String) request.getAttribute("idcliente");
String nomecliente = (String) request.getAttribute("nomecliente");
String cpf = (String) request.getAttribute("cpf");
String sexo = (String) request.getAttribute("sexo");
String email = (String) request.getAttribute("email");
String telefone = (String) request.getAttribute("telefone");
String tipo = (String) request.getAttribute("tipo");
String logradouro = (String) request.getAttribute("logradouro");
String numero = (String) request.getAttribute("numero");
String complemento = (String) request.getAttribute("complemento");
String bairro = (String) request.getAttribute("bairro");
String cep = (String) request.getAttribute("cep");
String nomeusuario = (String) request.getAttribute("nomeusuario");
String senha = (String) request.getAttribute("senha");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Agenda de clientes</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<form name="frmClientes" action="update2">
		<h1>Editar contato</h1>
		<table  id="estilo">

			<tr>
				<td><input type="text" name="idcliente" value="<%=idcliente%>"
					readonly></td>
			</tr>

			<tr>
				<td><input type="text" name="nomecliente"
					value="<%=nomecliente%>"></td>
			</tr>

			<tr>
				<td><input type="text" name="cpf" value="<%=cpf%>"></td>
			</tr>

			<tr>
				<td><input type="text" name="sexo" value="<%=sexo%>"></td>
			</tr>

			<tr>
				<td><input type="text" name="email" value="<%=email%>"></td>
			</tr>

			<tr>
				<td><input type="text" name="telefone" value="<%=telefone%>"></td>
			</tr>

			<tr>
				<td><input type="text" name="tipo" value="<%=tipo%>"></td>
			</tr>


			<tr>
				<td><input type="text" name="logradouro"
					value="<%=logradouro%>"></td>
			</tr>

			<tr>
				<td><input type="text" name="numero" value="<%=numero%>"></td>
			</tr>



			<tr>
				<td><input type="text" name="complemento"
					value="<%=complemento%>"></td>
			</tr>


			<tr>
				<td><input type="text" name="bairro" value="<%=bairro%>"></td>
			</tr>


			<tr>
				<td><input type="text" name="cep" value="<%=cep%>"></td>
			</tr>



			<tr>
				<td><input type="text" name="nomeusuario"
					value="<%=nomeusuario%>"></td>
			</tr>

			<tr>
				<td><input type="text" name="senha" value="<%=senha%>"></td>
			</tr>

		</table>
		<input class="Botao1" type="button" value="Salvar" onclick="validar()">
		</form>
	<script src="validador.js"></script>
</body>
</html>