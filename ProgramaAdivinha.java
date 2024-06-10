package br.com.fiap.jogo.app;

import java.util.Scanner;

import br.com.fiap.jogo.model.JogoAdivinha;

public class ProgramaAdivinha {
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		JogoAdivinha jogo = new JogoAdivinha();
		int num;
		String resp;
		
		while(true) {
		
		System.out.println("Digite o número: ");
		num = tec.nextInt();
		
		resp = jogo.chute(num);
		
		System.out.println(resp);
		if(resp.equalsIgnoreCase("Você acertou!")) {
			System.out.println(jogo.getTentativas()+" tentativas ");
			System.exit(0);
			}
		}
	}
}
