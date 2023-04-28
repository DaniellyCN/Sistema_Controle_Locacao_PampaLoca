public interface ILista {
    public void adicionar(Object objeto);
    public boolean excluir(Object objeto);
    public void listar();
    public Object getElementoPorIndice(int indice) throws Exception;
    public int tamanho();
    public boolean vazia();
}
