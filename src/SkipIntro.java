public class SkipIntro {
    public static void main(String[] args) {
        Game.playerOneName = "PlayerOne";
        Game.playerTwoName = "PlayerTwoGame";

        args = new String[2];

        //Multiplayer
        args[0] = "no"; // yes or no

        //Difficulty
        args[1] = "Hard"; // Easy Med Hard

        //Player One Pokemon
        //args[2] = "Charmander"; // Charmander Squirtle Bulbasaur

        //Player Two Pokemon
        //args[3] = "";

        try {
            Main.main(args);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
