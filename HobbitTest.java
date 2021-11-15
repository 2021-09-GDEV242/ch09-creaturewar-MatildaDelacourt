

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class HobbitTest.
 *
 * @author  Matilda Delacourt
 * @version 11.15.2021
 */
public class HobbitTest
{
    /**
     * Default constructor for test class HobbitTest
     */
    public HobbitTest()
    {
    }
  
    /**
     * Test that the health and strength are within correct range
     */
    @Test
    public void testInit(){
        Hobbit hobbit1 = new Hobbit();
        assertTrue(hobbit1.getHealth()>=15);
        assertTrue(hobbit1.getHealth()<=35);
        
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
