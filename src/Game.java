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

    public void pickPlayerTwoPokemon(String pokemonName) {

        pickPlayerTwoPokemon(pokemonName, true);

    }

    public void pickPlayerTwoPokemon(int computerInput){
        if(computerInput == 1){
            pickPlayerTwoPokemon("Wigglypuff", false);
        }
        else if(computerInput == 2){
            pickPlayerTwoPokemon("Nidoqueen", false);
        }
        else{
            pickPlayerTwoPokemon("Fearow", false);
        }
    }

    public void pickPlayerTwoPokemon(String pokemonName, Boolean printPicture) {
        if((pokemonName.toLowerCase()).charAt(0) == 'w'){
            if(printPicture){
                System.out.println(resources.wigglypuffPicture());
            }



        }
        else if((pokemonName.toLowerCase()).charAt(0) == 'n'){
            if(printPicture){
                System.out.println(resources.nidoqueenPicture());
            }





        }
        else if((pokemonName.toLowerCase()).charAt(0) == 'f'){
            if(printPicture){
                System.out.println(resources.fearowPicture());
            }




        }
        else{
            pickPlayerTwoPokemon("Wigglypuff");
        }

    }








// Need Player Names, and Player Health


}
