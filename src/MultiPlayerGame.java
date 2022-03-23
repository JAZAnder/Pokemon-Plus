import java.util.Scanner;

public class MultiPlayerGame {
    Resources resources = new Resources();
    Scanner input = new Scanner(System.in);

    String playerOne;
    String playerTwo;
    int playerOneHealth = 100;
    int playerTwoHealth = 100;

    public MultiPlayerGame(String name, String name2) {
        playerOne = name;
        playerTwo = name2;
    }

    public void beginTheGame() throws InterruptedException {

        Game letsPlay = new Game(playerOne, playerOneHealth, playerTwo, playerTwoHealth);

        resources.pickYourPokemonPlayerOnePicture(playerOne);//Leave Blank for 100
        letsPlay.pickPlayerOnePokemon(input.next());
        letsPlay.playerOneMoveList();

        Thread.sleep(1000);

        resources.pickYourPokemonPlayerTwoPicture(playerTwo);//Leave Blank for 100
        letsPlay.pickPlayerTwoPokemon(input.next());
        letsPlay.playerTwoMoveList();
    }
}
