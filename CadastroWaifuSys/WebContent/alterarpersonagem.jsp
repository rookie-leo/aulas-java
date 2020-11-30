<%@page import="br.com.sys.model.Personagem" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS interno -->
<style type="text/css">
	b{
		color: #cc8202;
	}
	body{
		background-color: #590111;
	}
</style>
<meta charset="ISO-8859-1">
<title>Alterar Personagem</title>
</head>
<body>
	<h2><b>Alterar Personagem</b></h2>
	 <form method="post" action="entrada">
		<b>Código:</b> <input type="text" name="txtcodigo" value="${personagem.codigo }" size="5" readonly>
		<b>Nome:</b> <input type="text" name="txtnome" value="${personagem.nome }" size="45"><br>
		<b>Classe:</b> <select name="txtclasse" value="${personagem.classe }">				
					<option>Guerreiro</option>
					<option>Berzek</option>
					<option>Mago</option>
				</select>
		<b>Vida:</b> <input type="text" name="txtvida" value="${personagem.vida }" size="5">
		<b>Força:</b> <input type="text" name="txtforca" value="${personagem.forca }" size="5">
		<b>Defesa:</b> <input type="text" name="txtdefesa" value="${personagem.defesa }" size="5"><br><br>
		
		<input type="hidden" name="txtacao" value="alterar">
		<input type="submit" value="Alterar Personagem">
	</form>
</body>
</html>