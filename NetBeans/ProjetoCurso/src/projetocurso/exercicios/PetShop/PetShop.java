package projetocurso.exercicios.PetShop;

import java.util.ArrayList;

public class PetShop {

    private ArrayList<PetShopPet> petList = new ArrayList<PetShopPet>();
    private PetShopPet pet;
    private PetShopDono donoPet;

    public void setPet(String nomePet, String tipoPet, String corPet) {
        this.pet = new PetShopPet(nomePet, tipoPet, corPet);
    }
    
    /**
     * Seta as informações do Dono do Pet
     *
     * @param nomeDono
     * @param idadeDono
     * @param nomePet
     */
    public void setDonoPet(String nomeDono, int idadeDono) {
        this.donoPet = new PetShopDono(nomeDono, idadeDono);
    }

    /**
     * Seta as informações do Pet
     *
     */
    public void setPet() {
        this.petList.add(this.pet);
//        this.pet = new PetShopPet(nomePet, tipoPet, corPet);
    }

    /**
     * Informações sobre o Dono do Pet
     *
     * @return
     */
    public PetShopDono getDonoPet() {
        return this.donoPet;
    }

    public PetShopPet getPet(int indice) {
        return this.petList.get(indice);
    }
    
    public ArrayList<PetShopPet> getPets() {
        return this.petList;
    }
}
