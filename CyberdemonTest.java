

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CyberdemonTest.
 *
 * @author  Matilda Delacourt
 * @version 11.15.2021
 */
public class CyberdemonTest
{
    /**
     * Default constructor for test class CyberdemonTest
     */
    public CyberdemonTest()
    {
        
    }
    
    /**
     * Test that the health and strength are within correct range
     */
    @Test
    public void testInit(){
        Cyberdemon cyberdemon1 = new Cyberdemon();
        //System.out.println("Health: "+balrog1.getHealth());
        assertTrue(cyberdemon1.getHealth()>=25);
        assertTrue(cyberdemon1.getHealth()<=100);
        
    }
}
