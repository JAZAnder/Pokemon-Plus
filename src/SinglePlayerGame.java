import java.util.Scanner;
import java.lang.Math;

public class SinglePlayerGame extends Game{
    Resources resources = new Resources();
    Scanner input = new Scanner(System.in);


    boolean playerTurn = true;
    public SinglePlayerGame(String name, int playerHealth, int opponentHealth) throws InterruptedException {
        super();
        this.playerOneName = name;
        resources.pickYourPokemonPlayerOnePicture(playerOneName);

        Pokemon pokemonOne = new Pokemon(input.next(),playerHealth);

        this.playerHealth = playerHealth;
        this.opponentHealth = opponentHealth;

    }


    public void beginTheGame() throws InterruptedException {
        Game letsPlay = new Game(playerOneName, playerHealth, "Billy", opponentHealth);

        //resources.pickYourPokemonPlayerOnePicture(playerOneName);//Default Delay : 100
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
