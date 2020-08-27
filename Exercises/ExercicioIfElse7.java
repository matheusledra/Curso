package Curso.Exercises;

import java.util.Scanner;

public class ExercicioIfElse7 {

	public static void main(String[] args) {

		double macas, precoTotal;
		Scanner totalMacas = new Scanner(System.in);

		System.out.print("Digite o número de maçãs compradas: ");
		macas = totalMacas.nextDouble();

		if (macas < 12) {
			precoTotal = macas * 0.30;
			System.out.println("Preço a ser pago: R$" + precoTotal);
		} else {
			precoTotal = macas * 0.25;
			System.out.println("Preço a ser pago: R$" + precoTotal);
		}

	}
}
