package projetocurso.interfaces2.beans;

import projetocurso.interfaces2.AutomovelInterface;

public abstract class Automovel{
    
    private String tipoAutomovel;
    private String modelo;
    private String marca;
    private String tipoRodas;

    public String getTipoAutomovel() {
        return tipoAutomovel + "/" + marca + " " + modelo;
    }

    public void setTipoAutomovel(String tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoRodas() {
        return tipoRodas;
    }

    public void setTipoRodas(String tipoRodas) {
        this.tipoRodas = tipoRodas;
    }
    
}
