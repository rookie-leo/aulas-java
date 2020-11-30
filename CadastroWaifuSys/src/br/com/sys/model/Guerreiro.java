package br.com.sys.model;

public class Guerreiro extends Personagem implements Espada{

	
	Guerreiro(String nome, String classe, int vida, int forca, int defesa){
		super(nome, classe, vida, forca, defesa);
	}
	
	@Override
	public void especial() {
		double sorte = Math.random();
		int forcaMais =(int)( 1 + sorte * (10 - 0));
		forca += forcaMais;
		vida += 15;
	}
	
}
