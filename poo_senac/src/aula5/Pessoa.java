package aula5;

public abstract class Pessoa {

    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void getExibirDados(){
        System.out.print("Nome: " + nome + "\nIdade: " + idade );
    }


}
