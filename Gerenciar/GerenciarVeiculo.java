package Gerenciar;

import java.util.NoSuchElementException;

public class GerenciarVeiculo implements IGerenciar{
    
    private Lista veiculos;
    
    public GerenciarVeiculo(Lista veiculos) {
        this.veiculos = veiculos;
    }
    public GerenciarVeiculo(){
        veiculos = new Lista();
    }

    public int getQuantElementos() { 
       int quant = 0;
       for(int i=0;i<veiculos.tamanho();i++){
            quant++;
        }
        return quant;
    }
    
   

    @Override
    public void adicionar(Object veiculo) {
        if(veiculo instanceof Veiculo){
            veiculos.adicionar((Veiculo)veiculo);
        }else{
            // retornar erro
        }
    
    }
 
    public void excluir(String placa, Lista locacoesLista) throws Exception {
        Veiculo veiculoAuxiliar = this.getVeiculo(placa);
        for(int j = 0; j < locacoesLista.tamanho(); j++){
            Object objeto = locacoesLista.getElementoPeloIndice(j);
            if (objeto instanceof Locacao) {
                Locacao locacao = (Locacao) objeto;
                if(locacao.getPlacaVeiculo().equals(veiculoAuxiliar.getPlaca())){
                    throw new Exception("Existe veículo associado em alguma locação por isso não pode ser excluído.");
                }
            }
        }
        veiculos.excluir(veiculoAuxiliar);
    }

    @Override
    // IMPLEMENTAR THOWRS EXCEPTIONS
    // RECEBE TRÊS PARAMETROS: o PRIMEIRO É O ATUAL, O SEGUNDO É QUAL ATRIBUTO SERÁ EDITADO E O TERCEIRO É QUAL SERÁ O NOVO
    //Esse método foi pensado para editar qualquer um dos atributos da classe, por isso o usuário deve dizer qual deles será editado.
    public void editar(String atual, String atributo, String novo) {
        for (int i = 0; i < veiculos.tamanho(); i++) {
            Object obj = veiculos.getElementoPeloIndice(i); // retorna um objeto
            if (obj instanceof Veiculo) { // verifica se o objeto é uma instância de Cliente
                Veiculo veiculo = (Veiculo) obj; // faz o cast do objeto para Cliente

                switch(atributo){
                    case "Placa":
                        if(veiculo.getPlaca().equals(atual))
                            veiculo.setPlaca(novo);
                        break;
                    case "Modelo":
                        if(veiculo.getModelo().equals(atual))
                            veiculo.setModelo(novo);
                        break;
                    case "Marca":
                        if(veiculo.getMarca().equals(atual))
                            veiculo.setMarca(novo);
                        break;
                    case "Ano":
                        if(veiculo.getAno() == Integer.parseInt(atual))
                            veiculo.setAno(Integer.parseInt(novo));
                    break;
                    case "Potência":
                        if(veiculo.getPotencia() == Integer.parseInt(atual))
                            veiculo.setPotencia(Integer.parseInt(novo));
                        break;
                    case "Categoria":
                        if(veiculo.getCategoria().equals(atual))
                            veiculo.setCategoria(novo);
                        break;
                    default:
                        break;
                }
            }
        } 
    }

    public String listar() {
        String lista = "";
        for(int i = 0; i < veiculos.tamanho(); i++){
            Object obj  = veiculos.getElementoPeloIndice(i);
            if(obj instanceof Veiculo){
                Veiculo veiculo = (Veiculo) obj;
                lista+= veiculo.toString();
            }
        }
        return lista;
    }

    public String listarUltimo(){
        String lista = "";
        for(int i = veiculos.tamanho(); i >= 0; i--){
            Object obj  = veiculos.getElementoPeloIndice(i);
            if(obj instanceof Veiculo){
                Veiculo veiculo = (Veiculo) obj;
                lista+= veiculo.toString();
            }
        }
        return lista;
    }
    
    public int tamanho(){
        return veiculos.tamanho();
    }

    public Lista getLista(){
        return veiculos;
    }
    public Lista getVeiculosDisponiveis() {
        Lista veiculosDisponiveis = new Lista();
        for (int i = 0; i < veiculos.tamanho(); i++) {
            Object veiculo  = veiculos.getElementoPeloIndice(i);
            if(veiculo instanceof Veiculo){
                if(((Veiculo) veiculo).isDisponivel()){
                veiculosDisponiveis.adicionar(veiculo);    
                }
                
            }
        }
        return veiculosDisponiveis;
    }

    // Tratar método na Main
    //procura um objeto do tipo Veiculo dentro de uma 
    //lista chamada veiculos, comparando a placa do veículo com o parâmetro 
    //passado como argumento. Se a placa for encontrada na lista, o método retorna 
    //o objeto Veiculo.
    public Veiculo getVeiculo(String placa) throws NoSuchElementException{
        for(int i = 0; i < veiculos.tamanho(); i++){
            Object obj  = veiculos.getElementoPeloIndice(i);
            if(obj instanceof Veiculo){
                Veiculo veiculo = (Veiculo) obj;
                if(veiculo.getPlaca().equals(placa))
                    return veiculo;
            }
        }
        throw new NoSuchElementException("Veículo, com a placa informada, não encontrado.");
        
    }
}

