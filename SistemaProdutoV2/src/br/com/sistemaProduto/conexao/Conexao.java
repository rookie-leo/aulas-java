package br.com.sistemaProduto.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection conectar() {
		Connection con =  null;
		
		final String path= "jdbc:mysql://localhost/dbprodutosv2?verifyServerCertificate=false&useSSL=true";
		final String user = "root";
		final String pass = "DevFox02";
		
		try {
			con = DriverManager.getConnection(path, user, pass);
			System.out.println("Conexão Estabelecida com sucesso!");
		}catch(SQLException exc) {
			System.err.println("Falha na conexão!");
			exc.printStackTrace();
		}
		return con;
	}
}
