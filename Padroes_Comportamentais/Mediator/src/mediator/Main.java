package mediator;

public class Main {

    public static void main(String[] args) {
        BalcaoMediator balcao = new BalcaoControlador();
        CozinhaJanta minhaJanta = new CozinhaJanta(balcao);
        CozinhaSobremesa minhaSobremesa = new CozinhaSobremesa(balcao);
        
        balcao.registrarCozinhaJanta(minhaJanta);
        balcao.registrarCozinhaSobremesa(minhaSobremesa);
        
        balcao.validarCombo("Lasanha", "Bolo");
    }
    
}
