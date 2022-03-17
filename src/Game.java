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



            System.out.println (resources.charmanderPicture());
        }
        else if((pokemonName.toLowerCase()).charAt(0) == 's'){




            System.out.println (resources.squirtlePicture());
        }
        else if((pokemonName.toLowerCase()).charAt(0) == 'b'){





            System.out.println (resources.bulbasaurPicture());
        }
        else{
            pickPlayerOnePokemon("Charmander");
        }

    }
    public String pickPlayerTwoPokemon(String pokemonName) {
        if((pokemonName.toLowerCase()).charAt(0) == 'w'){



            System.out.println("Wigglypuff");
        }
        else if((pokemonName.toLowerCase()).charAt(0) == 'n'){




            System.out.println("Nidoqueen");

        }
        else if((pokemonName.toLowerCase()).charAt(0) == 'f'){



            System.out.println("Fearow");

        }
        else{
            return pickPlayerTwoPokemon("Wigglypuff");
        }

        return pokemonName;
    }
    public void pickPlayerTwoPokemon(int computerInput){
        if(computerInput == 1){
            System.out.println("Wigglypuff");
        }
        else if(computerInput == 2){
            System.out.println("Nidoqueen");
        }
        else{
            System.out.println("Fearow");
        }
    }







// Need Player Names, and Player Health


}
