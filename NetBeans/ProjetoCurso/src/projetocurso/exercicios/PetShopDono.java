package projetocurso.exercicios;

public class PetShopDono {

    private String nomeDono;
    private int idadeDono;
    private String pet;

    /**
     * Seta as informações do Dono no Pet
     *
     * @param nomeDono
     * @param idadeDono
     * @param nomePet
     */
    public PetShopDono(String nomeDono, int idadeDono, String nomePet) {
        this.nomeDono = nomeDono;
        this.idadeDono = idadeDono;
        this.pet = nomePet;
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
    public String getPet() {
        return this.pet;
    }
}
