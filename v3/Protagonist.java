public class Protagonist extends Character{

    public Protagonist(){
	name = "Max";
	health = 125;
	attack = 0.4;
	defense = 40;
	strength = 100;
    }
    
    //overloaded constructor that allows you to give name for protagonist
    public Protagonist( String entName){
	this();
	name = entName;
    }
    
    //returns name of protagonist
    public String getName(){
	return name;
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

    /*public static void main( String[] args ){
	Protagonist knight = new Protagonist ("Etheros");
	// test out the constructor and associated methods
	System.out.println( "Your name is: " + knight.getName() );
	System.out.println( "Your def is: " + knight.getDefense() );
	System.out.println( "Your knight is: " + knight.isAlive() );
	System.out.println( "\n" );
	// test the damage taken
	knight.lowerHP(22);
	knight.specialize();
	knight.normalize();
	
    }*/
}
