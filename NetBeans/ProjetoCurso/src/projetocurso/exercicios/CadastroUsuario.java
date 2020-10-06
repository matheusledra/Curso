package projetocurso.exercicios;

public class CadastroUsuario {

    String nome;
    int idade;

    /**
     * Salva o nome do usuário
     * @param nome
     */
    public void setName(String nome) {
        if (!"".equals(nome)) {
            this.nome = nome;
        } else {
            this.nome = "Unknown";
        }
    }

    /**
     * Retorna o nome do usuário
     * @return
     */
    public String getName() {
        return this.nome;
    }

    /**
     * Salva a idade do usuário
     * @param idade
     */
    public void setIdade(int idade) {
        if ("".equals(idade)) {
            this.idade = idade;
        } else {
            this.idade = 0;
        }
    }

    /**
     * Retorna a idade do usuário
     * @return
     */
    public int getIdade() {
        return this.idade;
    }
}
