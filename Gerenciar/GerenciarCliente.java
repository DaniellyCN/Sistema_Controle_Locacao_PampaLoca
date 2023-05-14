package Gerenciar;

import java.util.NoSuchElementException;

public class GerenciarCliente implements IGerenciar{
    
    private Lista clientes;


    public GerenciarCliente(Lista clientes) {
    this.clientes = clientes;
}
    
    public GerenciarCliente(){
       clientes = new Lista();
    }
    
    public Lista getLista(){
        return clientes;
    }

    @Override
    public void adicionar(Object cliente) throws IllegalArgumentException {
        if(!(cliente instanceof Cliente)){
            throw new IllegalArgumentException("Um cliente deve ser informado como argumento.");
        }
        clientes.adicionar((Cliente)cliente);
    }

    
    public void excluir(int cNH, Lista locacoes_lista) throws Exception{
        boolean retornar = false;
        Cliente cliente_auxiliar = new Cliente();
        for (int i = 0; i < clientes.tamanho(); i++) {
            Object obj = clientes.getElementoPeloIndice(i); 
            if (obj instanceof Cliente) { 
                Cliente cliente = (Cliente) obj;
                if(cliente.getCNH() == cNH){
                    cliente_auxiliar = cliente;
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
                   // if(locacao.getCnhCliente() == cliente_auxiliar.getCNH()){
                    if(Integer.parseInt(locacao.getCnhCliente()) == cliente_auxiliar.getCNH()){
                        throw new Exception("Existe cliente associado em alguma locação por isso não pode ser excluído.");
                    }else{
                        if(count == locacoes_lista.tamanho()){
                            clientes.excluir(cliente_auxiliar);
                        }
                    }
                }
            }
        }

        throw new Exception("Não foi encontrado cliente com esse cpf.");
    }

    @Override
    
    // RECEBE TRÊS PARAMETROS: o PRIMEIRO É O ATUAL, O SEGUNDO É QUAL ATRIBUTO SERÁ EDITADO E O TERCEIRO É QUAL SERÁ O NOVO
    //Esse método foi pensado para editar qualquer um dos atributos da classe, por isso o usuário deve dizer qual deles será editado.
    public void editar(String atual, String atributo, String novo) {
        for (int i = 0; i < clientes.tamanho(); i++) {
            Object obj = clientes.getElementoPeloIndice(i); // retorna um objeto
            if (obj instanceof Cliente) { // verifica se o objeto é uma instância de Cliente
                Cliente cliente = (Cliente) obj; // faz o cast do objeto para Cliente

                switch (atributo) {
                    case "Nome":
                        if(cliente.getNome().equals(atual))
                            cliente.setNome(novo);
                        break;
                    case "CNH":
                        if(cliente.getCNH() == Integer.parseInt(atual))
                            cliente.setCNH(Integer.parseInt(novo));
                        break;
                    case "Telefone":
                        if(cliente.getTelefone().equals(atual))
                            cliente.setTelefone(novo);
                        break;
                    case "CPF":
                        if(cliente.getCPF() == Integer.parseInt(atual))
                            cliente.setCPF(Integer.parseInt(novo));
                        break;
                    default:
                        break;
                }
                
            }
        }    
    }

    
    public String listar() {
        String lista = "";
        for(int i = 0; i < clientes.tamanho(); i++){
            Object obj  = clientes.getElementoPeloIndice(i);
            if(obj instanceof Cliente){
                Cliente cliente = (Cliente) obj;
                lista+= cliente.toString();
            }
        }
        return lista;
    }

   
    public String listarUltimo(){
        String lista = "";
        for(int i = clientes.tamanho(); i >= 0; i--){
            Object obj  = clientes.getElementoPeloIndice(i);
            if(obj instanceof Cliente){
                Cliente cliente = (Cliente) obj;
                lista+= cliente.toString();
            }
        }
        return lista;
    }

    @Override
    public int tamanho() {
        return clientes.tamanho();
    }

    public Cliente getCliente(int cNH) throws NoSuchElementException{
        for(int i = 0; i < clientes.tamanho(); i++){
            Object obj  = clientes.getElementoPeloIndice(i);
            if(obj instanceof Cliente){
                Cliente cliente = (Cliente) obj;
                if(cliente.getCNH() == cNH)
                    return cliente;
            }
        }
        throw new NoSuchElementException();
    }
}