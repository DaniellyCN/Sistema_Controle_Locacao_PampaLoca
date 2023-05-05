package Gerenciar;

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
                    throw new Exception("Veículo já está reservado para esta mesma data.");
                }
            }
        }
        reservas.adicionar(reserva);
        
    }

    public void excluir(Object reserva) throws Exception{
        if(!(reserva instanceof Reserva)){
         throw new Exception("O parametro dado não é uma reserva.");
        }
        reservas.excluir(reserva);
    }


    public void editar(String atual, String atributo, String novo) {
        // TODO Auto-generated method stub
        
    }

    
    public String listar() {
        String lista = "";
        for(int i = 0; i < reservas.tamanho(); i++){
            Object obj  = reservas.getElementoPeloIndice(i);
            if(obj instanceof Reserva){
                Reserva reserva = (Reserva) obj;
                lista+= reserva.toString();
            }
        }
        return lista;
    }

    
    public int tamanho() {
        reservas.tamanho();
        return 0;
    }

}
