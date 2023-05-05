
public class Main {
    public static void main(String[] args){
        
        GerenciarArquivo arquivo_categorias = new GerenciarArquivo("C:\\Users\\d00ne\\OneDrive\\Documentos\\NetBeansProjects\\PampaLoca\\src\\main\\java\\uploads\\Categorias.csv",8);
        GerenciarArquivo arquivo_veiculos = new GerenciarArquivo("C:\\Users\\d00ne\\OneDrive\\Documentos\\NetBeansProjects\\PampaLoca\\src\\main\\java\\uploads\\Veiculos.csv",8);

        // ----------- POPULANDO A LISTA DE CATEGORIAS --------------
        GerenciarCategoria categorias_lista = new GerenciarCategoria();

        for(int i = 0; i < 7; i++ ){
            String linha = arquivo_categorias.lerArquivos()[i];
            String[] linha_separada  = linha.split(";");

            Categoria categoria = new Categoria(Integer.parseInt(linha_separada[0]),linha_separada[1]);
            //System.out.println(categoria.toString());
            categorias_lista.adicionar(categoria); 
            //System.out.println(categoria.toString());
        }
        System.out.println("Terceiro elemento da lista de categorias: ");
        System.out.println(categorias_lista.getLista().getElementoPeloIndice(2));
        System.out.println(categorias_lista.tamanho());

        // ------------ POPULANDO A LISTA DE VEICULOS -------------------
        GerenciarVeiculo veiculos_lista = new GerenciarVeiculo();

        for(int i = 0; i < 7; i++ ){
            String linha = arquivo_veiculos.lerArquivos()[i];
            String[] linha_separada  = linha.split(";");

            Veiculo veiculo = new Veiculo(
                linha_separada[0],linha_separada[1],linha_separada[2],Integer.parseInt(linha_separada[3]),
                Integer.parseInt(linha_separada[4]),Integer.parseInt(linha_separada[5]),linha_separada[6]);

            veiculos_lista.adicionar(veiculo); 
            //System.out.println(veiculo.toString());
        }
        
        // ------------ SUBSTITUINDO O ID DA CATEGORIA PELO NOME, NA LISTA DE VEICULOS

        
        for(int i = 0; i < veiculos_lista.tamanho(); i++) {
            Object obj = veiculos_lista.getLista().getElementoPeloIndice(i); 
            if (obj instanceof Veiculo) { 
                Veiculo veiculo = (Veiculo) obj; 
                boolean encontrouCategoria = false; // inicializa a variável auxiliar
                
                for(int j = 0; j < categorias_lista.tamanho(); j++){
                    if (encontrouCategoria) {
                        break; // se já encontrou a categoria, sai do loop interno
                    }
                    Object objeto = categorias_lista.getLista().getElementoPeloIndice(j); 
                    if (objeto instanceof Categoria) { 
                        Categoria categoria = (Categoria) objeto; 
        
                        if(Integer.parseInt(veiculo.getCategoria()) == (categoria.getIdentificador())){
                            veiculo.setCategoria(categoria.getNome());
                            System.out.println(categoria.getNome());
                            encontrouCategoria = true; // atualiza a variável auxiliar
                        }
                    }
                }
                encontrouCategoria = false; // redefine a variável auxiliar
            }
        }

            

        System.out.println(veiculos_lista.listar());
    }
}