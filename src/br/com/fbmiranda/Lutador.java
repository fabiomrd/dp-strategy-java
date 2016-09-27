package br.com.fbmiranda;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Lutador implements Golpe{
	
	private String nome;
	private int vida;
	

	public Lutador(String nome, int vida) {
		super();
		this.nome = nome;
		this.vida = vida;
	}

	@Override
	public void usarSoco(Lutador oponente) {
		// TODO Auto-generated method stub
		oponente.vida = oponente.vida - 25;
		System.out.println(this.nome + " usou Soco e causou 25 de dano");
		System.out.println("Vida do "+ oponente.getNome() + ":" + oponente.getVida());
	}

	@Override
	public void usarChute(Lutador oponente) {
		oponente.vida = oponente.vida - 35;
		System.out.println(this.nome + " usou Chute e causou 35 de dano");
		System.out.println("Vida do "+ oponente.getNome() + ":" + oponente.getVida());
	}
	
	@Override
	public void usarRasteira(Lutador oponente) {
		oponente.vida = oponente.vida - 40;
		System.out.println(this.nome + " usou Rasteira e causou 40 de dano");
		System.out.println("Vida do "+ oponente.getNome() + ":" + oponente.getVida());
	}
	
	
	public String getNome() {
		return nome;
	}

	public int getVida() {
		return vida;
	}


}
