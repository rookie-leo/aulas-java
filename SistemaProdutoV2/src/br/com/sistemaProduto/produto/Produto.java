package br.com.sistemaProduto.produto;

public class Produto {

//	atributos
	private String nome;
	private int cod;
	private int qtde;
	private double preco;
	
//	metodos
	public Produto(){}
	
	public Produto(String nome, int qtde, double preco){
		this.nome = nome;
		this.qtde = qtde;
		this.preco = preco;
		this.subTotal();
	}
	
	public double subTotal() {
		return this.preco * this.qtde;
	}
	
//	getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	} 
}
