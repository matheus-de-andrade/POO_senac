package testes;

public class Revista extends ItemBiblioteca{
	
	private int edicao;

	public Revista(String titulo, int anoPublicacao, int edicao) {
		super(titulo, anoPublicacao);
		this.edicao = edicao;
	}
	
	@Override
	public void exibirInformacoes(){
		System.out.print("Título: " + titulo + "\nAno de publicação: " + anoPublicacao + "\nEdição: " + edicao);
	}

}
