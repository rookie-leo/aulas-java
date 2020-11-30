package br.com.sys.model;

public class Berserk extends Personagem implements Machado {

	Berserk(String nome, String classe, int vida, int forca, int defesa){
		super(nome, classe, vida, forca, defesa);
	}
	
	@Override
	public void atkPesado() {
		
	}
}
