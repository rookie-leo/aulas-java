package br.com.sys.model;

public class Personagem {

	private String nome;
	private String classe;
	private int codigo;
	protected int vida;
	protected int forca;
	protected int defesa;
	
	public Personagem(){}
	
	public Personagem(String nome, int vida, int forca, int defesa){
		this.nome = nome;
		this.vida = vida;
		this.forca = forca; 
		this.defesa = defesa;
	}

	public Personagem(String nome, String classe, int vida, int forca, int defesa){
		this.nome = nome;
		this.classe = classe;
		this.vida = vida;
		this.forca = forca; 
		this.defesa = defesa;
	}
	
	
//	Métodos
	public int ataque(int vidaInimigo) {
		return forca - vidaInimigo;
	}

	
//	Getter and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	
}
