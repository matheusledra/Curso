package Curso.Exercises;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exercicios {

	static Scanner entradaValores;
	static int escolhaExercicio;

	public static void main(String[] args) throws InterruptedException {

		int eentradaValoresolhaLista;
		entradaValores = new Scanner(System.in);

		System.out.println("Selecione uma Lista: ");
		System.out.println("1 -> Lista de Exercícios Básicos Java");
		System.out.println("2 -> Exercícios do Cleiton");
		System.out.println("3 -> Exercícios do Ramon");
		System.out.println("4 -> Exercícios de If/Else");
		System.out.println("5 -> Exercícios de Switch");

		eentradaValoresolhaLista = entradaValores.nextInt();

		System.out.println("");
		System.out.println("Abrindo lista...");

		switch (eentradaValoresolhaLista) {
		case 1:
			ExerciciosBasicos.exerciciosBasicos();
			break;
		case 2:
			ExerciciosCleiton.exerciciosCleiton();
			break;
		case 3:
			ExerciciosRamon.exerciciosRamon();
			break;
		case 4:
			ExerciciosIfElse.exerciciosIfElse();
			break;
		case 5:
			ExerciciosSwitch.exerciciosSwitch();
			break;
		default:
			System.out.println("Lista não encontrada...");
			break;
		}

	}
}