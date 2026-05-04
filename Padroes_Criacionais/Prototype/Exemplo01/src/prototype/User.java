package prototype;

public class User implements Prototype{
    private int id;
    private String email;
    private String senha;
    private String username;

    //Vale Enfatizar que o java permite dois construtores em uma mesma classe
    //desde que suas assinaturas (se refere ao tipo e ordem dos parametros recebebidos)
    //sejam siferentes, exemplo -> String, String, Int e String, Int, String : Aceito
    //                             String, String, Int e String, String, Int : Recusado
    //Esse é o caso no prototype :)
    public User(User user){
        this.id = user.id;
        this.username = user.username;
        this.email = user.email;
        this.senha = user.senha; 
        
    }
    
    public User(){
        
    }
    
    public User clone(){
        return new User(this);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + ", senha=" + senha + ", username=" + username + '}';
    }
}
