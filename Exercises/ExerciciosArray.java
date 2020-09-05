package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExerciciosArray {

	public static void exerciciosArray() {
		Scanner escolhaExercicio = new Scanner(System.in);

		System.out.println("1 -> Guarda 10 números em Array e printa eles");
		System.out.println("2 -> Guarda 10 frutas em Array e printa elas com indice");
		System.out.println("3 -> Cria 10 números aleatórios e organiza em ordem crescente");
		System.out.println("4 -> Cria 10 números aleatórios, o usuário escolhe um, e mostra a posição dele");
		System.out.println("5 -> Jogo da Quina.");

		int escolha = escolhaExercicio.nextInt();

		switch (escolha) {
		case 1:
			exercicioArray1();
			break;
		case 2:
			exercicioArray2();
			break;
		case 3:
			exercicioArray3();
			break;
		case 4:
			exercicioArray4();
			break;
		case 5:
			exercicioArray5();
			break;
		default:
			System.out.println("Exercício não encontrado!");
			break;
		}
		escolhaExercicio.close();
	}

	// -----===[|> <!!!> <|]===---- \\
	public static void exercicioArray1() {
		Scanner informaNumeros = new Scanner(System.in);
		int[] numerosArray = new int[10];
		int contador = 0;

		while (contador < numerosArray.length) {
			System.out.print("Informe o " + (contador + 1) + "º número: ");
			numerosArray[contador] = informaNumeros.nextInt();
			contador++;
		}
		contador = 0;
		while (contador < numerosArray.length) {
			System.out.println(numerosArray[contador]);
			contador++;
		}
		informaNumeros.close();
	}

	public static void exercicioArray2() {
		Scanner informaFrutas = new Scanner(System.in);
		String[] frutasArray = new String[10];
		int contador = 0;

		while (contador < frutasArray.length) {
			System.out.print("Digite o nome da " + (contador + 1) + "º fruta: ");
			frutasArray[contador] = informaFrutas.next();
			contador++;
		}

		contador = 0;
		System.out.println("Frutas informadas e seus indices:");
		while (contador < frutasArray.length) {
			System.out.println(contador + " -> " + frutasArray[contador]);
			contador++;
		}

		informaFrutas.close();
	}

	public static void exercicioArray3() {
		int[] numerosAleatorios = new int[10];
		int contadorVerificarNumeroMenor = 0;
		int contadorRepetirVerificacao = 0;
		int menor = 0;

		while (contadorVerificarNumeroMenor < numerosAleatorios.length) {
			numerosAleatorios[contadorVerificarNumeroMenor] = ThreadLocalRandom.current().nextInt(1, 100);
			contadorVerificarNumeroMenor++;
		}

		System.out.println("--[ Números gerados ]--");
		contadorVerificarNumeroMenor = 0;
		while (contadorVerificarNumeroMenor < numerosAleatorios.length) {
			System.out.println(numerosAleatorios[contadorVerificarNumeroMenor]);
			contadorVerificarNumeroMenor++;
		}

		while (contadorRepetirVerificacao < numerosAleatorios.length) {
			contadorVerificarNumeroMenor = contadorRepetirVerificacao;
			menor = 101;
			while (contadorVerificarNumeroMenor < numerosAleatorios.length) {
				if (numerosAleatorios[contadorVerificarNumeroMenor] < menor) {
					menor = numerosAleatorios[contadorVerificarNumeroMenor];
					numerosAleatorios[contadorVerificarNumeroMenor] = numerosAleatorios[contadorRepetirVerificacao];
					numerosAleatorios[contadorRepetirVerificacao] = menor;
				}
				contadorVerificarNumeroMenor++;
			}
			contadorRepetirVerificacao++;
			contadorVerificarNumeroMenor++;
		}
		System.out.println("");
		System.out.println("--[ Números gerados em ordem crescente ]--");
		contadorVerificarNumeroMenor = 0;
		while (contadorVerificarNumeroMenor < numerosAleatorios.length) {
			System.out.println(numerosAleatorios[contadorVerificarNumeroMenor]);
			contadorVerificarNumeroMenor++;
		}
	}

	public static void exercicioArray4() {
		Scanner informaNumero = new Scanner(System.in);
		String numerosGerados = "";
		int numeroExcolhido;
		int[] numerosAleatorios = new int[10];
		int contador = 0;

		while (contador < numerosAleatorios.length) {
			numerosAleatorios[contador] = ThreadLocalRandom.current().nextInt(1, 100);
			contador++;
		}
		contador = 0;
		numerosGerados = "Números gerados: ";
		while (contador < numerosAleatorios.length) {
			numerosGerados += numerosAleatorios[contador] + " ";
			contador++;
		}

		System.out.println(numerosGerados);
		contador = 0;
		System.out.println("");
		System.out.print("Informe um número para saber a posição: ");
		numeroExcolhido = informaNumero.nextInt();
		while (contador < numerosAleatorios.length) {
			if (numeroExcolhido == numerosAleatorios[contador]) {
				System.out.println("Número: " + numerosAleatorios[contador]);
				System.out.println("Posição " + (contador + 1));
			}
			contador++;
		}

		informaNumero.close();
	}

	public static void exercicioArray5() {
		Scanner informaNumeros = new Scanner(System.in);
		int[] numerosAleatorios = new int[5];
		int[] numerosUsuario = new int[5];
		int contador = 0;
		int acertos = 0;
		int pontos = 0;

		while (contador < numerosAleatorios.length) {
			int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 25);
			if (!(numeroAleatorio == numerosAleatorios[0] || numeroAleatorio == numerosAleatorios[1]
					|| numeroAleatorio == numerosAleatorios[2] || numeroAleatorio == numerosAleatorios[3]
					|| numeroAleatorio == numerosAleatorios[4])) {
				numerosAleatorios[contador] = numeroAleatorio;
			} else {
				contador--;
			}
			contador++;
		}

		contador = 0;
		System.out.println("Informe 5 números");
		while (contador < numerosUsuario.length) {
			numerosUsuario[contador] = informaNumeros.nextInt();
			contador++;
		}
		contador = 0;
		while (contador < numerosUsuario.length) {
			if (numerosUsuario[0] == numerosAleatorios[contador]) {
				acertos += 1;
			}
			if (numerosUsuario[1] == numerosAleatorios[contador]) {
				acertos += 1;
			}
			if (numerosUsuario[2] == numerosAleatorios[contador]) {
				acertos += 1;
			}
			if (numerosUsuario[3] == numerosAleatorios[contador]) {
				acertos += 1;
			}
			if (numerosUsuario[4] == numerosAleatorios[contador]) {
				acertos += 1;
			}
			contador++;
		}

		if (acertos == 1) {
			pontos = 1;
		} else if (acertos == 2) {
			pontos = 3;
		} else if (acertos == 3) {
			pontos = 10;
		} else if (acertos == 4) {
			pontos = 50;
		} else if (acertos == 5) {
			pontos = 100;
		} else {
			pontos = 0;
		}

		System.out.println("Você teve " + acertos + " acertos");
		System.out.println("Sua pontuação: " + pontos);

		informaNumeros.close();
	}
}
