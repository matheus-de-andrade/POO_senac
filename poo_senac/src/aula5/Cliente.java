package aula5;

public class Cliente extends Pessoa {

    private double limiteCred;

    public Cliente(String nome, int idade, double limiteCred) {
        super(nome, idade);// O Super passa o parametro para o construtor da classe pai
        this.limiteCred = limiteCred;
        
    }

    public void getExibirLimiteCred(){
        System.out.print("Olá, " + nome + " !! Seu imite é de R$" + limiteCred);
    }



}
