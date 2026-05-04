package decoratorexercicio;

public class CasaQuadrada implements Local{
    public double largura, comprimento, area;
    
    public CasaQuadrada(double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
        area = largura*comprimento;
    } 
    
    @Override
    public String exibirDescricao(){
        return "A sua casa tem " + area +" de area" ;  
    }
}
