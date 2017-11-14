public class Priest extends Protagonist{

    public Priest(){
	name = "I Is Priest";
	health = 100;
	attack = 0.5;
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
    //increases attack attribute
	attack += 0.1;
    //decreases defense attribute
	defense -= 5;
    
	//System.out.print("Charging special! Player's attack is now " + attack + ". ");
	//System.out.println( "Player's defense is now " + defense + ".");  
    }

    //normalizes stats
    public void normalize(){
	attack = 0.5;
	defense = 20;
	//System.out.print("Charging special! Player's attack is now " + attack + ". ");
	//System.out.println( "Player's defense is now " + defense + ".");  
    }

    
    public void about(){
	System.out.println("This class has low defense and low attack power, and can heal itself every turn.");
    }
    


    public static void main (String[] args){
        Priest pat = new Priest();
	pat.about();
    }
}
