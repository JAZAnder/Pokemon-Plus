public class Game {



    String playerOneName;
    int playerOneHealth;
    String playerTwoName;
    int playerTwoHealth;
    Pokemon pokemonOne;
    Pokemon pokemonTwo;

    protected Game() {

    }



    public boolean isGameOver(){
        return playerOneHealth<=0||playerTwoHealth<=0;
    }

    public void playerOneMoveList(){
        System.out.println(("- - - - - - - - - - - - - - - - - - - - -".indent(107)));
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tFirst Move is "+ pokemonOne.getMove1() + " \t\t(Guaranteed to Hit)");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSecond Move is "+ pokemonOne.getMove2() + " \t\t(80% Chance to Hit)");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tThird Move is "+ pokemonOne.getMove3() + " \t\t(60% Chance to Hit) ");


    }
    public void playerTwoMoveList(){
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        System.out.println("First Move is "+ pokemonTwo.getMove1() + " \t\t(Guaranteed to Hit)");
        System.out.println("Second Move is "+ pokemonTwo.getMove2() + " \t\t(80% Chance to Hit)");
        System.out.println("Third Move is "+ pokemonTwo.getMove3() + " \t\t(60% Chance to Hit)");
    }



//Getters and Setters


    public String getPlayerTwoHealthBar() {
        return "BOB";
    }

    public String getPlayerOneHealthBar() {
        return "BOB";
    }




// Need Player Names, and Player Health


}
