package Curso;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		
		int opcao; // Define um inteiro com variavel opcao
		
		Scanner sc = new Scanner(System.in); // Cria um escaneamento do teclado

		System.out.println("Selecione um animal:"); 
		System.out.println(" ");
		System.out.println("1- Dog"); 
		System.out.println("2- Cat"); 
		System.out.println("3- Bird");
		System.out.println(" "); 
		opcao = sc.nextInt(); // Define o valor da variavel opcao para o que foi escrito sendo um número
		
		switch (opcao) { // Cria um bloco de condicoes
		case 1: // caso o valor da variavel opcao seja 1 executa ate o brake
			System.out.println(" ");
			System.out.println("AuAu");
			break;
		case 2: // caso o valor da variavel opcao seja 2 executa ate o brake
			System.out.println(" ");
			System.out.println("Miau");
			break;
		case 3: // caso o valor da variavel opcao seja 3 executa ate o brake
			System.out.println(" ");
			System.out.println("PiuPiu");
			break;
		default: // caso não for nenhum desses, execute ate o break
			System.out.println(" ");
			System.out.println("Opção inexistente! '" + opcao + "'");
			break;
		}
		
		sc.close(); // Para o escaneamento do teclado
		
	}
	
}
