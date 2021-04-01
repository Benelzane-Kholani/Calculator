package za.ac.cput.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author 219446482
 */
public class CalculatorTest {
    
    public Calculator calculator;
  
    public CalculatorTest() {
    }
    
    @BeforeEach
    public void setUp() {
        this.calculator = new Calculator();
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
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.division(a, b);
        assertEquals(expResult, result);
        
    }
    
}
}
