package testes;

public class ContaBancaria{

    private String titular;
    private double saldo;

    String getTitular(){
        return titular;
    }

    private double getSaldo(){
        return saldo;
    }

    void setTitular(String titular){
        this.titular = titular;
    }

    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    void depositar(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }

    void sacar(double valor){
        if(this.getSaldo() <= valor){
            this.setSaldo(this.getSaldo() - valor);
        }
        else{
            System.out.print("operação inválida - Saldo insuficiente");
        }
    }

    double mostrarSaldo(){
        return this.getSaldo();
    }
}