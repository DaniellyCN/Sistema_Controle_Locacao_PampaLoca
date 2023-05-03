public class GerenciarReserva {
    private Lista reservas;

    public GerenciarReserva(){
        reservas = new Lista();
    }

    public GerenciarReserva(Lista reserva_lista){
        reservas = reserva_lista;
    }

    
    public void adicionar(Reserva reserva, Lista lista_locacao, String inicio, String devolucao) throws Exception {
        for(int i = 0; i < lista_locacao.tamanho(); i++){
            Object obj = lista_locacao.getElementoPeloIndice(i); 
            if (obj instanceof Locacao) {
                Locacao locacao = (Locacao) obj;
                if(locacao.getPlacaVeiculo().equals(reserva.getPlacaCarro()) && locacao.getRetirada().equals(inicio) && locacao.getDevolucao().equals(devolucao)){
                    throw new Exception("Veículo já esta reservado para esta data.");
                }
            }
        }
        reservas.adicionar(reserva);
        
    }

    public void excluir(Object reserva){
        if(reserva instanceof Reserva){
            reservas.excluir(reserva);
        }else{
            // retornar erro
        }   
    }


    public void editar(String atual, String atributo, String novo) {
        // TODO Auto-generated method stub
        
    }

    
    public String listar() {
        // TODO Auto-generated method stub
        return null;
    }

    
    public int tamanho() {
        // TODO Auto-generated method stub
        return 0;
    }

    
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
