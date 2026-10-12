package testes;

public class Emprestimo {
	
	private Usuario usuario;
	private ItemBiblioteca item;

	public Emprestimo(Usuario usuario, ItemBiblioteca item) {
		this.usuario = usuario;
		this.item = item;
	}
	
	void exibirEmprestimo() {
		System.out.println("Usuário: " + usuario.getNome());
		item.exibirInformacoes();
	}

}
