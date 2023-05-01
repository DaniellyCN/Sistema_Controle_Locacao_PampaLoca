public class GerenciarVeiculo implements IGerenciar{
    
    private Lista veiculos;
    private int quantidade_veiculo;

    public GerenciarVeiculo(){
        veiculos = new Lista();
        quantidade_veiculo = 0;
    }


    @Override
    public void adicionar(Object veiculo) {
        if(veiculo instanceof Veiculo){
            veiculos.adicionar((Veiculo)veiculo);
            quantidade_veiculo++;
        }else{
            // retornar erro
        }
    
    }
    
    @Override
    public void excluir(Object veiculo) {
        if(veiculo instanceof Veiculo){
            veiculos.excluir((Categoria)veiculo);
            quantidade_veiculo--;
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
    
    public int tamanho(){
        return veiculos.tamanho();
    }

}

