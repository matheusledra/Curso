package Curso.Estudos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class RefazendoExerciciosVetoresEmSala {

	public static void exercicio1() {
		Scanner scEntrada = new Scanner(System.in);
		int[] vetPosicoes = new int[12], vetXY = new int[2];

		for (int i = 0; i < vetPosicoes.length; i++) {
			vetPosicoes[i] = ThreadLocalRandom.current().nextInt(1, 30);
			System.out.println("vetPosicoes [Posição " + (i + 1) + "] " + vetPosicoes[i]);
		}

		System.out.println("");
		for (int i = 0; i < vetXY.length; i++) {
			System.out.print("Escolha a " + (i + 1) + "º posição: ");
			vetXY[i] = (scEntrada.nextInt() - 1);
		}

		System.out.println("\nO resultado de " + vetPosicoes[vetXY[0]] + " + " + vetPosicoes[vetXY[1]] + " é: "
				+ (vetPosicoes[vetXY[0]] + vetPosicoes[vetXY[1]]));

		scEntrada.close();
	}

	public static void exercicio2() {
		int[] vetNumerosImpares = new int[10];
		int qntdPreenchidos = 0;

		for (int i = 0; qntdPreenchidos < vetNumerosImpares.length; i++) {
			if (!(i % 2 == 0)) {
				vetNumerosImpares[qntdPreenchidos] = i;
				System.out.println("vetNumerosImpares[" + qntdPreenchidos + "] " + vetNumerosImpares[qntdPreenchidos]);
				qntdPreenchidos++;
			}
		}
	}

	public static void exercicio3() {
		int[] vetValores = new int[16];
		int guardarNumeros;

		System.out.println("Vetor Gerado: ");
		for (int i = 0; i < vetValores.length; i++) {
			vetValores[i] = ThreadLocalRandom.current().nextInt(1, 50);
			System.out.println("vetValores[" + i + "] " + vetValores[i]);
		}

		for (int i = 0; i < vetValores.length / 2; i++) {
			guardarNumeros = vetValores[i];
			vetValores[i] = vetValores[i + 8];
			vetValores[i + 8] = guardarNumeros;
		}

		System.out.println("\nVetor trocado: ");
		for (int i = 0; i < vetValores.length; i++) {
			System.out.println("vetValores[" + i + "] " + vetValores[i]);
		}
	}

	public static void exercicio4() {
		Scanner scEntrada = new Scanner(System.in);
		String numeroSaida = "----------";
		boolean numeroEncontrado = false;
		int[] vetGerado = new int[20];
		int valorX;

		System.out.println("Vetor gerado: ");
		for (int i = 0; i < vetGerado.length; i++) {
			vetGerado[i] = ThreadLocalRandom.current().nextInt(1, 50);
			System.out.println("vetGerado[" + i + "] " + vetGerado[i]);
		}

		System.out.print("\nEscolha um número para saber sua posição: ");
		valorX = scEntrada.nextInt();

		for (int i = 0; i < vetGerado.length; i++) {
			if (valorX == vetGerado[i]) {
				numeroSaida += "\nNúmero: " + valorX + "\nPosição: " + (i + 1) + "\n----------";
				numeroEncontrado = true;
			}
		}

		if (numeroEncontrado) {
			System.out.println(numeroSaida);
		} else {
			System.out.println("Número não encontrado");
		}

		scEntrada.close();
	}

	public static void exercicio5() {
		int[] vetGerado = new int[40];
		int qntdPares = 0;

		System.out.println("Vetor gerado: ");
		for (int i = 0; i < vetGerado.length; i++) {
			vetGerado[i] = ThreadLocalRandom.current().nextInt(1, 50);
			System.out.println("vetGerado[" + i + "] " + vetGerado[i]);

			if (vetGerado[i] % 2 == 0) {
				qntdPares++;
			}
		}

		System.out.println("\nA quantidade de números pares é: " + qntdPares);
	}

	public static void exercicio6() {
		int[] vetGerado = new int[40];

		System.out.println("Vetor gerado: ");
		for (int i = 0; i < vetGerado.length; i++) {
			vetGerado[i] = ThreadLocalRandom.current().nextInt(-20, 20);

			if (vetGerado[i] < 0) {
				vetGerado[i] = 0;
			}

			System.out.println("vetGerado[" + i + "] " + vetGerado[i]);
		}
	}

	public static void exercicio7() {
		int[] vetGeradoUm = new int[20];
		int[] vetGeradoDois = new int[20];
		int[] vetPosicoesParImpar = new int[40];
		int preenchimentosPar = 0, preenchimentosImpar = 0;

		System.out.println("Vetor 1 gerado: ");
		for (int i = 0; i < vetGeradoUm.length; i++) {
			vetGeradoUm[i] = ThreadLocalRandom.current().nextInt(1, 50);
			System.out.println("vetGeradoUm[" + i + "] " + vetGeradoUm[i]);
		}
		System.out.println("\nVetor 2 gerado: ");
		for (int i = 0; i < vetGeradoDois.length; i++) {
			vetGeradoDois[i] = ThreadLocalRandom.current().nextInt(1, 50);
			System.out.println("vetGeradoUm[" + i + "] " + vetGeradoDois[i]);
		}

		System.out.println(
				"\nVetor 3 gerado: \n(Nas posições pares números do primeiro,\nnas ímpares números do segundo)");
		for (int i = 0; i < vetPosicoesParImpar.length; i++) {
			if (i % 2 == 0) {
				vetPosicoesParImpar[i] = vetGeradoUm[preenchimentosPar];
				preenchimentosPar++;
			} else {
				vetPosicoesParImpar[i] = vetGeradoDois[preenchimentosImpar];
				preenchimentosImpar++;
			}

			System.out.println("vetPosicoesParImpar[" + i + "] " + vetPosicoesParImpar[i]);
		}
	}

	public static void exercicio8() {
		int[] vetorNumeros = new int[40];

		System.out.println("Números gerados:");
		for (int i = 0; i < vetorNumeros.length; i++) {
			vetorNumeros[i] = ThreadLocalRandom.current().nextInt(1, 100);
			System.out.println(String.format("vetorNumeros[%2d] ", i) + String.format("| %2d |", vetorNumeros[i]));
		}

		System.out.println("\nNúmeros acumulados: \n" + "vetorNumeros[ 0] |   " + vetorNumeros[0] + " |");
		for (int i = 0; i < vetorNumeros.length - 1; i++) {
			vetorNumeros[i + 1] = vetorNumeros[i] + vetorNumeros[i + 1];
			System.out.println(
					String.format("vetorNumeros[%2d] ", i + 1) + String.format("| %4d |", vetorNumeros[i + 1]));
		}
	}

	public static void exercicio9() throws InterruptedException {
		Scanner scEntrada = new Scanner(System.in);
		String[] vetLetrasFrase;
		String frase;

		System.out.print("Digite uma frase: ");
		frase = scEntrada.nextLine();
		vetLetrasFrase = new String[frase.length()];

		System.out.print("Frase escrita: ");
		for (int i = 0; i < vetLetrasFrase.length; i++) {
			vetLetrasFrase[i] = frase.charAt(i) + "";
			System.out.print(vetLetrasFrase[i]);
		}

		System.out.println("\n\nRetirando os espaços...");
		TimeUnit.SECONDS.sleep(3);

		System.out.print("\nFrase sem espaços: ");
		for (int i = 0; i < vetLetrasFrase.length; i++) {
			if (vetLetrasFrase[i].equals(" ")) {
				vetLetrasFrase[i] = "";
			}
			System.out.print(vetLetrasFrase[i]);
		}

		scEntrada.close();
	}

	public static void exercicio10() {
		String[] vetNumeroLetras = { "T", "r", "i", "n", "t", "a" };

		System.out.println("Número no vetor escrito por extenso:");
		for (int i = 0; i < vetNumeroLetras.length; i++) {
			System.out.print(vetNumeroLetras[i]);
		}
	}

	public static void exercicio11() {
		boolean continuaVerificacaoDeAnagrama = false;
		Scanner scEntrada = new Scanner(System.in);
		String palavraUm, palavraDois;
		char[] vetLetrasPalavraUm, vetLetrasPalavraDois;
		int qntdIguaisConsecutivas = 0, qntdIguais = 0;

		System.out.println("Digite a primeira palavra: ");
		palavraUm = scEntrada.next();
		vetLetrasPalavraUm = palavraUm.toLowerCase().toCharArray();

		System.out.println("Digite a segunda palavra ( " + palavraUm.length() + " letras): ");
		palavraDois = scEntrada.next();
		vetLetrasPalavraDois = palavraDois.toLowerCase().toCharArray();

		for (int i = 0; i < vetLetrasPalavraUm.length; i++) {
			if (vetLetrasPalavraUm[i] == vetLetrasPalavraDois[i]) {
				qntdIguaisConsecutivas++;
			}
		}

		if (qntdIguaisConsecutivas == vetLetrasPalavraDois.length) {
			System.out.println("As palavras são as mesmas!");
			System.exit(0);
		} else {
			continuaVerificacaoDeAnagrama = true;
		}

		if (continuaVerificacaoDeAnagrama) {
			for (int i = 0; i < vetLetrasPalavraDois.length; i++) {
				for (int j = 0; j < vetLetrasPalavraDois.length; j++) {
					if (vetLetrasPalavraUm[i] == vetLetrasPalavraDois[j]) {
						qntdIguais++;
						vetLetrasPalavraDois[j] = ' ';
						continuaVerificacaoDeAnagrama = true;
						break;
					} else {
						continuaVerificacaoDeAnagrama = false;
					}
				}
				if (!continuaVerificacaoDeAnagrama) {
					break;
				}
			}
		}

		if (qntdIguais == vetLetrasPalavraUm.length) {
			System.out.println("As palavras \"" + palavraUm + "\" e \"" + palavraDois + "\" são anagramas!");
		} else {
			System.out.println("As palavras \"" + palavraUm + "\" e \"" + palavraDois + "\" não são anagramas!");
		}

		scEntrada.close();
	}

	public static void exercicio12() {
		int[] vetPrimeiro = new int[9];
		int[] vetSegundo = new int[vetPrimeiro.length];
		int[] vetTerceiro = new int[vetPrimeiro.length];
		int[] vetUniao = new int[vetPrimeiro.length];
		String textoPrimeiroVetor = "", textoSegundoVetor = "", textoTerceiroVetor = "", textoVetorUniao = "";

		for (int i = 0; i < vetPrimeiro.length; i++) {
			vetPrimeiro[i] = ThreadLocalRandom.current().nextInt(1, 100);
			textoPrimeiroVetor += String.format("vetPrimeiro[%2d] ", (i + 1)) + String.format("%2d\n", vetPrimeiro[i]);

			vetSegundo[i] = ThreadLocalRandom.current().nextInt(1, 100);
			textoSegundoVetor += String.format("vetSegundo[%2d] ", (i + 1)) + String.format("%2d\n", vetSegundo[i]);

			vetTerceiro[i] = ThreadLocalRandom.current().nextInt(1, 100);
			textoTerceiroVetor += String.format("vetTerceiro[%2d] ", (i + 1)) + String.format("%2d\n", vetTerceiro[i]);

			if (i < vetUniao.length / 3) {
				vetUniao[i] = vetPrimeiro[i];
			} else if (i < vetUniao.length / 3 + vetUniao.length / 3) {
				vetUniao[i] = vetSegundo[i];
			} else {
				vetUniao[i] = vetTerceiro[i];
			}
			textoVetorUniao += String.format("vetUniao[%2d] ", (i + 1)) + String.format("%2d\n", vetUniao[i]);
		}

		System.out.println("\nPrimeiro vetor gerado: ");
		System.out.println(textoPrimeiroVetor);

		System.out.println("\nSegundo vetor gerado: ");
		System.out.println(textoSegundoVetor);

		System.out.println("\nTerceiro vetor gerado: ");
		System.out.println(textoTerceiroVetor);

		System.out.println("\nVetor Unido: ");
		System.out.println(textoVetorUniao);
	}

	public static void exercicio13() {
		int[] vetNumeros = new int[10];
		boolean numerosIguais = false;
		String textoVetorGerado = "| ";

		for (int i = 0; i < vetNumeros.length; i++) {
			vetNumeros[i] = ThreadLocalRandom.current().nextInt(1, 20);
			textoVetorGerado += String.format("%2d | ", vetNumeros[i]);
		}
		System.out.println("Vetor gerado: ");
		System.out.println(textoVetorGerado);
		
		System.out.println("\n-----------");
		for (int i = 0; i < vetNumeros.length; i++) {
			for (int j = i; j < vetNumeros.length; j++) {
				if (i != j && vetNumeros[i] == vetNumeros[j]) {
					System.out.println("vetorNumerosAleatorios[" + i + "] " + vetNumeros[i]);
					System.out.println("vetorNumerosAleatorios[" + j + "] " + vetNumeros[j]);
					System.out.println("-----------");
					numerosIguais = true;
				}
			}
		}
		
		if(!numerosIguais) {
			System.out.println("Não existem números repetidos");
			System.out.println("-----------");
		}
	}

	public static void exercicio14() {
		int[] vetNumeros = new int[50];
		int auxiliar = 0;

		System.out.println("Vetor gerado: ");
		for (int i = 0; i < vetNumeros.length; i++) {
			vetNumeros[i] = ThreadLocalRandom.current().nextInt(0, 30);
			System.out.println(String.format("| %3d | ", vetNumeros[i]));
		}

		for (int i = 0; i < vetNumeros.length; i++) {
			for (int j = 0; j < vetNumeros.length; j++) {
				if (vetNumeros[j] == 0 && j < vetNumeros.length - 1) {
					auxiliar = vetNumeros[j + 1];
					vetNumeros[j + 1] = 0;
					vetNumeros[j] = auxiliar;
				}
			}
		}

		System.out.println("\n\nVetor compactado:");
		for (int i = 0; i < vetNumeros.length; i++) {
			System.out.println(String.format("| %3d | ", vetNumeros[i]));
		}
	}

	public static void exercicio15() {
		int[] vetSequencia = { 1, 5, 7, 6, 9, 2, 8, 4, 0, 3 };
		int indice = 0;
		
		System.out.println("Índice | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
		System.out.println("Valor  | 5 | 7 | 6 | 9 | 2 | 8 | 4 | 0 | 3 |");

		System.out.println("\nSeguindo a sequência:");
		for (int i = 0; i < vetSequencia.length; i++) {
			System.out.print(vetSequencia[indice]);
			indice = vetSequencia[indice];

			if (i < vetSequencia.length - 1) {
				System.out.print(", ");
			}
		}
	}

}
