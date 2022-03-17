import java.util.Scanner;
import java.lang.Math;

public class SinglePlayerGame {
    Resources resources = new Resources();
    Scanner input = new Scanner(System.in);

    String playerName;
    int playerHealth;
    int opponentHealth;
    public SinglePlayerGame(String name, int playerHealth, int opponentHealth) {
        playerName = name;
        this.playerHealth = playerHealth;
        this.opponentHealth = opponentHealth;

    }


    public void beginTheGame() throws InterruptedException {
        Game letsPlay = new Game(playerName, playerHealth, "Billy", opponentHealth);

        resources.pickYourPokemonPlayerOnePicture(playerName,100);//Default Delay : 100
        letsPlay.pickPlayerOnePokemon(input.next());

        //resources.pickYourPokemonPlayerTwoPicture(100);//Default Delay : 100
        letsPlay.pickPlayerTwoPokemon((int)(Math.random()*10)+1);



        //Pick your Pokemon




        //Random Enemy for Opponent

        //Pick your Move

    }
}
