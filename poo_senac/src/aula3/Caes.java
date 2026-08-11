package aula3;

public class Caes {

    // Atributos
    String nome;
    String raca;
    double peso;

    //construtor
    public Caes(String nome, String raca, double peso){
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;

    }

    //Métodos
    public void exibirdados() {
    System.out.print("Nome do cão: " + nome + "\nRaça do cão: " + raca + "\nPeso do cão: " + peso + "Kg\n");

    }
    public void latir(){
        if(peso > 60){
            System.out.print("Woooof, Wooooof");
        }
        else if(peso >= 30){
            System.out.print("Ruffff, Rufffff");
        }
        else{
            System.out.print("Auu. Auuu, Auuu");
        }
    }

    public String getNome(){
        return nome;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setPeso(double peso){
        this.peso = peso;
    }

}
