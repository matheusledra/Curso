package projetocurso.exercicios.Faculdade;
    
public class Professor extends Funcionario{
    private int horasDeAula;
    
    public void setHorasDeAula(int horasDeAula) {
        this.horasDeAula = horasDeAula;
    }
    
    @Override
    public double getSalario() {
        return (super.getSalario() + horasDeAula * 10);
    }
    
    public String getInfo() {
        String infoBasica = super.getInfo();
        return infoBasica + "\nHoras de Aula: " + this.horasDeAula + "\n\nSalário final com horas de aula: " + getSalario();
    }
}
