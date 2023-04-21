public class Lista implements ILista {
    //PENDÊNCIAS: LER OS ARQUIVOS, TRATAMENTO DE EXCEÇÃO E MÉTODO LISTAR
    private Noh primeiro;
    private Noh ultimo;
    private int totalElementos = 0;

    public Lista(){
        ultimo = null;
        primeiro = null;
    }

    @Override
    // A adição de um elemento é feita no começo da lista, ou seja, ao adicionar um elemento, os elementos posteriores 
    // são "empurrando" para o fim.

    // Caso haja necessidade de criar método que adicione elementos a partir do final da lista, contate o dev responsável
    public void adicionar(Object conteudo) {
        Noh novo = new Noh(conteudo);

        if(primeiro == null){
            primeiro = novo;
            ultimo  = novo;
        }else{
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
            primeiro = novo;
        }
        totalElementos ++;
    }

    @Override
    public boolean excluir(Object conteudo) {
        Noh auxiliar = primeiro;

        while(auxiliar != null && auxiliar.getProximo() != conteudo){
            auxiliar = auxiliar.getProximo();
        }

        if(auxiliar == null){
            return false;
        }

        if(auxiliar == primeiro){
            primeiro = auxiliar.getProximo();
            if(primeiro != null){
                primeiro.setAnterior(null);
            }else{
                ultimo = null;
            }
        }else if(auxiliar == ultimo){
            ultimo = auxiliar.getAnterior();
            if(ultimo != null){
                ultimo.setProximo(null);
            }else{
                primeiro = null;
            }
        }else{
            auxiliar.getProximo().setAnterior(auxiliar.getAnterior());
            auxiliar.getAnterior().setProximo(auxiliar.getProximo());
        }

        return true;
        
    }

    @Override
    public void listar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int tamanho() {
        return totalElementos;
    }

    @Override
    public boolean vazia() {
        if(totalElementos == 0){
            return true;
        }
        return false;
    }
}

