package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Jaque", 7.1);
		Aluno a2 = new Aluno("Leo", 8.1);
		Aluno a3 = new Aluno("Le", 6.1);
		Aluno a4 = new Aluno("Cida", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = a -> a.getNota() >= 7;
		Predicate<Aluno> reprovados = aprovados.negate();
		
		System.out.println(alunos.stream().allMatch(aprovados));//Todos foram aprovados? false
		System.out.println(alunos.stream().anyMatch(aprovados));//Alguém foi aprovado? true
		System.err.println((alunos.stream().noneMatch(reprovados)));
		//Alguém foi reprovado? sim, mas o valor foi invertido com o negate
	}
}
