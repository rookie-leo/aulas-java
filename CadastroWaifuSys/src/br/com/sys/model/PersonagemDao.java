package br.com.sys.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonagemDao {

//	M�todos
	public void cadastratar(Personagem personagem) {
		CriaTable.criarTable();//Verifica se existe a tabela personagem, e cria uma caso n�o exista.
		
		try {
			Connection con = Conexao.receberConexao();//Estabelece uma conex�o com o banco de dados
			
			//Recebe as informa��es inseridas pelo usu�rio e cadastra um novo personagem
			String sql = "INSERT INTO personagem(nome, classe, vida, forca, defesa)"
					+ "VALUES(?, ?, ?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, personagem.getNome());
			ps.setString(2, personagem.getClasse());
			ps.setInt(3, personagem.getVida());
			ps.setInt(4, personagem.getForca());
			ps.setInt(5, personagem.getDefesa());
			
			ps.execute();
			ps.close();
		}catch(SQLException e) {
			System.err.println("Erro ao cadastrar personagem!");
			e.printStackTrace();
		}
	}

	public ArrayList<Personagem> mostrarTodos(){//Mostra todos os personagens j� cadastrados no banco de dados
		Connection con = Conexao.receberConexao();
		
		ArrayList<Personagem> personagens = new ArrayList<Personagem>();
		
		String sql = "SELECT * FROM personagem";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				Personagem personagem = new Personagem();
				personagem.setCodigo(result.getInt("codigo"));
				personagem.setNome(result.getString("nome"));
				personagem.setClasse(result.getString("classe"));
				personagem.setVida(result.getInt("vida"));
				personagem.setForca(result.getInt("forca"));
				personagem.setDefesa(result.getInt("defesa"));
				personagens.add(personagem);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return personagens;
	}
	
	public Personagem mostrarPorCodigo(int cod) {//Mostra as informa��es apenas do personagem selecionado 

		Connection con = Conexao.receberConexao();
		Personagem personagem = null;
		
		String sql = "SELECT * FROM personagem WHERE codigo = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cod);
			ResultSet result = ps.executeQuery();
			
			if(result.next()) {
				personagem = new Personagem();
				personagem.setCodigo(result.getInt("codigo"));
				personagem.setNome(result.getString("nome"));
				personagem.setVida(result.getInt("vida"));
				personagem.setForca(result.getInt("forca"));
				personagem.setDefesa(result.getInt("defesa"));
			}else {
				System.err.println("Personagem n�o encontrado!");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return personagem;
	}
	
	public void excluirPorCodigo(int cod) {//Exclui o personagem selecionado
		Connection con = Conexao.receberConexao();
		
		String sql = "DELETE FROM personagem WHERE codigo = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cod);
			
			ps.execute();
			ps.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarPorCod(Personagem personagem) {//Altera informa��es do personagem selecionado
		Connection con = Conexao.receberConexao();
		
		String sql = "UPDATE personagem SET nome = ?, classe = ?, vida = ?, forca = ?, defesa = ? WHERE codigo = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, personagem.getNome());
			ps.setString(2, personagem.getClasse());
			ps.setInt(3, personagem.getVida());
			ps.setInt(4, personagem.getForca());
			ps.setInt(5, personagem.getDefesa());
			ps.setInt(6, personagem.getCodigo());
			
			ps.execute();
			ps.close();
		}catch(SQLException e) {
			System.err.println("Erro na altera��o!");
			e.printStackTrace();
		}
	}
}
