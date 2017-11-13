public class Character
{

    // Instance Vars

    protected String name;
    protected int health;
    protected int defense;
    protected int strength;
    protected double attack;

    
    // Methods
    
    //returns boolean value of whether protagonist is alive
    public boolean isAlive(){
	return health > 0;
    }
    
    //returns defense of protagonist
    public int getDefense(){
	return defense;
    }
    
    //decreases life attribute of protagonist
    public void lowerHP( int damage ){
	health = health - damage;
    }
    
    //calculates damage done by protagonist against the monster
    public int attack( Character chara ){
	int damage = (int) ( (strength * attack) - chara.getDefense() );
	chara.lowerHP( damage );
	return damage;
    }
 
}
