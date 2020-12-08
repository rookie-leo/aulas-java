package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<List<String>> list1 = () -> Arrays.asList("Jaque", "Le", "Leo", "Cida");
		System.out.println(list1.get());
	}
}
