package projetocurso.interfaces;

public class Professor extends FuncionarioA implements Funcionario{
    private int horasDeAula;

    public int getHorasDeAula() {
        return horasDeAula;
    }

    public void setHorasDeAula(int horasDeAula) {
        this.horasDeAula = horasDeAula;
    }
    
    
    public double getGastos() {
        return getSalario() + (getHorasDeAula() * 10);
    }
    
    public String getInfo(){
     String infos = "Nome: " + getNome() + "\n";
     infos += "Departamento: " + getDepto()+ "\n";
     infos += "Salário: " + getSalario()+ "\n";
     
     infos += "Horas de Aula: " + getHorasDeAula() + "\n";
     return infos;
    }
    
    public void recebeAumento(double aumento) {
        setSalario(aumento + 400);
    }

    @Override
    public void recebeAumanto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
