package projetocurso.exercicios.Funcionario;

public class Gerente extends Funcionario{
    
    @Override
    public void recebeAumento(double salario) {
        double percentAumento = (getSalario() * 0.15);
        
        super.setSalario(salario + percentAumento);
    }
}
