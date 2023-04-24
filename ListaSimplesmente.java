// Feita para guardar o arquivo lido
public class ListaSimplesmente{
    // PENDÊNCIAS:::: fazer método para remover para substituir lá na main felo count começando por 1
    private NohSimplesmente primeiro;
    private int totalElementos = 0;

    public ListaSimplesmente(){
        primeiro = null;
    }

    public void adicionar(String conteudo){
        NohSimplesmente novo = new NohSimplesmente(conteudo);
        if(primeiro == null){
            primeiro = novo;
        }else{
            novo.setProximo(primeiro);
            primeiro = novo;
        }
        totalElementos ++;
    }

    public int tamanho() {
        return totalElementos;
    }
}