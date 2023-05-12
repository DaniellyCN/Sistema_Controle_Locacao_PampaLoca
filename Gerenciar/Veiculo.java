package Gerenciar;
//mudei categoria
public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private int potencia;
    private int qtdeLugares;
    private String categoria;
    private Categoria categoriA;
    private boolean disponivel;

    public Veiculo(String placa, String modelo, String marca, int ano, int potencia, int qtdeLugares,String categoria){
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.potencia = potencia;
        this.qtdeLugares = qtdeLugares;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    public Veiculo(){}
    
    public int getAno() {
        return ano;
    }

   
    public String getCategoria() {
        return categoria;
    }

    public Categoria getCategoriA() {
        return categoriA;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getQtdeLugares() {
        return qtdeLugares;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    //
    public void setCategoriA(Categoria categoriA) {
        this.categoriA = categoriA;
    }

    
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setQtdeLugares(int qtdeLugares) {
        this.qtdeLugares = qtdeLugares;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public String toString(){
        return "Placa: "+getPlaca()+ " Modelo: "+getModelo()+ " Marca: "+getMarca()+ " Ano: "+getAno()+ 
            " Potência: "+getPotencia()+ " Lugares: "+getQtdeLugares()+ " Categoria: "+getCategoria()+"\n";
    }


}
