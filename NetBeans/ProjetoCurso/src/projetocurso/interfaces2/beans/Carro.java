package projetocurso.interfaces2.beans;

import projetocurso.interfaces2.AutomovelInterface;

public class Carro extends Automovel implements AutomovelInterface{
    
    public Carro() {
        setTipoAutomovel("Carro");
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getTipoAutomovel() {
        return super.getTipoAutomovel();
    }
    
    @Override
    public String getTipoRodas() {
        return "Roda de Carro";
    }
    
    public void setTipoMotor(String tipoMotor){ 
    }

    @Override
    public void setTipoMotor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
