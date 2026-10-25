package totem;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TotemAtendimento {

    private ArrayList<Senha> listaSenhas;
    private int contador;

    public TotemAtendimento() {

        listaSenhas = new ArrayList<>();
        contador = 1;
    }

    public Senha emitirSenhaComum() {

        Senha senha = new SenhaComum(
                contador++,
                LocalDateTime.now());

        listaSenhas.add(senha);

        return senha;
    }

    public Senha emitirSenhaPreferencial(
            String motivo) {

        Senha senha = new SenhaPreferencial(
                contador++,
                LocalDateTime.now(),
                motivo);

        listaSenhas.add(senha);

        return senha;
    }

    public void listarTodasSenhas() {

        if (listaSenhas.isEmpty()) {
            System.out.println(
                    "\nNenhuma senha pendente.");
            return;
        }

        System.out.println(
                "\n===== SENHAS PENDENTES =====");

        for (Senha senha : listaSenhas) {
            senha.exibirDados();
        }

        System.out.println(
                "\nTotal: "
                        + listaSenhas.size());
    }

    public void chamarProximaSenha() {

        if (listaSenhas.isEmpty()) {

            System.out.println(
                    "\nNão há senhas para atendimento.");

            return;
        }

        for (int i = 0; i < listaSenhas.size(); i++) {

            if (listaSenhas.get(i)
                    instanceof SenhaPreferencial) {

                Senha senha =
                        listaSenhas.remove(i);

                System.out.println(
                        "\n>>> CHAMANDO: "
                                + senha.formatarSenha());

                return;
            }
        }

        Senha senha = listaSenhas.remove(0);

        System.out.println(
                "\n>>> CHAMANDO: "
                        + senha.formatarSenha());
    }
}
