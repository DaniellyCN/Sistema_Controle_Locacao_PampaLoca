public interface IGerenciar {

    public void adicionar(Object object);
    //public void excluir(Object object);
    public void editar(String atual, String atributo, String novo);
    public String listar();
    public int tamanho();
}
