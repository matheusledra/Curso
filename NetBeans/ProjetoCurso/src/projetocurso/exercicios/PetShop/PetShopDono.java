package projetocurso.exercicios.PetShop;

import java.util.ArrayList;

public class PetShopDono {

    private String nomeDono;
    private int idadeDono;
    private ArrayList<String> pet = new ArrayList<String>();

    /**
     * Seta as informações do Dono no Pet
     *
     * @param nomeDono
     * @param idadeDono
     * @param nomePet
     */
    public PetShopDono(String nomeDono, int idadeDono) {
        this.nomeDono = nomeDono;
        this.idadeDono = idadeDono;
    }
    
    public void addPet(String nomePet) {
        this.pet.add(nomePet);
    }

    /**
     * Retorna o nome do Dono do Pet
     *
     * @return
     */
    public String getNome() {
        return this.nomeDono;
    }

    /**
     * Retorna a idade do Dono do Pet
     *
     * @return
     */
    public int getIdade() {
        return this.idadeDono;
    }

    /**
     * Retorna o nome do Pet
     *
     * @return
     */
    public ArrayList<String> getPet() {
        return this.pet;
    }
}
