
import java.util.Scanner;
import static org.fusesource.jansi.Ansi.Color.*;
import static org.fusesource.jansi.Ansi.ansi;
import org.fusesource.jansi.AnsiConsole;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        AnsiConsole.systemInstall();

        //ansi().fg(RED).a(""));
        Resources.intro(); //Leave Blank for 750





        if(Game.playerOneName == null){
            System.out.print("Enter your Name : ");
            Game.playerOneName = input.next();
        }

        if(args[0].equals(null)){
            System.out.print("Multiplayer (yes or no)? : ");
            args[0] = input.next();
        }





        if(args[0].equalsIgnoreCase("yes")){

            if(Game.playerTwoName == null||Game.playerTwoName.equals("Opponent")){
                System.out.print("Enter Player 2 Name : ");
                Game.playerTwoName = input.next();
            }

            MultiPlayerGame MPG = new MultiPlayerGame();
            MPG.beginTheGame();

        }
        else {
            //System.out.println("Single");

            Game.playerTwoName = "Opponent";

            String difficulty;
            if(args[1].equals(null)){
                Resources.chooseDifficulty(100); //Leave Blank for 500
                System.out.print("Pick your Difficulty (Default is Medium) : ");
                difficulty = input.next();
            }
            else{
                difficulty = args[1];
            }

            SinglePlayerGame SPG;
            if((difficulty.toLowerCase()).charAt(0) == 'e'){
                SPG = new SinglePlayerGame(120, 100);
            }
            else if((difficulty.toLowerCase()).charAt(0) == 'h'){
                SPG = new SinglePlayerGame( 100, 120);
            }
            else{
                SPG = new SinglePlayerGame( 100, 100);
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