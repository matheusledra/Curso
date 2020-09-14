package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ExercicioVetores {

	public static void exerciciosVetores() throws InterruptedException {
		int escolhaExercicio;
		Scanner entradaValores = new Scanner(System.in);

		escolhaExercicio = -1;
		System.out.println("");
		System.out.println("1 -> Ler 12 vetores, X e Y e somar.");
		System.out.println("2 -> Dez primeiros números ímpares");
		System.out.println("3 -> Trocar 8 primeiros valores pelos 8 últimos e vice versa");
		System.out.println("4 -> Busca de valor em um vetor de 20 posições");
		System.out.println("5 -> Contar quantos valores espaços tem no vetor");
		System.out.println("6 -> Atribuição de valor 0 para valores negativos");
		System.out.println("7 -> Posições pares valor de um vetor e ímpares de outro vetor");
		System.out.println("8 -> Passar todos os valores 1 posição a frente");
		System.out.println("9 -> Retirar espaços em branco de uma frase");
		System.out.println("10 -> Escrever número por extenso");
		System.out.println("11 -> Verificar anagrama (não feito)");
		System.out.println("12 -> Vetor com terços de outros vetores");
		System.out.println("13 -> Verificar se existem valores iguais no vetor");
		System.out.println("14 -> Deixar zeros nas posições finais do vetor");
		System.out.println("15 -> Ler trajetória de um vetor");
		System.out.println("");
		System.out.println("0 -> Sair");

		escolhaExercicio = entradaValores.nextInt();

		if (escolhaExercicio != 0) {
			System.out.println("");
			System.out.println("Iniciando Exercício...");
			TimeUnit.SECONDS.sleep(1);
		}

		switch (escolhaExercicio) {
		case 0:
			System.out.println("Saindo...");
			break;
		case 1:
			exercicioVetor1();
			break;
		case 2:
			exercicioVetor2();
			break;
		case 3:
			exercicioVetor3();
			break;
		case 4:
			exercicioVetor4();
			break;
		case 5:
			exercicioVetor5();
			break;
		case 6:
			exercicioVetor6();
			break;
		case 7:
			exercicioVetor7();
			break;
		case 8:
			exercicioVetor8();
			break;
		case 10:
			exercicioVetor10();
			break;
		case 12:
			exercicioVetor12();
			break;
		case 13:
			exercicioVetor13();
			break;
		case 14:
			exercicioVetor14();
			break;
		case 15:
			exercicioVetor15();
			break;
		default:
			System.out.println("Exercício não encontrado...");
			break;
		}
		entradaValores.close();
	}

	public static void exercicioVetor1() {
		Scanner entradaValores = new Scanner(System.in);
		int[] valores = new int[12];
		int posicao1, posicao2, soma;

		System.out.println("Posições válidas:  ");
		System.out.println("");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = ThreadLocalRandom.current().nextInt(1, 100);
			System.out.println((i + 1));
		}

		System.out.println("Escolha a primeira posição: ");
		posicao1 = entradaValores.nextInt();
		System.out.println("Escolha a segunda posição: ");
		posicao2 = entradaValores.nextInt();

		System.out.println("");
		System.out.println("Número na primeira posição: " + valores[posicao1]);
		System.out.println("Número na segunda posição: " + valores[posicao2]);

		soma = valores[posicao1] + valores[posicao2];

		System.out.println("");
		System.out.println("Soma dos valores: " + soma);

		entradaValores.close();
	}

	public static void exercicioVetor2() {
		int[] numeros = new int[10];
		int indice = 0;

		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0) {
				numeros[indice] = i;
				indice++;
			}
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

	public static void exercicioVetor3() {
		int[] numerosCriados = new int[16];
		int[] numerosTrocados = new int[16];

		for (int i = 0; i < numerosCriados.length; i++) {
			numerosCriados[i] = ThreadLocalRandom.current().nextInt(1, 50);
		}

		System.out.println("Números criados: ");
		for (int i = 0; i < numerosCriados.length; i++) {
			System.out.println(numerosCriados[i]);
		}

		for (int i = 0; i < (numerosTrocados.length / 2); i++) {
			numerosTrocados[i] = numerosCriados[i + (numerosCriados.length / 2)];
		}
		for (int i = (numerosTrocados.length / 2); i < numerosTrocados.length; i++) {
			numerosTrocados[i] = numerosCriados[i - (numerosCriados.length / 2)];
		}

		System.out.println("");
		System.out.println("Números com a posição alterada: ");
		for (int i = 0; i < numerosTrocados.length; i++) {
			System.out.println(numerosTrocados[i]);
		}
	}

	public static void exercicioVetor4() {
		Scanner entradaDados = new Scanner(System.in);
		int[] numeros = new int[20];
		int numeroExcolhido;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ThreadLocalRandom.current().nextInt(1, 50);
		}

		System.out.println("Escolha um número para saber sua posição: ");
		System.out.println("");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		numeroExcolhido = entradaDados.nextInt();

		System.out.println("");
		for (int i = 0; i < numeros.length; i++) {
			if (numeroExcolhido == numeros[i]) {
				System.out.println("Posição do número: " + (i + 1));
			}
		}

		entradaDados.close();
	}

	public static void exercicioVetor5() throws InterruptedException {
		int[] numeros = new int[40];
		int quantidadePares = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ThreadLocalRandom.current().nextInt(1, 80);
		}

		System.out.println("Números gerados: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		TimeUnit.SECONDS.sleep(2);
		System.out.println("");
		System.out.println("Números pares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i]);
				quantidadePares++;
			}
		}
		System.out.println("No total foram gerados " + quantidadePares + " números pares.");
	}

	public static void exercicioVetor6() {
		int[] numeros = new int[40];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ThreadLocalRandom.current().nextInt(-10, 50);
		}

		System.out.println("Números antes da atribuição: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				numeros[i] = 0;
			}
		}

		System.out.println("");
		System.out.println("Números após atribuição: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

	public static void exercicioVetor7() {
		int[] vetorUm = new int[20];
		int[] vetorDois = new int[20];
		int[] vetorValoresUmEDois = new int[40];
		int indicePares = 0;
		int indiceImpares = 0;

		for (int i = 0; i < vetorDois.length; i++) {
			vetorUm[i] = ThreadLocalRandom.current().nextInt(1, 40);
			vetorDois[i] = ThreadLocalRandom.current().nextInt(1, 40);
		}

		System.out.println("Números do Vetor 1: ");
		for (int i = 0; i < vetorUm.length; i++) {
			System.out.println(vetorUm[i]);
		}

		System.out.println("");
		System.out.println("Números do Vetor 2: ");
		for (int i = 0; i < vetorDois.length; i++) {
			System.out.println(vetorDois[i]);
		}

		for (int i = 0; i < vetorValoresUmEDois.length; i++) {
			if ((i + 1) % 2 == 0) {
				vetorValoresUmEDois[i] = vetorUm[indicePares];
				indicePares++;
			} else {
				vetorValoresUmEDois[i] = vetorDois[indiceImpares];
				indiceImpares++;
			}
		}

		System.out.println("");
		System.out.println("Números dos Vetores unidos: ");
		for (int i = 0; i < vetorValoresUmEDois.length; i++) {
			System.out.println(vetorValoresUmEDois[i]);
		}
	}

	public static void exercicioVetor8() {
		int[] numeros = new int[40];
		int guardaUltimoNumero;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ThreadLocalRandom.current().nextInt(1, 80);
		}

		System.out.println("Números gerados: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println((i + 1) + " -> " + numeros[i]);
		}

		guardaUltimoNumero = numeros[numeros.length - 1];
		for (int i = (numeros.length - 1); i > 0; i--) {
			if (i > 0) {
				numeros[i] = numeros[i - 1];
			}
		}
		numeros[0] = guardaUltimoNumero;

		System.out.println("");
		System.out.println("Números pulados uma posição a frente cada um: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println((i + 1) + " -> " + numeros[i]);
		}

	}

	public static void exercicioVetor9() {
		String[] fraseComEspacos = { "Eu ", "estudo", " no ", "entra21 ", "com", " o ", "Ramon" };
		String[] fraseSemEspacos = new String[fraseComEspacos.length];

		System.out.println("Frase com espaços:");
		for (int i = 0; i < fraseComEspacos.length; i++) {
			System.out.print(fraseComEspacos[i]);
		}

		for (int i = 0; i < fraseComEspacos.length; i++) {
			fraseSemEspacos[i] = fraseComEspacos[i].replaceAll(" ", "");
		}

		System.out.println("");
		System.out.println("Frase sem espaços: ");
		for (int i = 0; i < fraseSemEspacos.length; i++) {
			System.out.print(fraseSemEspacos[i]);
		}
	}

	public static void exercicioVetor10() {
		String[] caracteresNumero = { "C", "i", "n", "c", "o" };
		String numeroPorExtenso = "";

		System.out.println("Caracteres no vetor: ");
		for (int i = 0; i < caracteresNumero.length; i++) {
			numeroPorExtenso += caracteresNumero[i];
			System.out.println("caracteresNumero[" + i + "] -> " + caracteresNumero[i]);
		}

		System.out.println("");
		System.out.println("Número escrito: ");
		System.out.println(numeroPorExtenso);
	}

	public static void exercicioVetor12() {
		int[] vetorUm = new int[9];
		int[] vetorDois = new int[9];
		int[] vetorTres = new int[9];
		int[] unirVetores = new int[9];
		int valorTerco = vetorUm.length / 3;

		for (int i = 0; i < vetorUm.length; i++) {
			vetorUm[i] = ThreadLocalRandom.current().nextInt(1, 40);
			vetorDois[i] = ThreadLocalRandom.current().nextInt(1, 40);
			vetorTres[i] = ThreadLocalRandom.current().nextInt(1, 40);
		}

		System.out.println("Valores no primeiro vetor: ");
		for (int i = 0; i < vetorUm.length; i++) {
			System.out.print(vetorUm[i] + " | ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Valores no segundo vetor: ");
		for (int i = 0; i < vetorDois.length; i++) {
			System.out.print(vetorDois[i] + " | ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Valores no terceiro vetor: ");
		for (int i = 0; i < vetorTres.length; i++) {
			System.out.print(vetorTres[i] + " | ");
		}

		for (int i = 0; i < unirVetores.length; i++) {
			if (i < valorTerco) {
				unirVetores[i] = vetorUm[i];
			} else if (i < (valorTerco + valorTerco)) {
				unirVetores[i] = vetorDois[i];
			} else {
				unirVetores[i] = vetorTres[i];
			}
		}

		System.out.println("");
		System.out.println("");
		System.out.println("Valores Unidos em Terços");
		for (int i = 0; i < unirVetores.length; i++) {
			System.out.print(unirVetores[i] + " | ");
		}
	}

	public static void exercicioVetor13() {
		int[] valores = new int[10];

		for (int i = 0; i < valores.length; i++) {
			valores[i] = ThreadLocalRandom.current().nextInt(1, 20);
		}

		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}

		System.out.println("Valores Repitidos: ");
		for (int i = 0; i < valores.length; i++) {
			for (int j = i; j < valores.length; j++) {
				if (i != j) {
					if (valores[i] == valores[j]) {
						System.out.println("Posição " + (i + 1) + " -> " + valores[i] + " | " + "Posição " + (j + 1)
								+ " -> " + valores[j]);
					}
				}
			}
		}
	}

	public static void exercicioVetor14() {
		int[] numeros = new int[50];
		int auxiliar;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ThreadLocalRandom.current().nextInt(-1, 10);
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " | ");
		}

		for (int j = 0; j < numeros.length; j++) {
			for (int i = 0; i < numeros.length - 1; i++) {
				if (numeros[i] == 0) {
					auxiliar = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = auxiliar;
				}
			}
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " | ");
		}
	}

	public static void exercicioVetor15() {
		int[] valores = { 5, 7, 6, 9, 2, 8, 4, 0, 3 };
		int trajetoria = 1;

		System.out.println("Posição | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
		System.out.println("Valor   | 5 | 7 | 6 | 9 | 2 | 8 | 4 | 0 | 3 |");

		System.out.println("");
		System.out.println("Leitura: ");
		System.out.print("1, ");
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[trajetoria - 1]);
			if (valores[trajetoria - 1] != 0) {
				System.out.print(", ");
			}
			trajetoria = valores[trajetoria - 1];
		}
	}
}
