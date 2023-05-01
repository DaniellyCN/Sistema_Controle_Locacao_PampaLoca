public class Cliente{
    private String nome;
    private int CNH;
    private int telefone;
    private int CPF;
    
    public Cliente(String nome, int CNH, int telefone, int CPF){
        this.nome = nome;
        this.CNH = CNH;
        this.telefone = telefone;
        this.CPF = CPF;
     }
     
    public int getCNH() { return CNH;}

    public int getCPF() { return CPF;}

    public String getNome() { return nome;}

    public int getTelefone() { return telefone;}

    public void setCNH(int cNH) { CNH = cNH;}

    public void setCPF(int cPF) { CPF = cPF;}

    public void setNome(String nome) { this.nome = nome;}

    public void setTelefone(int telefone) { this.telefone = telefone;}
     
}