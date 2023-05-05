package Gerenciar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//MUDAR O RETORNO PARA UMA LISTA SIMPLESMENTE EM getLinhaArquivo
public class GerenciarArquivo {
    private String[] arquivoEmLista;
    private String caminho;

    public GerenciarArquivo(String caminho, int colunas){
        arquivoEmLista = new String[colunas];
        this.caminho = caminho;
    }

    // retorna um o arquivo lido em vetor, onde cada elemento do vetor corresponde à uma linha do arquivo;
    // o arquivo já está sendo lido desconsiderando a primeira linha do arquivo
    public String[] lerArquivos(){
        FileReader arquivo = null;
        BufferedReader leitura = null;
        try{
            arquivo = new FileReader(caminho);
            leitura = new BufferedReader(arquivo);
            String linha = leitura.readLine();
            int posicao = 0;
            while(linha != null){
                // System.out.println(linha);
                linha = leitura.readLine();
                arquivoEmLista[posicao] = linha;
                posicao++;
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
