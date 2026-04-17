package padaria.sonho;

public class PadariaSonho {

    public static void main(String[] args) {
        Comida paozinho = new PaoDeSal();
        System.out.println(paozinho.descricao() + "\n" + paozinho.preco());
        System.out.println("\nAdicionando Manteiga...\n");
        
        paozinho = new Manteiga(paozinho);
        System.out.println(paozinho.descricao() + "\n" + paozinho.preco());
        System.out.println("\nAdicionando Presunto...\n");
        
        paozinho = new Presunto(paozinho);
        System.out.println(paozinho.descricao() + "\n" + paozinho.preco());
    }   
}
