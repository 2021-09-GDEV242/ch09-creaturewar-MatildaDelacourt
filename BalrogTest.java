import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BalrogTest.
 *
 * @author  Matilda Delacourt
 * @version 11.15.2021
 */
public class BalrogTest
{
    /**
     * Default constructor for test class BalrogTest
     */
    public BalrogTest()
    {
    }

    /**
     * Test that the health and strength are within correct range
     */
    @Test
    public void testInit(){
        Balrog balrog1 = new Balrog();
        assertTrue(balrog1.getHealth()>=80);
        assertTrue(balrog1.getHealth()<=200);
        
    }
}
