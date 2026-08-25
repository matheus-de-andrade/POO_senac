package aula5;

public class heranca {

    public static void main(String[] args){
        Cliente cliente = new Cliente("Matheus", 20, 20000.25);
        cliente.getExibirDados();
        System.out.println();
        cliente.getExibirLimiteCred();
        Funcionario funcionario = new Funcionario("João", 20);
        System.out.println();
        funcionario.getExibirDados();

    }
}
