package mediator;

public interface BalcaoMediator {
    void registrarCozinhaJanta(CozinhaJanta janta);
    void registrarCozinhaSobremesa(CozinhaSobremesa sobremesa);
    void validarCombo(String janta, String sobremesa);
}
