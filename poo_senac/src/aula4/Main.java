package aula4;

import java.util.Scanner;
import aula3.Gato;

public class Main {

    public static void main (String[] args){
        Scanner tc = new Scanner(System.in);
        Gato gato1 = new Gato("Matheus", 20.1, 14);
        System.out.print(gato1.getNome());


    }
}
