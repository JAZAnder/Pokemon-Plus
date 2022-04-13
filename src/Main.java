
import java.util.Scanner;
import static org.fusesource.jansi.Ansi.Color.*;
import static org.fusesource.jansi.Ansi.ansi;
import org.fusesource.jansi.AnsiConsole;

public class Main {

    static String playerOneName;
    static String playerTwoName;

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        AnsiConsole.systemInstall();

        //ansi().fg(RED).a(""));
        Resources.intro(); //Leave Blank for 750





        if(playerOneName == null){
            System.out.print("Enter your Name : ");
            playerOneName = input.next();
        }

        System.out.print("Multiplayer (yes or no)? : ");



        if((input.next()).equalsIgnoreCase("yes")){

            if(playerTwoName == null){
                System.out.print("Enter Player 2 Name : ");
                playerTwoName = input.next();
            }

            MultiPlayerGame MPG = new MultiPlayerGame(playerOneName, playerTwoName);
            MPG.beginTheGame();

        }
        else {
            //System.out.println("Single");

            Resources.chooseDifficulty(100); //Leave Blank for 500
            System.out.print("Pick your Difficulty (Default is Medium) : ");
            String difficulty = input.next();
            SinglePlayerGame SPG;
            if((difficulty.toLowerCase()).charAt(0) == 'e'){
                SPG = new SinglePlayerGame(playerOneName, 120, 100);
            }
            else if((difficulty.toLowerCase()).charAt(0) == 'h'){
                SPG = new SinglePlayerGame(playerOneName, 100, 120);
            }
            else{
                SPG = new SinglePlayerGame(playerOneName, 100, 100);
            }

            SPG.beginTheGame();


        }

        System.out.println("Play Again ? ");
        if(input.next().equalsIgnoreCase("yes")){
            main(args);
        }
        else{

        }
        
        input.close();
    }
}