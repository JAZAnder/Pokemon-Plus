import java.util.Scanner;

public class SinglePlayerGame extends Game{

    Scanner input = new Scanner(System.in);


    public SinglePlayerGame(String name, int playerHealth, int opponentHealth) throws InterruptedException {
        this.playerOneName = name;
        this.playerTwoName = "Opponent";

        Resources.pickYourPokemonPlayerOnePicture(playerOneName);
        pokemonOne = new Pokemon(input.next(),playerHealth);
        playerOneMoveList();

        pokemonTwo = new Pokemon(opponentHealth);


    }


    public void beginTheGame() throws InterruptedException {


        Resources.introSpeech();

        while(isGameOver()){
            System.out.println(pokemonTwo.getPicture());
            System.out.println(getPlayerTwoHealthBar());
            System.out.println(pokemonOne.getPicture());
            System.out.println(getPlayerOneHealthBar());






    }

    }
}
