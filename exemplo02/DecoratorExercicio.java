package decoratorexercicio;

public class DecoratorExercicio {

    public static void main(String[] args) {
        Local casa = new CasaQuadrada(200, 100);
        casa = new AvaliacaoOtima(casa);      
        System.out.println(casa.exibirDescricao());
        
        Local casa2 = new CasaTriangular(200, 100);
        casa2 = new AvaliacaoRuim(casa2);
        
        System.out.println(casa2);
    }
}
