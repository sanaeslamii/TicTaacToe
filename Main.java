// package Play;
import java.util.*;
import Play.Dooz;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Game!!!");

        Dooz game1 = new Dooz();
        int row,column;
        
        while(true)
        {
            game1.screen();
            System.out.println("it's " + game1.turnplayer + " turn!. Choose a row and column between (0-2): ");
            row = input.nextInt();
            column = input.nextInt();

            if(game1.movement(row,column) == true)
            {
                if(game1.checkwinner())
                {
                    game1.screen();
                    System.out.println("Player " + game1.turnplayer + " wins!");
                    break;
                }
                else if(game1.fullborad())
                {
                    game1.screen();
                    System.out.println("it's tie!");
                    break;
                }
                else
                {
                    game1.changeplayer();
                }
            }
            else
            {
                System.out.println("Invalid move!!!");
            }
        }
        input.close();
    }
}
