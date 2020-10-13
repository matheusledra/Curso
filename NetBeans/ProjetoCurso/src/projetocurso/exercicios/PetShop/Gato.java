package projetocurso.exercicios.PetShop;

public class Gato extends PetShopPet {
    
    public String mia() {
        return new String("Miau");
    }
    
    @Override
    public String emiteSom() {
        return mia();
    }
    
}
