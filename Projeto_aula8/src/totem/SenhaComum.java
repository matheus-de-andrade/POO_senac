package totem;

import java.time.LocalDateTime;

public class SenhaComum extends Senha {

    public SenhaComum(int numero, LocalDateTime dataHora) {
        super(numero, dataHora);
    }

    @Override
    public String formatarSenha() {
        return String.format("C-%03d", getNumero());
    }
}