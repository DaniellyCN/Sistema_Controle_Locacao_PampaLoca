public class GerenciarCategoria implements IGerenciar{
    private Lista listaCategoria;

    public GerenciarCategoria(){
        listaCategoria = new Lista();
    }

    @Override
    public void adicionar(Object categoria) {
        if(categoria instanceof Categoria){
            listaCategoria.adicionar((Categoria)categoria);
        }else{
            // retornar erro
        }
    }

    @Override
    public void excluir(Object categoria) {
        if(categoria instanceof Categoria){
            listaCategoria.excluir((Categoria)categoria);
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
}
