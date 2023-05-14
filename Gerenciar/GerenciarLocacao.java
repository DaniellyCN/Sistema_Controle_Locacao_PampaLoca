package Gerenciar;
import Gerenciar.Lista;
public class GerenciarLocacao implements IGerenciar {
    private Lista locacoes;
    private Lista cagotegorias;
    private Lista veiculos;
    private Lista clientes;
    

    public GerenciarLocacao(){
        locacoes = new Lista();
    }
    
    public GerenciarLocacao(Lista locacoes,Lista categorias,Lista clientes,Lista veiculos){
        this.clientes = clientes;
        this.cagotegorias = categorias;
        this.veiculos = veiculos;
        this.locacoes = locacoes;
    }
    
    
     public int getQuantElementos() { 
        int quant = 0;
       for(int i=0;i<locacoes.tamanho();i++){
            quant++;
        }
        return quant;
    }
     
     public String listar() {
        String lista = "";
        for(int i = 0; i < locacoes.tamanho(); i++){
            Object obj  = locacoes.getElementoPeloIndice(i);
            if(obj instanceof Locacao){
                Locacao locacao = (Locacao) obj;
                lista+= locacao.toString();
            }
        }
        return lista;
    }

      public Lista getLista(){
        return locacoes;
    }
     
    @Override
    // Incluir locação
    public void adicionar(Object locacao) throws IllegalArgumentException{
        if(!(locacao instanceof Locacao)){
            throw new IllegalArgumentException("Uma locação deve ser informada como argumento.");
        }
        locacoes.adicionar((Locacao)locacao); 
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


    public String listar(Lista lista_reservas) {
        String lista = "";
        for(int j = 0; j < lista_reservas.tamanho(); j++){
            Object obj  = lista_reservas.getElementoPeloIndice(j);
            if(obj instanceof Reserva){
                Reserva reserva = (Reserva) obj;

                for(int i = 0; i < locacoes.tamanho(); i++){
                    Object objeto  = locacoes.getElementoPeloIndice(i);
                    if(objeto instanceof Locacao){
                        Locacao locacao = (Locacao) objeto;

                        if(!(reserva.getPlacaCarro().equals(locacao.getPlacaVeiculo()))){
                            lista+= "Data da retirada: "+locacao.getRetirada()+" Data de devolução: "+locacao.getDevolucao()+" Valor cobrado: "+locacao.getValor()+"\n";
                        }
                    }
                }
            }
        }
        
        return lista;
    }

    public String listarUltimo(){
        String lista = "";
        for(int i = locacoes.tamanho(); i >= 0; i--){
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
