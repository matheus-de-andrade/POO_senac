package aula3;

public class Caes {

    // Atributos
    String nome;
    String raca;
    double peso;
    int pes01;

    //construtor
    public Caes(String nome, String raca, double peso){
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;

    }
    public Caes(String nome, String raca, int pes01){
        this.nome = nome;
        this.raca = raca;
        this.pes01 = pes01;

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

    //getname
    public String getNome(){
        return nome;
    }

    //setname
    void setNome(String nome){
        this.nome = nome;
    }

    void setPeso(double peso){
        this.peso = peso;
    }

    //polimorfismo
    public void morder(){
        System.out.print("O cão vai te morder!!");
    }

    public void morder(int quantidade){
        System.out.print("O cão vai te morder " + quantidade + " vezes!");
    }

}
