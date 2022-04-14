public class SinglePlayerGame extends Game{
//Variables


//Constructors
    public SinglePlayerGame( int playerHealth, int opponentHealth) throws InterruptedException {

        Resources.pickYourPokemonPlayerOnePicture(playerOneName);
        pokemonOne = new Pokemon(input.next(),playerHealth,1);
        rightMoveList(pokemonOne);
        Thread.sleep(5000);

        pokemonTwo = new Pokemon(opponentHealth);


    }

//Methods
    public void beginTheGame() throws InterruptedException {


        Resources.introSpeech();
        Thread.sleep(1000);

        while(pokemonOne.getHealth()>0&&pokemonTwo.getHealth()>0){
            if (pokemonOne.getHealth()>0){
                battleScreen();
                moveList(pokemonOne);
                System.out.print(playerOneName+" pick Your Move : ");
                currentAttack = input.next();
                System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------");
                pokemonTwo.takeDamage(pokemonOne.attack(currentAttack));
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

//Setters and Getters
}
