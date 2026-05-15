package oberserver;

public interface PublicadorLeilao {
    void adicionarLicitante(Licitante a);
    void removerLicitante(Licitante a);
    void notificarLicitante();
    void novoLance(double valor);
}
