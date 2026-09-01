package aula6;

public class Veiculo {

    protected String placa;
    protected long renavam;
    protected String chassi;

    public Veiculo(String placa, long renavam, String chassi){
        this.placa = placa;
        this.renavam = renavam;
        this.chassi = chassi; 
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public long getRenavam() {
        return renavam;
    }
    public void setRenavam(long renavam) {
        this.renavam = renavam;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    

}
