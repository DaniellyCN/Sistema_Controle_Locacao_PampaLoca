public class GerenciarVeiculo implements IGerenciar{
    private Lista listaVeiculo;
    
    public GerenciarVeiculo(){
        listaVeiculo = new Lista();
    }
    @Override
    public void adicionar(Object veiculo) {
        if(veiculo instanceof Veiculo){
            listaVeiculo.adicionar((Veiculo)veiculo);
        }else{
            // retornar erro
        }
    }

    @Override
    public void excluir(Object veiculo) {
        if(veiculo instanceof Veiculo){
            listaVeiculo.excluir((Categoria)veiculo);
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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
