public class Cliente{
    private String nome;
    private int CNH;
    private String telefone;
    private int CPF;
    
    public Cliente(String nome, int CNH, String telefone, int CPF){
        this.nome = nome;
        this.CNH = CNH;
        this.telefone = telefone;
        this.CPF = CPF;
     }

    public Cliente(){}
    public int getCNH() { return CNH;}

    public int getCPF() { return CPF;}

    public String getNome() { return nome;}

    public String getTelefone() { return telefone;}

    public void setCNH(int cNH) { CNH = cNH;}

    public void setCPF(int cPF) { CPF = cPF;}

    public void setNome(String nome) { this.nome = nome;}

    public void setTelefone(String telefone) { this.telefone = telefone;}

    public String toString(){
        return "Nome: "+this.getNome()+" CNH: "+this.getCNH()+" CPF: "+this.getCPF()+" Telefone: "+this.getTelefone()+" \n";
    }
     
}