package Aula7;

public class Pagamentocartao extends Pagamento {

	private String numCartao;
	private String cvv;
	private int parcelas;
	
	public Pagamentocartao(String idTransacao, double valorOriginal, String numCartao, String cvv, int parcelas) {
		super(idTransacao, valorOriginal);
		this.numCartao = numCartao;
		this.cvv = cvv;
		this.parcelas = parcelas;
	}

	@Override
	public boolean validarDados(){
		return numCartao != null && numCartao.length() ==16
				&& cvv != null && cvv.length() ==3;
	}
	
	@Override
	public double calcularTaxa(){
		double taxaFixa = 4.50;
		double jurosTransacao = (parcelas > 1) ? (valorOriginal * 0.01 * parcelas) : 0;
		return valorOriginal + taxaFixa + jurosTransacao;
	}
	
	
}
