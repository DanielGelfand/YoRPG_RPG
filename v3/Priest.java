public class Priest extends Protagonist{

    public Priest(){
	super(); //I want super to inherit the name, and the uninitialized variables.
	// I want the variables to be created in character, and call the methods in protagonist.
	// How would I call this in YORPG?
	// Automatic Regeneration of 15/turn
	// a method to regen health in Prtagonist
	// is it Protagonist pat = new Priest()?
	// or is it Character pat = new Protagonist(name, className)?
	health = 100;
	attack = 0.4;
	defense = 20;
	strength = 50;
    }

    public static void about(){
	System.out.println("This class has low defense and low attack power, and can heal itself every turn.");
    }


    public static void main (String[] args){
	about();
    }
}
