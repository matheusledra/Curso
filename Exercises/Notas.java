package Curso.Exercises;

import java.util.Scanner;

public class Notas {
	
	public static void main(String[] args) {
		
		double nota = 0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva a nota: ");
		nota = sc.nextDouble();
		
		if(nota <= 3) {
			System.out.println("Nota ruim");
		} else if(nota > 3 && nota < 6) {
			System.out.println("Nota satisfatoria");
		} else if(nota > 6 && nota < 8) {
			System.out.println("Nota boa");
		} else if(nota > 8 && nota < 10){
			System.out.println("Nota otima!");
		} else {
			System.out.println("A Nota maxima é 10");
		}
	}
}
