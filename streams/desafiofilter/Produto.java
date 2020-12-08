package streams.desafiofilter;

public class Produto {

	private final String nome;
	private final boolean frete;
	private final double preco;
	private final double desconto;
	
	Produto(String nome, double preco, double desconto, boolean frete){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.frete = frete;
	}

	public double calcularDesconto() {
		return this.preco * (1 - this.desconto);
	}
	
	public String getNome() {
		return nome;
	}

	public boolean isFrete() {
		return frete;
	}

	public double getPreco() {
		return preco;
	}

	public double getDesconto() {
		return desconto;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", frete=" + frete + ", preco=" + preco + ", desconto=" + desconto + "]";
	}
		
	
}
