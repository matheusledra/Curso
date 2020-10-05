package Curso;

import java.util.Scanner;

public class Ternario {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Oi, tudo bem? S/N");
		
		String resposta = sc.next();
		
		String texto = resposta.equalsIgnoreCase("S") ? "Fico feliz por vc" : 
			resposta.equalsIgnoreCase("N") ? "Espero que melhore" : "Tem algo de errado na resposta";
		
		System.out.println(texto);
		sc.close();
	}
}
