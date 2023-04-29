
public class Main {
    public static void main(String[] args){
        
        GerenciarArquivo arquivo_categorias = new GerenciarArquivo("uploads\\Categorias.csv");
        GerenciarArquivo arquivo_veiculos = new GerenciarArquivo("uploads\\Veiculos.csv");

        GerenciarCategoria lista_categoria = new GerenciarCategoria();
        

        System.out.println(arquivo_categorias.getLinhaArquivo());
        //System.out.println(arquivo_categorias.tamanho());

        //for(int i=1; i < 8; i++){
          //  Categoria categoria = new Categoria();
            //for(int j=; j < 2; j++){
            //    System.out.println(categoria.getNome());
                //if(j==0){
                    
              //      categoria.setIdentificador(Integer.parseInt(arquivo_categorias.getLinhaArquivo()[0]));
                //}else{
                    // o else sempre vai ser o nome pq pra categoria sao sempre dois elementos no array retornado em getLinhaArquivo: o primeiro o id e o segundo o nome
                //    categoria.setNome(arquivo_categorias.getLinhaArquivo()[1]);
                //}
            //}

            
        //}
    }
}
