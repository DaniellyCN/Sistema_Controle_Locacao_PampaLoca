package Gerenciar;
import java.util.NoSuchElementException;

public class GerenciarCategoria implements IGerenciar{

    private Lista categorias;

    public GerenciarCategoria(){
        categorias = new Lista();
    }

    @Override
    public void adicionar(Object categoria) throws IllegalArgumentException {
        if(!(categoria instanceof Categoria)){
            throw new IllegalArgumentException("Uma categoria deve ser informada como argumento.");
        }
        categorias.adicionar((Categoria)categoria);
    }

    
    public void excluir(int identificador, Lista veiculos_lista) throws Exception{
        boolean retornar = false;
        Categoria cat = new Categoria();
        for (int i = 0; i < categorias.tamanho(); i++) {
            Object obj = categorias.getElementoPeloIndice(i); 
            if (obj instanceof Categoria) { 
                Categoria categoria = (Categoria) obj;
                if(categoria.getIdentificador() == identificador){
                    cat = categoria;
                    retornar = true;
                }

            }
        }
        int count = 0;
        if(retornar){
            for(int j =0; j < veiculos_lista.tamanho(); j++){
                count++;
                Object objeto = veiculos_lista.getElementoPeloIndice(j);
                if( objeto instanceof Veiculo){
                    Veiculo veiculo = (Veiculo) objeto;
                    if(veiculo.getCategoria().equals(cat.getNome())){
                        throw new Exception("Há veículo atrelado à essa categoria e por isso não pode ser excluída.");
                    }else{
                        if(count == veiculos_lista.tamanho()){
                            categorias.excluir(cat);
                        }
                    }
                }
            }
        }else{
            throw new Exception("Não há categoria com esse identificador na lista de categorias.");
        }
    }

    @Override
    // IMPLEMENTAR THOWRS EXCEPTIONS
    // RECEBE TRÊS PARAMETROS: o PRIMEIRO É O ATUAL, O SEGUNDO É QUAL ATRIBUTO SERÁ EDITADO E O TERCEIRO É QUAL SERÁ O NOVO
    //Esse método foi pensado para editar qualquer um dos atributos da classe, por isso o usuário deve dizer qual deles será editado.
    public void editar(String atual, String atributo, String novo) {
        for (int i = 0; i < categorias.tamanho(); i++) {
            Object obj = categorias.getElementoPeloIndice(i); // retorna um objeto
            if (obj instanceof Categoria) { // verifica se o objeto é uma instância de Categoria
                Categoria cat = (Categoria) obj; // faz o cast do objeto para Categoria
                switch(atributo){
                    case "Nome":
                        if(cat.getNome().equals(atual)){
                            cat.setNome(novo);
                        };
                        break;
                    case "Identificador":
                        if(cat.getIdentificador() == Integer.parseInt(atual)){
                            cat.setIdentificador(Integer.parseInt(novo));
                        };
                        break;
                    default:
                        break;
                }
            }
        }
    }
    
    public String listar() {
        String lista = "";
        for(int i = 0; i < categorias.tamanho(); i++){
            Object obj  = categorias.getElementoPeloIndice(i);
            if(obj instanceof Categoria){
                Categoria categoria = (Categoria) obj;
                lista+= categoria.toString();
            }
        }
        return lista;
    }

    public int tamanho(){
        return categorias.tamanho();
    }

    public Lista getLista(){
        return categorias;
    }
    // Tratar exceção na main desse método
    public Categoria getCategoria(int identificador) throws NoSuchElementException{
        for(int i = 0; i < categorias.tamanho(); i++){
            Object obj  = categorias.getElementoPeloIndice(i);
            if(obj instanceof Categoria){
                Categoria categoria = (Categoria) obj;
                if(categoria.getIdentificador() == identificador){
                    return categoria;
                }
            }
        }
        throw new NoSuchElementException("Categoria não encontrada");
    }

}
