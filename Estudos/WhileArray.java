package Curso.Estudos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class WhileArray {

	public static void main(String[] args) throws InterruptedException {
	}

	public static void teste() {
		Scanner informaNomes = new Scanner(System.in);
		String[] arrayString = new String[5];

		int repete = 0;

		while (repete < 5) {
			System.out.println("Informe um nome: ");
			String nome = informaNomes.next();
			arrayString[repete] = nome;
			repete++;
		}

		System.out.println("Nomes cadastrados: ");
		repete = 0;
		while (repete < 5) {
			System.out.println((repete + 1) + " - " + arrayString[repete]);
			repete++;
		}
		informaNomes.close();
	}

	public static void teste2() throws InterruptedException {
		Scanner informaNumeros = new Scanner(System.in);
		int[] numerosArray = new int[10];
		int repete = 0, maior = 0, menor = 99999, posicaoMaior = 0, indiceMaior = 0, posicaoMenor = 0, indiceMenor = 0;

		while (repete < numerosArray.length) {
			System.out.println("Informe o " + (repete + 1) + " número");
			numerosArray[repete] = informaNumeros.nextInt();
			repete++;
		}

		TimeUnit.SECONDS.sleep(1);

		System.out.println("Números informados:");
		repete = 0;
		while (repete < numerosArray.length) {
			System.out.println((repete + 1) + " -> " + numerosArray[repete]);
			repete++;
		}

		TimeUnit.SECONDS.sleep(1);

		repete = 0;
		while (repete < numerosArray.length) {
			if (numerosArray[repete] > maior) {
				maior = numerosArray[repete];
			}
			if (numerosArray[repete] < menor) {
				menor = numerosArray[repete];
			}
			repete++;
		}

		repete = 0;
		while (repete < numerosArray.length) {
			if (maior == numerosArray[repete]) {
				posicaoMaior = repete + 1;
				indiceMaior = repete;
			}
			if (menor == numerosArray[repete]) {
				posicaoMenor = repete + 1;
				indiceMenor = repete;
			}
			repete++;
		}
		System.out.println("O maior número é: " + maior);
		System.out.println("Posição do maior número: " + posicaoMaior);
		System.out.println("Indice do maior número: " + indiceMaior);
		System.out.println();
		System.out.println("O menor número é: " + menor);
		System.out.println("Posição do menor número: " + posicaoMenor);
		System.out.println("Indice do menor número: " + indiceMenor);

		informaNumeros.close();
	}

	public static void teste3() {
		Scanner informaNumeros = new Scanner(System.in);
		int[] numerosArray = new int[10];
		ArrayList<Object> arrayArray = new ArrayList<Object>();
		int repete = 0;

		while (repete < numerosArray.length) {
			System.out.print("Informe o " + (repete + 1) + "º número: ");
			numerosArray[repete] = informaNumeros.nextInt();
			repete++;
		}

		repete = 0;
		while (repete < numerosArray.length) {
			if (numerosArray[repete] % 2 == 0) {
				arrayArray.add(numerosArray[repete]);
			}
			repete++;
		}
		System.out.println("Números Pares: ");
		repete = 0;
		while (repete < arrayArray.size()) {
			System.out.print((repete + 1) + " - ");
			System.out.println(arrayArray.get(repete));
			repete++;
		}

		informaNumeros.close();
	}

	public static void teste4() {
		String[] nomesArray = new String[5];
		String pesquisaNomes;
		String situacao = "";
		int repete = 0;

		while (repete < nomesArray.length) {
			nomesArray[repete] = JOptionPane.showInputDialog(null, "Informe o " + (repete + 1) + "º nome",
					"Informar nomes", JOptionPane.QUESTION_MESSAGE);
			repete++;
		}

		pesquisaNomes = JOptionPane.showInputDialog(null, "Informe o nome que deseja pesquisa", "Pesquisa de nomes",
				JOptionPane.QUESTION_MESSAGE);

		repete = 0;
		while (repete < nomesArray.length) {
			if (nomesArray[repete].equalsIgnoreCase(pesquisaNomes)) {
				situacao = "Cadastrado!";
			} else if (situacao.equals("Cadastrado!")) {
			} else {
				situacao = "Não cadastrado!";
			}
			repete++;
		}

		JOptionPane.showMessageDialog(null, "Nome: " + pesquisaNomes + " \nSituação: " + situacao);
	}

	public static void teste5() {
		ArrayList<String> nomesUsuarios = new ArrayList<String>();
		ArrayList<String> senhaUsuario = new ArrayList<String>();
		ArrayList<String> idadeUsuario = new ArrayList<String>();
		String[] opcoesJOption = { "Cadastrar", "Ver Cadastrados" };
		String[] opcoesJOption2 = { "Sim", "Não" };
		String cadastros = "Usuários cadastrados: \n \n";
		int opcaoEscolhida = 0;
		int adicionaNome = 0;
		boolean repete = true;

		while (repete) {
			repete = false;
			opcaoEscolhida = JOptionPane.showOptionDialog(null, "O que deseja?", "Escolha", JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, opcoesJOption, opcoesJOption[0]);

			if (opcaoEscolhida == 0) {
				nomesUsuarios.add(JOptionPane.showInputDialog("Digite seu nome de usuário"));
				senhaUsuario.add(JOptionPane.showInputDialog("Digite uma senha"));
				idadeUsuario.add(JOptionPane.showInputDialog("Digite sua idade"));
			} else if (opcaoEscolhida == 1) {
				while (adicionaNome < nomesUsuarios.size()) {
					cadastros += "Nome: " + nomesUsuarios.get(adicionaNome) + "\n";
					cadastros += "Senha: " + senhaUsuario.get(adicionaNome) + "\n";
					cadastros += "Idade: " + idadeUsuario.get(adicionaNome) + "\n" + "\n";
					adicionaNome++;
				}
				JOptionPane.showMessageDialog(null, cadastros, "Usuários Cadastrados", JOptionPane.INFORMATION_MESSAGE);
			}
			
			opcaoEscolhida = JOptionPane.showOptionDialog(null, "Deseja voltar ao menu principal?", "Escolha", JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, opcoesJOption2, opcoesJOption2[0]);
			if(opcaoEscolhida == 0) {
				repete = true;
			} else {
				repete = false;
			}
		}
	}
}
