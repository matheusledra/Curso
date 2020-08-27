package Curso.Estudos;

import java.util.Scanner;

public class IfElseTernario {

	public static void main(String[] args) {

		double iNota1 = 0.0, iNota2 = 0.0, iNota3 = 0.0, iNota4 = 0.0, iMedia = 0.0;
		String sNotaMaior = "", sNotaMenor = "";

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		iNota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		iNota2 = sc.nextDouble();
		System.out.print("Digite a terceita nota: ");
		iNota3 = sc.nextDouble();
		System.out.print("Digite a quarta nota: ");
		iNota4 = sc.nextDouble();

		if (iNota1 < 0 || iNota2 < 0 || iNota3 < 0 || iNota4 < 0) {
			System.out.println("Uma das notas digitadas é menor que 0!");
			sNotaMaior = iNota1 < 0 ? "Nota 1 -> " + iNota1
					: iNota2 < 0 ? "Nota 2 -> " + iNota2 : iNota3 < 0 ? "Nota 3 -> " + iNota3 : "Nota 4 -> " + iNota4;
			System.out.println(sNotaMaior);
		} else if (iNota1 > 10 || iNota2 > 10 || iNota3 > 10 || iNota4 > 10) {
			System.out.println("Uma das notas digitadas é maior que 10!");
			sNotaMenor = iNota1 > 10 ? "Nota 1 -> " + iNota1
					: iNota2 > 10 ? "Nota 2 -> " + iNota2 : iNota3 > 10 ? "Nota 3 -> " + iNota3 : "Nota 4 -> " + iNota4;
			System.out.println(sNotaMenor);
		} else {
			iMedia = (iNota1 + iNota2 + iNota3 + iNota4) / 4;

			if (iMedia >= 0 && iMedia < 6) {
				System.out.println("Média do Aluno - > " + iMedia);
				System.out.println("Reprovado");
			} else if (iMedia >= 6 && iMedia < 9) {
				System.out.println("Média do Aluno - > " + iMedia);
				System.out.println("Aprovado - Bom");
			} else if (iMedia >= 9) {
				System.out.println("Média do Aluno - > " + iMedia);
				System.out.println("Aprovado - Ótimo");
			}
		}
		sc.close();
	}
}
