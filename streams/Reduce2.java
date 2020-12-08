package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Jaque", 7.1);
		Aluno a2 = new Aluno("Leo", 8.1);
		Aluno a3 = new Aluno("Le", 6.1);
		Aluno a4 = new Aluno("Cida", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = a -> a.getNota() >= 7;
		Function<Aluno, Double> getNotas= a -> a.getNota();
		BinaryOperator<Double> totalNotas = (ac, x) -> ac + x;
		
		alunos.parallelStream()
			.filter(aprovados)
			.map(getNotas)
			.reduce(totalNotas)
			.ifPresent(System.out::println);
		
	}
}
