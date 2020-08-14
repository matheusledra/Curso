package Curso;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		String resposta = "";
		int num = 0;
		boolean repetir = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja tentar acertar o numero? S/N");
		resposta = sc.next();
		
		repetir = resposta.equalsIgnoreCase("S");
		
		if(repetir == true) {
			do {
				System.out.print("Digite um numero: ");
				num = sc.nextInt();
				
				if(num == 6) {
					System.out.println("Acertou! :D");
					
					repetir = false;
				} else {
					System.out.println("Errou! ;(");
					System.out.println("");
					System.out.println("Deseja tentar novamente?");
					resposta = sc.next();
					
					repetir = resposta.equalsIgnoreCase("S");
				}
			} while (repetir);
		}
	}

}
