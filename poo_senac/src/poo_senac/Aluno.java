package poo_senac;

public class Aluno{
		
    String nome;
    int idade;
    int anoNascimento;
    
    public Aluno(String nome, int idade, int anoNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.anoNascimento = anoNascimento;
    }
    
    void mostrardados(){
        System.out.print("-- Informações(aluno) --\n\nNome: " + nome + "\nidade: " + idade + "\nAno de nascimento: " + anoNascimento);
    }
}
