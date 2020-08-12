package Curso;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		String gen;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu genero (M,F,B...)");
		gen = sc.next();

		switch (gen.toUpperCase()) { // Pega o que está escrito na var "gen" e coloca para o maiusculo
		case "M": // Caso for "M" vai executar o que está até o "break;"
			System.out.println("Bem-Vindo"); // Imprime uma linha escrito "Bem-Vindo"
			break; // Para a execução do case

		case "F": // Caso for "F" vai executar o que está até o "break;"
			System.out.println("Bem-Vinda"); // Imprime uma linha escrito "Bem-Vinda"
			break; // Para a execução do case

		default: // Caso não for nenhum dos anteriores vai executar o que está até o "break;"
			System.out.println("Bem-Vindx"); // Imprime uma linha escrito "Bem-Vindx"
			break; // Para a execução do default
		}
	}

}
