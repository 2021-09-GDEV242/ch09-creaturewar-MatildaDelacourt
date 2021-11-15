

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class OrcTest.
 *
 * @author  Matilda Delacourt
 * @version 11.15.2021
 */
public class OrcTest
{
    /**
     * Default constructor for test class OrcTest
     */
    public OrcTest()
    {
        
    }
        
    /**
     * Test that the health and strength are within correct range
     */
    @Test
    public void testInit(){
        Orc orc1 = new Orc();
        assertTrue(orc1.getHealth()>=20);
        assertTrue(orc1.getHealth()<=40);
        
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
