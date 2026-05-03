/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author lucas
 */
public class Pessoa {
    private final String nome;
    private final String username;
    private final String email;
    private final int idade;
    private final String genero;

    private Pessoa(Builder builder) {
        this.nome = builder.nome;
        this.username = builder.username;
        this.email = builder.email;
        this.idade = builder.idade;
        this.genero = builder.genero;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", username=" + username + ", email=" + email + ", idade=" + idade + ", genero=" + genero + '}';
    }
    
    
    public static class Builder{
        //como é uma classe estatica meu objeto nao precisa estar instanciado para eu acessar isto
        private String nome;
        private String username;
        private String email;
        private int idade;
        private String genero;
        
        public Builder(){
            this.nome = "Nao Preenchido";
            this.username = "Nao preenchido";
            this.email = "Nao preenchido";
            this.idade = 0;
            this.genero = "nao preenchido";
        }
        
        //de
        public Builder nome(String nome){
            this.nome = nome;
            return this;
        }
        public Builder username(String username){
            this.username = username;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder idade(int idade){
            this.idade = idade;
            return this;
        }
        public Builder genero(String genero){
            this.genero = genero;
            return this;
        }
        public Pessoa build(){
            return new Pessoa(this);
        }
        
    }
}
