package Curso.Exercises;

import java.util.Scanner;

public class NotasMacas {
	
	public static void main(String[] args) {
		
		double nota = 0.0;
		int macas = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva a nota: ");
		nota = sc.nextDouble();
		
		System.out.print("Escreva o numero de macas: ");
		macas = sc.nextInt();
		
		if(nota < 10 || macas < 10) {
			System.out.println("Nota top");
		} else if(nota < 8 || macas < 8) {
			System.out.println("Nota satisfatoria");
		} else if(nota < 6 || macas < 6) {
			System.out.println("Nota boa");
		} else if(nota < 3 || macas < 3) {
			System.out.println("Nota otima!");
		} else {
			System.out.println("A Nota maxima é 10");
		}
		
	}

}
