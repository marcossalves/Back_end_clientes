<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="model.DAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.JavaBeans"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Clientes</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Cadastro de clientes</h1>
	<a href="clientes.jsp" class="Botao1">Novo cliente</a>
	<table id="estilo">
		<thead>
			<th>Idcliente</th>
			<th>Nome</th>
			<th>Cpf</th>
			<th>Sexo</th>
			<th>Email</th>
			<th>Telefone</th>
			<th>Tipo</th>
			<th>Logradouro</th>
			<th>Numero</th>
			<th>Complemento</th>
			<th>Bairro</th>
			<th>Cep</th>
			<th>Usuário</th>
			<th>Senha</th>
		</thead>
		<tbody>
			<%
				DAO dao = new DAO();
			
			ArrayList<JavaBeans> clientes = dao.listarClientes(); // 1 e //5
			for (int i = 0; i < clientes.size(); i++) {
			%>
			<tr>
				<td><%=clientes.get(i).getIdcliente()%></td>
				<td><%=clientes.get(i).getNomecliente()%>
				<td><%=clientes.get(i).getCpf()%>
				<td><%=clientes.get(i).getSexo()%>
				<td><%=clientes.get(i).getEmail()%>
				<td><%=clientes.get(i).getTelefone()%>
				<td><%=clientes.get(i).getTipo()%>
				<td><%=clientes.get(i).getLogradouro()%>
				<td><%=clientes.get(i).getNumero()%>
				<td><%=clientes.get(i).getComplemento()%>
				<td><%=clientes.get(i).getBairro()%>
				<td><%=clientes.get(i).getCep()%>
				<td><%=clientes.get(i).getNomeusuario()%>
				<td><%=clientes.get(i).getSenha()%>
				<td><a
					href="update1?idcliente=<%=clientes.get(i).getIdcliente()%>" class="Botao1">Editar</a><a
					href="delete?idcliente=<%=clientes.get(i).getIdcliente()%>" class="Botao1">Excluir</a></td>
			</tr>
			<%
				}
			%>

		</tbody>
	</table>
</body>

</html>