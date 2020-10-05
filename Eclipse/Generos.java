package Curso;
// Informa em que pacota esta salvo a classe

import java.util.Scanner;
// Importa o Scanner

public class Generos {
	//Define uma classe publica chamada Generos
	
	public static void main(String[] args) {
		// Metodo padrao java para falar ao java o que executar
		
		String gen;
		// Define uma String(Frase) com a variavel "gen"
		String nome;
		// Define uma String(Frase) com a variavel "nome"
		
		Scanner sc = new Scanner(System.in);
		// Cria um escanemento do teclado ao ser digitado no prompt
		
		System.out.println("Qual o seu nome?");
		// Imprime uma linha escrito "Qual o seu nome?"
		nome = sc.nextLine();
		// Escaneia o que for escrito no prompt e atribui o que for escrito a variavel "nome"
		
		System.out.println("Qual e seu genero? (M,F,B...)");
		// Imprime uma linha escrito "Qual e seu genero? (M,F,B...)"
		gen = sc.next();
		// Escaneia a primeira palavra/numero escrita e atribui o que for escrito a variavel "gen"
		
		// Para números é usado if(5 == 5)
		// Para Strings é usado if(var.equals) ou if(var.equalsIgnoreCase) -- (equalsIgnoreCase ignora se esta maisculo ou minusculo)
		if(gen.equalsIgnoreCase("M")) {
			// Verifica se o valor da variavel "gen" for "M" ignorando se estiver maiusculo ou minusculo e executar o que estiver dentro do {}
			System.out.println("Bem-Vindo " + nome);
			// Imprime uma linha escrito "Bem-Vindo " + o valor dado a variavel "nome"
		} else if(gen.equals("F")){
			// Caso não for "M" se o valor da variavel "gen" for "F" ignorando se estiver maiusculo ou minusculo e executar o que estiver dentro do {}
			System.out.println("Bem-Vinda " + nome);
			// Imprime uma linha escrito "Bem-Vinda " + o valor dado a variavel "nome"
		} else {
			// Caso não for nenhum dos anteriores vai executar o que estiver dentro do {}
			System.out.println("Bem-Vindx " + nome);
			// Imprime uma linha escrito "Bem-Vindx " + o valor dado a variavel "nome"
		}
		sc.close();
		// Para o escaneamento do teclado
	}
}
