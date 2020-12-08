package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> printar = System.out::print;//pode ser tmb	Consumer<Object> printar = System.out::print;
//		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Python ", "PHP\n");
		langs.forEach(printar);
		
		String maisLangs[] = {"C ", "C++ ", "JS ", "HTML\n"};
		Stream.of(maisLangs).forEach(printar);
		
		Arrays.stream(maisLangs).forEach(printar);
		Arrays.stream(maisLangs, 1, 4).forEach(printar);
		
		List<String> outrasLangs = Arrays.asList("Pearl ", "Lua ", "Kotlin\n");
		outrasLangs.stream().forEach(printar);
		outrasLangs.parallelStream().forEach(printar);
		
//		Gerando Streams infinitas
//		Stream.generate(() -> "a").forEach(printar);//gera a letra "a" infinitamente
//		Stream.iterate(0, n -> n + 1).forEach(println);//gera numeros em sequencia infinitamente
//		Stream.iterate(0, n -> n++!= 150 ? n : 0).forEach(println);//roda infinitamente do zero ao 150

	}
}
