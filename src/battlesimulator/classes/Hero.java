package battlesimulator.classes;

public class Hero extends Character{
    public Hero(String name) {
        super(name);
    }
    
    @Override
    public final void atackEnemy(Character hero, Character enemy){
        if (hero.lucky > rng.nextInt(13) + 1) {
            causeDamage(hero, enemy);
            System.out.printf("Caused %d damage", hero.damage);
        }
        else{
            System.out.println("Atack fail");
        }
    }
}