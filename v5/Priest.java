public class Priest extends Protagonist {

public Priest(){
        name = "I Is Priest";
        health = 100;
        attack = 0.75;
        defense = 20;
        strength = 75;
}

public Priest ( String entName ){
        this();
        name = entName;
}

/*//overwritten regen
   public void regen(){
   health += 15;
   System.out.println("Your healing passive healed you for
   }*/

//special attack
public void specialize(){
    System.out.println("Charging Holy Hand Grenade... ");
        //increases attack attribute
    Priest.regenerate();
    attack += 0;
        //System.out.print("Charging special! Player's attack is now " + attack + ". ");
        //System.out.println( "Player's defense is now " + defense + ".");
}

//normalizes stats
public void normalize(){
        attack = 0.75;
        defense = 20;
        //System.out.print("Charging special! Player's attack is now " + attack + ". ");
        //System.out.println( "Player's defense is now " + defense + ".");
}

public void regenerate(){
        int regenAmt = 10;
        health += regenAmt;
        System.out.println("Your character regenerated " + regenAmt +" health!");
}

public void about(){
        System.out.println("This class has low defense and low attack power, and can heal itself every turn.");
}



public static void main (String[] args){
        Priest pat = new Priest();
        pat.about();
}
}
