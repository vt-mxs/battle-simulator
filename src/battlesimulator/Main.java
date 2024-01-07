package battlesimulator;
import java.util.Scanner;
import battlesimulator.classes.Hero;
import battlesimulator.classes.Enemy;
/**
 * @author vt
 * @version 2.0
 */
public class Main {
    
    // método para criação do personagem
    private static void createHero(Scanner input){
        String heroName;
        // recebendo o nome
        System.out.print("Hero name => ");
        heroName = input.nextLine();
        
        if (heroName.isEmpty()) {
            System.out.println("Hero name cannot be null");
        }
        else{
            // o heroi é criado se o nome passado não estiver vázio
            Hero newHero = new Hero(heroName);
            System.out.println("Hero was successfully created!");
            // apresentação do héroi
            System.out.println(newHero);
        }
    }
    
    // criação do inimigo
    private static void createEnemy(String enemyName){
        Enemy glob = new Enemy(enemyName);
        
        System.out.println("A foe has appeared in front of you!");
        System.out.println(glob);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciação da classe Scanner para poder receber
        // os inputs do usuário
        Scanner input = new Scanner(System.in);
        
        // chamada do método para criação do héroi
        createHero(input);
        
        // chamada do método para criação do inimigo
        createEnemy("Glob");
    }
}