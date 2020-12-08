package streams.desafiofilter;

public class Personagem {

	private final String nome;
	private final double vida;
	private final int kill;
	private final int mortes;
	
	Personagem(String nome, double vida, int kill, int mortes){
		this.nome = nome;
		this.vida = vida;
		this.kill = kill;
		this.mortes = mortes;
	}

	public String getNome() {
		return nome;
	}

	public double getVida() {
		return vida;
	}

	public int getKill() {
		return kill;
	}

	public int getMortes() {
		return mortes;
	}
	
	
	
}
