import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GerenciarArquivo {
    private Lista arquivoEmLista;
    private String caminho;

    public GerenciarArquivo(String caminho){
        arquivoEmLista = new Lista();
        this.caminho = caminho;
        //caminhoCategoria = "uploads\\Categorias.csv";
    }

    public Lista lerArquivos(){
        FileReader arquivo = null;
        BufferedReader leitura = null;
        try{
            arquivo = new FileReader(caminho);
            leitura = new BufferedReader(arquivo);
            String linha = leitura.readLine();
            while(linha != null){
                System.out.println(linha); // verificação por linha do arquivo se está ou não disponível no array criado
                linha = leitura.readLine(); // leitura de linha a linha do arquivo para ver esta ou não compatível com 
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
