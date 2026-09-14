package testes;

public class Aluno extends Pessoa{

    private int matricula;

    String getNome(){
        return nome;
    }

    double getmatricula(){
        return matricula;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setMatricula(int matricula){
        this.matricula = matricula;
    }

}