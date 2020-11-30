package br.com.sys.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*Classe responsável por estabelecer conexão com o banco de dados*/

public class Conexao {
	
	
	public static Connection receberConexao() {
		
		Connection con = null;
		
		String user = "root";
		String senha = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/waifudb?useSSL=false", user, senha);

		}catch(SQLException | ClassNotFoundException e) {
			System.err.println("Não foi possivel estabelecer uma conexão!");
			throw new RuntimeException(e);
		}
		return con;
	}
}
