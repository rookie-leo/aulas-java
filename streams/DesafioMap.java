package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	/*
	 * 1. Número para String binária. Ex.: 6 => "110"
	 * 2. Inverter a string. Ex.: "110" => "011"
	 * 3. Converter de volta para inteiro. Ex.: "011" => 3
	 * */
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Consumer<Object> print = System.out::println;
		
		Function<Integer, String> bin = x -> Integer.toBinaryString(x);//converte de dec para bin
		UnaryOperator<String> inverte = i -> new StringBuilder(i).reverse().toString();//inverte a ordem da str
		Function<String, Integer> dec = x -> Integer.parseInt(x, 2);//converte de bin para dec
		
		nums.stream().map(bin).map(inverte).map(dec).forEach(print);;
	}
}
