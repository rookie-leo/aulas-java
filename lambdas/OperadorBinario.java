package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.5, 8.9));
		
		BiFunction<Double, Double, String> result = (n1, n2) -> {
			double notaFinal = (n1 + n2) /2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		System.out.println(result.apply(9.5, 2.0));
		
		Function<Double, String> conceito = m -> m >= 7 ?
				"Aprovado" : "Reprovado";
		System.out.println(conceito.apply(media.apply(5.7, 10.0)));
	}
}
