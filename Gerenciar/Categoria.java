package Gerenciar;

public class Categoria {
    private String nome;
    private int identificador;

    Categoria(int identificador, String nome){
        this.setNome(nome);
        this.setIdentificador(identificador);
    }

    Categoria(){
        
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setIdentificador(int identificador){
        this.identificador=identificador;
    }

    public String toString(){
        return "Nome: "+getNome()+ " Identificador: "+getIdentificador()+"\n";
    }

}
