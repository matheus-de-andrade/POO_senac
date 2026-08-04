package poo_senac;

public class Professor{
		
    String nome;
    String materia;
    int idade;
    
    public Professor(String nome, String materia, int idade) {
        this.nome = nome;
        this.materia = materia;
        this.idade = idade;
    }
    
    void mostrardados() {
        System.out.print("-- Informações(professor) --\n\nNome: " + nome + "\nidade: " + idade + "\nMatéria: " + materia);
    }
}
