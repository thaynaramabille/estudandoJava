package ave;

//criação da classe
public class Passaro {
    private int asa; //atributos da classe
    public float peso; //atributos da classe
    private String nome; //atributos da classe

    //criação de um construtor
    public Passaro (int asa, float peso, String nome){
        this.asa = asa; //definindo os valores do objeto concreto
        this.peso = peso;
        this.nome = nome;

    }
    //Modificadores de acesso - acessa atributos e metodos
        //Private - somente a propria classe
        //Protect - somente classes filhas
        //Public - todos tem acesso

//void é o qeu temos na alma = nada, vazio, solo
    public void voar(){ //definindo um comportamento
        System.out.println("Tchau mae");
    }

}

