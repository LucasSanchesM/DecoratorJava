package exemplo02;

public class Player {
    private String nickname;
    private int nivel;
    private String Classe;
    private String arma;
    private int vida;
    private int mana;
    
    private Player(Builder builder){
        this.Classe = builder.Classe;
        this.arma = builder.arma;
        this.vida = builder.vida;
        this.nivel = builder.nivel;
        this.nickname = builder.nickname;
        this.mana = builder.mana;
    }
    
    
    public static class Builder{
       private String nickname;
       private int nivel;
       private String Classe;
       private String arma;
       private int vida;
       private int mana;
       
       public Builder(){
           this.Classe = "";
           this.arma = "";
           this.mana = 0;
           this.nickname = "";
           this.vida = 0;
       }
       
        public Builder setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder setNivel(int nivel) {
            this.nivel = nivel;
            return this;
        }

        public Builder setClasse(String Classe) {
            this.Classe = Classe;
            return this;
        }

        public Builder setArma(String arma) {
            this.arma = arma;
            return this;
        }

        public Builder setVida(int vida) {
            this.vida = vida;
            return this;
        }

        public Builder setMana(int mana) {
            this.mana = mana;
            return this;
        }
        public Player Builder(){
            if(nickname ==null || nickname == ""){
                System.out.println("Erro, é necessario nickname para criacao");
                return null;
            }
            else{
                return new Player(this);
            }
        }
        
        
    }

    @Override
    public String toString() {
        return "Player\n" + "nickname=" + nickname + "\nnivel=" + nivel + "\nClasse=" + Classe + "\narma=" + arma + "\nvida=" + vida + "\nmana=" + mana + '\n';
    }
    
    
}
