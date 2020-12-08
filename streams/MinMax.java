package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Jaque", 7.1);
		Aluno a2 = new Aluno("Leo", 8.1);
		Aluno a3 = new Aluno("Le", 6.1);
		Aluno a4 = new Aluno("Cida", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno> melhorNota = (nota1, nota2) ->{
			if(nota1.getNota() > nota2.getNota()) return 1;
			if(nota1.getNota() < nota2.getNota()) return -1;
			return 0;
		};
		
		Comparator<Aluno> piorNota = (nota1, nota2) ->{
			if(nota1.getNota() > nota2.getNota()) return -1;
			if(nota1.getNota() < nota2.getNota()) return 1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());//melhor nota

		System.out.println(alunos.stream().min(melhorNota).get());//pior nota
		System.out.println(alunos.stream().max(piorNota).get());//pior nota
	}
}
