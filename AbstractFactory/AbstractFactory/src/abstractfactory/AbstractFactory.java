package abstractfactory;

public class AbstractFactory {

    public static void main(String[] args) {
        FabricaEconomicos economico = new FabricaEconomicos();
        Carro carro = economico.criarCarro();
        Motocicleta moto = economico.criarMoto();
        
        
        System.out.println(carro.descricao() + "\n" + carro.preco() + "\n");
        System.out.println(moto.descricao() + "\n" + moto.preco() + "\n");
    }
    
}
