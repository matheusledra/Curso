package Curso.Exercises;

import java.util.Scanner;

public class MaiorMenorZero {

	public static void main(String[] args) {

		int iNumero;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		iNumero = sc.nextInt();

		if (iNumero < 0) {
			System.out.println("O número é negativo!");
		} else if (iNumero > 0) {
			System.out.println("O número é positivo!");
		} else {
			System.out.println("O número é igual a zero");
		}

	}
}
