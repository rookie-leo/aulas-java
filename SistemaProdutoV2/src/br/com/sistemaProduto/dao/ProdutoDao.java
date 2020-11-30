package br.com.sistemaProduto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.sistemaProduto.conexao.Conexao;
import br.com.sistemaProduto.produto.Produto;

public class ProdutoDao {
	
	public void cadastrar(Produto produto) {
		try {
			Connection con = Conexao.conectar();
			
			String sql = "INSERT INTO produtos(nome, qtde, preco) VALUES(?, ?, ?)";
			
			PreparedStatement prepara = con.prepareStatement(sql);
			prepara.setString(1, produto.getNome());
			prepara.setInt(2, produto.getQtde());
			prepara.setDouble(3, produto.getPreco());
			prepara.execute();
			prepara.close();
			               
			System.out.println("Produto cadastrado");
		}catch(SQLException exc) {
			System.err.println("Falha no cadastro!");
			exc.printStackTrace();
		}
	}
	
	public ArrayList<Produto >mostrarTodos(){
		Connection con = Conexao.conectar();
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		String sql = "SELECT * FROM produtos";
		
		
		try {
			PreparedStatement preparar = con.prepareStatement(sql);
			ResultSet result = preparar.executeQuery();
			
			while(result.next()) {
				Produto prod = new Produto();
				prod.setCod(result.getInt("cod"));
				prod.setNome(result.getString("nome"));
				prod.setQtde(result.getInt("qtde"));
				prod.setPreco(result.getDouble("preco"));
				produtos.add(prod);
			}
		}catch(SQLException exc) {
			System.err.println("Não foi possivel conectar ao banco de dados!");
			exc.printStackTrace();
		}
		return produtos;
	}

	public Produto mostrarPorCod(int codigo) {
		Connection con = Conexao.conectar();
		
		Produto prod = null;
		String sql = "SELECT * FROM produtos WHERE cod = ?";
		
		try {
			PreparedStatement preparar = con.prepareStatement(sql);
			preparar.setInt(1, codigo);
			ResultSet result = preparar.executeQuery();
			
			if(result.next()) {
				prod = new Produto();
				prod.setCod(result.getInt("cod"));
				prod.setNome(result.getString("nome"));
				prod.setPreco(result.getDouble("preco"));
				prod.setQtde(result.getInt("qtde"));
			}else System.err.println("Produto não encontrado!");
		}catch(SQLException exc) {
			exc.printStackTrace();
		}
		return prod;
	}
	
	public Produto mostrarPorNome(String nome) {
		Connection con = Conexao.conectar();
		Produto produto = null;
		
		String sql = "SELECT * FROM produtos WHERE nome = ?";
		
		try {
			PreparedStatement preparar = con.prepareStatement(sql);
			preparar.setString(1, nome);
			ResultSet result = preparar.executeQuery();
			
			if(result.next()) {
				produto = new Produto();
				produto.setCod(result.getInt("cod"));
				produto.setNome(result.getString("nome"));
				produto.setPreco(result.getDouble("preco"));
				produto.setQtde(result.getInt("qtde"));
			}else System.err.println("Produto não encontrado!");
		}catch(SQLException exc) {
			exc.printStackTrace();
		}
		return produto;
	}

	public void alterarProduto(Produto produto) {
		Connection con = Conexao.conectar();
		
		String sql = "UPDATE produtos SET nome = ?, qtde = ?, preco = ? WHERE cod = ?";
		
		try {
			PreparedStatement preparar = con.prepareStatement(sql);
			preparar.setString(1, produto.getNome());
			preparar.setInt(2, produto.getQtde());
			preparar.setDouble(3, produto.getPreco());
			preparar.setInt(4, produto.getCod());
			preparar.execute();
			preparar.close();
			
			System.out.println("Produto alterardo com sucesso!");
		}catch(SQLException exc) {
			System.err.println("Houve um erro ao alterar o produto!");
			exc.printStackTrace();
		}
	}
	
	public void alterarNome(Produto produto) {
		Connection con = Conexao.conectar();
		
		String sql = "UPDATE produtos SET nome = ? WHERE cod = ?";
		
		try {
			PreparedStatement preparar = con.prepareStatement(sql);
			preparar.setString(1, produto.getNome());
			preparar.setInt(2, produto.getCod());
			preparar.execute();
			preparar.close();

			System.out.println("Produto alterardo com sucesso!");
		}catch(SQLException exc) {
			System.err.println("Houve um erro ao modificar o produto!");
			exc.printStackTrace();
		}
	}

	public void excluir(int codigo) {
		Connection con = Conexao.conectar();
		
		String sql = "DELETE FROM produtos WHERE cod = ?";
		
		try {
			PreparedStatement preparar = con.prepareStatement(sql);
			preparar.setInt(1, codigo);
			
			preparar.execute();
			preparar.close();
			
			System.out.println("Produto excluido!");
		}catch(SQLException exc) {
			exc.printStackTrace();
		}
	}
}
