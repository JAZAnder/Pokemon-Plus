import java.util.Scanner;

public class Game {
    Resources resources = new Resources();


    String playerOneName;
    int playerOneHealth;
    String playerTwoName;
    int playerTwoHealth;

    Game(String playerOneName,int playerOneHealth, String playerTwoName, int playerTwoHealth){
        this.playerOneName = playerOneName;
        this.playerOneHealth = playerOneHealth;
        this.playerTwoName = playerTwoName;
        this.playerTwoHealth = playerTwoHealth;
    }

    public void pickPlayerOnePokemon(String pokemonName) {
        if((pokemonName.toLowerCase()).charAt(0) == 'c'){
            System.out.println("Charmander");




        }
        else if((pokemonName.toLowerCase()).charAt(0) == 's'){
            System.out.println("Squirtle");




        }
        else if((pokemonName.toLowerCase()).charAt(0) == 'b'){
            System.out.println("Bulbasaur");





        }

    }
    public void pickPlayerTwoPokemon(String pokemonName) {
        if((pokemonName.toLowerCase()).charAt(0) == '?'){

        }
        else if((pokemonName.toLowerCase()).charAt(0) == '?'){

        }
        else if((pokemonName.toLowerCase()).charAt(0) == '?'){

        }
        else{

        }

    }







// Need Player Names, and Player Health


}
