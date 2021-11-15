import java.util.ArrayList;
import java.util.Iterator;
/**
 * A battle simulator with 2 armies that challenge each other 1 creature at a time
 * 
 * @author Matilda Delacourt
 * @version 11.15.2021
 */
public class Simulator
{
    // instance variables
    private ArrayList<Creature> goodArmy = new ArrayList<Creature>();
    private ArrayList<Creature> badArmy = new ArrayList<Creature>();
    
    //current step of the battle
    private int step = 1;
    
    // used to loop through current battle participants
    private Iterator<Creature> itr;
    private Creature armyOneCreature;
    private Iterator<Creature> badItr;
    private Creature armyTwoCreature;
    

    /**
     * Constructor for objects of class Simulator
     */
    public Simulator()
    {
        populate();
        match();
        
    }

    /**
     * Randomly populate the Good and Evil armies
     */
    private void populate(){
        
        // first populate Good
        for(int count = 0; count < 100; count++){
            int goodChance = Randomizer.nextInt(10);
            if(goodChance <= 2){
                goodArmy.add(new Orc());
            }
            else if(goodChance <= 6){          
                goodArmy.add(new Human());
            }
            else if(goodChance <= 8){
                goodArmy.add(new Elf());
            }
            else{
                goodArmy.add(new Hobbit());
            }
        }
        
        // second populate Bad
        // army is smaller
        for(int count = 0; count < 50; count++){
            int badChance = Randomizer.nextInt(25);
            
            if(badChance <= 18){          
                badArmy.add(new Human());
            }
            else if(badChance <= 24){
                badArmy.add(new Cyberdemon());
            }
            else{
                badArmy.add(new Balrog());
            }
        }
        
    }
    
    /**
     * Soldiers attack at the same time with 4 possible outcomes
     * They both lose, one loses, or both go to next round
     */
    public void simultaneousBattle(){
        
            //the Good soldier attacks first
            int damage = armyOneCreature.damage();
            System.out.println("Good attacks for: "+damage);
            
            //the Bad Soldier takes damage
            armyTwoCreature.takeDamage(damage);
            System.out.println("Evil health remaining: "+armyTwoCreature.getHealth());
            
            //the Bad solider attacks next
            damage = armyTwoCreature.damage();
            System.out.println("Evil attacks for: "+damage);
            
            //the Good Soldier takes damage
            armyOneCreature.takeDamage(damage);
            System.out.println("Good health remaining: "+armyOneCreature.getHealth());
            
            // both knocked out
            if(armyTwoCreature.isKnockedOut() && armyOneCreature.isKnockedOut()){
                 
                System.out.println("\nGood and Evil are both defeated");
                 
                if(badItr.hasNext() && itr.hasNext()){
                    armyTwoCreature= badItr.next();   
                    armyOneCreature= itr.next();
                    ++step;
                    printStatus();
                    return;
                }
                else{
                    armyTwoCreature=null;   
                    armyOneCreature=null;
                }
                
            } 

            // Bad is knocked out
            else if(armyTwoCreature.isKnockedOut()){
                
                System.out.println("\nEvil is defeated");
                
                if(badItr.hasNext()){
                    armyTwoCreature= badItr.next();   
                    ++step;
                    printStatus();
                    return;
                }
                else{
                    armyTwoCreature=null;     
                }
                
            }
            
            // Good is knocked out
            else if(armyOneCreature.isKnockedOut()){
                 
                System.out.println("\nGood is defeated");
                 
                if(itr.hasNext()){
                    armyOneCreature= itr.next();   
                    ++step;
                    printStatus();
                    return;
                }
                else{
                    armyOneCreature=null;     
                }
                
            }
            // no winners
            else if(!armyTwoCreature.isKnockedOut() && !armyOneCreature.isKnockedOut()){
                System.out.println("\nNo winner");
                
                ++step;
                printStatus();
                return;
            }        
    }
    
    /**
     * Use this to print the round number and the combatants health/stats
     */
    public void printStatus(){
            System.out.print("\nRound "+step);
            
            if(armyOneCreature instanceof Hobbit){
                System.out.print(": Hobbit");
            }
            else if(armyOneCreature instanceof Orc){
                System.out.print(": Orc");
            }
            else if(armyOneCreature instanceof Human){
                System.out.print(": Human");
            }
            else if(armyOneCreature instanceof Elf){
                System.out.print(": Elf");
            }
            System.out.print(" (HP: "+ armyOneCreature.getHealth() + ") vs. ");
            
            if(armyTwoCreature instanceof Human){
                System.out.print("Evil Human");
            }
            else if(armyTwoCreature instanceof Cyberdemon){
                System.out.print("Cyberdemon");
            }
            else if(armyTwoCreature instanceof Balrog){
                System.out.print("Balrog");
            }
            System.out.println(" (HP: "+ armyTwoCreature.getHealth() + ")");
    }
    
    /**
     * Runs the battle
     */
    public void match(){
        
           //get Good creature
           itr = goodArmy.iterator();
           armyOneCreature = itr.next();
            
           //get Bad creature
           badItr = badArmy.iterator();
           armyTwoCreature = badItr.next();
            
           printStatus();
            
           //while both good army array and bad army array have members
           //keep looping
            while(armyOneCreature!=null && armyTwoCreature!=null){
  
                 simultaneousBattle();
                 
            }
                        
           //print final outcome
           if(armyOneCreature==null && armyTwoCreature==null){
                System.out.println("\n-----There are NO survivors-----\n");
           }
           else if(armyOneCreature==null){
                System.out.println("\n-----Bad Army WON-----\n");
           }   
           else if(armyTwoCreature==null){
               System.out.println("\n-----Good Army WON-----\n");
           }

    }
    
    /**
     * Main function
     */
    public static void main(String args[]){
        new Simulator();
    }

}
