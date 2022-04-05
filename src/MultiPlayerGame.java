import java.util.Scanner;

public class MultiPlayerGame extends Game{

    Scanner input = new Scanner(System.in);


    public MultiPlayerGame(String name, String name2) throws InterruptedException {
        playerOneName = name;
        playerTwoName = name2;

        Resources.pickYourPokemonPlayerOnePicture(playerOneName);
        pokemonOne = new Pokemon(input.next(),100,1);
        this.playerOneMoveList();
        Thread.sleep(5000);

        Resources.pickYourPokemonPlayerTwoPicture(playerTwoName);
        pokemonTwo = new Pokemon(input.next(),100,2);
        playerTwoMoveList();
        Thread.sleep(5000);
    }


    public void beginTheGame() throws InterruptedException {


        Resources.introSpeech();

        while (pokemonOne.getHealth() > 0 && pokemonTwo.getHealth() > 0) {
            if (pokemonOne.getHealth() > 0) {
                battleScreen();
                playerOneMoveList();
                System.out.print(playerOneName+" pick Your Move : ");
                pokemonTwo.takeDamage(pokemonOne.attack(input.next()));
                Thread.sleep(5000);
            }
            if (pokemonTwo.getHealth() > 0) {
                battleScreen();
                playerTwoMoveList();
                System.out.print(playerTwoName+" pick Your Move : ");
                pokemonOne.takeDamage(pokemonTwo.attack(input.next()));
                Thread.sleep(5000);
            }
        }
    }
}
