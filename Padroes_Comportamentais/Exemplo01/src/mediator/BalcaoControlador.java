package mediator;

public class BalcaoControlador implements BalcaoMediator{
    private CozinhaJanta jantas;
    private CozinhaSobremesa sobremesas;
    @Override
    public void registrarCozinhaJanta(CozinhaJanta janta) {
        this.jantas = janta;
    }

    @Override
    public void registrarCozinhaSobremesa(CozinhaSobremesa sobremesa) {
        this.sobremesas = sobremesa;
    }

    @Override
    public void validarCombo(String janta, String sobremesa) {
        if(jantas.temPrato(janta) && sobremesas.temPrato(sobremesa)){
            System.out.println("Combo validado...\n" + "Janta: " + janta + "\nSobremesa:" + sobremesa);
        }
        else{
            System.out.println("Impossivel pedir combo, itens faltando...");
        }
        
    }
    
}
