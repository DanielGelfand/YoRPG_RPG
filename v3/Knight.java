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
    
    public static void about(){
	System.out.println("This tank class has high defense and high health but low attack power. He has no regeneration.");
    }

    public static void main (String[] args){
	about();
    }
	
}
