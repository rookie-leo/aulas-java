<%@page import="br.com.sys.model.Personagem" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html>
<html>
<head>
<!-- CSS interno -->
<style type="text/css">
	body{
		background-color: white;
	}
	button{
		color: #cc8202;
		background-color: #590111;
	}
	td{
		
		text-align:center;
	}
</style>
<meta charset="ISO-8859-1">
<title>Tabela de Personagens</title>
</head>
<body>
	<!-- Tabela dos personagens já cadastrados -->
	<table border="1" bgcolor="#cfc8c8">
		<thead>
			<tr bgcolor="#590111" style="color:#cc8202">
				<th>Código</th>
				<th>Nome</th>
				<th>Classe</th>
				<th>Vida</th>
				<th>Força</th>
				<th>Defesa</th>
				<th colspan="2">Ação</th>				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="personagem" items="${personagens}">
				<tr>
					<td bgcolor="#590111" style="color: #cc8202">${personagem.codigo}</td><!--Se der erro, colocar getCodigo-->
					<td style="background-color: #f0cccc">${personagem.nome }</td>
					<td style="background-color: #f0cccc">${personagem.classe }</td>
					<td style="background-color: #f0cccc">${personagem.vida }</td>
					<td style="background-color: #f0cccc">${personagem.forca }</td>
					<td style="background-color: #f0cccc">${personagem.getDefesa()}</td>
					<td style="background-color: #f0cccc"><a href="entrada?acao=alterar&codigo=${personagem.codigo }">Alterar</a></td>
					<td style="background-color: #f0cccc"><a href="entrada?acao=excluir&codigo=${personagem.codigo }">Excluir</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<a href="entrada?acao=incluir"><button><b>Nova Carta</b></button></a><!-- Botão para cadastrar um novo personagem -->
</body>
</html>