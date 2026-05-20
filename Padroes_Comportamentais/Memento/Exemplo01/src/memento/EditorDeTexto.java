package memento;

public class EditorDeTexto {
    private String texto;
    
    public void escrever(String texto){
        this.texto = texto;
    }
    
    public String getTexto(){
        return this.texto;  
    }
    
    public EditorMemento salvar(){
        return new EditorMemento(this.texto);
    }
    
    public void restaurar(EditorMemento memento){
        if(memento!= null){
            this.texto = memento.getConteudo();
        }
    }
}
