package testes;

import java.util.ArrayList;

public class Biblioteca {
	
	private String nome;
	private ArrayList<ItemBiblioteca> itens = new ArrayList<>();
	
	public void adicionarItem(ItemBiblioteca item) {
		itens.add(item);
	}
	
	public void exibirBiblioteca() {
		System.out.print("--Informações da Biblioteca--\n\nNome: " + nome + "\nItens disponiveis:\n\n");
		for(int i = 0; i < itens.size(); i++) {
			itens.get(i).exibirInformacoes();
			System.out.print("\n\n________________________________________________________________________\n\n");
		}
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Biblioteca(String nome) {
		this.nome = nome;
	}

}
