import java.util.Scanner;

/**
 * Created by aamerine on 6/3/17.
 */
public class DiceThrower {
    public static void main(String args[]){
        Dice d = new Dice();

        Scanner scanner = new Scanner(System.in);
        System.out.print("What dice would you like to roll? (ex: 5d6)");
        String diceString = scanner.next();
        d.addDice(diceString);
        System.out.println("You rolled a total of: " + d.throwDice());
    }
}
