
/**
 * The Hobbit class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [30/20]
 * Implements a maximum/minimum hitpoint total for the creature type [35/15]
 *
 * @author Matilda Delacourt
 * @version 11.15.2021
 */
public class Hobbit extends Creature
{
    // instance variables
    private static final int MAX_HOBBIT_HP = 35;
    private static final int MIN_HOBBIT_HP = 15;
    private static final int MAX_HOBBIT_STR = 30;
    private static final int MIN_HOBBIT_STR = 20;

    /**
     * Constructor for objects of class Hobbit
     */
    public Hobbit()
    { // initialise instance variables
        super(
            Randomizer.nextInt(MAX_HOBBIT_HP-MIN_HOBBIT_HP)+MIN_HOBBIT_HP,    
            Randomizer.nextInt(MAX_HOBBIT_STR-MIN_HOBBIT_STR)+MIN_HOBBIT_STR
        );
    }
}