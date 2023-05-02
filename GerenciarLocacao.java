public class GerenciarLocacao implements IGerenciar {
    private Lista locacoes;

    public GerenciarLocacao(){
        locacoes = new Lista();
    }


    @Override
    // Incluir locação
    public void adicionar(Object locacao) {
        if(locacao instanceof Locacao){
            locacoes.adicionar((Locacao)locacao);
        }else{
            // retornar erro
        }    
    }

    // Devolver veículo
    public void excluir(String placa) throws Exception{
        for(int i = 0; i < locacoes.tamanho(); i++){
            Object obj = locacoes.getElementoPeloIndice(i); 
            if (obj instanceof Locacao) {
                Locacao locacao = (Locacao) obj;
                if(locacao.getPlacaVeiculo().equals(placa)){
                    locacoes.excluir((Locacao)locacao);
                }
            }
        }
        throw new Exception("Nenhum veículo encontrado, portanto, a locação não pode ser excluída.");
    }

    // IMPLEMENTAR THOWRS EXCEPTIONS
    // RECEBE TRÊS PARAMETROS: o PRIMEIRO É O ATUAL, O SEGUNDO É QUAL ATRIBUTO SERÁ EDITADO E O TERCEIRO É QUAL SERÁ O NOVO
    //Esse método foi pensado para editar qualquer um dos atributos da classe, por isso o usuário deve dizer qual deles será editado.
    @Override
    public void editar(String atual, String atributo, String novo) {
        for (int i = 0; i < locacoes.tamanho(); i++) {
            Object obj = locacoes.getElementoPeloIndice(i); // retorna um objeto
            if (obj instanceof Locacao) { // verifica se o objeto é uma instância de Cliente
                Locacao locacao = (Locacao) obj; // faz o cast do objeto para Cliente
                
                switch(atributo){
                    case "Data Retirada":
                        if(locacao.getRetirada().equals(atual))
                            locacao.setRetirada(novo);
                        break;
                    case "Data Devolucao":
                        if(locacao.getDevolucao().equals(atual))
                            locacao.setDevolucao(novo);
                        break;
                    case "Valor":
                        if(locacao.getValor() == Double.parseDouble(atual))
                            locacao.setValor(Double.parseDouble(novo));
                        break;
                    default:
                        break;
                }
                
            }
        }      
    }

    @Override
    public String listar() {
        String lista = "";
        for(int i = 0; i < locacoes.tamanho(); i++){
            Object obj  = locacoes.getElementoPeloIndice(i);
            if(obj instanceof Locacao){
                Locacao locacao = (Locacao) obj;
                lista+= "Data da retirada: "+locacao.getRetirada()+" Data de devolução: "+locacao.getDevolucao()+" Valor cobrado: "+locacao.getValor()+"\n";
            }
        }
        return lista;
    }
    
    @Override
    public int tamanho() {
        return locacoes.tamanho();
    }
}
