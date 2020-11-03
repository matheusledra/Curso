package br.com.compromissos.beans;

import java.text.ParseException;
import java.util.ArrayList;

public class Usuario extends Pessoa{
    
    private String login, senha;
    private ArrayList<Compromisso> compromisso = new ArrayList<Compromisso>();
    
    public Usuario(){}

    public Usuario(String nome, int idade, String sexo, String login, String senha) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void addCompromisso(String local, String titulo, String status, String data) throws ParseException {
        Compromisso comp = new Compromisso(local, titulo, status, data);
        this.compromisso.add(comp);
    }
    
    public Compromisso getCompromisso(int indiceCompromisso) {
        return this.compromisso.get(indiceCompromisso);
    }
    
    public int getQntdCompromissos() {
        return this.compromisso.size();
    }
}
