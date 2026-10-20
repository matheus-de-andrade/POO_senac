package totem;

public class SenhaPreferencial extends Senha{
	
	private String motivo;

	public SenhaPreferencial(int numero, String dataHora, String motivo) {
		super(numero,dataHora);
		this.motivo = motivo;
	}
	
	@Override
	public String formatarSenha() {
		return "P - ";
	}


}
