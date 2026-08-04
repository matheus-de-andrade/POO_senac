package poo_senac;

public class Primeiro_teste {

	public static void main(String[] args) {
		Professor professor1 = new Professor("Matheus","Artes", 27);
		Aluno aluno1 = new Aluno("matheus", 20, 2006);
		Disciplina diciplina1 = new Disciplina("Artes", 30);
		
		professor1.mostrardados();
		aluno1.mostrardados();
		diciplina1.mostrardados();

	}

}