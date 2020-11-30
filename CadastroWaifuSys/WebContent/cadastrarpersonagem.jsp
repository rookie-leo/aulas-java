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
<title>Cadastrar Personagem</title>
</head>
<body>
	 <form method="post" action="entrada">
		<b>Nome: </b><input type="text" name="txtnome" size="50%"><br>
		<b>Classe: </b><select name="txtclasse" value="${personagem.classe }">				
					<option>Guerreiro</option>
					<option>Berzek</option>
					<option>Mago</option>
				</select><br>
		<b>Vida:</b> <input type="text" name="txtvida" size="2%"><br>
		<b>Força:</b> <input type="text" name="txtforca" size="2%"><br>
		<b>Defesa:</b> <input type="text" name="txtdefesa" size="2%"><br>
		<input type="hidden" name="txtacao" value="incluir">
		<br>
		<input type="submit" value="Salvar Personagem">
	</form>
</body>
</html>