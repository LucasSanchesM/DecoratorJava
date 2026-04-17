package decoratorexercicio;
public class CasaTriangular implements Local{
    public double largura, comprimento, area;
    
    public CasaTriangular(double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
        this.area = largura*comprimento/2; 
    }
   
    @Override
    public String exibirDescricao(){
        return "A sua casa tem "+ area +" de area";   
    } 
}
