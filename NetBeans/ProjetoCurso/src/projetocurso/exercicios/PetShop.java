package projetocurso.exercicios;

public class PetShop {

    private PetShopPet pet;
    private PetShopDono donoPet;

    /**
     * Seta as informações do Dono do Pet
     *
     * @param nomeDono
     * @param idadeDono
     * @param nomePet
     */
    public void setDonoPet(String nomeDono, int idadeDono, String nomePet) {
        this.donoPet = new PetShopDono(nomeDono, idadeDono, nomePet);
    }

    /**
     * Seta as informações do Pet
     *
     * @param nomePet
     * @param tipoPet
     * @param corPet
     */
    public void setPet(String nomePet, String tipoPet, String corPet) {
        this.pet = new PetShopPet(nomePet, tipoPet, corPet);
    }

    /**
     * Informações sobre o Dono do Pet
     *
     * @return
     */
    public PetShopDono getDonoPet() {
        return this.donoPet;
    }

    /**
     * Informações sobre o Pet
     *
     * @return
     */
    public PetShopPet getPet() {
        return this.pet;
    }
}
