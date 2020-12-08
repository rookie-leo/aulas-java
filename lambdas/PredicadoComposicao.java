package lambdas;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		Scanner tcl = new Scanner(System.in);
		
		
		System.out.println(isPar.and(isTresDigitos).test(122));
		System.out.println(isPar.or(isTresDigitos).test(122));
		
		System.out.print("Digite um número: ");
		int user = tcl.nextInt();
		tcl.close();

		if(isPar.test(user) == true) {
			System.out.println("Par");
			if(isTresDigitos.test(user) == true)
				System.out.println("O número digitado tem 3 digitos.");
			else 
				System.out.println("O número digitado não tem 3 digitos");
				
		}else {
			System.out.println("Impar");
			if(isTresDigitos.test(user) == true)
				System.out.println("O número digitado tem 3 digitos.");
			else
				System.out.println("O número digitado não tem 3 digitos");
		}
	}
}
