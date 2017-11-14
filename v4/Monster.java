public abstract class Monster extends Character{
    /*private String name;
    private int health;
    private int defense;
    private int strength;
    private double attack;*/ // This is unneeded

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
    /*


    public static void main( String[] args ){
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
