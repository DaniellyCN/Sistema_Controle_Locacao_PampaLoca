package Gerenciar;


import Gerenciar.Categoria;


public class Main {
    public static void main(String[] args){
        
       GerenciarArquivo arquivo_categorias = new GerenciarArquivo("C:\\Users\\danielly\\OneDrive\\Documentos\\NetBeansProjects\\PampaLoca\\src\\main\\java\\uploads\\Categorias.csv",8);
        GerenciarArquivo arquivo_veiculos = new GerenciarArquivo("C:\\Users\\danielly\\OneDrive\\Documentos\\NetBeansProjects\\PampaLoca\\src\\main\\java\\uploads\\Veiculos.csv",8);

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
        GerenciarVeiculo veiculosLista = new GerenciarVeiculo();
        
        for(int i = 0; i < 7; i++ ){
            String linha = arquivo_veiculos.lerArquivos()[i];
            String[] linha_separada  = linha.split(";");

            Veiculo veiculo = new Veiculo(
                linha_separada[0],linha_separada[1],linha_separada[2],Integer.parseInt(linha_separada[3]),
                Integer.parseInt(linha_separada[4]),Integer.parseInt(linha_separada[5]),linha_separada[6] 
                    
            );
            System.out.println("MOSTRANDO");
            veiculosLista.adicionar(veiculo); 
             
           
            //System.out.println(veiculo.toString());
        }
        
        // ------------ SUBSTITUINDO O ID DA CATEGORIA PELO NOME, NA LISTA DE VEICULOS

        
        for(int i = 0; i < veiculosLista.tamanho(); i++) {
            Object obj = veiculosLista.getLista().getElementoPeloIndice(i); 
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

            

        System.out.println(veiculosLista.listar());
        
        
        
        //Verificando se está excluindo
     GerenciarVeiculo gerenciarVeiculo = new GerenciarVeiculo();
    Lista locacoes_lista = new Lista();

    // Adicionar alguns veículos
    gerenciarVeiculo.adicionar(new Veiculo("AAA-1111", "Modelo1", "Marca1", 2020, 100, 5, null));
    gerenciarVeiculo.adicionar(new Veiculo("BBB-2222", "Modelo2", "Marca2", 2019, 90, 4, null));
    gerenciarVeiculo.adicionar(new Veiculo("CCC-3333", "Modelo3", "Marca3", 2021, 120, 7,null));
    
    System.out.println("Veículos cadastrados:");
    System.out.println(gerenciarVeiculo.listar());
    
    // Excluir um veículo
    try {
        gerenciarVeiculo.excluir("BBB-2222", locacoes_lista);
        System.out.println("Veículo com placa BBB-2222 excluído com sucesso.");
    } catch (Exception e) {
        System.out.println("Erro ao excluir veículo: " + e.getMessage());
    }
    
    System.out.println("Veículos cadastrados após exclusão:");
    System.out.println(gerenciarVeiculo.listar());
        
        
        
        
        
        
        
        
    }
}