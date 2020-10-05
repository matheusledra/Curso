package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ExerciciosWhile {

	public static void exerciciosWhile() throws InterruptedException {
		Scanner escolhaExercicio = new Scanner(System.in);
		System.out.println("1 -> Números ímpares entre 1 e 100");
		System.out.println("2 -> Números pares entre 1 e 100");
		System.out.println("3 -> Pares e ímpares entre 1 e um número definido pelo usuário");
		System.out.println("4 -> Calcular média das notas de uma turma");
		System.out.println("5 -> Números de 1 a 20 (primeiro um em baixo do outro e depois um do lado do outro)");
		System.out.println("6 -> Números de 1000 a 1999 de resto 5 quando dividido por 11");
		System.out.println("7 -> Acertar número");
		System.out.println("8 -> Múltiplos de 10 de 1 a 100");

		int escolha = escolhaExercicio.nextInt();

		System.out.println("");
		System.out.println("Iniciando Exercício...");
		TimeUnit.SECONDS.sleep(1);

		switch (escolha) {
		case 1:
			exercicioWhile1();
			break;
		case 2:
			exercicioWhile2();
			break;
		case 3:
			exercicioWhile3();
			break;
		case 4:
			exercicioWhile4();
			break;
		case 5:
			exercicioWhile5();
			break;
		case 6:
			exercicioWhile6();
			break;
		case 7:
			exercicioWhile7();
			break;
		case 8:
			exercicioWhile8();
			break;
		default:
			System.out.println("Exercício não encontrado!");
			break;
		}
		escolhaExercicio.close();
	}

	// -----===[|> <!!!> <|]===---- \\
	public static void exercicioWhile1() {
		int numero = 1;

		System.out.println("Números ímpares:");
		while (numero <= 100) {
			if (numero % 2 != 0) {
				System.out.println(numero);
			}
			numero++;
		}
	}

	public static void exercicioWhile2() {
		int numero = 1;

		System.out.println("Números pares:");
		while (numero <= 100) {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
			numero++;
		}
	}

	public static void exercicioWhile3() throws InterruptedException{
		Scanner informaMaximo = new Scanner(System.in);
		int numero = 1;
		
		System.out.print("Informe o número máximo: ");
		int maximo = informaMaximo.nextInt();
		
		System.out.println("Números ímpares:");
		while(numero <= maximo) {
			if(numero % 2 != 0) {
				System.out.println(numero);
			}
			numero++;
		}
		
		TimeUnit.SECONDS.sleep(3);
		System.out.println("");
		System.out.println("Números pares:");
		numero = 1;
		while(numero <= maximo) {
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
			numero++;
		}
		informaMaximo.close();
	}

	public static void exercicioWhile4() {
		Scanner informarInteiros = new Scanner(System.in);
		int qntdAlunos;
		Double somaTotal = 0.0;
		Double mediaTurma;
		int repete = 0;
		
		System.out.print("Informe a quantidade de alunos na sala: ");
		qntdAlunos = informarInteiros.nextInt();
		
		while (repete < qntdAlunos) {
			System.out.println("Informe a nota do " + (repete + 1) + "º aluno!");
			somaTotal += informarInteiros.nextDouble();
			repete++;
		}
		
		mediaTurma = somaTotal / qntdAlunos;
		System.out.println("Média aritmética da turma: " + mediaTurma);
		informarInteiros.close();
	}

	public static void exercicioWhile5() {
		int repete = 1;
		
		while(repete <= 20) {
			System.out.println(repete);
			repete++;
		}
		System.out.println("");
		repete = 1;
		while(repete <= 20) {
			System.out.print(repete + " ");
			repete++;
		}
	}

	public static void exercicioWhile6() {
		int minimo = 1000;
		
		while(minimo < 2000) {
			if(minimo % 11 == 5) {
				System.out.println(minimo);
			}
			minimo++;
		}
	}

	public static void exercicioWhile7() {
		Scanner tentativaAcerto = new Scanner(System.in);
		int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 20);
		int tentativas = 1;
		int numeroTentativaUsuario;
		
		while(tentativas <= 3) {
			System.out.println("Escreva um número (" + tentativas + "º tentaviva)");
			numeroTentativaUsuario = tentativaAcerto.nextInt();
			if(numeroTentativaUsuario == numeroAleatorio) {
				System.out.println("Parabéns, você acertou!");
				tentativas = 5;
			} else {
				System.out.println("Que pena, você errou ;(");
				tentativas++;
			}
		}
		
		if(tentativas == 4) {
			System.out.println("Suas 3 tentativas acabaram ;(");
			System.out.println("O número era: " + numeroAleatorio);
		}
		tentativaAcerto.close();
	}

	public static void exercicioWhile8() {
		int numero = 1;
		
		System.out.println("Números múltiplos de 10: ");
		while(numero <= 100) {
			if(numero % 10 == 0) {
				System.out.println(numero);
			}
			numero++;
		}
	}
}