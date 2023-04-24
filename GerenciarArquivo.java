import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GerenciarArquivo {
    private ListaSimplesmente arquivoEmLista;
    private String caminho;

    public GerenciarArquivo(String caminho){
        arquivoEmLista = new ListaSimplesmente();
        this.caminho = caminho;
        //caminhoCategoria = "uploads\\Categorias.csv";
    }

    public ListaSimplesmente lerArquivos(){
        FileReader arquivo = null;
        BufferedReader leitura = null;
        try{
            arquivo = new FileReader(caminho);
            leitura = new BufferedReader(arquivo);
            String linha = leitura.readLine();
            while(linha != null){
                System.out.println(linha);
                linha = leitura.readLine();
                arquivoEmLista.adicionar(linha);
            }
        }catch( IOException exception){
            System.out.println("Error: " + exception.getMessage());
        }finally{
            try{
                arquivo.close();
                leitura.close();
            }catch(IOException exception){
                exception.printStackTrace();
            }
        }
        return arquivoEmLista;
    }
}
