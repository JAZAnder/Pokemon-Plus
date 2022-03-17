import java.util.Scanner;

public class MultiPlayerGame {
    Resources resources = new Resources();
    Scanner input = new Scanner(System.in);

    String playerOne;
    String playerTwo;
    int playerOneHealth = 100;
    int playerTwoHealth = 100;

    public MultiPlayerGame(String name, String name2) {
        playerOne = name.toString();
        playerTwo = name2.toString();
    }

    public void beginTheGame() throws InterruptedException {

        Game letsPlay = new Game(playerOne, playerOneHealth, playerTwo, playerTwoHealth);

        resources.pickYourPokemonPlayerOnePicture(100);//Leave Blank for 100
        letsPlay.pickPlayerOnePokemon(input.next());

        Thread.sleep(1000);

        resources.pickYourPokemonPlayerTwoPicture(100);//Leave Blank for 100
        letsPlay.pickPlayerTwoPokemon(input.next());
    }
}
