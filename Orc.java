
/**
 * The Orc class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [40/20]
 * Implements a maximum/minimum hitpoint total for the creature type [40/20]
 *
 * @author Matilda Delacourt
 * @version 11.15.2021
 */
public class Orc extends Creature
{
      // instance variables
    private static final int MAX_ORC_HP = 40;
    private static final int MIN_ORC_HP = 20;
    private static final int MAX_ORC_STR = 40;
    private static final int MIN_ORC_STR = 20;


    /**
     * Constructor for objects of class Orc
     */
    public Orc()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_ORC_HP-MIN_ORC_HP)+MIN_ORC_HP,    
            Randomizer.nextInt(MAX_ORC_STR-MIN_ORC_STR)+MIN_ORC_STR
        );
    }
     /**
     * There is a 10% chance to do 2x damage
     */
    @Override
    public int damage(){
        int chance = Randomizer.nextInt(10);
        if ( chance == 1 ){
            return super.damage() * 2;
        }
        return super.damage();
    }
}
