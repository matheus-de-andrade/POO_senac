package Aula7;

public abstract class Pagamento {

	private String idTransacao;
	protected double valorOriginal;
	
	public Pagamento(String idTransacao, double valorOriginal) {
		this.idTransacao = idTransacao;
		this.valorOriginal = valorOriginal;
	};
	
	
	public String getIdTransacao() {
		return idTransacao;
	}
	
	public double getValorOriginal() {
		return valorOriginal;
	}
	
	public abstract double calcularTaxa();
	
	public abstract boolean validarDados();
}
