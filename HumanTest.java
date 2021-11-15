

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HumanTest.
 *
 * @author  Matilda Delacourt
 * @version 11.15.2021
 */
public class HumanTest
{
    /**
     * Default constructor for test class HumanTest
     */
    public HumanTest()
    {
    }
    
    /**
     * Test that the health and strength are within correct range
     */
    @Test
    public void testInit(){
        Human human1 = new Human();
        assertTrue(human1.getHealth()>=5);
        assertTrue(human1.getHealth()<=25);
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
