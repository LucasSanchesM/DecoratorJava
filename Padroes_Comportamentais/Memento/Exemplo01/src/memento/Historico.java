package memento;
import java.util.Stack;

public class Historico {
    private final Stack<EditorMemento> historico = new Stack<>();
    
    public void adicionar(EditorMemento editor){
        historico.push(editor);
    }
    public EditorMemento desfazer(){
        if(!historico.isEmpty()){
            return historico.pop();
        }
        else{
            return null;
        }
    }
    
}
