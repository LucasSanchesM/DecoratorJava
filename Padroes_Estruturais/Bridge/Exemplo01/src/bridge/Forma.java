package bridge;

public abstract class Forma {
    public DesenhoApi desenhoApi;
    public Forma(DesenhoApi desenhoApi){
        this.desenhoApi = desenhoApi;
    }
    public abstract void desenhar();
}
