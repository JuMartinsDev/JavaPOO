package br.com.fiap.jogatina.model;

public class ExemploCarta {

	public static void main(String[] args) {
		
		// da crtl + espaço vc importa a classe que vc quer usar
		Carta as = new Carta(1, '♠');
		//nome da classe sempre com a 1 letra maiúscula e o nome do arqueivo sempre será igual
		System.out.println(as);
		
		Carta dois = new Carta(10, '♣');
		System.out.println(dois);
		
		Carta tres = new Carta(14, '♦');
		System.out.println(tres);
		
	}
	
	
}
