public class Game {


//Variables
    String playerOneName;
    String playerTwoName;
    Pokemon pokemonOne;
    Pokemon pokemonTwo;



//Constructors
    protected Game() {

    }

//Methods

    protected boolean isGameOver(){
        return pokemonOne.getHealth()<=0||pokemonTwo.getHealth()<=0;
    }
    protected void playerOneMoveList(){
        System.out.println(("- - - - - - - - - - - - - - - - - - - - -".indent(107)));
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tFirst Move is "+ pokemonOne.getMove1() + " \t\t(Guaranteed to Hit)");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSecond Move is "+ pokemonOne.getMove2() + " \t\t(80% Chance to Hit)");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tThird Move is "+ pokemonOne.getMove3() + " \t\t(60% Chance to Hit) ");


    }
    protected void playerTwoMoveList(){
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        System.out.println("First Move is "+ pokemonTwo.getMove1() + " \t\t(Guaranteed to Hit)");
        System.out.println("Second Move is "+ pokemonTwo.getMove2() + " \t\t(80% Chance to Hit)");
        System.out.println("Third Move is "+ pokemonTwo.getMove3() + " \t\t(60% Chance to Hit)");
    }
    protected void battleScreen() throws InterruptedException {
        System.out.println(pokemonTwo.getPicture());
        System.out.println(getHealthBar(pokemonTwo.getHealth()));
        Thread.sleep(1000);
        System.out.println(pokemonOne.getPicture());
        System.out.println(getHealthBar(pokemonOne.getHealth()));
    }




//Getters and Setters


    public String getHealthBar(int health) {
        if(health>=100){

        }
        else if(health>=80){

        }
        else if(health>=60){

        }
        else if(health>=40){

        }
        else if(health>=20){

        }
        else if(health>=0){

        }
            return " ";
    }




// Need Player Names, and Player Health


}
