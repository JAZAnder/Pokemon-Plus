import java.util.Scanner;

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

        resources.pickYourPokemonPlayerOnePicture(100);//100
        letsPlay.pickPlayerOnePokemon(input.next());

        resources.pickYourPokemonPlayerTwoPicture(100);//100
        letsPlay.pickPlayerTwoPokemon(input.next());

        //Pick your Pokemon




        //Random Enemy for Opponent

        //Pick your Move

    }
}
