package aula6;

public class Main {

    public static void main(String[] args){
        //Endereco e = new Endereco("Rua 10", 1591, "Casa 10", 15561);

        Cliente c = new Cliente("Matheus", "Matheus.deandrade@gmail.com", 135336488, "12/04/2006", "rua 10", 1451, "casa 10", 534);

        System.out.print(c.getEndereco().getLogradouro());

        //Cliente v = new Cliente("Matheus", "matheusdeandrade13@gmail.com", 1111111111, "14/04/2006", "mh");

    }

}
