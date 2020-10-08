package projetocurso.exercicios.Compromissos;

import java.text.ParseException;
import java.util.ArrayList;

public class Pessoa {
    private ArrayList<Compromissos> comp = new ArrayList<Compromissos>();
    private Compromissos compro;
    private String nome, sexo;
    
    public void setCompromisso(String titulo, String tipo, String dataCompromisso, String local) throws ParseException {
        this.compro = new Compromissos(titulo, tipo, dataCompromisso, local);
    }
    public void setCompromisso() throws ParseException {
        this.comp.add(this.compro);
    }
    
    public Compromissos getCompromisso(int indice) {
        return this.comp.get(indice);
    }
    
    public ArrayList<Compromissos> getCompromissos() {
        return this.comp;
    }
    
    public void setPessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getSexo() {
        return this.sexo;
    }
    
}
