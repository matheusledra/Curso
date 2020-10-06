package projetocurso;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {
    String nome;
    String voz;
    double altura;
    double peso;
    int idade;
    
    /**
     * Construtor vazio
     */
    Pessoa() {
        
    }
    
    /**
     * Construtor com nome
     * @param nome 
     */
    Pessoa(String nome) {
        this.nome = nome;
    }
    
    /**
     * Salvar o nome da pessoa
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Pega o nome da pessoa salvo
     * @return 
     */
    public String getNome() {
        return this.nome;
    }
    
    /**
     * Salva a voz da pessoa
     * @param voz 
     */
    public void setVoz(String voz) {
        this.voz = voz;
    }
    
    /**
     * Pega a voz da pessoa salva
     * @return
     */
    public String getVoz() {
        return this.voz;
    }
    
    /**
     * Salva a altura da pessoa
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /**
     * Pega a altura da pessoa salva
     * @return
     */
    public double getAltura() {
        return this.altura;
    }
    
    /**
     * Salva o peso da pessoa
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    /**
     * Pega o peso da pessoa salva
     * @return
     */
    public double getPeso() {
        return this.peso;
    }
    
    /**
     * Salva a idade da pessoa
     * @param idade
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /**
     * Pega a idade da pessoa salva
     * @return
     */
    public int getIdade() {
        return this.idade;
    }
    
    /**
     * Descobra a idade pelo ano de
     * nascimento da pessoa
     */
    public String getIdadeAnoNasc(int anoNascimento) {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int idade = 0;
        String retornacao = "";
        
        if(anoNascimento > anoAtual) {
            retornacao += "Ano de Nascimento é inválido";
        } else {
            idade = anoAtual - anoNascimento;
            retornacao += "" + idade;
        }
        return retornacao;
    }
    
}
