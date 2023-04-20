public class Cliente{
    private String nome;
    private String CNH;
    private int telefone;
    private int CPF;
    
    public Cliente(String nome, String CNH, int telefone, int CPF){
        this.nome = nome;
        this.CNH = CNH;
        this.telefone = telefone;
        this.CPF = CPF;
     }
    public String getCNH() { return CNH;}

    public int getCPF() { return CPF;}

    public String getNome() { return nome;}

    public int getTelefone() { return telefone;}

    public void setCNH(String cNH) { CNH = cNH;}

    public void setCPF(int cPF) { CPF = cPF;}

    public void setNome(String nome) { this.nome = nome;}

    public void setTelefone(int telefone) { this.telefone = telefone;}
     
}