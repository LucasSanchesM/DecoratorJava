package proxy;

public class ProxyCafeSimples implements Cafes{
    private CafeSimples cafe;
    private double quantidadeEmLitros;
    
    public ProxyCafeSimples(double quantidadeEmLitros){
        this.quantidadeEmLitros = quantidadeEmLitros;
    }
    
    @Override
    public void colocarIngredientes(String ingrediente){
        if(cafe == null){
            cafe = new CafeSimples(quantidadeEmLitros);
        }
        cafe.colocarIngredientes(ingrediente);
    }
    
    @Override
    public void exibir(){
        if(cafe == null){
            cafe = new CafeSimples(quantidadeEmLitros);
        }
        cafe.exibir();
    }
}
