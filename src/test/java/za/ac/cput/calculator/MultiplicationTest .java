/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.calculator;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author 220229171
 */
public class MultiplicationTest {
     
    private Multiplication multiplication1;
    private Multiplication multiplication2;
    private Multiplication multiplication3;

    
    @BeforeEach
    public void setUp() {
    multiplication1 = new Multiplication();
    multiplication2 = new Multiplication();
    multiplication3 = multiplication1;
    }
    
    @Test
    void testIdentity(){
        assertSame(multiplication1,multiplication3);
        //This method will see if these two variables are the same
    }
    
    @Test
    void testEquality(){
        assertEquals(multiplication1,multiplication2);
        //this method will compare these two variables
    }
    
    @Test
    @Disabled("This method needs to be reviewed")
    void setCalculateSum() {
        // This method will not execute
    }
    
    @Test
    void setCalculateVolume() {
        fail("This method still needs to be updated");
        //This method will fail on purpose
    }

    
    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    void setTax() {
        // fails if execution time exceeds the time limit
    }
}
   

