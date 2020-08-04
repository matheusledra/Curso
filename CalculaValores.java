package Curso;

public class CalculaValores{

	public static void main (String[] args) {
		
		int nummeroUm;
		int nummeroDois;
		int soma, subtracao, vezes, divisao;
		
		// Ira fazer um calculo de soma
		
		nummeroUm = 10;
		nummeroDois = 60;
		soma = nummeroUm + nummeroDois;
		subtracao = nummeroUm - nummeroDois;
		vezes = nummeroUm / nummeroDois;
		divisao = nummeroUm * nummeroDois;
		
		System.out.println("O resultado: " + soma);
		System.out.println("O resultado: " + subtracao);
		System.out.println("O resultado: " + vezes);
		System.out.println("O resultado: " + divisao);
	}
}