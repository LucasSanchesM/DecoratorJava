package padariaalegria;

public class PadariaAlegria {

    public static void main(String[] args) {
        PaoDeSal paozinho = new PaoDeSal();
        System.out.println(paozinho.descricao() + paozinho.preco());
        System.out.println("Adicionando Manteiga...\n");
        
        paozinho.colocarManteiga();
        System.out.println(paozinho.descricao() + paozinho.preco());
        System.out.println("Adicionando Presunto...\n");
        
        paozinho.colocarPresunto();
        paozinho.colocarManteiga();
        System.out.println(paozinho.descricao() + paozinho.preco());
    }
}
