package totem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TotemAtendimento totem =
                new TotemAtendimento();

        int opcao;

        do {

            System.out.println("\n====================");
            System.out.println("  TOTEM CLÍNICO");
            System.out.println("====================");
            System.out.println("1 - Emitir Senha Comum");
            System.out.println("2 - Emitir Senha Preferencial");
            System.out.println("3 - Chamar Próxima Senha");
            System.out.println("4 - Listar Senhas Pendentes");
            System.out.println("0 - Sair");

            System.out.print("\nEscolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

            case 1:

                Senha comum =
                        totem.emitirSenhaComum();

                System.out.println(
                        "\nSenha emitida: "
                                + comum.formatarSenha());

                break;

            case 2:

                System.out.print(
                        "Motivo da preferência: ");

                String motivo =
                        sc.nextLine();

                Senha pref =
                        totem.emitirSenhaPreferencial(
                                motivo);

                System.out.println(
                        "\nSenha emitida: "
                                + pref.formatarSenha());

                break;

            case 3:

                totem.chamarProximaSenha();

                break;

            case 4:

                totem.listarTodasSenhas();

                break;

            case 0:

                System.out.println(
                        "\nSistema encerrado.");

                break;

            default:

                System.out.println(
                        "\nOpção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}