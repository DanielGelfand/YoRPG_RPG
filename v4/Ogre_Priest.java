public class Ogre_Priest extends Monster{

   public Ogre_Priest(){
	name = "Ogre Priest";
	health = 150;
	attack = 1;
	defense = 10;
	strength = (int) ( (Math.random() * 20) + 45 );
    }

    public Ogre_Priest( String entName ){
	this();
	name = entName;
    }    

    public static void about(){
	System.out.println("This monster has low health and low attack and low defense. It also has moderate HP. It can heal itself every turn.");
    }

    public static void main(String[] args){
	about();
    }
}
