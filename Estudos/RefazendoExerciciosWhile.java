package Curso.Estudos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RefazendoExerciciosWhile {

	public static void exercicio1() {
		int numeros = 1;

		System.out.println("Números ímpares entre 1 a 100");
		while (numeros <= 100) {
			if (numeros % 2 != 0) {
				System.out.println("[" + numeros + "]");
			}
			numeros++;
		}
	}

	public static void exercicio2() {
		int numeros = 0;

		while (numeros <= 100) {
			if (numeros % 2 == 0) {
				System.out.println("[" + numeros + "]");
			}
			numeros++;
		}
	}
	
	public static void exercicio3() {
		Scanner entradaDados = new Scanner(System.in);
		String numerosPares = "", numerosImpares = "";
		int numeros = 0, ateNumero;

		System.out.print("Digite até que número você deseja ver os pares e ímpares: ");
		ateNumero = entradaDados.nextInt();

		while (numeros <= ateNumero) {
			if (numeros % 2 == 0) {
				numerosPares += "[" + numeros + "] ";
			} else {
				numerosImpares += "[" + numeros + "] ";
			}
			numeros++;
		}

		System.out.println("Números pares --------\n" + numerosPares);
		System.out.println("Números ímpares --------\n" + numerosImpares);

		entradaDados.close();
	}
	
	public static void exercicio4() {
		Scanner entradaDados = new Scanner(System.in);
		int qntdAlunos, soma = 0, media, repeticao = 1;
		
		System.out.print("Digite a quantidade de alunos na sala: ");
		qntdAlunos = entradaDados.nextInt();
		
		while(repeticao <= qntdAlunos ) {
			System.out.println("Digite a nota do " + repeticao + " aluno");
			soma += entradaDados.nextInt();
			repeticao++;
		}
		
		media = soma / qntdAlunos;
		
		System.out.println("A média da turma é: " + media);
		
		entradaDados.close();
	}

	public static void exercicio5() {
		int numeros = 1;
		String numerosLadoLado = "| ";
		
		System.out.println("Números um em baixo do outro");
		while(numeros <= 20) {
			System.out.println("| " + numeros + " |");
			numerosLadoLado += numeros + " | ";
			numeros++;
		}
		
		System.out.println("\nNúmeros lado a lado: ");
		System.out.println(numerosLadoLado);
	}

	public static void exercicio6() {
		int numeros = 1000;
		
		System.out.println("Os números de 1000 a 1999 divisiveis por 11 são:");
		while(numeros < 2000) {
			if(numeros % 11 == 0) {
				System.out.println("| " + numeros + " |");
			}
			numeros++;
		}
	}

	public static void exercicio7() {
		Scanner scTentativa = new Scanner(System.in);
		boolean repetirJogo = false;
		int numeroAleatorio, numeroTentativaUsuario, chancesUsuario = 1, pontuacao = 0;

		System.out.println("Bem-Vindo ao Jogo de Acertos");
		System.out.println("");
		System.out.println("O jogo consiste no seguinte:");
		System.out.println("- O computador irá gerar um número de 1 a 20");
		System.out.println("- Você terá 3 chances para acertar o número");
		System.out.println("- Caso você acertar ganha 1 ponto");
		System.out.println("");
		System.out.println("                                 Boa sorte!");

		do {
			chancesUsuario = 1;
			numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 21);
			System.out.println(numeroAleatorio);
			System.out.println("Número gerado!");
			
			if(chancesUsuario <= 3) {
				do {
					System.out.print("\nDigite sua tentativa: ");
					numeroTentativaUsuario = scTentativa.nextInt();

					if (!(numeroTentativaUsuario <= 20 && numeroTentativaUsuario >= 1)) {
						System.out.println("\nVocê digitou um número acima/abaixo do permitido! \nTente novamente");
						System.out.println("A tentativa não será contada!");
					} else if (numeroTentativaUsuario == numeroAleatorio) {
						pontuacao++;
						System.out.println("\nParabéns, você acertou o número!");
						System.out.println("+1 Ponto! Total: " + pontuacao);
						chancesUsuario = 5;
					} else {
						System.out.println("\nVocê errou ;(");
						System.out.println("Total de tentavias: " + chancesUsuario);
						chancesUsuario++;
					}
				} while (chancesUsuario <= 3);
			}
			if (chancesUsuario == 4) {
				System.out.println("");
				System.out.println("Suas tentativas acabaram! ;(");
				System.out.println("O número era: " + numeroAleatorio);
			}

			System.out.println("");
			System.out.println("Deseja executar o jogo novamente? S/N");
			repetirJogo = scTentativa.next().equalsIgnoreCase("S") ? true : false;
			System.out.println("");
		} while (repetirJogo);

		scTentativa.close();
	}

}
