package iterator;

public class CanaisTv implements CanalCollection{
    private String[] listaCanais;
    private int totalAtivos;

    public CanaisTv() {
        this.totalAtivos = 0;
        listaCanais = new String[10];
    }
    
    
    
    public void criarCanal(String canal){
        if(totalAtivos < listaCanais.length){
            listaCanais[totalAtivos] = canal;
            totalAtivos++;
        }else{
            System.out.println("A lista de canais está cheia");
        }
    }
    @Override
    public Iterator createIterator(){
        return new CanalIterator(listaCanais);
    }
    
}
