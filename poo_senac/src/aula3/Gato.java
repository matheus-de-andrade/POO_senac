package aula3;

public class Gato {

    private String nome;
    private double peso;
    private int idade;

    public Gato(String nome, double peso, int idade){
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }
    public Gato(){
        
    }

    public void miar(int quantidade){
        for(int i = 0; i < quantidade; i++){
            System.out.print("Miauuuuuu\n");
        }
    }
    public void miar(){
        System.out.print("Miauuuuu");
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
