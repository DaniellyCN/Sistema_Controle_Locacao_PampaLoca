public class Main {
    public static void main(String[] args){
        
        GerenciarArquivo arquivo_categorias = new GerenciarArquivo("uploads\\Categorias.csv",8);
        GerenciarArquivo arquivo_veiculos = new GerenciarArquivo("uploads\\Veiculos.csv",8);


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

            // Criando a lista de veiculos já com o nome da categoria
            // ------------ SUBSTITUINDO O ID DA CATEGORIA PELO NOME, NA LISTA DE VEICULOS
            String cat = "";
            switch(linha_separada[6]){
                case "1010":
                cat = "esportivo";
                break;

                case "1011":
                cat = "sedan comptacto";
                break;

                case "1012":
                cat = "sedan medio";
                break;

                case "1013":
                cat = "SUV compacto";
                break;

                case "1014":
                cat = "SUV ";
                break;

                case "1015":
                cat = "caminhonete";
                break;

                case "1016":
                cat = "hatch";
                break;
            }
            veiculo.setCategoria(cat);
            veiculos_lista.adicionar(veiculo); 
            //System.out.println(veiculo.toString());
        }
        //System.out.println(veiculos_lista.listar());


    }
}