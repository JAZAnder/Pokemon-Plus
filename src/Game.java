import java.util.Scanner;

public class Game {


//Variables
    String playerOneName;
    String playerTwoName;
    Pokemon pokemonOne;
    Pokemon pokemonTwo;
    String currentAttack;
    Scanner input = new Scanner(System.in);



//Constructors
    protected Game() {

    }

//Methods


    protected void rightMoveList(Pokemon pokemon){
        System.out.println(("- - - - - - - - - - - - - - - - - - - - -".indent(107)));
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tFirst Move is "+ pokemon.getMove1() + " \t\t(Guaranteed to Hit)");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSecond Move is "+ pokemon.getMove2() + " \t\t(80% Chance to Hit)");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tThird Move is "+ pokemon.getMove3() + " \t\t(60% Chance to Hit) ");


    }
    protected void moveList(Pokemon pokemon){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tFirst Move is "+ pokemon.getMove1() + " (10HP) \t\t(Guaranteed to Hit)");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tSecond Move is "+ pokemon.getMove2() + " (15HP) \t\t(80% Chance to Hit)");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tThird Move is "+ pokemon.getMove3() + " (20HP) \t\t(60% Chance to Hit) ");


    }
    protected void leftMoveList(Pokemon pokemon){
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        System.out.println("First Move is "+ pokemon.getMove1() + " \t\t(Guaranteed to Hit)");
        System.out.println("Second Move is "+ pokemon.getMove2() + " \t\t(80% Chance to Hit)");
        System.out.println("Third Move is "+ pokemon.getMove3() + " \t\t(60% Chance to Hit)");
    }
    protected void battleScreen() throws InterruptedException {
        System.out.println(pokemonTwo.getPicture());
        Thread.sleep(1000);
        System.out.println(pokemonOne.getPicture());
        Thread.sleep(1000);

        System.out.println(playerOneName+" : "+pokemonOne.getName());
        printHealthBar(pokemonOne.getHealth());
        System.out.println("\t\t\t\t\t\t\t\t"+pokemonOne.getHealth()+"HP\n");

        System.out.println(playerTwoName+" : "+pokemonTwo.getName());
        printHealthBar(pokemonTwo.getHealth());
        System.out.println("\t\t\t\t\t\t\t\t"+pokemonTwo.getHealth()+"HP");
    }




//Getters and Setters


    public void printHealthBar(int health) {
    Resources.healthBar(health);
    }



}
