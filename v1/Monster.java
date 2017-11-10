public class Monster{
    private String name;
    private int health;
    private int defense;
    private int strength;
    private double attack;

    public Monster(){
	name = "Max";
	health = 150;
	attack = 1;
	defense = 20;
	strength = (int)( (Math.random() * 20) + 45 );
    }
   //overloaded constructor that allows you to give name for monster
    public Monster( String entName){
	this();
	name = entName;
    }
   
    //returns boolean value of whether monster is alive
    public boolean isAlive(){
	return health > 0;
    }

    //returns defense of monster
    public int getDefense(){
	return defense;
    }
    
    //returns name of monster
    public String getName(){
	return name;
    }

    //decreases life attribute of monster
    public void lowerHP( int damage ){
	health = health - damage;
    }
   
    //damages the protagonist
    public int attack( Protagonist protagonist ){
	int damage = (int) ( (strength * attack) - protagonist.getDefense() );
	protagonist.lowerHP( damage);
	return damage;
	}


    /*public static void main( String[] args ){
	Monster ornstein = new Monster ("Smaug");
	test out the constructor and associated methods
		System.out.println( "Your name is: " + knight.getName() );
	System.out.println( "Your def is: " + knight.getDefense() );
	System.out.println( "Your knight is: " + knight.isAlive() );
	System.out.println( "\n" );
	 test the damage taken
	knight.lowerHP(22);
	knight.specialize();
	knight.normalize();
	
    }*/
}
