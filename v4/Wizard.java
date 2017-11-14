public class Wizard extends Protagonist{
    
    public Wizard(){
	name = "Wyse Juan";
	health = 90;
	attack = 2;
	defense = 15;
	strength = 90;
    }
    
    public Wizard( String entName ){
	this();
	name = entName;
    }

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
	attack = 0.4;
	defense = 40;
	//System.out.print("Charging special! Player's attack is now " + attack + ". ");
	//System.out.println( "Player's defense is now " + defense + ".");  
    }

    
    public void about(){
	System.out.println("This glass cannon class has low defense and high attack power. It cannot heal itself.");
    }

    public static void main (String[] args){
	Wizard pat = new Wizard();
	pat.about();
    }
}
