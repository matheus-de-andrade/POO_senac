package totem;

import java.time.LocalDateTime;

public class SenhaPreferencial extends Senha {

    private String motivo;

    public SenhaPreferencial(
            int numero,
            LocalDateTime dataHora,
            String motivo) {

        super(numero, dataHora);
        this.motivo = motivo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String formatarSenha() {

        return String.format(
                "P-%03d (%s)",
                getNumero(),
                motivo);
    }
}