import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//MUDAR O RETORNO PARA UMA LISTA SIMPLESMENTE EM getLinhaArquivo
public class GerenciarArquivo {
    private Lista arquivoEmLista;
    private String caminho;
    private String[] colunas;
    private int quantidadeLinhas;

    public GerenciarArquivo(String caminho){
        arquivoEmLista = new Lista();
        this.caminho = caminho;
        quantidadeLinhas = 0;
    }

    public Lista lerArquivos(){
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
                quantidadeLinhas++;
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

    // retorna um array em que cada elemento é uma coluna de uma linha. Tipo do retorno é String

    //MUDAR O RETORNO PARA UMA LISTA SIMPLESMENTE
    public String[] getLinhaArquivo(){
        FileReader arquivo = null;
        BufferedReader leitura = null;
        //ListaSimplesmente colunas = new ListaSimplesmente();
        
        try{
            colunas = new String[2];
            arquivo = new FileReader(caminho);
            leitura = new BufferedReader(arquivo);
            String linha = leitura.readLine();
            colunas = linha.split(";");
            System.out.println(colunas.length);
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
        return colunas;
    }

    public int tamanho(){
        this.lerArquivos();
        return quantidadeLinhas;
    }
}
