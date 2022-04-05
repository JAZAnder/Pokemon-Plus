public class Pokemon {
    String name;
    private String move1;
    private String move2;
    private String move3;
    private int health;
    private String picture;
    private double randomNumber;


    //Constructors
    Pokemon(String input, int health, int playerNumber){

        this.health = health;

        if((input.toLowerCase()).charAt(0) == 'c'&&playerNumber==1){
            System.out.println (Resources.charmanderPicture());

            move1 = "Ember";
            move2 = "Growl";
            move3 = "Scratch";
            name = "Charmander";
            picture = Resources.charmanderPicture();

        }
        else if((input.toLowerCase()).charAt(0) == 's'&&playerNumber==1){
            System.out.println (Resources.squirtlePicture());

            move1 = "Bubble";
            move2 = "Water Gun";
            move3 = "Tackle";
            name = "Squirtle";
            picture = Resources.squirtlePicture();
        }
        else if((input.toLowerCase()).charAt(0) == 'b'&&playerNumber==1){
            System.out.println (Resources.bulbasaurPicture());

            move1 = "Vine Whip";
            move2 = "Growth";
            move3 = "Leech Seed";
            name = "Bulbasaur";
            picture = Resources.bulbasaurPicture();

        }
        else if((input.toLowerCase()).charAt(0) == 'w'&&playerNumber==2){
            System.out.println(Resources.wigglypuffPicture());

            move1 = "Charm";
            move2 = "Gyro Ball";
            move3 = "Play Rough";
            name = "Wigglypuff";
            picture = Resources.wigglypuffPicture();

        }
        else if((input.toLowerCase()).charAt(0) == 'n'&&playerNumber==2){
            System.out.println(Resources.nidoqueenPicture());


            move1 = "Swift";
            move2 = "Sizzly Slide";
            move3 = "Shadow Ball";
            name = "Nidoqueen";
            picture = Resources.nidoqueenPicture();

        }
        else if((input.toLowerCase()).charAt(0) == 'f'&&playerNumber==2){
                System.out.println(Resources.fearowPicture());


            move1 = "Drill Run";
            move2 = "Peck";
            move3 = "Sky Attack";
            name = "Fearow";
            picture = Resources.fearowPicture();

        }


        else if (playerNumber == 1) {
            //Defaults for Player 1
            System.out.println (Resources.charmanderPicture());

            move1 = "Ember";
            move2 = "Growl";
            move3 = "Scratch";
            name = "Charmander";
            picture = Resources.charmanderPicture();

        }
        else if (playerNumber == 2) {
            //Defaults for Player 2
            System.out.println(Resources.wigglypuffPicture());
            move1 = "Charm";
            move2 = "Gyro Ball";
            move3 = "Play Rough";
            name = "Wigglypuff";
            picture = Resources.wigglypuffPicture();

        }
        
        
        
    }

    Pokemon(int health){

        this.health = health;

        randomNumber =  (Math.random()*3);


        if(randomNumber<=1){
            move1 = "Charm";
            move2 = "Gyro Ball";
            move3 = "Play Rough";
            name = "Wigglypuff";
            picture = Resources.wigglypuffPicture();


        }
        else if(randomNumber<=2){
            move1 = "Swift";
            move2 = "Sizzly Slide";
            move3 = "Shadow Ball";
            name = "Nidoqueen";
            picture = Resources.nidoqueenPicture();

        }
        else{
            move1 = "Drill Run";
            move2 = "Peck";
            move3 = "Sky Attack";
            name = "Fearow";
            picture = Resources.fearowPicture();
        }

    }

    //Methods
    public void takeDamage(int damage){
        this.health = this.health - damage;

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+name+" took "+damage+" damage\n"+
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+name + " now has "+getHealth()+"HP\n"+
                "\t\t\t\t\t\t\t\t\t\t\t\t - - - - - - - - - - - - - - - - -");
    }
    public int attack(int attack){
        randomNumber = Math.random();
        if(attack == 1){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+name+" used "+move1);
            return 10;
        }
        else if(attack == 2&&randomNumber<.80){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+name+" used "+move2);
            return 15;
        }
        else if(attack == 3&&randomNumber<.60){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+name+" used "+move3);
            return 20;
        }
        else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+name+" missed ");
            return 0;
        }
    }
    public int attack(String attack){
        int i = 0;
        if (attack.length() > 1) {
            while (move1.toLowerCase().charAt(i) == move2.toLowerCase().charAt(i)||
                    move1.toLowerCase().charAt(i)==move3.toLowerCase().charAt(i)||
                    move2.toLowerCase().charAt(i)==move3.toLowerCase().charAt(i)){

                i++;
            }
        }

        if((attack.toLowerCase()).charAt(i) == move1.toLowerCase().charAt(i)||attack.equals("1")){
            return attack(1);
        }
        else if((attack.toLowerCase()).charAt(i) == move2.toLowerCase().charAt(i)||attack.equals("2")){
            return attack(2);
        }
        else if((attack.toLowerCase()).charAt(i) == move3.toLowerCase().charAt(i)||attack.equals("3")) {
            return attack(3);
        }
        else{
         return attack(4);
        }

    }


    //Getters and Setters


    public String getName() {
        return name;
    }

    public String getMove1() {
        return move1;
    }

    public String getMove2() {
        return move2;
    }

    public String getMove3() {
        return move3;
    }

    public int getHealth() {
        if(health>0){
            return health;
        }
        else{
            return 0;
        }

    }

    public String getPicture() {
        return picture;
    }
}
