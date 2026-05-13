package iterator;

public class CanalIterator implements Iterator{
    private String[] lista;
    private int posicao;
    
    public CanalIterator(String[] lista){
        this.lista = lista;
        posicao = 0;
    }
    
    public boolean hasNext(){
        return posicao < lista.length;
    }
    
    public Object next(){
        if(posicao< lista.length ){
            return lista[posicao++];
        }
        else{
            System.out.println("Nao há proximo");
            return null;
        }
    }
}
