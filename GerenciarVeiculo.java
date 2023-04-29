public class GerenciarVeiculo implements IGerenciar{
    
    private Veiculo veiculo;
    
    
    public GerenciarVeiculo(String placa, String modelo, String marca, int ano,int potencia,  int qtdeLugares, String categoria) {
        this.veiculo = new Veiculo(placa, modelo, marca, ano, potencia, qtdeLugares, categoria);
    }

    @Override
    public void adicionar() {
        Veiculo.listaVeiculo.adicionar(veiculo);

        
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
        Noh atual = Veiculo.listaVeiculo.getPrimeiro();  //Como foi modificado a classe, o getPrimeiro deve ser removido, está na classe Lista 
        while(atual != null){
            Veiculo v = (Veiculo) atual.getConteudo();
            System.out.println("Placa: " + v.getPlaca() + " - Modelo: " + v.getModelo() + " - Marca: " + v.getMarca() + "ano  " + v.getAno() + "potencia  " + v.getPotencia() + " qtd lugar  "+ v.getQtdeLugares() + "categoria   " + v.getCategoria());
            atual = atual.getProximo();
        }

    }
    
}

