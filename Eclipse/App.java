package Curso;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		int idade = 0;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite sua idade"); // Esperado um Int 
			idade = sc.nextInt(); // Vai ler o input do Int

			System.out.println("Sua idade e: " + idade); // Escreve o texto + a Int digitada
		} catch (Exception e) {
			System.out.println("Erro na entrada do valor!"); // Mensagem de erro caso não seja digitado um Int
		} finally {
			sc.close(); // Fecha o scanner após ler o Int
		}
	}
}
