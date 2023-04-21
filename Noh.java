public class Noh {
    private Noh anterior;
    private Noh proximo;
    private Object conteudo;

    public Noh(Object conteudo){
        this.conteudo = conteudo;
        proximo = null;
        anterior = null;
    }

    public Noh getAnterior() { return anterior;}
    public Object getConteudo() { return conteudo;}
    public Noh getProximo() { return proximo;}
    public void setAnterior(Noh anterior) { this.anterior = anterior;}
    public void setConteudo(Object conteudo) { this.conteudo = conteudo;}
    public void setProximo(Noh proximo) { this.proximo = proximo;}

}
