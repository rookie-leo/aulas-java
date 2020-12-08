package lambdas;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class TesteLambdas {

	public static void main(String[] args) {
		
		//recebe um tipo int e retorna um tipo int
		UnaryOperator<Integer> maisDois = x -> x + 2;
		UnaryOperator<Integer> vezesQuatro = x -> x * 4;
		UnaryOperator<Integer> aoQuadrado = x -> x * x;
		//recebe um tipo int e retorna um tipo boolean
		Predicate<Integer> isEven = y -> y % 2 == 0;
		//recebe um tipo boolean e retorna um tipo Str
		Function<Boolean, String> evenOrOdd = z -> 
			z == true ? "É par!" : "É impar!";
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int user = kb.nextInt();
		kb.close();
		
		int result = maisDois.andThen(vezesQuatro)
				.andThen(aoQuadrado).apply(user);
		
		boolean par = isEven.test(result);
		
		System.out.println(result);
		
		System.out.println(evenOrOdd.apply(par));
	}
}
