package projetocurso.interfaces2.beans;

import projetocurso.interfaces2.AutomovelInterface;

public class Exe{
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();
        
        carro.setMarca("Fiat");
        carro.setModelo("Palio");
        
        moto.setMarca("Susuki");
        moto.setModelo("Sla");
        
        getAutomovelInfos(moto);
    }
    
    public static void getAutomovelInfos(AutomovelInterface auto) {
        
        System.out.println("Infos: " + auto.getTipoAutomovel());
        System.out.println("Tipo de Rodas: " + auto.getTipoRodas());
    }
}
