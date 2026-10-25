package totem;

import java.time.LocalDateTime;

public abstract class Senha {

    private int numero;
    private LocalDateTime dataHora;

    public Senha(int numero, LocalDateTime dataHora) {
        this.numero = numero;
        this.dataHora = dataHora;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public abstract String formatarSenha();

    public void exibirDados() {
        System.out.println(
            formatarSenha() +
            " - Emitida em: " +
            dataHora
        );
    }
}