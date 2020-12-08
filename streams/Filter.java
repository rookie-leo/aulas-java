package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Léo", 7.8, true);
		Aluno a2 = new Aluno("Lê", 5.8, true);
		Aluno a3 = new Aluno("Jaque", 9.8, false);
		Aluno a4 = new Aluno("Cida", 6.8, false);
		Aluno a5 = new Aluno("Gui", 7.1, false);
		Aluno a6 = new Aluno("Emi", 8.8, true);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
		Predicate<Aluno> comportamento = a -> a.isBomComportamento() == true;
		Function<Aluno, String> saudacao = a -> "Parabéns " + a.getNome() + "! Você foi aprovadx!!";
		
		alunos.stream()
			.filter(aprovado)
			.filter(comportamento)
			.map(saudacao)
			.forEach(System.out::println);
	}
}
