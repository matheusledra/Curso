package Curso.Estudos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RefazendoExerciciosArray {

	public static void exercicio1() {
		Scanner scEntradaNumeros = new Scanner(System.in);
		int[] numerosArray = new int[10];
		int repeticao = 0;
		
		while(repeticao < numerosArray.length) {
			System.out.println("Digite o " + (repeticao + 1) + " número");
			numerosArray[repeticao] = scEntradaNumeros.nextInt();
			repeticao++;
		}
		
		System.out.println("\nNúmeros: ");
		repeticao = 0;
		while(repeticao < numerosArray.length) {
			System.out.println(numerosArray[repeticao]);
			repeticao++;
		}
		
		scEntradaNumeros.close();
	}

	public static void exercicio2() {
		Scanner scEntradaFrutas = new Scanner(System.in);
		String[] frutasArray = new String[10];
		int repeticao = 0;
		
		while(repeticao < 10) {
			System.out.println("Digite a " + (repeticao + 1) + " fruta: ");
			frutasArray[repeticao] = scEntradaFrutas.next();
			repeticao++;
		}
		
		repeticao = 0;
		System.out.println("Frutas no array:");
		while (repeticao < 10) {
			System.out.println("frutasArray[" + repeticao + "] " + frutasArray[repeticao]);
			repeticao++;
		}
		
		scEntradaFrutas.close();
	}

	public static void exercicio3() {
		int[] numerosArray = new int[10];
		int repeticao = 0, verificarNumeroMenor = 0, menor = 101;

		System.out.println("Números gerados: ");
		while (repeticao < numerosArray.length) {
			numerosArray[repeticao] = ThreadLocalRandom.current().nextInt(1, 100);
			System.out.println("numerosArray[" + repeticao + "] " + numerosArray[repeticao]);
			repeticao++;
		}

		repeticao = 0;
		while (repeticao < numerosArray.length) {
			verificarNumeroMenor = repeticao;
			menor = 101;
			while (verificarNumeroMenor < numerosArray.length) {
				if(numerosArray[verificarNumeroMenor] < menor) {
					menor = numerosArray[verificarNumeroMenor];
					numerosArray[verificarNumeroMenor] = numerosArray[repeticao];
					numerosArray[repeticao] = menor;
				}
				verificarNumeroMenor++;
			}
			repeticao++;
		}

		repeticao = 0;
		System.out.println("Números em sequência");
		while (repeticao < numerosArray.length) {
			System.out.println("numerosArray[" + repeticao + "] " + numerosArray[repeticao]);
			repeticao++;
		}
	}
	
	public static void exercicio4() {
		Scanner scEntrada = new Scanner(System.in);
		int[] numerosArray = new int[10];
		int repeticao = 0, numeroUsuario;
		
		while(repeticao < numerosArray.length) {
			numerosArray[repeticao] = ThreadLocalRandom.current().nextInt(1, 100);
			System.out.println("numerosArray[" + repeticao + "] " + numerosArray[repeticao]);
			repeticao++;
		}
		
		System.out.print("\nEscolha um dos números para saber a posição: ");
		numeroUsuario = scEntrada.nextInt();
		
		repeticao = 0;
		while (repeticao < numerosArray.length) {
			if(numeroUsuario == numerosArray[repeticao]) {
				break;
			}
			repeticao++;
		}
		
		System.out.println("Posição: " + (repeticao + 1));
		
		scEntrada.close();
	}

}
