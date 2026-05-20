package memento;

public class Main {

    public static void main(String[] args) {
        EditorDeTexto texto = new EditorDeTexto();
        Historico historico = new Historico();
        
        texto.escrever("Ola");
        System.out.println(texto.getTexto());
        historico.adicionar(texto.salvar());
        
        texto.escrever("bom dia");
        System.out.println(texto.getTexto());
        historico.adicionar(texto.salvar());
        
        texto.escrever("Tudo bem?");
        System.out.println(texto.getTexto());
        System.out.println("\nDesfazendo alterações...\n");
        
        texto.restaurar(historico.desfazer());
        System.out.println(texto.getTexto());
        
        texto.restaurar(historico.desfazer());
        System.out.println(texto.getTexto());
    }
    
}
