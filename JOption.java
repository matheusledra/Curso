package Curso;

import javax.swing.JOptionPane;

public class JOption {
	
	public static void main(String[] args) {
		String pergunta = "Teste" + 
				"\nTeste";
		
		String nomeUsuario = JOptionPane.showInputDialog("Informe seu nome: " + pergunta);
		
		JOptionPane.showMessageDialog(null, "Seja Bem-Vindo " + nomeUsuario, "Boas Vindas!", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
