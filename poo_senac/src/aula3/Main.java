package aula3;

public class Main {

    public static void main (String[] args){
        Caes cao1 = new Caes("Rodolfo", "Pastor Alemão", 10);

        cao1.exibirdados();
        cao1.setNome("Rovani");
        System.out.print(cao1.getNome());

        System.out.println();
        cao1.latir();
        cao1.setPeso(60.0);
        cao1.latir();
        cao1.morder();
        cao1.morder(4);

        System.out.print("\n\n\n\n\n\n\n\n\n\n\n");

        Gato gato1 = new Gato("Matheus", 5.6,7);
        System.out.print("Nome do gato: " + gato1.getNome());
        gato1.setNome("Andrade");
        System.out.print("\nNome do gato: " + gato1.getNome());


        Gato gato2 = new Gato();




    }

}
