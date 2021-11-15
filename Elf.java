
/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 *
 * @author Matilda Delacourt
 * @version 11.15.2021
 */
public class Elf extends Creature
{
    // instance variables
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
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
