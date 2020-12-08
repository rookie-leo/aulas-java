package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map{
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		System.out.println("\n\n");
		
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeira = n -> n.charAt(0) + "";
		UnaryOperator<String> grito = n -> n + "!!! ";
		
		marcas.stream().forEach(print);
		System.out.println("\n\n");
		marcas.stream().map(primeira).map(grito).forEach(print);
		System.out.println("\n\n");
		marcas.stream()
			.map(maiuscula)
			.map(primeira)
			.map(grito)
			.forEach(print); 
		
		System.out.println("\n\nUsando a classe Utilitarios...");
		marcas.stream().map(Utilitarios.primeira).map(Utilitarios.grito()).forEach(print);;
	}
}