package Gerenciar;

public class Reserva {
    private double taxa;
    private String placaCarro;

    public Reserva(double taxa, String placaCarro) {
        this.taxa = taxa;
        this.placaCarro = placaCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public String toString(){
        return "Taxa: "+this.getTaxa()+" Placa do carro: "+this.getPlacaCarro()+"\n";
    }


}
