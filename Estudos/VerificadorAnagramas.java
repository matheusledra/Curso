package Curso.Estudos;

import javax.swing.JOptionPane;

public class VerificadorAnagramas {

//		Leia dois vetores. Verifique e escreva se um é anagrama de outro

	public static void main(String[] args) {
		try {
			boolean repetirPrograma = false;

			JOptionPane.showMessageDialog(null, mensagens(0, 0, 0, "", ""), "Bem-Vindo",
					JOptionPane.INFORMATION_MESSAGE);

			do {
				String[] opcoesRepetir = { "Sim", "Não" };
				String palavraUm = "", palavraDois = "";
				char[] primeiraPalavra, segundaPalavra;
				boolean tamanhoMenorMaior = false, continua = false;
				int quantidadeLetras = 0, repetir = 1;

				palavraUm = JOptionPane.showInputDialog(null, mensagens(1, 0, 0, "", ""), "Primeira palavra",
						JOptionPane.QUESTION_MESSAGE).toLowerCase();
				primeiraPalavra = palavraUm.toCharArray();
				
				do {
					palavraDois = JOptionPane.showInputDialog(null, mensagens(2, primeiraPalavra.length, 0, "", ""),
							"Segunda palavra", JOptionPane.QUESTION_MESSAGE).toLowerCase();
					
					segundaPalavra = palavraDois.toCharArray();

					if (segundaPalavra.length < primeiraPalavra.length) {
						JOptionPane.showMessageDialog(null,
								mensagens(3, primeiraPalavra.length, segundaPalavra.length, palavraUm, palavraDois),
								"Erro!", JOptionPane.ERROR_MESSAGE);
						tamanhoMenorMaior = true;
					} else if (segundaPalavra.length > primeiraPalavra.length) {
						JOptionPane.showMessageDialog(null,
								mensagens(4, primeiraPalavra.length, segundaPalavra.length, palavraUm, palavraDois),
								"Erro!", JOptionPane.ERROR_MESSAGE);
						tamanhoMenorMaior = true;
					} else {
						tamanhoMenorMaior = false;
						if (palavraUm.equals(palavraDois)) {
							JOptionPane.showMessageDialog(null, mensagens(5, 0, 0, palavraUm, palavraDois),
									"Palavras Iguais!", JOptionPane.INFORMATION_MESSAGE);
						} else {
							for (int i = 0; i < segundaPalavra.length; i++) {
								for (int j = 0; j < segundaPalavra.length; j++) {
									if (primeiraPalavra[i] == segundaPalavra[j]) {
										segundaPalavra[j] = ' ';
										quantidadeLetras++;
										continua = true;
										break;
									} else {
										continua = false;
									}
								}
								if (!continua) {
									break;
								}
							}

							if (quantidadeLetras == primeiraPalavra.length) {
								JOptionPane.showMessageDialog(null, mensagens(6, 0, 0, palavraUm, palavraDois));
							} else {
								JOptionPane.showMessageDialog(null, mensagens(7, 0, 0, palavraUm, palavraDois));
							}
						}
					}
				} while (tamanhoMenorMaior);

				repetir = JOptionPane.showOptionDialog(null, mensagens(8, 0, 0, "", ""), "Repetir",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesRepetir, opcoesRepetir[0]);

				if (repetir == 0) {
					repetirPrograma = true;
				} else {
					repetirPrograma = false;
					System.exit(0);
				}
			} while (repetirPrograma);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
		} finally {
			System.exit(0);
		}
	}

	public static String mensagens(int mensagem, int tamanhoPrimeira, int tamanhoSegunda, String palavraUm,
			String palavraDois) {
		String[] vetorMensagens = new String[9];

		vetorMensagens[0] = "Verificador de Anagramas \nBem-Vindo!s \n\n"
				+ "O programa funciona da seguinte forma: \n\n" + "•  O usuário digita uma palavra, logo após uma \n"
				+ "  outra palavra. (OBS: A quantidade de letras \n" + "  deve ser igual) \n"
				+ "•  O programa fará a verificação instantânea e \n" + "  dará o resultado, sendo ou não um anagrama.";
		vetorMensagens[1] = "Digite a primeira palavra";
		vetorMensagens[2] = "Digite a segunda palavra (" + tamanhoPrimeira + " letras)";
		vetorMensagens[3] = "Erro! \n" + "A segunda palavra é menor que a primeira \n" + "Primeira palavra: "
				+ palavraUm + " -> " + tamanhoPrimeira + " letras \nSegunda palavra: " + palavraDois + " -> "
				+ tamanhoSegunda + " letras \n\nResultado: Verificação não feita!";
		vetorMensagens[4] = "Erro! \n" + "A segunda palavra é maior que a primeira \n" + "Primeira palavra: "
				+ palavraUm + " -> " + tamanhoPrimeira + " letras \nSegunda palavra: " + palavraDois + " -> "
				+ tamanhoSegunda + " letras \n\nResultado: Verificação não feita!";
		vetorMensagens[5] = "Primeira palavra: " + palavraUm + "\nSegunda palavra: " + palavraDois
				+ "\n\nResultado: As palavras são iguais";
		vetorMensagens[6] = "Primeira palavra: " + palavraUm + "\nSegunda palavra: " + palavraDois
				+ "\n\nResultado: É um anagrama!";
		vetorMensagens[7] = "Primeira palavra: " + palavraUm + "\nSegunda palavra: " + palavraDois
				+ "\n\nResultado: Não é um anagrama!";
		vetorMensagens[8] = "Deseja verificar outra palavra?";

		return vetorMensagens[mensagem];
	}
}
