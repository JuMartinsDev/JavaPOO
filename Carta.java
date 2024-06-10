package br.com.fiap.jogatina.model;

public class Carta {

	private int valor;
	private char naipe;
	
	//Construtor do objeto carta - inicia o objeto e instancia eles 
	public Carta(int v, char n) {
		//precisa ter um modificadore, na maioria das vezes é público
		//tem o mesmo nome da minha classe
		if(v<1 || v>13) {
			System.out.println("ERRO GERAL");
			System.exit(99); //termina a execução, finalização anormal do programa
		}
		valor=v;
		naipe=n;
	}
	
	public String toString() {
		if(valor == 1) 
			return "A" + naipe;
		else
			return valor + "" + naipe;  /// " é uma string vazia
	}

}
