package aula6;

public class Endereco {

        private String logradouro;
        private int numero;
        private String complemento;
        private int cep;

    public Endereco(){
        
    }
    public String getLogradouro(){
        return logradouro;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getComplemento(){
        return logradouro;
    }

    public void setComplemento(String logradouro){
        this.logradouro = logradouro;
    }

    public void setCep(int cep){
        this.cep = cep;
    }

}
