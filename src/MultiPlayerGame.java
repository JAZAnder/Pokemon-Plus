import java.util.Scanner;

public class MultiPlayerGame extends Game{

    Scanner input = new Scanner(System.in);


    public MultiPlayerGame(String name, String name2) throws InterruptedException {
        playerOneName = name;
        playerTwoName = name2;

        Resources.pickYourPokemonPlayerOnePicture(playerOneName);
        pokemonOne = new Pokemon(input.next(),100);
        playerOneMoveList();

        Resources.pickYourPokemonPlayerTwoPicture(playerTwoName);
        pokemonTwo = new Pokemon(input.next(),100);
        playerTwoMoveList();
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
