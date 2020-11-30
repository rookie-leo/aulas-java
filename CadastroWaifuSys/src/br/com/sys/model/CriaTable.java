package br.com.sys.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*Classe responsável por criar a tabela de personagens em MySQL*/

public class CriaTable {

public static void criarTable() {
		
	Connection con = Conexao.receberConexao();
		try {
		//Se a tabela de personagens não existir no banco de dados, o sistema cria uma.				
			String sql = 
					 "create table if not exists personagem("
					+ "codigo INT PRIMARY KEY AUTO_INCREMENT,"
					+ "nome VARCHAR(50) NOT NULL,"
					+ "classe VARCHAR(20) NOT NULL,"
					+ "vida INT NOT NULL,"
					+ "forca INT NOT NULL,"
					+ "defesa INT NOT NULL"
					+ ");";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.execute();
			ps.close();
		}catch (SQLException e) {
			//Se a tabela já existir no sistema, esse erro não será levantado
			System.err.println("Não foi possivel criar a tabela!");
			e.printStackTrace();
		}
	}

}
