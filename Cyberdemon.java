
/**
 * The Cyberdemon class implements a wrapper for the base Demon class with the following additions
 * Implements a maximum/minimum strength for the creature type [40/20]
 * Implements a maximum/minimum hitpoint total for the creature type [100/25]
 * 
 * @author Matilda Delacourt
 * @version 11.15.2021
 */
public class Cyberdemon extends Demon
{
    // instance variables
    private static final int MAX_CD_HP = 100;
    private static final int MIN_CD_HP = 25;
    private static final int MAX_CD_STR = 40;
    private static final int MIN_CD_STR = 20;

    /**
     * Constructor for objects of class Cyberdemon
     * Calls the Creature constructor through the Demon constructor
     */
    public Cyberdemon()
    {

        super(MAX_CD_HP, MIN_CD_HP, MAX_CD_STR, MIN_CD_STR);
    }


}
