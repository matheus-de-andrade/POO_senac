package testes;

public class Retangulo{

    private double largura;
    private double altura;

    double getLargura(){
        return largura;
    }

    double getAltura(){
        return altura;
    }

    void setLargura(double largura){
        this.largura = largura;
    }

    void setAltura(double altura){
        this.altura = altura;
    }

    double calcularArea(double largura, double altura){
        double area = largura * altura;
        return area;
    }

    double calcularPerimetro(double largura, double altura){
        double perimetro = (largura + altura) *2;
        return perimetro;
}

}