public class Game {
    Resources resources = new Resources();


    String playerOneName;
    int playerOneHealth;
    String playerTwoName;
    int playerTwoHealth;
    private String playerOneMove1;
    private String playerOneMove2;
    private String playerOneMove3;
    private String playerTwoMove1;
    private String playerTwoMove2;
    private String playerTwoMove3;

    Game(String playerOneName,int playerOneHealth, String playerTwoName, int playerTwoHealth){
        this.playerOneName = playerOneName;
        this.playerOneHealth = playerOneHealth;
        this.playerTwoName = playerTwoName;
        this.playerTwoHealth = playerTwoHealth;
    }

    public void pickPlayerOnePokemon(String pokemonName) {
        if((pokemonName.toLowerCase()).charAt(0) == 'c'){
            System.out.println (resources.charmanderPicture());

            playerOneMove1 = "Ember";
            playerOneMove2 = "Growl";
            playerOneMove3 = "Scratch";

        }
        else if((pokemonName.toLowerCase()).charAt(0) == 's'){
            System.out.println (resources.squirtlePicture());

            playerOneMove1 = "Bubble";
            playerOneMove2 = "Water Gun";
            playerOneMove3 = "Tackle";

        }
        else if((pokemonName.toLowerCase()).charAt(0) == 'b'){
            System.out.println (resources.bulbasaurPicture());

            playerOneMove1 = "Vine Whip";
            playerOneMove2 = "Growth";
            playerOneMove3 = "Leech Seed";

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

            playerTwoMove1 = "Charm";
            playerTwoMove2 = "Gyro Ball";
            playerTwoMove3 = "Play Rough";

        }
        else if((pokemonName.toLowerCase()).charAt(0) == 'n'){
            if(printPicture){
                System.out.println(resources.nidoqueenPicture());
            }

            playerTwoMove1 = "Swift";
            playerTwoMove2 = "Sizzly Slide";
            playerTwoMove3 = "Shadow Ball";

        }
        else if((pokemonName.toLowerCase()).charAt(0) == 'f'){
            if(printPicture){
                System.out.println(resources.fearowPicture());
            }

            playerTwoMove1 = "Drill Run";
            playerTwoMove2 = "Peck";
            playerTwoMove3 = "Sky Attack";

        }
        else{
            pickPlayerTwoPokemon("Wigglypuff");
        }

    }

    private boolean isGameOver(){
        return playerOneHealth<=0&&playerTwoHealth<=0;
    }

    public void playerOneMoveList(){
        System.out.println(("- - - - - - - - - - - - - - - - - - - - ".indent(107)));
        System.out.println("First Move is "+ playerOneMove1 + " (Guaranteed to Hit)");
        System.out.println("First Move is "+ playerOneMove2 + " (80% Chance to Hit)");
        System.out.println("\t\t\t\t\tFirst Move is "+ playerOneMove3 + " (60% Chance to Hit) ");
        System.out.println("a\t\tabc");
        System.out.println("abc\t\tb");

    }
    public void playerTwoMoveList(){
        System.out.println("- - - - - - - - - - - - - - - - ");
        System.out.println("First Move is "+ playerTwoMove1 + " (Guaranteed to Hit)");
        System.out.println("First Move is "+ playerTwoMove2 + " (80% Chance to Hit)");
        System.out.println("First Move is "+ playerTwoMove3 + " (60% Chance to Hit)");
    }

//Getters and Setters
    public String getPlayerOneMove1() {
    return playerOneMove1;
}
    public String getPlayerOneMove2() {
        return playerOneMove2;
    }
    public String getPlayerOneMove3() {
        return playerOneMove3;
    }
    public String getPlayerTwoMove1() {
        return playerTwoMove1;
    }
    public String getPlayerTwoMove2() {
        return playerTwoMove2;
    }
    public String getPlayerTwoMove3() {
        return playerTwoMove3;
    }






// Need Player Names, and Player Health


}
