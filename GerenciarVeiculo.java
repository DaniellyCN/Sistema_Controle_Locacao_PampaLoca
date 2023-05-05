import java.util.NoSuchElementException;

public class GerenciarVeiculo implements IGerenciar{
    
    private Lista veiculos;

    public GerenciarVeiculo(){
        veiculos = new Lista();
    }


    @Override
    public void adicionar(Object veiculo) {
        if(veiculo instanceof Veiculo){
            veiculos.adicionar((Veiculo)veiculo);
        }else{
            // retornar erro
        }
    
    }
    
    public void excluir(String placa, Lista locacoes_lista) throws Exception {
        boolean retornar = false;
        Veiculo veiculo_auxiliar = new Veiculo();
        
        for (int i = 0; i < veiculos.tamanho(); i++) {
            Object obj = veiculos.getElementoPeloIndice(i); 
            if (obj instanceof Veiculo) { 
                Veiculo veiculo = (Veiculo) obj;
                if(veiculo.getPlaca().equals(placa)){
                    veiculo_auxiliar = veiculo;
                    retornar = true;
                }

            }
        }
        int count = 0;
        if(retornar){
            for(int j = 0; j < locacoes_lista.tamanho();j++){
                count ++;
                Object objeto = locacoes_lista.getElementoPeloIndice(j); 
                if (objeto instanceof Locacao) { 
                    Locacao locacao = (Locacao) objeto;
                    if(locacao.getPlacaVeiculo() == veiculo_auxiliar.getPlaca()){
                        throw new Exception("Existe veículo associado em alguma locação por isso não pode ser excluído.");
                    }else{
                        if(count == locacoes_lista.tamanho()){
                            veiculos.excluir(veiculo_auxiliar);
                        }
                    }
                }
            }
        }

        throw new Exception("Veículo, com a placa informada, não encontrado.");

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
    public Veiculo getVeiculo(String placa) throws NoSuchElementException{
        for(int i = 0; i < veiculos.tamanho(); i++){
            Object obj  = veiculos.getElementoPeloIndice(i);
            if(obj instanceof Veiculo){
                Veiculo veiculo = (Veiculo) obj;
                if(veiculo.getPlaca().equals(placa))
                    return veiculo;
            }
        }
        throw new NoSuchElementException();
    }
}

