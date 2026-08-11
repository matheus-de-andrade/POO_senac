package aula3;

public class Main {

    public static void main (String[] args){
        Caes cao1 = new Caes("Rodolfo", "Pastor Alemão", 10.5);

        cao1.exibirdados();
        cao1.setNome("Rovani");
        System.out.print(cao1.getNome());

        System.out.println();
        cao1.latir();
        cao1.setPeso(60.0);
        cao1.latir();


    }

}
