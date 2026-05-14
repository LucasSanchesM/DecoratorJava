package template;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    int idPedido;
    List <Item> itens  = new ArrayList<>();
    
    public Pedido(int id){
        this.idPedido = id;
    }
    
    public void adicionarItem(Item i){
        itens.add(i);
    }
}
