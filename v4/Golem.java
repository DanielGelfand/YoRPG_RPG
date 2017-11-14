public class Golem extends Monster{
 
    public Golem(){
	name = "GoGoGolem";
	health = 350;
	attack = 1;
	defense = 40;
	strength = (int) ( (Math.random() * 20) + 45 );
    }

    public Golem( String entName ){
	this();
	name = entName;
    }
    
    public static void about(){
	System.out.println("This monster has low attack, but high defenses. It also has high HP.");
    }

    public static void main(String[] args){
	about();
    }
}
