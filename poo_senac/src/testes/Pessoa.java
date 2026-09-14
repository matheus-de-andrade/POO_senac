package testes;

public class Pessoa {

    protected String nome;
    protected int idade;

    void apresentar(){
        System.out.print("Olá, meu nome é " + this.getNome() + " e tenho " + this.getIdade() + " anos.");
    }

    String getNome(){
        return nome;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    int getIdade(){
        return idade;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

}