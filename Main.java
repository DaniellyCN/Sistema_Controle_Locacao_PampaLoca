
public class Main {
    public static void main(String[] args){
        
        GerenciarArquivo arquivo = new GerenciarArquivo("uploads\\Categorias.csv");

        ListaSimplesmente lista_categorias = new ListaSimplesmente();
        lista_categorias = arquivo.lerArquivos();
        

        System.out.println(lista_categorias.tamanho());
        

    }
}
