package poo_senac;

public class Disciplina{
		
    String diciplina;
    int quantAlunos;
    
    public Disciplina(String diciplina, int quantAlunos) {
        this.diciplina = diciplina;
        this.quantAlunos = quantAlunos;
    }
    
    void mostrardados() {
        System.out.print("-- Informações(Diciplina) --\n\nDiciplina: " + diciplina + "\nQuantidade de alunos: " + quantAlunos);
    }
}