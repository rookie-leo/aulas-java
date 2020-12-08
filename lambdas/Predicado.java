package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 750;//verifica se o produto é caro ou não
		
		Produto produto = new Produto("Notebook", 3985.99, 0.15);
		System.out.println(isCaro.test(produto));
		
	}
}
