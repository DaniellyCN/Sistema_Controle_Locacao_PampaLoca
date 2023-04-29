
public class Main {
    public static void main(String[] args){
        
        GerenciarArquivo arquivo_categorias = new GerenciarArquivo("uploads\\Categorias.csv");
        GerenciarArquivo arquivo_veiculos = new GerenciarArquivo("uploads\\Veiculos.csv");
        Categoria.listaCategoria = arquivo_categorias.lerArquivos();
        
        Categoria c = new Categoria();

        c.setNome("teste");
        c.setIdentificador(1234);
        

        System.out.println(Categoria.listaCategoria.tamanho());

        Categoria.listaCategoria.adicionar(c);
        System.out.println(Categoria.listaCategoria.tamanho());

//----------------------------------------------------------Veiculo

        Veiculo.listaVeiculo = arquivo_veiculos.lerArquivos();

       Veiculo v = new Veiculo();
        
    
        System.out.println(Veiculo.listaVeiculo.tamanho());


        //testando o método adicionar 
        GerenciarVeiculo gerenciarVeiculo = new GerenciarVeiculo("ABC1234", "Civic", "Honda", 2022, 150, 5, "Sedan");
        gerenciarVeiculo.adicionar();
      
        gerenciarVeiculo.listar();
    }
}
