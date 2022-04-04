public class Pokemon {
    String name;
    private String move1;
    private String move2;
    private String move3;
    private int health;
    private String picture;
    Resources resources = new Resources();

    
    Pokemon(String input, int health){

        this.health = health;

        if((input.toLowerCase()).charAt(0) == 'c'){
            System.out.println (resources.charmanderPicture());

            move1 = "Ember";
            move2 = "Growl";
            move3 = "Scratch";
            name = "Charmander";
            picture = resources.charmanderPicture();

        }
        else if((input.toLowerCase()).charAt(0) == 's'){
            System.out.println (resources.squirtlePicture());

            move1 = "Bubble";
            move2 = "Water Gun";
            move3 = "Tackle";
            name = "Squirtle";
            picture = resources.squirtlePicture();
        }
        else if((input.toLowerCase()).charAt(0) == 'b'){
            System.out.println (resources.bulbasaurPicture());

            move1 = "Vine Whip";
            move2 = "Growth";
            move3 = "Leech Seed";
            name = "Bulbasaur";
            picture = resources.bulbasaurPicture();

        }


        else{

        }
        
        
        
    }


    public void takeDamage(int damage){
        this.health = this.health - damage;
    }

}
