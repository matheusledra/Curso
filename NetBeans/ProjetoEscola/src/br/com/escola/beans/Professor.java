package br.com.escola.beans;

public class Professor extends Pessoa{
    
    private String turma;
    
    public Professor() {}
    
    public Professor(String nome, String turma) {
        setNome(nome);
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
