
public class Main {
    public static void main(String[] args){
        
        GerenciarArquivo arquivo_categorias = new GerenciarArquivo("uploads\\Categorias.csv");
        GerenciarArquivo arquivo_veiculos = new GerenciarArquivo("uploads\\Veiculos.csv");

        Lista lista_categorias = new Lista();
        lista_categorias = arquivo_categorias.lerArquivos();

        Categoria.listaCategoria = arquivo_categorias.lerArquivos();
        

        System.out.println(Categoria.listaCategoria.tamanho());

        
    

    }
}
