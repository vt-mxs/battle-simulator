package battlesimulator.classes;
import java.util.Random;

public class Character {
    // atributos da classe
    protected String name;
    protected int life;
    protected int damage;
    protected int lucky;

    // gerador para testes de acerto
    protected static Random rng = new Random();
    
    public Character(String name){
       this.name = name;
       this.life = rng.nextInt(17 - 10) + 10;
       this.damage = rng.nextInt(9 - 2) + 9;
       this.lucky = 7;
    }
    
    /*
     método para exibição "mais apresentável"
     dos personagem
     pra caso seja dado um System.out.print()
     ao invés de ser exibido um (exemplo) Classe$Objeto@<hashcode>
     será exibido em um formato melhor visível para o usuário
    */
    @Override
    public String toString(){
        return String.format(
            "Name: %s | Life: %d | Damage: %d | Lucky: %d",
            name,
            life,
            damage,
            lucky
        );
    }
    
    // métodos protegidos especícicos da classe
    
    protected int causeDamage(Character atacker, Character receptor){
        return atacker.damage -= receptor.life;
    }
    
    // métodos publicos especícicos da classe
    
    public void atackEnemy(Character atacker, Character target){
        if (atacker.lucky > rng.nextInt(13) + 1) {
            causeDamage(atacker, target);
            System.out.printf("Caused %d damage", atacker.damage);
        }
        else{
            System.out.println("Atack fail");
        }
    }
    
    public boolean runWay(Character runner){
        if(runner.lucky > rng.nextInt(19) + 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    // getters e setters
    public int getLife() {
        return life;
    }
}