package jogoDaForca;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		Forca f = new Forca();
		
		while(!f.enforcou() && !f.acertou()) {
		System.out.println(f.getPalavraFechada());
		
		System.out.println("Letra: ");
		char c = tec.nextLine().charAt(0);
		f.chuta(c);
		
		}
		
		if(f.enforcou()) {
			System.out.println("Perdeu: "+ f.getPalavraAberta());
		}else {
			System.out.println("Parabéns");
		}
		
	}

}
