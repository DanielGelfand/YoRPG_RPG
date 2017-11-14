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
    
    public static void about(){
	System.out.println("This glass cannon class has low defense and high attack power. It cannot heal itself.");
    }

    public static void main (String[] args){
	about();
    }
}
