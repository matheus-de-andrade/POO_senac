package Aula7;

public class PagamentoPix extends Pagamento {

	private String chavePix;
	
	public PagamentoPix(String idTransacao, double valorOriginal, String chavePix) {
		super(idTransacao, valorOriginal);
		this.chavePix = chavePix;
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}
	
	@Override
	public boolean validarDados() {
		return chavePix != null && chavePix.isEmpty();
	}
	
	@Override
	 public double calcularTaxa() {
	 double taxaPix = valorOriginal * 0.0099;
	 return valorOriginal + taxaPix;
	 }

}
