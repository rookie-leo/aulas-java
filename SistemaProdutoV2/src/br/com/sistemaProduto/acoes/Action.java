package br.com.sistemaProduto.acoes;

import java.util.ArrayList;

import br.com.sistemaProduto.dao.ProdutoDao;
import br.com.sistemaProduto.produto.Produto;

public class Action {

	public void cadastrarProduto(String nome, int qtde, double preco) {
		Produto produto = new Produto(nome, qtde, preco);
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.cadastrar(produto);
		
	}
	
	public void mostrarTodosProdutos() {
		ProdutoDao prod = new ProdutoDao();
		ArrayList<Produto> produtos = prod.mostrarTodos();
		
		for(Produto produto: produtos) {
			System.out.println("Código: " + produto.getCod());
			System.out.println("Produto: " + produto.getNome());
			System.out.println("Preço: R$ " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQtde());
			System.out.println("Sub Total: R$ " + produto.subTotal());
			System.out.println("||||||||||||||||||||||||||||||||||||||||");
		}
	}

	public void mostrarProdutoPorCod(int cod) {
		ProdutoDao produtoDao = new ProdutoDao();
		Produto produto = produtoDao.mostrarPorCod(cod); 
		
		System.out.printf("Código: %d", produto.getCod());
		System.out.printf("\nProduto: %s", produto.getNome());
		System.out.printf("\nPreço Unitário: R$ %.2f", produto.getPreco());
		System.out.printf("\nQuantidade: %d", produto.getQtde());
		System.out.printf("\nSubTotal: R$ %.2f\n", produto.subTotal());
	}
	
	public void mostrarProdutoPorNome(String nome) {
		ProdutoDao produtoDao = new ProdutoDao();
		Produto produto = produtoDao.mostrarPorNome(nome);
		
		System.out.printf("Código: %d", produto.getCod());
		System.out.printf("\nProduto: %s", produto.getNome());
		System.out.printf("\nPreço Unitário: R$ %.2f", produto.getPreco());
		System.out.printf("\nQuantidade: %d", produto.getQtde());
		System.out.printf("\nSubTotal: R$ %.2f\n", produto.subTotal());
	}
	
	public void alterarProdutoPorCod(int cod, String nome, int qtde, double preco) {
		Produto prod = new Produto(nome, qtde, preco);
		prod.setCod(cod);
		prod.setNome(nome);
		prod.setQtde(qtde);
		prod.setPreco(preco);
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.alterarProduto(prod);
	}
	
	public void alterarNomeProduto(int cod,String nome) {
		Produto prod = new Produto();
		
		prod.setCod(cod);
		prod.setNome(nome);
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.alterarProduto(prod);
	}
	
	public void alterarQtdeProduto(int cod, int qtde) {
		Produto prod = new Produto();
		
		prod.setQtde(qtde);
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.alterarProduto(prod);
	}

	public void excluirProduto(int cod) {
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.excluir(cod);
	}
}
