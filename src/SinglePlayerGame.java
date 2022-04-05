import java.util.Scanner;

public class SinglePlayerGame extends Game{

    Scanner input = new Scanner(System.in);


    public SinglePlayerGame(String name, int playerHealth, int opponentHealth) throws InterruptedException {
        this.playerOneName = name;
        this.playerTwoName = "Opponent";

        Resources.pickYourPokemonPlayerOnePicture(playerOneName);
        pokemonOne = new Pokemon(input.next(),playerHealth,1);
        playerOneMoveList();
        Thread.sleep(5000);

        pokemonTwo = new Pokemon(opponentHealth);


    }


    public void beginTheGame() throws InterruptedException {


        Resources.introSpeech();
        Thread.sleep(1000);

        while(pokemonOne.getHealth()>0&&pokemonTwo.getHealth()>0){
            if (pokemonOne.getHealth()>0){
                battleScreen();
                playerOneMoveList();
                System.out.print(playerOneName+" pick Your Move : ");
                pokemonTwo.takeDamage(pokemonOne.attack(input.next()));
                Thread.sleep(1000);
            }
            if (pokemonTwo.getHealth() > 0) {
                //battleScreen();
                //playerTwoMoveList();

                pokemonOne.takeDamage(pokemonTwo.attack((int) (Math.random()*3)));
                Thread.sleep(5000);
            }






    }

    }
}
