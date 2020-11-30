package br.com.sys.model;

public class Mago extends Personagem implements Cajado{

	
	Mago(String nome, String classe, int vida, int forca, int defesa){
		super(nome, classe, vida, forca, defesa);
	}
	
	@Override
	public void atkMagico() {}
	
}
