package projetocurso.exercicios.Funcionario;

public abstract class Funcionario {
    private String nome, departamento, dataEntrada, rg;
    private double salario;
    
    public Funcionario(){}
    
    public Funcionario(String nome, String departamento, String dataEntrada, double salario, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.rg = rg;
        this.dataEntrada = dataEntrada;
    }
    
    public void recebeAumento(double aumento) {
        this.salario = this.salario + aumento;
    }
    
    public double calculaGanhoAnual() {
        return (this.salario * 12);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEntradaBanco() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
