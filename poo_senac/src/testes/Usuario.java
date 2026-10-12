package testes;

public class Usuario {
	
	private String nome;
	private int cpf;

	public Usuario(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
