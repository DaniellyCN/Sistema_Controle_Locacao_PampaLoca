public class GerenciarCliente implements IGerenciar{
    
    private Lista clientes;
    private int quantidade_clientes;

    public GerenciarCliente(){
       clientes = new Lista();
       quantidade_clientes = 0;
    }

    @Override
    public void adicionar(Object cliente) {
        if(cliente instanceof Cliente){
            clientes.adicionar((Cliente)cliente);
            quantidade_clientes++;
        }else{
            // retornar erro
        }    
    }

    @Override
    public void excluir(Object cliente) {
        if(cliente instanceof Cliente){
            clientes.excluir((Cliente)cliente);
            quantidade_clientes--;
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

    @Override
    public int tamanho() {
        return clientes.tamanho();
    }
}