public class NohSimplesmente {
    private String conteudo;
    private NohSimplesmente proximo;    

    // Recebe um linha do arquivo
    public NohSimplesmente(String conteudo){
        this.conteudo = conteudo;
        proximo = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public NohSimplesmente getProximo() {
        return proximo;
    }
    
    public void setProximo(NohSimplesmente proximo) {
        this.proximo = proximo;
    }
}
