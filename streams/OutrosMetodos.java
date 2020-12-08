package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Jaque", 7.1);
		Aluno a2 = new Aluno("Leo", 8.1);
		Aluno a3 = new Aluno("Le", 6.1);
		Aluno a4 = new Aluno("Cida", 10);
		Aluno a5 = new Aluno("Gui", 7.1);
		Aluno a6 = new Aluno("Leo", 8.1);
		Aluno a7 = new Aluno("Gê", 6.1);
		Aluno a8 = new Aluno("Cida", 10);
		
		List<Aluno> alunos =
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinct...");//Elimina as duplicações de dados
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit...");
		alunos.stream()
		.distinct()
		.skip(2)
		.limit(2)
		.forEach(System.out::println);
		
		System.out.println("\ntakeWhile...");
		alunos.stream()
		.distinct()
//		.skip(2)
		.takeWhile(a -> a.getNota() >= 7)
		.forEach(System.out::println);
		
	}
}
