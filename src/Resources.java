import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static org.fusesource.jansi.Ansi.Color.*;
import static org.fusesource.jansi.Ansi.ansi;


public class Resources {
    private Resources(){

    }


    public static void chooseDifficulty() throws InterruptedException{
        chooseDifficulty(500);
    }

    public static void chooseDifficulty(int timeDelay) throws InterruptedException {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Assets/Transitions/Difficulty.txt"));

            String content = reader.readLine();
            int i=0;

            while (content != null){
                //Color Changing
                if (i == 0){
                    System.out.print(ansi().fgRgb(204,0,0));
                }
                else if(i ==9){
                    System.out.print(ansi().fgRgb(246,14,238));
                }
                else if (i == 19){
                    System.out.print(ansi().fgRgb(18,122,35));
                }
                else if (i == 25){
                    System.out.print(ansi().fgRgb(225,0,0));
                }

                System.out.println(content);
                Thread.sleep(timeDelay);
                content = reader.readLine();
                i++;

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(ansi().reset());



        /*
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        Thread.sleep(timeDelay);
        System.out.println("                    ______ _      _     __   __                ______ _  __  __ _            _   _ _         ");
        Thread.sleep(timeDelay);
        System.out.println("                    | ___ (_)    | |    \\ \\ / /                |  _  (_)/ _|/ _(_)          | | | | |        ");
        Thread.sleep(timeDelay);
        System.out.println("                    | |_/ /_  ___| | __  \\ V /___  _   _ _ __  | | | |_| |_| |_ _ _   _  ___| |_| | |_ _   _ ");
        Thread.sleep(timeDelay);
        System.out.println("                    |  __/| |/ __| |/ /   \\ // _ \\| | | | '__| | | | | |  _|  _| | | | |/ __| __| | __| | | |");
        Thread.sleep(timeDelay);
        System.out.println("                    | |   | | (__|   <    | | (_) | |_| | |    | |/ /| | | | | | | |_| | (__| |_| | |_| |_| |");
        Thread.sleep(timeDelay);
        System.out.println("                    \\_|   |_|\\___|_|\\_\\   \\_/\\___/ \\__,_|_|    |___/ |_|_| |_| |_|\\__,_|\\___|\\__|_|\\__|\\__, |");
        Thread.sleep(timeDelay);
        System.out.println("                                                                                                        __/ |");
        Thread.sleep(timeDelay);
        System.out.println("                                                                                                       |___/");
        Thread.sleep(timeDelay);
        System.out.println();
        Thread.sleep(timeDelay);
        System.out.println("                                            .-''-.     ____       .-'''-.    ____     __  ");
        Thread.sleep(timeDelay);
        System.out.println("                                          .'_ _   \\  .'  __ `.   / _     \\   \\   \\   /  / ");
        Thread.sleep(timeDelay);
        System.out.println("                                         / ( ` )   '/   '  \\  \\ (`' )/`--'    \\  _. /  '  ");
        Thread.sleep(timeDelay);
        System.out.println("                                        . (_ o _)  ||___|  /  |(_ o _).        _( )_ .'   ");
        Thread.sleep(timeDelay);
        System.out.println("                                        |  (_,_)___|   _.-`   | (_,_). '.  ___(_ o _)' ");
        Thread.sleep(timeDelay);
        System.out.println("                                        '  \\   .---..'   _    |.---.  \\  :|   |(_,_)'  ");
        Thread.sleep(timeDelay);
        System.out.println("                                         \\  `-'    /|  _( )_  |\\    `-'  ||   `-'  /      ");
        Thread.sleep(timeDelay);
        System.out.println("                                          \\       / \\ (_ o _) / \\       /  \\      /    ");
        Thread.sleep(timeDelay);
        System.out.println("                                           `'-..-'   '.(_,_).'   `-...-'    `-..-'        ");
        Thread.sleep(timeDelay);
        System.out.println("                                    ____    ____              __   _                                            ");
        Thread.sleep(timeDelay);
        System.out.println("                                   |_   \\  /   _|            |  ] (_)                                           ");
        Thread.sleep(timeDelay);
        System.out.println("                                     |   \\/   |  .---.   .--.| |  __  __   _   _ .--..--.                       ");
        Thread.sleep(timeDelay);
        System.out.println("                                     | |\\  /| | / /__\\\\/ /'`\\' | [  |[  | | | [ `.-. .-. |                      ");
        Thread.sleep(timeDelay);
        System.out.println("                                    _| |_\\/_| |_| \\__.,| \\__/  |  | | | \\_/ |, | | | | | |                      ");
        Thread.sleep(timeDelay);
        System.out.println("                                   |_____||_____|'.__.' '.__.;__][___]'.__.'_/[___||__||__]                    ");
        Thread.sleep(timeDelay);
        System.out.println("                                                 _   _               _                     ");
        Thread.sleep(timeDelay);
        System.out.println("                                                | | | |             | |                    ");
        Thread.sleep(timeDelay);
        System.out.println("                                                | |_| | __ _ _ __ __| |                    ");
        Thread.sleep(timeDelay);
        System.out.println("                                                |  _  |/ _` | '__/ _` |                    ");
        Thread.sleep(timeDelay);
        System.out.println("                                                | | | | (_| | | | (_| |                    ");
        Thread.sleep(timeDelay);
        System.out.println("                                                \\_| |_/\\__,_|_|  \\__,_|                    ");
        Thread.sleep(timeDelay);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

         */

    }



    public static void intro() throws InterruptedException{
        intro(750);
    }

    public static void intro(int timeDelay) throws InterruptedException{
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Assets/Transitions/PokemonIntro.txt"));

            String content = reader.readLine();
            int i=0;

            while (content != null){
                //Color Changing
                if (i == 0){
                    System.out.print(ansi().fgRgb(225,225,0));
                }
                else if(i == 4){
                    System.out.print(ansi().fgRgb(255,255,255));
                }
                else if (i == 8){
                    System.out.print(ansi().fgRgb(255,17,0));
                }

                System.out.println(content);
                Thread.sleep(timeDelay);
                content = reader.readLine();
                i++;

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println(ansi().reset());
        
    }



    public static void pickYourPokemonPlayerOnePicture(String playerName) throws InterruptedException{
        pickYourPokemonPlayerOnePicture(playerName,100);
    }

    public static void pickYourPokemonPlayerOnePicture(String playerName, int timeDelay) throws InterruptedException{
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Assets/Transitions/PlayerOneAllPokemon.txt"));

            String content = reader.readLine();

            while (content != null){
                System.out.println(content);
                Thread.sleep(timeDelay);
                content = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("                              "+playerName+" Choose Your Pokemon :   ");

    }



    public static void pickYourPokemonPlayerTwoPicture(String playerName) throws InterruptedException{
        pickYourPokemonPlayerTwoPicture(playerName,100);
    }

    public static void pickYourPokemonPlayerTwoPicture(String playerName, int timeDelay) throws InterruptedException{

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Assets/Transitions/PlayerTwoAllPokemon.txt"));

            String content = reader.readLine();

            while (content != null){
                System.out.println(content);
                Thread.sleep(timeDelay);
                content = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.print("                              "+playerName+" Choose Your Pokemon :   ");
    }



    public static void introSpeech() throws InterruptedException {
        introSpeech(100);
    }

    public static void introSpeech(int delay) throws InterruptedException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Assets/Transitions/IntroductionSpeech.txt"));
            String content = reader.readLine();
            System.out.println("\n");

            while (content != null){
                System.out.println(content);
                content = reader.readLine();
                Thread.sleep(delay);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public static String getPicture(String name, String side) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Assets/Pokemon/"+name+"_"+side+".txt"));
            String content = reader.readLine();
            String output = "";
            System.out.println("\n");


            while (content != null){
                output = output + "\n" +content;
                content = reader.readLine();
            }
            reader.close();
            return output;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }


    public static void healthBar(int health) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Assets/HealthBars.txt"));

            String content = reader.readLine();

            if (health >= 80) {
                System.out.print(ansi().fg(GREEN));
                while (!content.equals("80")) {
                    //System.out.println(content);
                    content = reader.readLine();
                }
                content = reader.readLine();

                while (!content.equals("80")) {
                    System.out.println(content);
                    content = reader.readLine();
                }
            } else if (health >= 60) {
                System.out.print(ansi().fg(GREEN));
                while (!content.equals("60")) {
                    //System.out.println(content);
                    content = reader.readLine();
                }
                content = reader.readLine();

                while (!content.equals("60")) {
                    System.out.println(content);
                    content = reader.readLine();
                }
            } else if (health >= 40) {
                System.out.print(ansi().fg(YELLOW));
                while (!content.equals("40")) {
                    //System.out.println(content);
                    content = reader.readLine();
                }
                content = reader.readLine();

                while (!content.equals("40")) {
                    System.out.println(content);
                    content = reader.readLine();
                }
            } else if (health >= 20) {
                System.out.print(ansi().fg(YELLOW));
                while (!content.equals("20")) {
                    //System.out.println(content);
                    content = reader.readLine();
                }
                content = reader.readLine();

                while (!content.equals("20")) {
                    System.out.println(content);
                    content = reader.readLine();
                }

            } else {
                System.out.print(ansi().fg(RED));
                while (!content.equals("0")) {
                    //System.out.println(content);
                    content = reader.readLine();
                }
                content = reader.readLine();

                while (!content.equals("0")) {
                    System.out.println(content);
                    content = reader.readLine();
                }
            }
            System.out.print(ansi().reset()); 
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
