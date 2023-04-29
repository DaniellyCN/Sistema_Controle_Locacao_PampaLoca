public class GerenciarVeiculo implements IGerenciar{
    private Lista listaVeiculo;
    private Veiculo veiculo;


    public GerenciarVeiculo(){
        listaVeiculo = new Lista();
    }

    public GerenciarVeiculo(String placa, String modelo, String marca, int ano,int potencia,  int qtdeLugares, String categoria) {
        this.veiculo = new Veiculo(placa, modelo, marca, ano, potencia, qtdeLugares, categoria);
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
        //Noh atual = Veiculo.listaVeiculo.getPrimeiro();  //Como foi modificado a classe, o getPrimeiro deve ser removido, está na classe Lista 
        //while(atual != null){
          //  Veiculo v = (Veiculo) atual.getConteudo();
            //System.out.println("Placa: " + v.getPlaca() + " - Modelo: " + v.getModelo() + " - Marca: " + v.getMarca() + "ano  " + v.getAno() + "potencia  " + v.getPotencia() + " qtd lugar  "+ v.getQtdeLugares() + "categoria   " + v.getCategoria());
            //atual = atual.getProximo();
     //   }

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}

