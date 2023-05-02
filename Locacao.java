
public class Locacao {
    private String retirada;
    private String devolucao;
    private double valor;
    private String placaVeiculo;
    private int cnhCliente;

    public Locacao(String retirada, String devolucao, double valor, String placa, int cNH) {
        this.retirada = retirada;
        this.devolucao = devolucao;
        this.valor = valor;
        placaVeiculo = placa;
        cnhCliente = cNH;
    }

    public String getDevolucao() {
        return devolucao;
    }

    public String getRetirada() {
        return retirada;
    }

    public double getValor() {
        return valor;
    }

    public void setDevolucao(String devolucao) {
        this.devolucao = devolucao;
    }

    public void setRetirada(String retirada) {
        this.retirada = retirada;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCnhCliente() {
        return cnhCliente;
    }

    public void setCnhCliente(int cnhCliente) {
        this.cnhCliente = cnhCliente;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String toString(){
        return "Data da retirada: "+this.getRetirada()+" Data de devolução: "+this.getDevolucao()+" Valor cobrado: "+this.getValor()+ " Placa do veículo: "+ this.getPlacaVeiculo()+ " CNH do cliente: "+this.getCnhCliente()+"\n";
    }
}
