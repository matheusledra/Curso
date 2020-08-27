package Curso.Exercises;

import java.util.Scanner;

public class ExercicioIfElse6 {

	public static void main(String[] args) {

		int senha;
		Scanner entradaSenha = new Scanner(System.in);

		System.out.print("Digite a senha: ");
		senha = entradaSenha.nextInt();

		if(senha == 1234) {
			System.out.println("Acesso Permitido!");
		} else {
			System.out.println("Acesso Negado!");
		}
	}
}
