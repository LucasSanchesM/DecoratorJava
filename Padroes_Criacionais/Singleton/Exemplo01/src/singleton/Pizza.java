package singleton;

public class Pizza {
    private String sabor;
    private String tamanho;
    public Pizza(String sabor, String tamanho){
        this.sabor = sabor;
        this.tamanho = tamanho;
    }
    @Override
    public String toString() {
        return "Pizza{" + "sabor=" + sabor + ", tamanho=" + tamanho + '}';
    }
}
