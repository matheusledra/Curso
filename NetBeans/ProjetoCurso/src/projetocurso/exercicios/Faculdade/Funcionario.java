package projetocurso.exercicios.Faculdade;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public String getInfo() {
        return "Nome: " + nome + "\nSalário: " + salario;
    }
    
}
