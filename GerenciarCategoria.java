public class GerenciarCategoria implements IGerenciar{

    private Lista categorias;

    public GerenciarCategoria(){
        categorias = new Lista();
    }

    @Override
    public void adicionar(Object categoria) {
        if(categoria instanceof Categoria){
            categorias.adicionar((Categoria)categoria);
        }else{
            // retornar erro
        }
    }

    @Override
    public void excluir(Object categoria) {
        if(categoria instanceof Categoria){
            categorias.excluir((Categoria)categoria);
        }else{
            // retornar erro
        }    
    }

    @Override
    public void editarDados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editarDados'");
    }

    @Override
    public void listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }
    
    public String toString() {
        return "";
    }

    public int tamanho(){
        return categorias.tamanho();
    }

}
