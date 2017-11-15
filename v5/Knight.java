public class Knight extends Protagonist{
    
    public Knight(){
	name = "Night Knight";
	health = 350;
	attack = 1;
	defense = 40;
	strength = (int) ( (Math.random() * 20) + 45 );
    }

    public Knight( String entName ){
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
	attack = 1;
	defense = 40;
	//System.out.print("Charging special! Player's attack is now " + attack + ". ");
	//System.out.println( "Player's defense is now " + defense + ".");  
    }

    public void about(){
	System.out.println("This tank class has high defense and high health but low attack power. He has no regeneration.");
    }

    public static void main (String[] args){
	Knight pat = new Knight();
	pat.about();
    }
	
}
