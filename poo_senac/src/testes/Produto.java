package testes;

public class Produto{

    private String nome;
    private double preco;

    void mostrarProduto(){
        System.out.print(this.getNome() + " - " + this.getPreco());
    }

    String getNome(){
        return nome
    }

    void setNome(String nome){
        this.nome = nome
    }

    double getPreco(){
        return preco
    }

    void setpreco(double preco){
        this.preco = preco
    }
}