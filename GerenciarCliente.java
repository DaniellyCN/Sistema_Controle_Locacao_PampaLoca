public class GerenciarCliente implements IGerenciar{
    
    private Cliente cliente;

    public GerenciarCliente( String nome, int CNH, int telefone, int CPF){
        
        this.cliente = new Cliente(nome, CNH, telefone, CPF);
    }

    @Override
    public void adicionar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionar'");
    }

    @Override
    public void excluir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
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

    
}