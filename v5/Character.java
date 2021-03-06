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
        int damage = (int) ( strength * attack );
        // deal with negative damage values
        if (chara.getDefense() > damage) {
                damage = (int) (damage * .15);
        }
        else {
                damage -= chara.getDefense();
        }
        chara.lowerHP( damage );
        return damage;
}

public int getHP(){
        return health;
}


// to be overwritten by two subclasses (Ogre Priest and Priest)
public void regenerate(){

}
//public abstract void about(); // to be added in Protagonist
//regenerate if your class allows for it



}
