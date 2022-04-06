public class MultiPlayerGame extends Game{
//Variables


//Constructors
    public MultiPlayerGame(String name, String name2) throws InterruptedException {
        playerOneName = name;
        playerTwoName = name2;

        Resources.pickYourPokemonPlayerOnePicture(playerOneName);
        pokemonOne = new Pokemon(input.next(),100,1);
        rightMoveList(pokemonOne);
        Thread.sleep(5000);

        Resources.pickYourPokemonPlayerTwoPicture(playerTwoName);
        pokemonTwo = new Pokemon(input.next(),100,2);
        leftMoveList(pokemonTwo);
        Thread.sleep(5000);
    }

//Methods
    public void beginTheGame() throws InterruptedException {


        Resources.introSpeech();

        while (pokemonOne.getHealth() > 0 && pokemonTwo.getHealth() > 0) {
            if (pokemonOne.getHealth() > 0) {
                battleScreen();
                moveList(pokemonOne);
                System.out.print(playerOneName+" pick Your Move : ");
                currentAttack = input.next();
                System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------");
                pokemonTwo.takeDamage(pokemonOne.attack(currentAttack));
                Thread.sleep(5000);
            }
            if (pokemonTwo.getHealth() > 0) {
                battleScreen();
                moveList(pokemonTwo);
                System.out.print(playerTwoName+" pick Your Move : ");
                currentAttack = input.next();
                System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------");
                pokemonOne.takeDamage(pokemonTwo.attack(currentAttack));
                Thread.sleep(5000);
            }
        }
    }

//Getters and Setters
}
