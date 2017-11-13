public class Ogre extends Monster{

   public Ogre(){
	name = "Ogreen Ogre";
	health = 250;
	attack = 1;
	defense = 20;
	strength = (int) ( (Math.random() * 20) + 45 );
    }

    public Ogre( String entName ){
	this();
	name = entName;
    }
    
    public static void about(){
	System.out.println("This monster has moderate attack and defense. It also has moderate HP.");
    }

    public static void main(String[] args){
	about();
    }
}
