package projetocurso.exercicios;

import javax.swing.JOptionPane;

public class CriacaoExercicios {

    public static void main(String[] args) {
        try {
            Pessoa pessoa = new Pessoa();

            String nome = JOptionPane.showInputDialog(null, "Digite seu nome", "Nome", JOptionPane.QUESTION_MESSAGE);
            String sexo = JOptionPane.showInputDialog(null, "Digite seu sexo", "Sexo", JOptionPane.QUESTION_MESSAGE);

            pessoa.setPessoa(nome, sexo);

            int qntdCompromissos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos compromissos você tem?", "Quantidade Compromissos", JOptionPane.QUESTION_MESSAGE));

            for (int i = 0; i < qntdCompromissos; i++) {
                String titulo = JOptionPane.showInputDialog(null, "Digite o título do compromisso", "Titulo", JOptionPane.QUESTION_MESSAGE);
                String tipo = JOptionPane.showInputDialog(null, "Digite o tipo do compromisso \n\nOnline, presencial, etc.", "Tipo", JOptionPane.QUESTION_MESSAGE);
                String data = JOptionPane.showInputDialog(null, "Digite a data do compromisso \n\nDD/MM/AAAA", "Data", JOptionPane.QUESTION_MESSAGE);
                String local = JOptionPane.showInputDialog(null, "Digite o local do compromisso", "Local", JOptionPane.QUESTION_MESSAGE);

                pessoa.setCompromisso(titulo, tipo, data, local);
                pessoa.setCompromisso();
            }

            String compromissosSalvos = "Compromissos de " + pessoa.getNome()
                    + "\n\n=====================================\n";

            for (int i = 0; i < qntdCompromissos; i++) {
                compromissosSalvos += "Compromisso " + (i + 1)
                        + "\nTítulo - " + pessoa.getCompromisso(i).getTitulo()
                        + "\nTipo - " + pessoa.getCompromisso(i).getTipo()
                        + "\nData - " + pessoa.getCompromisso(i).getData()
                        + "\nLocal - " + pessoa.getCompromisso(i).getLocal()
                        + "\n=====================================\n";

            }

            JOptionPane.showMessageDialog(null, compromissosSalvos, "Compromissos", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
