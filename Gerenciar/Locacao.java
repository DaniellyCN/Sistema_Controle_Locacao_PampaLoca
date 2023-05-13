package Gerenciar;

public class Locacao {
    private String retirada;
    private String devolucao;
    private double valor;
    private Veiculo placaVeiculo;
    private String cnhCliente;
    private Cliente CNHCliente;

    public Locacao(String retirada, String devolucao, double valor, Veiculo placa, String cNH, Cliente CNHCliente) {
        this.retirada = retirada;
        this.devolucao = devolucao;
        this.valor = valor;
        this.placaVeiculo = placa;
        this.cnhCliente = cNH;
        this.CNHCliente = CNHCliente;
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

    public String getCnhCliente() {
        return cnhCliente;
    }
    
     public Cliente getCNHCliente() {
        return CNHCliente;
    }

     public void setCnhCliente(String cnhCliente) {
        this.cnhCliente = cnhCliente;
    }
    public void setCnhCliente(Cliente CNHCliente) {
        this.CNHCliente = CNHCliente;
    }

    public Veiculo getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(Veiculo placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String toString(){
        return "Data da retirada: "+this.getRetirada()+" Data de devolução: "+this.getDevolucao()+" Valor cobrado: "+this.getValor()+ " Placa do veículo: "+ this.getPlacaVeiculo()+ " CNH do cliente: "+this.getCnhCliente()+"\n";
    }
}
