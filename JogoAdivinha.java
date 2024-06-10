package br.com.fiap.jogo.model;

import java.util.Random;

public class JogoAdivinha {

	private int tentativas;
	private int sorteado;
	
	public JogoAdivinha() {
		this.tentativas = 0; 
		
		Random aleatorio = new Random();
		this.sorteado = aleatorio.nextInt(1000)+1;
	}
	
	public int getTentativas() {
		return tentativas;
	}
	
	public String chute(int c) {
		
		this.tentativas++;
		
		if(this.sorteado==c) {
			return "Você acertou!";
		}else if(this.sorteado<c) { 
			return "Tente um número menor";
		}
		else {
			return "Tente um número maior";
		}
		}
	}
