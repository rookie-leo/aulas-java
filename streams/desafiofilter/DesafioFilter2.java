package streams.desafiofilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

	public static void main(String[] args) {
		
		Produto prod1 = new Produto("Luminária", 100.50, 0.35, false);
		Produto prod2 = new Produto("Mesa Desk", 242.90, 0.32, true);
		Produto prod3 = new Produto("Teclado", 85.99, 0.15, false);
		Produto prod4 = new Produto("Mouse gamer", 145.50, 0.31, true);
		Produto prod5 = new Produto("Impressora", 399.85, 0.30, true);
		Produto prod6 = new Produto("Arquivo", 100.00, 0.10, false);
		
		List<Produto> produtos = Arrays.asList(prod1, prod2, prod3, prod4, prod5, prod6);
		
		Predicate<Produto> desconto = 
				p -> p.getDesconto() >= 0.30;
		Predicate<Produto> freteGratis = 
				p -> p.isFrete() == true;
		Function<Produto, String> promocao = 
				p -> "Super promoção! " 
				+ p.getNome() 
				+ " por apenas R$" 
				+ String.format("%.2f", p.calcularDesconto()) 
				+ " e com frete grátis!!!"; 
		
		produtos.stream()
			.filter(desconto)
			.filter(freteGratis)
			.map(promocao)
			.forEach(System.out::println);
	}
}
