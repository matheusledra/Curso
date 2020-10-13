package projetocurso.exercicios.PetShop;

public class Cachorro extends PetShopPet {
    
    public String late() {
        return new String("Au Au");
    }
    
    @Override
    public String emiteSom() {
        return late();
    }
}
