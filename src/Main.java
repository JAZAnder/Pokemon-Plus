import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);


        Resources.intro(); //Leave Blank for 750
        System.out.print("Enter your Name : ");
        String name = input.next();
        System.out.print("Multiplayer (yes or no)? : ");



        if((input.next()).equalsIgnoreCase("yes")){
            System.out.print("Enter Player 2 Name : ");
            String name2 = input.next();

            MultiPlayerGame MPG = new MultiPlayerGame(name, name2);
            MPG.beginTheGame();

        }
        else {
            //System.out.println("Single");

            Resources.chooseDifficulty(100); //Leave Blank for 500
            System.out.print("Pick your Difficulty (Default is Medium) : ");
            String difficulty = input.next();
            SinglePlayerGame SPG;
            if((difficulty.toLowerCase()).charAt(0) == 'e'){
                SPG = new SinglePlayerGame(name, 120, 100);
            }
            else if((difficulty.toLowerCase()).charAt(0) == 'h'){
                SPG = new SinglePlayerGame(name, 100, 120);
            }
            else{
                SPG = new SinglePlayerGame(name, 100, 100);
            }

            SPG.beginTheGame();




        }

    }
}