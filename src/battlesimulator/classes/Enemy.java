package battlesimulator.classes;

public class Enemy extends Character{
    public Enemy(String name) {
        super(name);
    }
    
    @Override
    public final void atackEnemy(Character enemy, Character hero){
        if (enemy.lucky > rng.nextInt(13) + 1) {
            causeDamage(enemy, hero);
            System.out.printf("Caused %d damage", enemy.damage);
        }
        else{
            System.out.println("Atack fail");
        }
    }
}