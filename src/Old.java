
import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;


//Joshua A. Cantu W0701691 Assignment 2


public class Old {
    public static void main ( String [] args) throws InterruptedException{
        Scanner input = new Scanner (System.in);

        //And the game begings
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        Thread.sleep(750);
        System.out.println("                  ,'\\ ");
        Thread.sleep(750);
        System.out.println("                  _.----.        ____         ,'  _\\   ___    ___     ____");
        Thread.sleep(750);
        System.out.println("              _,-'       `.     |    |  /`.   \\,-\'    |   \\  /   |   |    \\  |`.");
        Thread.sleep(750);
        System.out.println("              \\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |");
        Thread.sleep(750);
        System.out.println("               \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |");
        Thread.sleep(750);
        System.out.println("                 \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |");
        Thread.sleep(750);
        System.out.println("                  \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |");
        Thread.sleep(750);
        System.out.println("                   \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |");
        Thread.sleep(750);
        System.out.println("                    \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |");
        Thread.sleep(750);
        System.out.println("                     \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |");
        Thread.sleep(750);
        System.out.println("                      \\_.-'       |__|    `-._ |              '-.|     '-.| |   |");
        Thread.sleep(750);
        System.out.println("                                              `'                            '-._|");
        Thread.sleep(750);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Enter your Name : ");
        String Name = input.next();

            /*
            game = Where Game is Running or Not
            isDiffSet = Where the Difficulty has been chosen (0 = No or 1 = Yes)
            Difficulty = 1 is Easy, 2 is Medium, 3 is Hard
            sureAboutDiff = Conferms Diffuculty

            rocketHealth is the Opponates Health
            playerHealth is the Players Health

            isPokeSet = Where the Pokemon has been chosen (0 = No or 1 = Yes)
            Pokemon = 1 is Charazard, 2 is Squirtle, 3 is Bulbizar
            sureAboutPok = Conferms Pokemon
            NameOfPOkemon = Name of the Pokemon
            */
        int game = 1;
        int isDiffSet;
        int Difficulty;
        int sureAboutDiff;
        int rocketHealth=0;
        int introcketHealth=1;
        double rocketPercent = rocketHealth/introcketHealth*100;
        int playerHealth=0;
        int intplayerHealth=1;
        double playerpercent = playerHealth/intplayerHealth*100;
        int isPokSet;
        int Pokemon;
        int sureAboutPok;
        String NameOfPokemon=("0");
        int moveDamage1=(10);
        int moveDamage2=(15);
        int moveDamage3=(20);
        String playerMove1=("0");
        String playerMove2=("0");
        String playerMove3=("0");
        String EnemyMove1 = ("0");
        String EnemyMove2 = ("0");
        String EnemyMove3 = ("0");
        int justForNeetness;
        String enemyPicture=("0");
        String enemyName=("0");
        String pokemonPicture=("0");
        String pokedex=("0");
        int moveChoice=(0);
        int compChoice=(0);

        //The Game Begins
        while(game==1){

            //These need to be Set at the begining of Every Game
            isDiffSet = 0;
            Difficulty=0;
            sureAboutDiff = 0;
            isPokSet = 0;
            Pokemon = 0;
            sureAboutPok = 0;
            justForNeetness = 0;

            //Setting the Difficulty
            while (isDiffSet==0) {

                if (Difficulty==1) {
                    System.out.println("You have Chosen Easy, is this Correct? Y=1/n=0");
                    sureAboutDiff = input.nextInt();
                    if (sureAboutDiff==1) {
                        isDiffSet = 1;

                        playerHealth = 100;
                        intplayerHealth = 100;
                        rocketHealth = 75;
                        introcketHealth = 75;
                        enemyPicture = (",-.                                                 .\r\n" +
                                ".` `.                                             .'|\r\n" +
                                "` `. `-._                     _,.--._            /  |\r\n" +
                                " `  ..   `.                  /       `.        ,' , '\r\n" +
                                "  `  ` `.  `-._              | '\".     \\      /  / .\r\n" +
                                "   `. `   `.   `.          ,\"'---'      .   ,' ,'' |\r\n" +
                                "     ` `.    `.  `.       .             |  /  / /  F\r\n" +
                                "      `. .     `.  \\ ,..--|             |,'  / /  /\r\n" +
                                "        \\ `.     .  |      \\           ,.   / /  /\r\n" +
                                "         `._`._   j   .----.`._     _,` | ,\" / ,'\r\n" +
                                "            `._`\"`  ,',\"\"\"\"-.`.\"\"--' ,-\":+.-'.'\r\n" +
                                "            ,'     . |`._)   . L     ||_7\\+-'\r\n" +
                                "           /       | |       | |     .\\   \\.\r\n" +
                                "          /        |  .      | |      \\\\_,'j\r\n" +
                                "         .          ._ `----' /        `--\" '\r\n" +
                                "        j             \"--..--'              |\r\n" +
                                "       ,|                        ,-\".       |\r\n" +
                                "     ,' |                       /   |       '\r\n" +
                                "    /   '                       `..'    ,'   \\\r\n" +
                                "   /   j                               /      L\r\n" +
                                "  j    |                              .       |\r\n" +
                                "  |  _.'                              |     , |\r\n" +
                                "  `-' .                               |   ,'  '\r\n" +
                                "      |                               `.-'     .\r\n" +
                                "      |                                        |\r\n" +
                                "      |                                        j\r\n" +
                                "      '                                       .\r\n" +
                                "       `                                     /\r\n" +
                                "        `.                                  /\r\n" +
                                "     ______.                              ,'\r\n" +
                                "   ,'       `-._                     _,.'\"\"`--..\r\n" +
                                "  .         ___,+ -...._________,...<_          \\\r\n" +
                                "   .___,.-\"'                          `-._      |\r\n" +
                                "                                          `-....' \r\n" +
                                "f");
                        enemyName = ("Wigglypuff");
                        pokedex=("\r\n"
                                + "|                                                     Pokedex                                                 |\r\n"
                                + "|                                                                                                             |\r\n"
                                + "|                                                   Wigglypuff                                                |\r\n"
                                + "|                                                                                                             |\r\n"
                                + "|                  Wigglytuff is a Pokémon with a bean-shaped body and stubby arms and legs.                  |\r\n"
                                + "|         There is a fluffy, curled tuft of fur on its head, which is described as perfectly heavenly.        |\r\n"
                                + "|           It has long, rabbit-like ears with black insides and slightly lighter color at the tips.          |\r\n"
                                + "|          Its large, blue eyes are covered in a layer of tears that quickly washes away any debris.          |\r\n"
                                + "|                                It is covered in pink fur with a white belly.                                |\r\n"
                                + "|This fine layer of fur is so soft that those who touch it, including other Wigglytuff, will not want to stop.|\r\n"
                                + "|        As a result, Wigglytuff is a highly sought after Pokémon because of its bouncy body and fur.         |\r\n"
                                + "| It sheds seasonally, and people gather the fur to spin into yarn. It is proud of its fine and delicate fur. |\r\n");
                        EnemyMove1 = ("Charm");
                        EnemyMove2 = ("Gyro Ball");
                        EnemyMove3 = ("Play Rough");


                    } else {
                        Difficulty=0;
                    }
                }
                else if(Difficulty==2){
                    System.out.println("You have Chosen Medium, is this Correct? Y=1/n=0");
                    sureAboutDiff = input.nextInt();
                    if (sureAboutDiff==1) {
                        isDiffSet = 1;

                        playerHealth = 100;
                        intplayerHealth = 100;
                        rocketHealth = 100;
                        introcketHealth = 100;
                        enemyPicture = ("\r\n"
                                + "                                          .\"                            \r\n"
                                + "                                        ,'  |				  								\r\n"
                                + "                                      _,... '.___                         \r\n"
                                + "                             +--._  ,'.-\"+.      \"`-.                     \r\n"
                                + "                         _,---\\   `\" / |p|.'     \"'   \\                   \r\n"
                                + "                       ,- _.---\".   |_,'      ,-\"\"\"\"-._|                  \r\n"
                                + "                     ,' ,.'    .'          ,-'        ,'                  \r\n"
                                + "                   ,' ,' |    .          .^---._      |                   \r\n"
                                + "            |. _  `. /   .    |   ,---.+'       `.    |                   \r\n"
                                + "           ,| | `/\\|.    `    |  .      `-.       .  /                    \r\n"
                                + "       .---. \"`-`.,\\ \\    `-.,'  |         `-._   | '                     \r\n"
                                + "        `.-'        , \"\"\"\"--'..-  \\            `--'.L                     \r\n"
                                + "          .          |`.     `     `._             _,'   .                \r\n"
                                + "           `.        |  `.    |_,..   `-..______.-'  _,-| |. ,\"\\          \r\n"
                                + "             -.     /     +--'/    `.            -,\"'   `\"  \".-'          \r\n"
                                + "               `-+-'      |  /       `.        '\\ |           .L_         \r\n"
                                + "           -\"--.,-`._..._,' j          `.     / | '           (_,'        \r\n"
                                + "          `.    j.-'     `- |            \\   j  |  `.  _...___'           \r\n"
                                + "            `. /__ ,...._  \\|             |  |  |...-`\"                   \r\n"
                                + "              j|  `      ,-/`.           /   `  ;.._                      \r\n"
                                + "          ,-. ||   |\"\"-.'  |  `..__,...-'     \\'    `.                    \r\n"
                                + "          `   |/`--    .  /|                  /----.__\\                   \r\n"
                                + "           \\  .         `' /                 /         \\                  \r\n"
                                + "            . |           ,`.              ,'     ___..+--.               \r\n"
                                + "            +-|          /   `-..______..-\"     ,\"  `.   /___             \r\n"
                                + "          ,'  |         j               .'    ,'      `\"|    /            \r\n"
                                + "       ,-+    .         |`._          ,+_    /          `-..'             \r\n"
                                + "   _.-'  |     `.      /    ``-----:='   `.,'         _,..'               \r\n"
                                + ",-'      L       `-.--'         ,,'        |       ,-'                    \r\n"
                                + "\\_        \\         `._    _,.-'           `.___..'                       \r\n"
                                + "  `.._     `._      __.+'\"'                                               \r\n"
                                + "      `---... +---\"\" mh                                                   \r\n"
                                + "");
                        enemyName=("Nidoqueen");
                        pokedex=("\r\n"
                                + "|                                                            Pokedex                                                         |\r\n"
                                + "|                                                                                                                            |\r\n"
                                + "|                                                           Nidoqueen                                                        |\r\n"
                                + "|                                                                                                                            |\r\n"
                                + "| Nidoqueen is a large, bipedal blue Pokémon with distinct reptilian features. Its body is encased with extremely hard scales|\r\n"
                                + "|that serve as excellent protection from any attack and stand up when Nidoqueen is excited or provoked. It has a blunt snout,|\r\n"
                                + "|  narrow brown eyes, and large ears with brown insides. There is a small horn on its forehead, a single spine on each ear,  |\r\n"
                                + "|and a line of toxic spikes running down the length of its back. Each hand has three short claws and each foot was two claws.|\r\n"
                                + "|   Its lower jaw, the front of its abdomen, and two plates on its chest are cream-colored. It has a thick, powerful tail.   |\r\n"
                                + "|           Nidoqueen is a female-only species. Nidoqueen can be quite fierce and is very protective of its young.           |\r\n"
                                + "|   This Pokémon is at its strongest when it is defending its young, and it will try to seal the entrance to its burrow to   |\r\n"
                                + "| protect them.  It also places it young on its gaps between its gap spikes which never relate poison when the children are  |\r\n"
                                + "|placed on it. Nidoqueen is more adaptive at being defensive than offensive. Nidoqueen's scales like armor allow it to defend|\r\n"
                                + "|  its children from any attack. When in contact with foes, it can poison them with the spikes from its back or cause small  |\r\n"
                                + "|  tremors by slamming the ground. It is also adept at sending foes flying with harsh tackles and it uses its hefty bulk to  |\r\n"
                                + "|   to execute powerful moves. Being the result of an evolution via Evolution stone, Nidoqueen is rarely found in the wild,  |\r\n"
                                + "|                                      though they can be found in savannas and plains.                                      |");
                        EnemyMove1 = ("Swift");
                        EnemyMove2 = ("Sizzly Slide");
                        EnemyMove3 = ("Shadow Ball");



                    } else {
                        Difficulty=0;
                    }

                }
                else if (Difficulty==3) {
                    System.out.println("You have Chosen Hard, is this Correct? Y=1/n=0");
                    sureAboutDiff = input.nextInt();
                    if (sureAboutDiff==1) {
                        isDiffSet = 1;

                        playerHealth = 100;
                        intplayerHealth = 100;
                        rocketHealth = 150;
                        introcketHealth = 150;
                        enemyPicture =("    ,---...__     ,.._\r\n" +
                                "  .\"\"\"_...   \"\"---\\.,_`\"-._                    __,..._\r\n" +
                                " ,--   \"\"\"\"\"\":--..    \"-   `-._ _,.        ,-\"\" ..----'\"\"\",\r\n" +
                                "`---........_____ ._     `-._  `. |       / /'      '\"\"\"\"-----.\r\n" +
                                "\\\"'\"\"\"\"\"\"''\"\"\"'\"-`           `-. `.      / j     .\\ |\\   -.,:,- .\r\n" +
                                " `-.......___     `._           \\  \\    ]\\ |   . |L ||/\\   `. ` .`.\r\n" +
                                "         __,..==--'/ '           \\  L  A|,'|    \\| |||||  ` .`.. -._\r\n" +
                                "    .--\"\"          `.             L | j  /'\"-.__\\V '/|||   | `. `._ `.\r\n" +
                                "      `....----_..-`\"`/.          | | | j   __ `._   | |'_`.\\  `.  `. |\r\n" +
                                "            -\"'       \\           | `_|.   l  `.  `.   |||   ` | `   \\'\r\n" +
                                "            `-._,...-\"\"\\-         |        |    .   /`.  \\  ..Y   `.  \\\r\n" +
                                "               `-..,'  .`         '         L \\  .  `--\"`.`.`|  .   \\  |\r\n" +
                                "                  \\  ,'  `|     ,'          .\\ +-'-...-^._`. | |..  ,\\ '\r\n" +
                                "                   `\\     `.._ j             /\"       \\  |\\ `..- `.'- `\r\n" +
                                "                    `. ,' | .  |           .'          \\ | `._`.\r\n" +
                                "                      +   | | j           /             `'    `.`.\r\n" +
                                "                       `.+._j_'      __..)                      `..\r\n" +
                                "                        _,-'   .,   j ` .'\"\"`--.                  `\r\n" +
                                "                     _.' .-'  /,'`\"-.  ,` .\\ \\` `\r\n" +
                                "                   ,'  .' / /`,'    ||'` ,'`T|.`-|\r\n" +
                                "                 ___,'/_,._/        L|   . |'-'\\\"\r\n" +
                                "                                    `-   ||    ' ");
                        enemyName=("Fearow");
                        pokedex=("\r\n"
                                + "|                               Pokedex                              |\r\n"
                                + "|                      			  		                        	|\r\n"
                                + "|                               Fearow                               |\r\n"
                                + "|                                                                    |\r\n"
                                + "|   Fearow is a large, mostly brown avian Pokémon with a vulturine   |\r\n"
                                + "|    neck and broad, powerful wings. It has a long, pointed, pink    |\r\n"
                                + "|  beak and a decorative red coxcomb on top of its head. Its narrow  |\r\n"
                                + "|eyes have very small pupils and do not appear to have colored irises|\r\n"
                                + "|  It has shaggy, feathers at the base of its neck and covering the  |\r\n"
                                + "|upper portion of its wings. These feathers are cream-colored, as are|\r\n"
                                + "| the tips of its flight feathers. Its sharp-clawed talons are pink, |\r\n"
                                + "|     with three toes pointing forward and one pointing backward.    |\r\n"
                                + "|Fearow has been around mostly unchanged for many years, as a Pokémon|\r\n"
                                + "| resembling it has been seen on ancient murals. Its large wings and |\r\n"
                                + "|stamina allow it to fly for an entire day without landing. Its long |\r\n"
                                + "|   neck and beak allow it to pluck prey from both land and water,   |\r\n"
                                + "|  and it has even been known to steal from unwary humans. It will   |\r\n"
                                + "| shoot upward, and then dive down to catch prey. It will also catch |\r\n"
                                + "|  tiny insects that hide underground and circle the ocean for fish. |\r\n"
                                + "|  Fearow are found naturally in open habitats with warmer climates, |\r\n"
                                + "|                mainly wastelands and desolate fields               |");
                        EnemyMove1 = ("Drill Run");
                        EnemyMove2 = ("Peck");
                        EnemyMove3 = ("Sky Attack");






                    } else {
                        Difficulty=0;
                    }

                }

                else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                    Thread.sleep(100);
                    System.out.println("                    ______ _      _     __   __                ______ _  __  __ _            _   _ _         ");
                    Thread.sleep(100);
                    System.out.println("                    | ___ (_)    | |    \\ \\ / /                |  _  (_)/ _|/ _(_)          | | | | |        ");
                    Thread.sleep(100);
                    System.out.println("                    | |_/ /_  ___| | __  \\ V /___  _   _ _ __  | | | |_| |_| |_ _ _   _  ___| |_| | |_ _   _ ");
                    Thread.sleep(100);
                    System.out.println("                    |  __/| |/ __| |/ /   \\ // _ \\| | | | '__| | | | | |  _|  _| | | | |/ __| __| | __| | | |");
                    Thread.sleep(100);
                    System.out.println("                    | |   | | (__|   <    | | (_) | |_| | |    | |/ /| | | | | | | |_| | (__| |_| | |_| |_| |");
                    Thread.sleep(100);
                    System.out.println("                    \\_|   |_|\\___|_|\\_\\   \\_/\\___/ \\__,_|_|    |___/ |_|_| |_| |_|\\__,_|\\___|\\__|_|\\__|\\__, |");
                    Thread.sleep(100);
                    System.out.println("                                                                                                        __/ |");
                    Thread.sleep(100);
                    System.out.println("                                                                                                       |___/");
                    Thread.sleep(100);
                    System.out.println();
                    Thread.sleep(100);
                    System.out.println("                                            .-''-.     ____       .-'''-.    ____     __  ");
                    Thread.sleep(100);
                    System.out.println("                                          .'_ _   \\  .'  __ `.   / _     \\   \\   \\   /  / ");
                    Thread.sleep(100);
                    System.out.println("                                         / ( ` )   '/   '  \\  \\ (`' )/`--'    \\  _. /  '  ");
                    Thread.sleep(100);
                    System.out.println("                                        . (_ o _)  ||___|  /  |(_ o _).        _( )_ .'   ");
                    Thread.sleep(100);
                    System.out.println("                                        |  (_,_)___|   _.-`   | (_,_). '.  ___(_ o _)' ");
                    Thread.sleep(100);
                    System.out.println("                                        '  \\   .---..'   _    |.---.  \\  :|   |(_,_)'  ");
                    Thread.sleep(100);
                    System.out.println("                                         \\  `-'    /|  _( )_  |\\    `-'  ||   `-'  /      ");
                    Thread.sleep(100);
                    System.out.println("                                          \\       / \\ (_ o _) / \\       /  \\      /    ");
                    Thread.sleep(100);
                    System.out.println("                                           `'-..-'   '.(_,_).'   `-...-'    `-..-'        ");
                    Thread.sleep(100);
                    System.out.println("                                    ____    ____              __   _                                            ");
                    Thread.sleep(100);
                    System.out.println("                                   |_   \\  /   _|            |  ] (_)                                           ");
                    Thread.sleep(100);
                    System.out.println("                                     |   \\/   |  .---.   .--.| |  __  __   _   _ .--..--.                       ");
                    Thread.sleep(100);
                    System.out.println("                                     | |\\  /| | / /__\\\\/ /'`\\' | [  |[  | | | [ `.-. .-. |                      ");
                    Thread.sleep(100);
                    System.out.println("                                    _| |_\\/_| |_| \\__.,| \\__/  |  | | | \\_/ |, | | | | | |                      ");
                    Thread.sleep(100);
                    System.out.println("                                   |_____||_____|'.__.' '.__.;__][___]'.__.'_/[___||__||__]                    ");
                    Thread.sleep(100);
                    System.out.println("                                                 _   _               _                     ");
                    Thread.sleep(100);
                    System.out.println("                                                | | | |             | |                    ");
                    Thread.sleep(100);
                    System.out.println("                                                | |_| | __ _ _ __ __| |                    ");
                    Thread.sleep(100);
                    System.out.println("                                                |  _  |/ _` | '__/ _` |                    ");
                    Thread.sleep(100);
                    System.out.println("                                                | | | | (_| | | | (_| |                    ");
                    Thread.sleep(100);
                    System.out.println("                                                \\_| |_/\\__,_|_|  \\__,_|                    ");
                    Thread.sleep(100);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.print(Name + " Pick your Difficulty - 1 - 2 - 3 -");
                    Difficulty = input.nextInt();
                }

                //System.out.println(playerHealth);
                //System.out.println(rocketHealth);
            }
            //Picking The Pokemon
            while (isPokSet==0) {

                if (Pokemon==1) {
                    System.out.println("You have Chosen Charmander, is this Correct? Y=1/n=0");
                    sureAboutPok = input.nextInt();
                    if (sureAboutPok==1) {
                        isPokSet = 1;
                        playerMove1 = ("Ember");
                        playerMove2 = ("Growl");
                        playerMove3 = ("Scratch");
                        NameOfPokemon = "Charmander";
                        pokemonPicture = ("                                                                                                                         _.--\"\"`-..                     \r\n"
                                + "                                                                                                                       ,'          `.                                                                     \r\n"
                                + "                                                                                                                     ,'          __  `.                            \r\n"
                                + "                                                                                                                    /|          \" __   \\                           \r\n"
                                + "                                                                                                                   , |           / |.   .                          \r\n"
                                + "                                                                                                                   |,'          !_.'|   |                          \r\n"
                                + "                                                                                                                 ,'             '   |   |                         \r\n"
                                + "                                                                                                                /              |`--'|   |                         \r\n"
                                + "                                                                                                               |                `---'   |                              \r\n"
                                + "                                                                                                                .   ,                   |                       ,\".                     \r\n"
                                + "                                                                                                                 ._     '           _'  |                    , ' \\ `                             \r\n"
                                + "                                                                                                             `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|                          \r\n"
                                + "                                                                                                             |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\                       \r\n"
                                + "                                                                                                           -:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .                           \r\n"
                                + "                                                                                                             `,         \"\"\"\"'     `.              ,'         |   |  ',,                              \r\n"
                                + "                                                                                                               `.      '            '            /          '    |'. |/                           \r\n"
                                + "                                                                                                                 `.   |              \\       _,-'           |       ''                             \r\n"
                                + "                                                                                                                   `._'               \\   '\"\\                .      |                                    \r\n"
                                + "                                                                                                                      |                '     \\                `._  ,'                                   \r\n"
                                + "                                                                                                                      |                 '     \\                 .'|                                            \r\n"
                                + "                                                                                                                      |                 .      \\                | |                                          \r\n"
                                + "                                                                                                                      |                 |       L              ,' |                                                \r\n"
                                + "                                                                                                                      `                 |       |             /   '                    \r\n"
                                + "                                                                                                                       \\                |       |           ,'   /                       \r\n"
                                + "                                                                                                                     ,' \\               |  _.._ ,-..___,..-'    ,'                 \r\n"
                                + "                                                                                                                    /     .             .      `!             ,j'                          \r\n"
                                + "                                                                                                                   /       `.          /        .           .'/                       \r\n"
                                + "                                                                                                                  .          `.       /         |        _.'.'                     \r\n"
                                + "                                                                                                                   `.          7`'---'          |------\"'_.'                   \r\n"
                                + "                                                                                                                  _,.`,_     _'                ,''-----\"'                             \r\n"
                                + "                                                                                                              _,-_    '       `.     .'      ,\\                           \r\n"
                                + "                                                                                                              -\" /`.         _,'     | _  _  _.|                                 \r\n"
                                + "                                                                                                               \"\"--'---\"\"\"\"\"'        `' '! |! /                    \r\n"
                                + "                                                                                                                                       `\" \" -'  ");
                    } else {
                        Pokemon=0;
                    }
                }
                else if(Pokemon==2){
                    System.out.println("You have Chosen Squrtle, is this Correct? Y=1/n=0");
                    sureAboutPok = input.nextInt();
                    if (sureAboutPok==1) {
                        isPokSet = 1;
                        playerMove1 = ("Bubble");
                        playerMove2 = ("Water Gun");
                        playerMove3 = ("Tackle");
                        NameOfPokemon = "Squirtle";
                        pokemonPicture = ("                                                                        _,........__                                \r\n"
                                + "                                                                                                                     ,-'            \"`-.                                                \r\n"
                                + "                                                                                                                    ,'                   `-.                                            \r\n"
                                + "                                                                                                                  ,'                        \\                                           \r\n"
                                + "                                                                                                                ,'                           .                                          \r\n"
                                + "                                                                                                                .'\\               ,\"\".       `                                          \r\n"
                                + "                                                                                                               ._.'|             / |  `       \\                                         \r\n"
                                + "                                                                                                               |   |            `-.'  ||       `.                                       \r\n"
                                + "                                                                                                               |   |            '-._,'||       | \\                                      \r\n"
                                + "                                                                                                               .`.,'             `..,'.'       , |`-.                                   \r\n"
                                + "                                                                                                               l                       .'`.  _/  |   `.                                 \r\n"
                                + "                                                                                                               `-.._'-   ,          _ _'   -\" \\  .     `                                \r\n"
                                + "                                                                                                          `.\"\"\"\"\"'-.`-...,---------','         `. `....__.                              \r\n"
                                + "                                                                                                          .'        `\"-..___      __,'\\          \\  \\     \\                             \r\n"
                                + "                                                                                                          \\_ .          |   `\"\"\"\"'    `.           . \\     \\                            \r\n"
                                + "                                                                                                             `.          |              `.          |  .     L                          \r\n"
                                + "                                                                                                               `.        |`--...________.'.        j   |     |                          \r\n"
                                + "                                                                                                                 `._    .'      |          `.     .|   ,     |                          \r\n"
                                + "                                                                                                                    `--,\\       .            `7\"\"' |  ,      |                          \r\n"
                                + "                                                                                                                       ` `      `            /     |  |      |    _,-'\"\"\"`-.            \r\n"
                                + "                                                                                                                        \\ `.     .          /      |  '      |  ,'          `.          \r\n"
                                + "                                                                                                                         \\  v.__  .        '       .   \\    /| /              \\        \r\n"
                                + "                                                                                                                          \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |       \r\n"
                                + "                                                                                                                           `        .        `._ ___,j.  `/ .-       ,---.     |       \r\n"
                                + "                                                                                                                           ,`-.      \\         .\"     `.  |/        j     `    |       \r\n"
                                + "                                                                                                                          /    `.     \\       /         \\ /         |     /    j       \r\n"
                                + "                                                                                                                         |       `-.   7-.._ .          |\"          '         /        \r\n"
                                + "                                                                                                                         |          `./_    `|          |            .     _,'         \r\n"
                                + "                                                                                                                         `.           / `----|          |-............`---'            \r\n"
                                + "                                                                                                                           \\          \\      |          |           \r\n"
                                + "                                                                                                                          ,'           )     `.         |                              \r\n"
                                + "                                                                                                                           7____,,..--'      /          |                              \r\n"
                                + "                                                                                                                                             `---.__,--.'                              \r\n"
                                + "                                                                                                                                               ");

                    } else {
                        Pokemon=0;
                    }

                }
                else if (Pokemon==3) {
                    System.out.println("You have Chosen Bulbasaur, is this Correct? Y=1/n=0");
                    sureAboutPok = input.nextInt();
                    if (sureAboutPok==1) {
                        isPokSet = 1;
                        playerMove1 = ("Vine Whip");
                        playerMove2 = ("Growth");
                        playerMove3 = ("Leech Seed");
                        NameOfPokemon = ("Bulbasaur");
                        pokemonPicture = ("                                           /\r\n" +
                                "                                                                                                                                  _,.------....___,.' ',.-.\r\n" +
                                "                                                                                                                               ,-'          _,.--\"        |\r\n" +
                                "                                                                                                                             ,'         _.-'              .\r\n" +
                                "                                                                                                                            /   ,     ,'                   `\r\n" +
                                "                                                                                                                           .   /     /                     ``.\r\n" +
                                "                                                                                                                           |  |     .                       \\.\\\r\n" +
                                "                                                                                                                 ____      |___._.  |       __               \\ `.\r\n" +
                                "                                                                                                               .'    `---\"\"       ``\"-.--\"'`  \\               .  \\\r\n" +
                                "                                                                                                              .  ,            __               `              |   .\r\n" +
                                "                                                                                                              `,'         ,-\"'  .               \\             |    L\r\n" +
                                "                                                                                                             ,'          '    _.'                -._          /    |\r\n" +
                                "                                                                                                            ,`-.    ,\".   `--'                      >.      ,'     |\r\n" +
                                "                                                                                                           . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'\r\n" +
                                "                                                                                                           ||:, .           ,'  ;  /  / \\ `        `.    .      .'/\r\n" +
                                "                                                                                                           j|:D  \\          `--'  ' ,'_  . .         `.__, \\   , /\r\n" +
                                "                                                                                                          / L:_  |                 .  \"' :_;                `.'.'\r\n" +
                                "                                                                                                          .    \"\"'                  \"\"\"\"\"'                    V\r\n" +
                                "                                                                                                           `.                                 .    `.   _,..  `\r\n" +
                                "                                                                                                             `,_   .    .                _,-'/    .. `,'   __  `\r\n" +
                                "                                                                                                              ) \\`._        ___....----\"'  ,'   .'  \\ |   '  \\  .\r\n" +
                                "                                                                                                             /   `. \"`-.--\"'         _,' ,'     `---' |    `./  |\r\n" +
                                "                                                                                                            .   _  `\"\"'--.._____..--\"   ,             '         |\r\n" +
                                "                                                                                                            | .\" `. `-.                /-.           /          ,\r\n" +
                                "                                                                                                            | `._.'    `,_            ;  /         ,'          .\r\n" +
                                "                                                                                                           .'          /| `-.        . ,'         ,           ,\r\n" +
                                "                                                                                                           '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'\r\n" +
                                "                                                                                                           `\"^--'..'   '-`-^-'\"--    `-^-'`.''\"\"\"\"\"`.,^.`.--' mh");

                    } else {
                        Pokemon=0;
                    }

                }

                else {
                    System.out.println("Choose Your Pokemon");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("              _.--\"\"`-..                                                                                   _,........__                                                 ");
                    Thread.sleep(100);
                    System.out.println("            ,'          `.                                                                             ,-'            \"`-.                                              ");
                    Thread.sleep(100);
                    System.out.println("          ,'          __  `.                                                                          ,'                   `-.                                          ");
                    Thread.sleep(100);
                    System.out.println("         /|          \" __   \\                                                                       ,'                        \\                                         ");
                    Thread.sleep(100);
                    System.out.println("        , |           / |.   .                                                                    ,'                           .                                        ");
                    Thread.sleep(100);
                    System.out.println("        |,'          !_.'|   |                                                                    .'\\               ,\"\".       `                                        ");
                    Thread.sleep(100);
                    System.out.println("      ,'             '   |   |                                                                   ._.'|             / |  `       \\                                       ");
                    Thread.sleep(100);
                    System.out.println("     /              |`--'|   |                                                                   |   |            `-.'  ||       `.                                     ");
                    Thread.sleep(100);
                    System.out.println("    |                `---'   |                                                                   |   |            '-._,'||       | \\                                    ");
                    Thread.sleep(100);
                    System.out.println("     .   ,                   |                       ,\".                                         .`.,'             `..,'.'       , |`-.                                 ");
                    Thread.sleep(100);
                    System.out.println("      ._     '           _'  |                    , ' \\ `                                        l                       .'`.  _/  |   `.                               ");
                    Thread.sleep(100);
                    System.out.println("  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|                                       `-.._'-   ,          _ _'   -\" \\  .     `                              ");
                    Thread.sleep(100);
                    System.out.println("  |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\                                 `.\"\"\"\"\"'-.`-...,---------','         `. `....__.                            ");
                    Thread.sleep(100);
                    System.out.println("-:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .                                 .'        `\"-..___      __,'\\          \\  \\     \\                           ");
                    Thread.sleep(100);
                    System.out.println("  `,         \"\"\"\"'     `.              ,'         |   |  ',,                                \\_ .          |   `\"\"\"\"'    `.           . \\     \\                          ");
                    Thread.sleep(100);
                    System.out.println("    `.      '            '            /          '    |'. |/                                   `.          |              `.          |  .     L                        ");
                    Thread.sleep(100);
                    System.out.println("    `.      '            '            /          '    |'. |/                                   `.          |              `.          |  .     L                        ");
                    Thread.sleep(100);
                    System.out.println("        `._'               \\   '\"\\                .      |                                         `._    .'      |          `.     .|   ,     |                        ");
                    Thread.sleep(100);
                    System.out.println("           |                '     \\                `._  ,'                                            `--,\\       .            `7\"\"' |  ,      |                        ");
                    Thread.sleep(100);
                    System.out.println("           |                 '     \\                 .'|                                                 ` `      `            /     |  |      |    _,-'\"\"\"`-.          ");
                    Thread.sleep(100);
                    System.out.println("           |                 .      \\                | |                                                  \\ `.     .          /      |  '      |  ,'          `.        ");
                    Thread.sleep(100);
                    System.out.println("           |                 |       L              ,' |                                                   \\  v.__  .        '       .   \\    /| /              \\      ");
                    Thread.sleep(100);
                    System.out.println("           `                 |       |             /   '                                                    \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |     ");
                    Thread.sleep(100);
                    System.out.println("            \\                |       |           ,'   /                                                      `        .        `._ ___,j.  `/ .-       ,---.     |     ");
                    Thread.sleep(100);
                    System.out.println("          ,' \\               |  _.._ ,-..___,..-'    ,'                                            /         ,`-.      \\         .\"     `.  |/        j     `    |     ");
                    Thread.sleep(100);
                    System.out.println("         /     .             .      `!             ,j'                                              /       /    `.     \\       /         \\ /         |     /    j     ");
                    Thread.sleep(100);
                    System.out.println("        /       `.          /        .           .'/                       _,.------....___,.' ',.-.       |       `-.   7-.._ .          |\"          '         /      ");
                    Thread.sleep(100);
                    System.out.println("       .          `.       /         |        _.'.'                     ,-'          _,.--\"        |       |          `./_    `|          |            .     _,'       ");
                    Thread.sleep(100);
                    System.out.println("        `.          7`'---'          |------\"'_.'                     ,'         _.-'              .       `.           / `----|          |-............`---'          ");
                    Thread.sleep(100);
                    System.out.println("       _,.`,_     _'                ,''-----\"'                       /   ,     ,'                   `        \\          \\      |          |                            ");
                    Thread.sleep(100);
                    System.out.println("   _,-_    '       `.     .'      ,\\                                .   /     /                     ``.     ,'           )     `.         |                            ");
                    Thread.sleep(100);
                    System.out.println("   -\" /`.         _,'     | _  _  _.|                               |  |     .                       \\.\\     7____,,..--'      /          |                            ");
                    Thread.sleep(100);
                    System.out.println("    \"\"--'---\"\"\"\"\"'        `' '! |! /                      ____      |___._.  |       __               \\ `.                     `---.__,--.'                            ");
                    Thread.sleep(100);
                    System.out.println("                            `\" \" -'                     .'    `---\"\"       ``\"-.--\"'`  \\               .  \\                                                            ");
                    Thread.sleep(100);
                    System.out.println("                                                    .  ,            __               `              |   .                                                              ");
                    Thread.sleep(100);
                    System.out.println("                                                  `,'         ,-\"'  .               \\             |    L                                                               ");
                    Thread.sleep(100);
                    System.out.println("                                                  ,'          '    _.'                -._          /    |                                                              ");
                    Thread.sleep(100);
                    System.out.println("                                                 ,`-.    ,\".   `--'                      >.      ,'     |                                                              ");
                    Thread.sleep(100);
                    System.out.println("                                               . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'                                                               ");
                    Thread.sleep(100);
                    System.out.println("                                               ||:, .           ,'  ;  /  / \\ `        `.    .      .'/                                                                ");
                    Thread.sleep(100);
                    System.out.println("                                                j|:D  \\          `--'  ' ,'_  . .         `.__, \\   , /                                                                ");
                    Thread.sleep(100);
                    System.out.println("                                             / L:_  |                 .  \"' :_;                `.'.'                                                                   ");
                    Thread.sleep(100);
                    System.out.println("                                              .    \"\"'                  \"\"\"\"\"'                    V                                                                    ");
                    Thread.sleep(100);
                    System.out.println("                                              `.                                 .    `.   _,..  `                                                                     ");
                    Thread.sleep(100);
                    System.out.println("                                                `,_   .    .                _,-'/    .. `,'   __  `                                                                    ");
                    Thread.sleep(100);
                    System.out.println("                                                  ) \\`._        ___....----\"'  ,'   .'  \\ |   '  \\  .                                                                  ");
                    Thread.sleep(100);
                    System.out.println("                                                /   `. \"`-.--\"'         _,' ,'     `---' |    `./  |                                                                   ");
                    Thread.sleep(100);
                    System.out.println("                                               .   _  `\"\"'--.._____..--\"   ,             '         |                                                                   ");
                    Thread.sleep(100);
                    System.out.println("                                               | .\" `. `-.                /-.           /          ,                                                                   ");
                    Thread.sleep(100);
                    System.out.println("                                               | `._.'    `,_            ;  /         ,'          .                                                                    ");
                    Thread.sleep(100);
                    System.out.println("                                                .'          /| `-.        . ,'         ,           ,                                                                   ");
                    Thread.sleep(100);
                    System.out.println("                                                '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'                                                                    ");
                    Thread.sleep(100);
                    System.out.println("                                               `\"^--'..'   '-`-^-'\"--    `-^-'`.''\"\"\"\"\"`.,^.`.--'                                                                      ");
                    Thread.sleep(100);
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("                      1.Charmander                                                                             2.Squirtle                  ");
                    System.out.println("                                                                  3.Bulbasaur                                                     ");
                    System.out.print("                              Choose Your Pokemon :   ");
                    Pokemon = input.nextInt();
                }



            }

            //Before the Game
            while (justForNeetness==0) {
                System.out.println();
                System.out.println();
                System.out.println();
                Thread.sleep(300);
                System.out.print("                              Welcome ");
                Thread.sleep(300);
                System.out.print(Name);
                Thread.sleep(300);
                System.out.print(" to");
                Thread.sleep(300);
                System.out.print(" your");
                Thread.sleep(300);
                System.out.print(" first");
                Thread.sleep(300);
                System.out.println(" Battle!!");
                Thread.sleep(300);
                System.out.print("                      You");
                Thread.sleep(300);
                System.out.print(" are");
                Thread.sleep(300);
                System.out.print(" facing");
                Thread.sleep(300);
                System.out.print(" off");
                Thread.sleep(300);
                System.out.print(" against");
                Thread.sleep(300);
                System.out.print(" Trace");
                Thread.sleep(300);
                System.out.print(" from");
                Thread.sleep(300);
                System.out.print(" the");
                Thread.sleep(300);
                System.out.print(" Kanto");
                Thread.sleep(300);
                System.out.println(" region.");
                Thread.sleep(300);
                System.out.print("               You");
                Thread.sleep(300);
                System.out.print(" see");
                Thread.sleep(300);
                System.out.print(" his");
                Thread.sleep(300);
                System.out.print(" pokemon,");
                Thread.sleep(300);
                System.out.print(" and");
                Thread.sleep(300);
                System.out.print(" you");
                Thread.sleep(300);
                System.out.print(" don't");
                Thread.sleep(300);
                System.out.print(" Recoonize");
                Thread.sleep(300);
                System.out.print(" it,");
                Thread.sleep(300);
                System.out.print(" so");
                Thread.sleep(300);
                System.out.print(" you");
                Thread.sleep(300);
                System.out.print(" scan");
                Thread.sleep(300);
                System.out.println(" it");
                Thread.sleep(300);
                System.out.print("                                   with");
                Thread.sleep(300);
                System.out.print(" your");
                Thread.sleep(300);
                System.out.print(" Pokedex");
                Thread.sleep(500);
                System.out.println();
                System.out.println(pokedex);
                Thread.sleep(10000);

                justForNeetness = 1;
                System.out.println("The game has began");
                System.out.println("You hear the announcer and he says, \"Today we have Trace fighting with his "
                        + enemyName +" against "+Name+" with his "+NameOfPokemon );
                Thread.sleep(2000);
                System.out.println("");
                System.out.println("You are battleing with your " +NameOfPokemon+ "and your moves are " +playerMove1+ ", "+playerMove2+", and "+playerMove3);
            }




            //The Game Beings
            while (playerHealth*rocketHealth>0) {
                rocketPercent = rocketHealth*100/introcketHealth;
                playerpercent = (playerHealth*100/intplayerHealth);

                /* System.out.println("- - - IFNO - - -");
                System.out.println(rocketPercent);
                System.out.println(rocketHealth);
                System.out.println(introcketHealth);
                System.out.println(playerpercent);
                System.out.println(playerHealth);
                System.out.println(intplayerHealth);
                System.out.println("- - - - - - - -");
                */



                if (rocketPercent<20) {
                    System.out.println("Your Health is UNder 20");
                    System.out.println(enemyPicture);
                    System.out.println(rocketHealth+"HP");
                    System.out.println("\r\n"
                            + "    | -------------------------------------------------- |        \r\n"
                            + "    | ==========                                         |  		\r\n"
                            + "    | ==========                                         |        \r\n"
                            + "    | ==========                                         |        \r\n"
                            + "    | -------------------------------------------------- |        \r\n");
                }
                else if(rocketPercent<40){
                    System.out.println("Your Health is UNder 40");
                    System.out.println(enemyPicture);
                    System.out.println(rocketHealth+"HP");
                    System.out.println("\r\n"
                            + "    | -------------------------------------------------- |        \r\n"
                            + "    | ====================                               |  		\r\n"
                            + "    | ====================                               |        \r\n"
                            + "    | ====================                               |        \r\n"
                            + "    | -------------------------------------------------- |        \r\n");
                }
                else if (rocketPercent<60) {
                    System.out.println("Your Health is UNder 60");
                    System.out.println(enemyPicture);
                    System.out.println(rocketHealth+"HP");
                    System.out.println("\r\n"
                            + "    | -------------------------------------------------- |        \r\n"
                            + "    | ==============================                     |  		\r\n"
                            + "    | ==============================                     |        \r\n"
                            + "    | ==============================                     |        \r\n"
                            + "    | -------------------------------------------------- |        \r\n");
                }
                else if (rocketPercent<80) {
                    System.out.println("Your Health is UNder 80");
                    System.out.println(enemyPicture);
                    System.out.println(rocketHealth+"HP");
                    System.out.println("\r\n"
                            + "    | -------------------------------------------------- |        \r\n"
                            + "    | ========================================           |  		\r\n"
                            + "    | ========================================           |        \r\n"
                            + "    | ========================================           |        \r\n"
                            + "    | -------------------------------------------------- |        \r\n");
                }
                else if (rocketPercent<=100) {
                    System.out.println(enemyPicture);
                    System.out.println(rocketHealth+"HP");
                    System.out.println("\r\n"
                            + "    | -------------------------------------------------- |        \r\n"
                            + "    | ================================================== |  		\r\n"
                            + "    | ================================================== |        \r\n"
                            + "    | ================================================== |        \r\n"
                            + "    | -------------------------------------------------- |        \r\n");
                }

                else {
                    System.out.println("You SHouldn't see this Message Ever");


                }

                Thread.sleep(2500);

                if (playerpercent<20) {
                    System.out.println(pokemonPicture);
                    System.out.println("                                                                                                         "+playerHealth+"HP");
                    System.out.println("\r\n"
                            + "                                                                                                             | -------------------------------------------------- |        \r\n"
                            + "                                                                                                             | ==========                                         |  		\r\n"
                            + "                                                                                                             | ==========                                         |        \r\n"
                            + "                                                                                                             | ==========                                         |        \r\n"
                            + "                                                                                                             | -------------------------------------------------- |        \r\n"
                            + "                                                                                                                                                                            \r\n"
                            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \r\n"
                            + "                                                                 Your Moves Are\r\n"
                            + "                                                        1."+playerMove1 +" ("+moveDamage1+")\r\n"
                            + "                                                        2."+playerMove2 +" ("+moveDamage2+")\r\n"
                            + "                                                        3."+playerMove3 +" ("+moveDamage3+")\r\n"
                            + "                                                        4.Healing Poton (+10)");

                }
                else if(playerpercent<40){
                    System.out.println(pokemonPicture);
                    System.out.println("                                                                                                         "+playerHealth+"HP");
                    System.out.println("\r\n"
                            + "                                                                                                             | -------------------------------------------------- |        \r\n"
                            + "                                                                                                             | ====================                               |  		\r\n"
                            + "                                                                                                             | ====================                               |        \r\n"
                            + "                                                                                                             | ====================                               |        \r\n"
                            + "                                                                                                             | -------------------------------------------------- |        \r\n"
                            + "                                                                                                                                                                            \r\n"
                            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \r\n"
                            + "                                                                 Your Moves Are\r\n"
                            + "                                                        1."+playerMove1 +" ("+moveDamage1+")\r\n"
                            + "                                                        2."+playerMove2 +" ("+moveDamage2+")\r\n"
                            + "                                                        3."+playerMove3 +" ("+moveDamage3+")\r\n"
                            + "                                                        4.Healing Poton (+10)");

                }
                else if (playerpercent<60) {
                    System.out.println(pokemonPicture);
                    System.out.println("                                                                                                         "+playerHealth+"HP");
                    System.out.println("\r\n"
                            + "                                                                                                             | -------------------------------------------------- |        \r\n"
                            + "                                                                                                             | ==============================                     |  		\r\n"
                            + "                                                                                                             | ==============================                     |        \r\n"
                            + "                                                                                                             | ==============================                     |        \r\n"
                            + "                                                                                                             | -------------------------------------------------- |        \r\n"
                            + "                                                                                                                                                                            \r\n"
                            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \r\n"
                            + "                                                                 Your Moves Are\r\n"
                            + "                                                        1."+playerMove1 +" ("+moveDamage1+")\r\n"
                            + "                                                        2."+playerMove2 +" ("+moveDamage2+")\r\n"
                            + "                                                        3."+playerMove3 +" ("+moveDamage3+")\r\n");
                }
                else if (playerpercent<80) {
                    System.out.println(pokemonPicture);
                    System.out.println("                                                                                                         "+playerHealth+"HP");
                    System.out.println("\r\n"
                            + "                                                                                                             | -------------------------------------------------- |        \r\n"
                            + "                                                                                                             | ========================================           |  		\r\n"
                            + "                                                                                                             | ========================================           |        \r\n"
                            + "                                                                                                             | ========================================           |        \r\n"
                            + "                                                                                                             | -------------------------------------------------- |        \r\n"
                            + "                                                                                                                                                                            \r\n"
                            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \r\n"
                            + "                                                                 Your Moves Are\r\n"
                            + "                                                        1."+playerMove1 +" ("+moveDamage1+")\r\n"
                            + "                                                        2."+playerMove2 +" ("+moveDamage2+")\r\n"
                            + "                                                        3."+playerMove3 +" ("+moveDamage3+")\r\n");
                }
                else if (playerpercent<=100) {
                    System.out.println(pokemonPicture);
                    System.out.println("                                                                                                         "+playerHealth+"HP");
                    System.out.println("\r\n"
                            + "                                                                                                             | -------------------------------------------------- |        \r\n"
                            + "                                                                                                             | ===================================================|  		\r\n"
                            + "                                                                                                             | ===================================================|        \r\n"
                            + "                                                                                                             | ===================================================|        \r\n"
                            + "                                                                                                             | -------------------------------------------------- |        \r\n"
                            + "                                                                                                                                                                            \r\n"
                            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \r\n"
                            + "                                                                 Your Moves Are\r\n"
                            + "                                                        1."+playerMove1 +" ("+moveDamage1+")\r\n"
                            + "                                                        2."+playerMove2 +" ("+moveDamage2+")\r\n"
                            + "                                                        3."+playerMove3 +" ("+moveDamage3+")\r\n");
                }

                else {
                    System.out.println("You SHouldn't see this Message Ever");


                }




                //playerHealth = (playerHealth + -25);
                Thread.sleep(500);
                System.out.print("Pick Your Move : ");
                moveChoice = input.nextInt();
                Thread.sleep(1000);
                System.out.println("\r\n"+"\r\n");
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

                //Will the Move Run??
                if(Math.random()<.20&&moveChoice<4){
                    moveChoice=5;
                }

                if (moveChoice==4) {
                    playerHealth=playerHealth+10;
                    System.out.println("             "+NameOfPokemon+" used Heal. "+NameOfPokemon+" now has "+playerHealth+"HP");
                    moveChoice = 0;
                } else {

                    if (moveChoice==1) {
                        rocketHealth=rocketHealth-moveDamage1;
                        System.out.println("             "+NameOfPokemon+" used "+playerMove1+" and did "+moveDamage1+ " damage.\r\n"
                                +"                          "+ enemyName+ " now has "+ rocketHealth+"HP");

                    }
                    else if (moveChoice==2) {
                        rocketHealth=rocketHealth-moveDamage2;
                        System.out.println("             "+NameOfPokemon+" used "+playerMove2+" and did "+moveDamage2+ " damage. \r\n"
                                +"                          "+ enemyName+ " now has "+ rocketHealth+"HP");

                    }
                    else if (moveChoice==3) {
                        rocketHealth=rocketHealth-moveDamage3;
                        System.out.println("             "+NameOfPokemon+" used "+playerMove3+" and did "+moveDamage3+ " damage. \r\n"
                                +"                          "+ enemyName+ " now has "+ rocketHealth+"HP");

                    }
                    else if (moveChoice==69) {
                        rocketHealth=rocketHealth-200;
                        System.out.println("             That's one way to end a fight");
                    }
                    else if (moveChoice==420) {
                        playerHealth=100;
                        System.out.println("             That did the trick, Your Pokemon feels great");
                    }
                    else {
                        System.out.println("             Your Pokemon missed. . .");

                    }
                }


                compChoice = (int)(Math.random()*3)+1;
                //compChoice =  ThreadLocalRandom.current().nextInt(1, 3 + 1);
                if(Math.random()<.20){
                    compChoice =5;
                }
                //System.out.println(compChoice);

                if (compChoice==1) {
                    playerHealth=playerHealth-moveDamage1;
                    System.out.println("             "+enemyName+" used "+EnemyMove1+" and did "+moveDamage1+ " damage.\r\n"
                            +"                          "+ NameOfPokemon+ " now has "+ playerHealth+"HP");

                }
                else if (compChoice==2) {
                    playerHealth=playerHealth-moveDamage2;
                    System.out.println("             "+enemyName+" used "+EnemyMove2+" and did "+moveDamage2+ " damage. \r\n"
                            +"                          "+ NameOfPokemon+ " now has "+ playerHealth+"HP");

                }
                else if (compChoice==3) {
                    playerHealth=playerHealth-moveDamage3;
                    System.out.println("             "+enemyName+" used "+EnemyMove3+" and did "+moveDamage3+ " damage. \r\n"
                            +"                          "+ NameOfPokemon+ " now has "+ rocketHealth+"HP");

                }

                else {
                    System.out.println("             Your Opponent Missed");


                }

                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                Thread.sleep(5000);


                // System.out.println(pokemonPicture);



                //System.out.println(enemyPicture);


            }


            if (playerHealth>0) {
                System.out.println("                  ___           ___                    ___                       ___                       \r\n"
                        + "                 /\\  \\         /\\  \\                  /\\  \\                     /\\  \\                      \r\n"
                        + "      ___       /::\\  \\        \\:\\  \\                _\\:\\  \\       ___          \\:\\  \\                     \r\n"
                        + "     /|  |     /:/\\:\\  \\        \\:\\  \\              /\\ \\:\\  \\     /\\__\\          \\:\\  \\                    \r\n"
                        + "    |:|  |    /:/  \\:\\  \\   ___  \\:\\  \\            _\\:\\ \\:\\  \\   /:/__/      _____\\:\\  \\                   \r\n"
                        + "    |:|  |   /:/__/ \\:\\__\\ /\\  \\  \\:\\__\\          /\\ \\:\\ \\:\\__\\ /::\\  \\     /::::::::\\__\\                  \r\n"
                        + "  __|:|__|   \\:\\  \\ /:/  / \\:\\  \\ /:/  /          \\:\\ \\:\\/:/  / \\/\\:\\  \\__  \\:\\~~\\~~\\/__/                  \r\n"
                        + " /::::\\  \\    \\:\\  /:/  /   \\:\\  /:/  /            \\:\\ \\::/  /   ~~\\:\\/\\__\\  \\:\\  \\                        \r\n"
                        + " ~~~~\\:\\  \\    \\:\\/:/  /     \\:\\/:/  /              \\:\\/:/  /       \\::/  /   \\:\\  \\                       \r\n"
                        + "      \\:\\__\\    \\::/  /       \\::/  /                \\::/  /        /:/  /     \\:\\__\\                      \r\n"
                        + "       \\/__/     \\/__/         \\/__/                  \\/__/         \\/__/       \\/__/                      ");

            }

            if (playerHealth<=0) {
                System.out.println("____    ____  ______    __    __      __        ______     ______        _______. _______     __      __  \r\n"
                        + "\\   \\  /   / /  __  \\  |  |  |  |    |  |      /  __  \\   /  __  \\      /       ||   ____|   |  |    |  | \r\n"
                        + " \\   \\/   / |  |  |  | |  |  |  |    |  |     |  |  |  | |  |  |  |    |   (----`|  |__      |  |    |  | \r\n"
                        + "  \\_    _/  |  |  |  | |  |  |  |    |  |     |  |  |  | |  |  |  |     \\   \\    |   __|     |  |    |  | \r\n"
                        + "    |  |    |  `--'  | |  `--'  |    |  `----.|  `--'  | |  `--'  | .----)   |   |  |____    |__|    |__| \r\n"
                        + "    |__|     \\______/   \\______/     |_______| \\______/   \\______/  |_______/    |_______|   (__)    (__)");

            }


            System.out.println("Would You Like to Play Again??? Y=1/N=0");
            game = input.nextInt();
        }

        System.out.println("Game Over");
        input.close();
    }

}


/*













 */

/*
______ _      _     __   __                ______ _  __  __ _            _   _ _
| ___ (_)    | |    \ \ / /                |  _  (_)/ _|/ _(_)          | | | | |
| |_/ /_  ___| | __  \ V /___  _   _ _ __  | | | |_| |_| |_ _ _   _  ___| |_| | |_ _   _
|  __/| |/ __| |/ /   \ // _ \| | | | '__| | | | | |  _|  _| | | | |/ __| __| | __| | | |
| |   | | (__|   <    | | (_) | |_| | |    | |/ /| |  | | | | | |_| | (__| |_| | |_| |_| |
\_|   |_|\___|_|\_\   \_/\___/ \__,_|_|    |___/ |_|_| |_| |_|\__,_|\___|\__|_|\__|\__, |
                                                                                    __/ |
                                                                                   |___/
*/
