package Curso.Exercises;

import java.util.Scanner;

public class ExercicioIfElse5 {

	public static void main(String[] args) {
		
		int anoNascimento;
		Scanner entradaAno = new Scanner(System.in);
		
		System.out.print("Digite seu ano de nascimento: ");
		anoNascimento = entradaAno.nextInt();
		
		if(2020 - anoNascimento >= 16) {
			System.out.println("Você pode votar esse ano!");
		} else {
			System.out.println("Você não pode votar esse ano!");
		}
		
	}
}
