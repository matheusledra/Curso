package Curso.Estudos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class RefazendoExerciciosVetores {

	public static void exercicio1() {
//		 Leia um vetor de 12 posições e em seguida ler também dois valores X e Y
//		 quaisquer correspondentes a duas posições no vetor. Ao final seu programa
//		 deverá escrever a soma dos valores encontrados nas respectivas posições X e Y.

		String[] vetorPosicoes = { "primeira", "segunda" };
		Scanner entradaValores = new Scanner(System.in);
		int[] vetorNumerosAleatorios = new int[12];
		int[] vetorXY = new int[2];
		int soma = 0;

		System.out.println("Vetor gerado: ");
		for (int i = 0; i < vetorNumerosAleatorios.length; i++) {
			vetorNumerosAleatorios[i] = ThreadLocalRandom.current().nextInt(1, 50);
			System.out.println("Na posição [" + (i + 1) + "] " + vetorNumerosAleatorios[i]);
		}

		for (int i = 0; i < vetorXY.length; i++) {
			System.out.print("Escolha a " + vetorPosicoes[i] + " posição: ");
			vetorXY[i] = entradaValores.nextInt() - 1;
		}

		for (int i = 0; i < vetorXY.length; i++) {
			soma += vetorNumerosAleatorios[vetorXY[i]];
		}

		System.out
				.println("Na posição [" + (vetorXY[0] + 1) + "] está o número: " + vetorNumerosAleatorios[vetorXY[0]]);
		System.out
				.println("Na posição [" + (vetorXY[1] + 1) + "] está o número: " + vetorNumerosAleatorios[vetorXY[1]]);
		System.out.println("A soma dos dois números é: " + soma);

		entradaValores.close();
	}

	public static void exercicio2() {
//		Declare um vetor de 10 posições e o preencha com os 10 primeiros números impares e o escreva

		int[] vetorNumerosImpares = new int[10];
		int quantidadeNumerosPreenchidos = 10;
		int numeros = 0;
		int i = 0;

		System.out.println("Números ímpares no vetor: ");
		while (i < quantidadeNumerosPreenchidos) {
			if (numeros % 2 != 0) {
				vetorNumerosImpares[i] = numeros;
				System.out.println("vetorNumerosImpares[" + i + "] " + vetorNumerosImpares[i]);
				i++;
			}
			numeros++;
		}
	}

	public static void exercicio3() {
//		Leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8 últimos e vice-e-versa. 
//		Escreva ao final o vetor obtido

		int[] vetorNumerosGerados = new int[16];
		int[] vetorNumerosTrocados = new int[vetorNumerosGerados.length];

		System.out.println("Números gerados: ");
		for (int i = 0; i < vetorNumerosTrocados.length; i++) {
			vetorNumerosGerados[i] = ThreadLocalRandom.current().nextInt(1, 40);
			System.out.println("vetorNumerosGerados[" + i + "] " + vetorNumerosGerados[i]);
		}

		for (int i = 0; i < (vetorNumerosTrocados.length / 2); i++) {
			vetorNumerosTrocados[i] = vetorNumerosGerados[i + (vetorNumerosGerados.length / 2)];
			vetorNumerosTrocados[i + (vetorNumerosTrocados.length / 2)] = vetorNumerosGerados[i];
		}

		System.out.println("\nVetor com os números trocados: ");
		for (int i = 0; i < vetorNumerosTrocados.length; i++) {
			System.out.println("vetorNumerosTrocados[" + i + "] " + vetorNumerosTrocados[i]);
		}
	}

	public static void exercicio4() {
//		Leia um vetor de 20 posições e em seguida um valor X qualquer. 
//		Seu programa devera fazer uma busca do valor de X no vetor lido e 
//		informar a posição em que foi encontrado ou se não foi encontrado

		Scanner entradaValores = new Scanner(System.in);
		int[] vetorNumerosAleatorios = new int[20];
		int numeroX;

		System.out.println("Números gerados aleatoriamente: ");
		for (int i = 0; i < vetorNumerosAleatorios.length; i++) {
			vetorNumerosAleatorios[i] = ThreadLocalRandom.current().nextInt(1, 50);
			System.out.println("vetorNumerosAleatorios[" + i + "] " + vetorNumerosAleatorios[i]);
		}

		System.out.print("Escolha um número para saber sua posição: ");
		numeroX = entradaValores.nextInt();

		for (int i = 0; i < vetorNumerosAleatorios.length; i++) {
			if (numeroX == vetorNumerosAleatorios[i]) {
				System.out.println("O número " + numeroX + " foi encontrado na posição " + (i + 1));
			}
		}

		entradaValores.close();
	}

	public static void exercicio5() {
//		Leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui

		int[] vetorNumeros = new int[40];
		int quantidadePares = 0;
		String numerosGerados = "";
		String numerosPares = "";

		for (int i = 0; i < vetorNumeros.length; i++) {
			vetorNumeros[i] = ThreadLocalRandom.current().nextInt(1, 99);
			numerosGerados += String.format("| %2d | \n", vetorNumeros[i]);
			if (vetorNumeros[i] % 2 == 0) {
				numerosPares += String.format("| %2d | \n", vetorNumeros[i]);
				quantidadePares++;
			}
		}

		System.out.println("Números gerados: ");
		System.out.println(numerosGerados);

		System.out.println("Números Pares:");
		System.out.println(numerosPares);
		System.out.println("A quantidade de números pares é " + quantidadePares);
	}

	public static void exercicio6() {
//		Leia um vetor de 40 posições e atribua valor 0 para todos os elementos que possuírem valores negativos

		int[] vetorNumeros = new int[40];
		String textoNumerosGerados = "";
		String textoNumerosMenoresQueZero = "";

		for (int i = 0; i < vetorNumeros.length; i++) {
			vetorNumeros[i] = ThreadLocalRandom.current().nextInt(-50, 50);
			textoNumerosGerados += String.format("| %3d | \n", vetorNumeros[i]);
			if (vetorNumeros[i] < 0) {
				vetorNumeros[i] = 0;
				textoNumerosMenoresQueZero += String.format("| %2d | \n", vetorNumeros[i]);
			} else {
				textoNumerosMenoresQueZero += String.format("| %2d | \n", vetorNumeros[i]);
			}

		}

		System.out.println("Números gerados: ");
		System.out.println(textoNumerosGerados);

		System.out.println("Números menores que zero trocados: ");
		System.out.println(textoNumerosMenoresQueZero);
	}

	public static void exercicio7() {
//		Leia dos vetores de 20 posições e calcule um outro vetor contendo, nas posições 
//		pares os valores do primeiro e nas posições impares os valores do segundo.

		int[] vetorNumerosAleatoriosUm = new int[20];
		int[] vetorNumerosAleatoriosDois = new int[20];
		int[] vetorUniaoVetores = new int[40];
		int[] colocaNumeros = { 0, 0 };
		String[] textos = { "Números no primeito vetor: \n", "Números no segundo vetor: \n",
				"Números no vetor de união: \n" };

		for (int i = 0; i < vetorNumerosAleatoriosDois.length; i++) {
			vetorNumerosAleatoriosUm[i] = ThreadLocalRandom.current().nextInt(1, 100);
			textos[0] += String.format("vetorNumerosAleatoriosUm[%2d] ", i)
					+ String.format("| %2d |\n", vetorNumerosAleatoriosUm[i]);

			vetorNumerosAleatoriosDois[i] = ThreadLocalRandom.current().nextInt(1, 100);
			textos[1] += String.format("vetorNumerosAleatoriosDois[%2d] ", i)
					+ String.format("| %2d |\n", vetorNumerosAleatoriosDois[i]);
		}

		System.out.println(textos[0]);
		System.out.println(textos[1]);

		for (int i = 0; i < vetorUniaoVetores.length; i++) {
			if (i % 2 == 0) {
				vetorUniaoVetores[i] = vetorNumerosAleatoriosUm[colocaNumeros[0]];
				textos[2] += String.format("vetorUniaoVetores[%2d] ", i)
						+ String.format("| %2d |\n", vetorUniaoVetores[i]);
				colocaNumeros[0]++;
			} else {
				vetorUniaoVetores[i] = vetorNumerosAleatoriosDois[colocaNumeros[1]];
				textos[2] += String.format("vetorUniaoVetores[%2d] ", i)
						+ String.format("| %2d |\n", vetorUniaoVetores[i]);
				colocaNumeros[1]++;

			}
		}

		System.out.println(textos[2]);
	}

	public static void exercicio8() {
//		 Leia um vetor de 40 posições e acumule os valores do primeiro elemento no
//		 segundo, deste no terceiro e assim por diante. Ao final, escreva o vetor
//		 obtido.

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
//		Leia um vetor contendo letras de uma frase inclusive os espaços em branco. 
//		Retirar os espaços em branco do vetor e depois escreve-los.

		Scanner entradaDados = new Scanner(System.in);
		String[] letrasFrase;
		String frase;

		System.out.print("Digite uma frase: ");
		frase = entradaDados.nextLine();
		letrasFrase = new String[frase.length()];

		System.out.print("Frase escrita: ");
		for (int i = 0; i < letrasFrase.length; i++) {
			letrasFrase[i] = frase.charAt(i) + "";
			System.out.print(letrasFrase[i]);
		}

		System.out.println("\n\nRetirando os espaços...");
		TimeUnit.SECONDS.sleep(2);

		System.out.print("\nFrase sem espaços: ");
		for (int i = 0; i < letrasFrase.length; i++) {
			if (letrasFrase[i].equals(" ")) {
				letrasFrase[i] = "";
			}
			System.out.print(letrasFrase[i]);
		}

		entradaDados.close();

	}

	public static void exercicio10() {
//		Leia um vetor de 5 posições contendo os caracteres de um numero. Em seguida escreva esse numero por extenso

		String[] letrasNumero = { "S", "e", "t", "e", "n", "t", "a" };

		System.out.println("Número no vetor escrito por extenso:");
		for (int i = 0; i < letrasNumero.length; i++) {
			System.out.print(letrasNumero[i]);
		}
	}

	public static void exercicio11() {
		VerificadorAnagramas.main(null);
	}
	
	public static void exercicio12() {
//		Leia 3 vetores de 9 posições e crie outro com o 1º terço do primeiro, 
//		o segundo 3º. do segundo e o ultimo terço do 3º. Escrever o vetor resultante ao final

		int[] vetorPrimeiro = new int[9];
		int[] vetorSegundo = new int[9];
		int[] vetorTerceiro = new int[9];
		int[] vetorUniao = new int[9];
		String textoPrimeiroVetor = "| ", textoSegundoVetor = "| ", textoTerceiroVetor = "| ", textoVetorUniao = "| ";

		for (int i = 0; i < vetorPrimeiro.length; i++) {
			vetorPrimeiro[i] = ThreadLocalRandom.current().nextInt(1, 100);
			textoPrimeiroVetor += String.format("%2d | ", vetorPrimeiro[i]);

			vetorSegundo[i] = ThreadLocalRandom.current().nextInt(1, 100);
			textoSegundoVetor += String.format("%2d | ", vetorSegundo[i]);

			vetorTerceiro[i] = ThreadLocalRandom.current().nextInt(1, 100);
			textoTerceiroVetor += String.format("%2d | ", vetorTerceiro[i]);

			if (i < vetorUniao.length / 3) {
				vetorUniao[i] = vetorPrimeiro[i];
			} else if (i < vetorUniao.length / 3 + vetorUniao.length / 3) {
				vetorUniao[i] = vetorSegundo[i];
			} else {
				vetorUniao[i] = vetorTerceiro[i];
			}
			textoVetorUniao += String.format("%2d | ", vetorUniao[i]);
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
//		Leia um vetor de 10 posições e verifique se existem valores iguais e os escreva.

		int[] vetorNumerosAleatorios = new int[10];
		boolean numerosIguaisExistem = false;
		String textoVetorGerado = "| ";

		for (int i = 0; i < vetorNumerosAleatorios.length; i++) {
			vetorNumerosAleatorios[i] = ThreadLocalRandom.current().nextInt(1, 20);
			textoVetorGerado += String.format("%2d | ", vetorNumerosAleatorios[i]);
		}
		System.out.println("Vetor gerado: ");
		System.out.println(textoVetorGerado);
		
		System.out.println("\n-----------");
		for (int i = 0; i < vetorNumerosAleatorios.length; i++) {
			for (int j = i; j < vetorNumerosAleatorios.length; j++) {
				if (i != j && vetorNumerosAleatorios[i] == vetorNumerosAleatorios[j]) {
					System.out.println("vetorNumerosAleatorios[" + i + "] " + vetorNumerosAleatorios[i]);
					System.out.println("vetorNumerosAleatorios[" + j + "] " + vetorNumerosAleatorios[j]);
					System.out.println("-----------");
					numerosIguaisExistem = true;
				} else if(!numerosIguaisExistem) {
					numerosIguaisExistem = false;
				}
			}
		}
		
		if(!numerosIguaisExistem) {
			System.out.println("Não existem números repetidos");
			System.out.println("-----------");
		}
	}

	public static void exercicio14() {
//		Leia um vetor de 50 posições e o compacte, ou seja, elimine as 
//		posições com valor zero avançando uma posição, com os com os valores 
//		subseqüentes do vetor. Dessa forma todos “zeros” devem ficar para as posições finais do vetor

		int[] vetorNumeros = new int[50];
		int auxiliar = 0;
		int quantidadeZeros = 0;
		String textoVetorGerado = "Vetor gerado: \n";

		for (int i = 0; i < vetorNumeros.length; i++) {
			vetorNumeros[i] = ThreadLocalRandom.current().nextInt(0, 30);
			textoVetorGerado += String.format("| %3d |\n", vetorNumeros[i]);
		}
		System.out.println(textoVetorGerado);

		for (int i = 0; i < vetorNumeros.length; i++) {
			for (int j = 0; j < vetorNumeros.length; j++) {
				if (vetorNumeros[j] == 0 && j < vetorNumeros.length - 1) {
					auxiliar = vetorNumeros[j + 1];
					vetorNumeros[j + 1] = 0;
					vetorNumeros[j] = auxiliar;
				}
			}
		}

		System.out.println("Vetor compactado:");
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println(String.format("| %3d |", vetorNumeros[i]));
			if(vetorNumeros[i] == 0) {
				quantidadeZeros++;
			}
		}
		
		System.out.println("A quantidade de zeros colocados para o final do vetor foram: " + quantidadeZeros);
	}

	public static void exercicio15() {
//		Considere um vetor de trajetórias de 9 elementos, onde cada 
//		elemento possui o valor do próximo elemento do vetor a ser lido. 
//        Índice      1   2   3   4   5   6   7   8   9  
//        Valor       5   7   6   9   2   8   4   0   3 
//        Assim, a seqüência da leitura seria 1, 5, 2, 7, 4, 9, 3, 6, 8, 0
//        Faça um algoritmo que seja capaz de ler esse vetor e seguir a trajetória

		int[] valores = { 5, 7, 6, 9, 2, 8, 4, 0, 3 };
		int trajetoria = 1;
		String textoTrajetoria = "Trajetória: \n1, ";

		System.out.println("Posição | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
		System.out.println("Valor   | 5 | 7 | 6 | 9 | 2 | 8 | 4 | 0 | 3 |\n");

		for (int i = 0; i < valores.length; i++) {
			textoTrajetoria += valores[trajetoria - 1];
			if (valores[trajetoria - 1] != 0) {
				textoTrajetoria += ", ";
			}
			trajetoria = valores[trajetoria - 1];
		}

		System.out.println(textoTrajetoria);
	}
}