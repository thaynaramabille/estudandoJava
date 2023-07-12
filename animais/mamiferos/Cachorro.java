package mamiferos;

public class Cachorro {
    private int pata; //atributos da classe
    public float peso; //atributos da classe
    private String nome; //atributos da classe

    //criação de um construtor
    public Cachorro(int pata, float peso, String nome) {
        this.pata = pata; //definindo os valores do objeto concreto
        this.peso = peso;
        this.nome = nome;
    }

    public void latir(){ //definindo um comportamento
        System.out.println("Au au ");
    }
}
