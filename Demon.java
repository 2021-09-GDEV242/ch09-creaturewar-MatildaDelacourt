
/**
 * Abstract base class for all demon classes. Chance for extreme magical damage for all demons
 * 
 * @author Matilda Delacourt
 * @version 11.15.2021
 */
public abstract class Demon extends Creature
{
    /**
     * Calls the Creature constructor to randomize stats
     * 
     * @param maxHP maximum HP
     * @param minHP minimum HP
     * @param maxStr maximum strength
     * @param minSt minimum strength
     */
    public Demon(int maxHP, int minHP, int maxStr, int minStr){
        super(
            Randomizer.nextInt(maxStr-minStr)+minStr,
            Randomizer.nextInt(maxHP-minHP)+minHP
        );
    }
    
    /**
     * There is a 5% chance to do magical damage +50
     * @return the amount of damage
     */
    @Override
    public int damage(){
        int chance = Randomizer.nextInt(20);
        if ( chance == 1 ) {
            return super.damage() + 50;
        }
        return super.damage();
    }
}
