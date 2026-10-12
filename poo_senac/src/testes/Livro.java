package testes;

public class Livro extends ItemBiblioteca{
	
	private String autor;

	public Livro(String titulo, int anoPublicacao, String autor) {
		super(titulo, anoPublicacao);
		this.autor = autor;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public void exibirInformacoes(){
		System.out.print("Título: " + titulo + "\nAno de publicação: " + anoPublicacao + "\nAutor: " + autor);
	}

}
