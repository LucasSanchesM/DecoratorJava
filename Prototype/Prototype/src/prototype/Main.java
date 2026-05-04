package prototype;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1);
        user1.setEmail("joao@teste.com");
        user1.setSenha("1234");
        user1.setUsername("joao");
        
        System.out.println(user1);
        
        User user2 = user1.clone();
        //Uma coisa interessante de se notar é que na interface Prototype eu digo que o retorno do metodo clone
        //deve ser do tipo prototype, porem como a classe user implementa prototype ela permite eu retornar usuario,
        // essa pratica permite que eu escolha intanciar como prototype (generico0 ou User (especifico, como eu utilizei)
        //caso fosse necessario a intancia de Prototype eu poderia fazer: Prototype user2 = user1.clone();
        System.out.println(user2);
        
    }
    
}
