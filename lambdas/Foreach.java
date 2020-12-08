package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays
				.asList("Davi", "Jaque", "Léo", "Lê");
		
		System.out.println("Foreach tradicional: ");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nForeach lambda#01: ");
		aprovados.forEach((nome) -> 
			{System.out.println(nome + "!!!");});
		
		System.out.println("\nMethod Reference: ");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #2");
		aprovados.forEach(nome -> meuImprimir(nome));

		System.out.println("\nMethod Reference #02: ");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é " + nome);
	}
}











