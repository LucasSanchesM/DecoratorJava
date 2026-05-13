
package iterator;

public class Main {

    public static void main(String[] args) {
        CanaisTv meusCanais = new CanaisTv();
        meusCanais.criarCanal("SBT");
        meusCanais.criarCanal("Globo");
        meusCanais.criarCanal("Rede Tv");
        
        Iterator it = meusCanais.createIterator();
        
        while(true){
            if(it.hasNext() == true){
                System.out.println("Canal Atual: " + it.next() + "\nAlterando Canal...");
            }else{
                System.out.println("Não ha proximos canais...");
                break;
            }
        }
    }
    
}
