package streams.desafiofilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Personagem p1 = new Personagem("Viktor", 10.5, 7, 5);
		Personagem p2 = new Personagem("Vivian", 25, 10, 12);
		Personagem p3 = new Personagem("Androxus", 5.5, 15, 3);
		Personagem p4 = new Personagem("Fernando", 80.5, 19, 5);
		Personagem p5 = new Personagem("Makoa", 79.9, 0, 17);
		Personagem p6 = new Personagem("Vora", 50.5, 11, 4);
		
		List<Personagem> personagens = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Personagem> kills = p -> p.getKill() >= 10;
		Predicate<Personagem> life = p -> p.getVida() >= 50 &&  p.getMortes() <= 5;
		Function<Personagem, String> jogadaPartida = 
				p -> p.getNome() + " Recebeu a jogada da partida, com " + p.getKill() + " kills";
		
		personagens.stream()
			.filter(kills)
			.filter(life)
			.map(jogadaPartida)
			.forEach(System.out::println);
		
	}
}
