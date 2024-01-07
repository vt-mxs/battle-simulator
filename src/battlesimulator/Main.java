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
    public static void createHero(Scanner input){
        String heroName;
        // recebendo o nome
        System.out.print("Hero name => ");
        heroName = input.nextLine();
        // criação do héroi
        Hero newHero = new Hero(heroName);
        System.out.println("Hero was successfully created!");
        // apresentação do héroi
        System.out.println(newHero);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciação da classe Scanner para poder receber
        // os inputs do usuário
        Scanner input = new Scanner(System.in);
        
        // chamada do método para criação do personagem
        createHero(input);
        
        // criação do inimigo
        Enemy glob = new Enemy("Glob");
        
        System.out.println("A foe has appeared in front of you!");
        System.out.println(glob);
        
        System.out.print(
            """
            What do you do?
            1 - Atack
            2 - Run
            => """
        );
    }
}
