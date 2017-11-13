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
    public static void about(){
	System.out.println("This class has low defense and low attack power, and can heal itself every turn.");
    }


    public static void main (String[] args){
	about();
    }
}
