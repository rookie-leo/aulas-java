package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
				
		System.out.println(parOuImpar.apply(5));
		
		Function<String, String> oResultadoEh = 
				valor -> "O resultado é: " + valor;
				
		Function<String, String> empolgado = valor -> valor + "!!!";
				
		String resultadoFinal = parOuImpar
				.andThen(oResultadoEh)
				.andThen(empolgado)
				.apply(2); 
		System.out.println(resultadoFinal);
	}
}
