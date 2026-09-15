package Aula7;

public class ProcessadorPagamento {

	public void processarTransacao(Pagamento pagamento) {
		 System.out.println("Iniciando Transação: " + pagamento.getIdTransacao());
		 
		 if (!pagamento.validarDados()) {
		 System.err.println("Erro: Dados de pagamento inválidos para a transação " 
		 + pagamento.getIdTransacao());
		 return;
		 }
		 double valorFinal = pagamento.calcularTaxa();
		 System.out.printf("Sucesso! Valor original: R$%.2f | Total com taxas: R$%.2f%n", 
		 pagamento.getValorOriginal(), valorFinal);
		 System.out.println("----------------------------------------------------------------");
	}

}
