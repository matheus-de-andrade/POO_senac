package testes;

public abstract class ItemBiblioteca {

	protected String titulo;
	protected int anoPublicacao;
	
	public ItemBiblioteca(String titulo, int anoPublicacao) {
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
	}
	
	void exibirInformacoes() {
		System.out.print("Título: " + titulo + "\nAno de publicação: " + anoPublicacao);
	}
	 public int getAnoPublicacao() {
		return anoPublicacao;
	}
	 
	 public String getTitulo() {
		return titulo;
	}
	 
	 public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	 
	 public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
