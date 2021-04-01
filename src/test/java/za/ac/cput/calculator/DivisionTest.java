package za.ac.cput.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author 219446482 - Daniella Burgess
 */
public class DivisionTest {
    
    public Division division;
  
    public DivisionTest() {
    }
    
    @BeforeEach
    public void setUp() {
        this.division = new Division();
    }
    
   @Test
   public void testEquality(){
      assertEquals(6, 6);
   }
   
   @Test
   public void testIdentity(){
      assertSame(10, 10);
   }
   
   @Disabled("Disabled until bug #99 has been fixed")
    class DisabledClass{
       @Test
       void testWiilBeSkipped(){
   }
    /**
     * Test of division method, of class Calculator.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int a = 0;
        int b = 0;
        Division instance = new Division();
        int expResult = 0;
        int result = instance.division(a, b);
        assertEquals(expResult, result);
        
    }
    
}
}
