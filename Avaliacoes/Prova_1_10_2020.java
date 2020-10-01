package Curso.Avaliacoes;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

public class Prova_1_10_2020 {

	public static void questao1() {
		boolean repetirDivisao = false;
		String confirmacaoRepeticao;
		double numeroUm, numeroDois, resultadoDivisao;

		try {
			do {
				numeroUm = Integer.parseInt(
						JOptionPane.showInputDialog(null, "-- Divisão de números -- \n\nDigite o primeiro número",
								"Divisão", JOptionPane.QUESTION_MESSAGE));
				numeroDois = Integer.parseInt(
						JOptionPane.showInputDialog(null, "-- Divisão de números -- \n\nDigite o primeiro número",
								"Divisão", JOptionPane.QUESTION_MESSAGE));

				resultadoDivisao = numeroUm / numeroDois;

				JOptionPane.showMessageDialog(null,
						"Resultado: \n" + numeroUm + " / " + numeroDois + " = " + resultadoDivisao, "Resultado",
						JOptionPane.INFORMATION_MESSAGE);

				confirmacaoRepeticao = JOptionPane.showInputDialog(null, "Deseja repetir o programa?",
						"Repetir o Programa?", JOptionPane.QUESTION_MESSAGE);

				repetirDivisao = (confirmacaoRepeticao.equalsIgnoreCase("S")) ? true : false;
			} while (repetirDivisao);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro!\n" + e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
		} finally {
			System.exit(0);
		}
	}

	public static void questao2() {
		boolean repetirPrograma = false;
		String confirmacaoRepeticao;
		int numero, somaTotal = 0;

		try {
			do {
				somaTotal = 0;
				numero = Integer.parseInt(JOptionPane.showInputDialog(null,
						"-- Somador de números anteriores -- \n\nDigite um número maior que 25", "Soma de Números",
						JOptionPane.QUESTION_MESSAGE));

				if (numero < 25) {
					JOptionPane.showMessageDialog(null,
							"Você digitou um número menor que 25! \n\nNúmero digitado -> " + numero, "Número inválido",
							JOptionPane.INFORMATION_MESSAGE);
					repetirPrograma = true;
				} else {
					somaTotal += numero;
					for (int i = numero; i > 0; i--) {
						somaTotal += i;
					}

					JOptionPane.showMessageDialog(null, "Somatória concluída! \n\nSoma total: " + somaTotal,
							"Soma concluída", JOptionPane.INFORMATION_MESSAGE);

					confirmacaoRepeticao = JOptionPane.showInputDialog(null, "Deseja fazer outra somatória?",
							"Repetir Programa?", JOptionPane.QUESTION_MESSAGE);

					repetirPrograma = (confirmacaoRepeticao.equalsIgnoreCase("S")) ? true : false;
				}
			} while (repetirPrograma);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro!\n" + e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
		} finally {
			System.exit(0);
		}
	}

	public static void questao3() {
		boolean repetirPrograma = false;
		String confirmacaoRepeticao;
		int numeroGerado, maior = 0, menor = 2001, somaTotal = 0;
		double media;

		try {
			do {
				somaTotal = 0;
				maior = 0;
				menor = 2001;
				for (int i = 0; i < 500; i++) {
					numeroGerado = ThreadLocalRandom.current().nextInt(1, 2000);
					somaTotal += numeroGerado;

					if (numeroGerado > maior) {
						maior = numeroGerado;
					}
					if (numeroGerado < menor) {
						menor = numeroGerado;
					}
				}

				media = somaTotal / 500;

				JOptionPane.showMessageDialog(null,
						"Foram gerados 500 número entre 1 e 2000 \nEntre eles: \n\nO maior -> " + maior
								+ "\nO menor -> " + menor + "\nA soma total -> " + somaTotal + "\nA média geral -> "
								+ media,
						"Números gerados", JOptionPane.INFORMATION_MESSAGE);

				confirmacaoRepeticao = JOptionPane.showInputDialog(null, "Deseja repetir o programa?",
						"Repetir Programa?", JOptionPane.QUESTION_MESSAGE);

				repetirPrograma = (confirmacaoRepeticao.equalsIgnoreCase("S")) ? true : false;
			} while (repetirPrograma);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro!\n" + e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
		} finally {
			System.exit(0);
		}
	}

	public static void questao4() {
		boolean repetirPrograma = false, numeroForaIntervalo = false;
		String confirmacaoRepeticao;
		int numeroGerado, numeroUsuario, pontuacao = 0;

		try {
			do {
				numeroGerado = ThreadLocalRandom.current().nextInt(1, 15);

				do {
					numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, numeroGerado
							+ "-- Jogo do Acerto -- \nÉ gerado um número entre 1 e 15 \nO usuário digita um número de 1 a 15 \nSe o usuário acertar, ganha 1 ponto!"
							+ " \n\nFoi gerado um número entre 1 e 15! \n\nDigite sua tentativa", "Jogo do Acerto",
							JOptionPane.QUESTION_MESSAGE));

					if (numeroUsuario >= 1 && numeroUsuario <= 15) {
						numeroForaIntervalo = false;
						if (numeroUsuario == numeroGerado) {
							pontuacao++;
							JOptionPane.showMessageDialog(null,
									"Parabéns, Você acertou o número! \n+1 Ponto \n\nPontuação Atual: " + pontuacao,
									"Acertou!", JOptionPane.INFORMATION_MESSAGE);

							confirmacaoRepeticao = JOptionPane.showInputDialog(null, "Deseja jogar novamente? S/N",
									"Jogar Novamente?", JOptionPane.INFORMATION_MESSAGE);
							repetirPrograma = (confirmacaoRepeticao.equalsIgnoreCase("S")) ? true : false;
						} else {
							confirmacaoRepeticao = JOptionPane.showInputDialog(null,
									"Que Pena! Você errou o número! \nO número era: " + numeroGerado
											+ "\n\nDeseja tentar novamente? S/N",
									"Errou!", JOptionPane.INFORMATION_MESSAGE);
							repetirPrograma = (confirmacaoRepeticao.equalsIgnoreCase("S")) ? true : false;
						}
					} else {
						numeroForaIntervalo = true;
						JOptionPane.showMessageDialog(null,
								"Você digitou um número fora do intervalo! [1, 15] \nNúmero digitado: " + numeroUsuario
										+ "\n\nO programa voltará, mas o número gerado será o mesmo",
								"Número fora do intervalo", JOptionPane.INFORMATION_MESSAGE);
					}
				} while (numeroForaIntervalo);
			} while (repetirPrograma);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro!\n" + e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
		} finally {
			System.exit(0);
		}
	}
}
