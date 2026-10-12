package testes;

public class Main{

    public static void main(String[] args){
        Usuario ps1 = new Usuario("Matheus", 123456789);
        ItemBiblioteca livro1 = new Livro("A trança da mulher careca", 2023, "Natheus de Andrade");
        ItemBiblioteca revista1 = new Revista("Batman", 2024, 25);
        ItemBiblioteca livro2 = new Livro("Mar seco", 2021, "Matheus de Andrade");
        
        Emprestimo emprestimo1 = new Emprestimo(ps1, livro1);
        Emprestimo emprestimo2 = new Emprestimo(ps1, revista1);
        
        Biblioteca bb1 = new Biblioteca("Biblio do Matheus");
        bb1.adicionarItem(revista1);
        bb1.adicionarItem(livro1);
        bb1.adicionarItem(livro2);
        
        bb1.exibirBiblioteca();
    }
}