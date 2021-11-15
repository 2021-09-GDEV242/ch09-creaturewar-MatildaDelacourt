

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfTest.
 *
 * @author Matilda Delacourt
 * @version 11.15.2021
 */
public class ElfTest
{
    /**
     * Default constructor for test class ElfTest
     */
    public ElfTest()
    {
    }
    
    /**
     * Test that the health and strength are within correct range
     */
    @Test
    public void testInit(){
        Elf elf1 = new Elf();
        assertTrue(elf1.getHealth()>=8);
        assertTrue(elf1.getHealth()<=25);
        
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
