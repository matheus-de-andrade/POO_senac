package Aula7;

import java.util.ArrayList;
import java.util.List;


public class EcommerceApp {

	public static void main(String[] args) {
		 ProcessadorPagamento processador = new ProcessadorPagamento();
		 List<Pagamento> transacoesDoDia = new ArrayList<>();
		 
		 transacoesDoDia.add(new Pagamentocartao("TX-9981", 100.00, "1234567812345678", "123", 3));
		 transacoesDoDia.add(new PagamentoPix("TX-9982", 50.00, "financeiro@loja.com"));
		 transacoesDoDia.add(new Pagamentocartao("TX-9983", 250.00, "1111", "99", 1)); // Inválido
		 
		 for (Pagamento pg : transacoesDoDia) {
		 processador.processarTransacao(pg);
		 }
	}

}
