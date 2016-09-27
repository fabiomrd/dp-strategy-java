package br.com.fbmiranda;

public class Main {

	public static void main(String[] args) {
		
		
		Lutador caio = new Lutador("Caio",100);
		Lutador jones= new Lutador("Jones",100);
		
		System.out.println("Simula��o de luta");
		System.out.println(" \n# " + caio.getNome() + " VS " + jones.getNome() + " #\n ");
		
		System.out.println("Inicio da Luta!!!");
				
		caio.usarSoco(jones);
		
		jones.usarChute(caio);
		
		caio.usarRasteira(jones);
		
		// No Strategy Design Pattern, o objetivo � realizar uma opera��o com maneiras diferentes, ou seja, estrat�gias diferentes.
		
		//Neste exemplo, os lutadores possuem diferentes estrat�gias (Golpes) para atacar o oponente.
		//Cada golpe, possui um dano de ataque. O Soco causa 25 de dano, Chute 35, Rasteira 40.
		//� poss�vel adicionar novos golpes e/ou modificar o dano que cada um deles causa no oponente.
	}


	
}
