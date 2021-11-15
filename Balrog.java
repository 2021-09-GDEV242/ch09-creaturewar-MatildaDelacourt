
/**
 * The Balrog class implements a wrapper for the base Demon class with the following additions
 * Implements a maximum/minimum strength for the creature type [100/50]
 * Implements a maximum/minimum hitpoint total for the creature type [200/80]
 * 
 * @author Matilda Delacourt
 * @version 11.15.2021
 */
public class Balrog extends Demon
{
    // instance variables
    private static final int MAX_B_HP = 200;
    private static final int MIN_B_HP = 80;
    private static final int MAX_B_STR = 100;
    private static final int MIN_B_STR = 50;
    
    /**
     * Constructor for objects of class Balrog
     * Calls the Creature constructor through the Demon constructor
     */
    public Balrog()
    {
        // initialise instance variables
       super(MAX_B_HP, MIN_B_HP, MAX_B_STR, MIN_B_STR);
    }
    
    /**
     * Balrog attacks 2x each round
     * 
     * @return the amount of damage
     */
    @Override
    public int damage(){
        int damage1 = super.damage();
        int damage2 = super.damage();
        return damage1 + damage2;
    }

}
