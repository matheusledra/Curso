package projetocurso.interfaces2.beans;

import projetocurso.interfaces2.AutomovelInterface;

public class Moto extends Automovel implements AutomovelInterface{
    
    public Moto() {
        setTipoAutomovel("Motocicleta");
    }
    
    public String getTipoAutomovel() {
        return super.getTipoAutomovel();
    }
    
    @Override
    public String getTipoRodas() {
        return "Roda de Moto";
    }
    
    public void setTipoMotor(String tipoMotor){ 
    }

    @Override
    public void setTipoMotor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
