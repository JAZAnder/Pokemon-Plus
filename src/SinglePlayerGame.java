import java.util.Scanner;
import java.lang.Math;

public class SinglePlayerGame {
    Resources resources = new Resources();
    Scanner input = new Scanner(System.in);

    String playerName;
    int playerHealth;
    int opponentHealth;
    boolean playerTurn = true;
    public SinglePlayerGame(String name, int playerHealth, int opponentHealth) {
        playerName = name;
        this.playerHealth = playerHealth;
        this.opponentHealth = opponentHealth;

    }


    public void beginTheGame() throws InterruptedException {
        Game letsPlay = new Game(playerName, playerHealth, "Billy", opponentHealth);

        resources.pickYourPokemonPlayerOnePicture(playerName);//Default Delay : 100
        letsPlay.pickPlayerOnePokemon(input.next());
        letsPlay.playerOneMoveList();

        //resources.pickYourPokemonPlayerTwoPicture(100);//Default Delay : 100
        letsPlay.pickPlayerTwoPokemon((int)(Math.random()*10)+1);

        Thread.sleep(1000);

        resources.introSpeech();
        while(!letsPlay.isGameOver()){
            System.out.println(letsPlay.getPlayerTwoPokemonPicture());
            System.out.println(letsPlay.getPlayerTwoHealthBar());
            System.out.println(letsPlay.getPlayerOnePokemonPicture());
            System.out.println(letsPlay.getPlayerOneHealthBar());






    }

    }
}
