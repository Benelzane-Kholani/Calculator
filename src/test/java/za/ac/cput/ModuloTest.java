/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.calculator;


import static java.time.Duration.ofMillis;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Benelzane Kholani 218257465
 */
public class ModuloTest {

    private Modulo mod;
    private Modulo mod1;
    private Modulo mod2;

    @BeforeEach
    public void setUp() {
    mod  = new Modulo();
    mod1 = new Modulo(4,3);
    mod2 = mod;
    }

    //Testing for object Equality
    @Test
    public void testEquality(){
        //assertEquals(mod,mod1); Test failed mod is not equal to mod1
        assertEquals(mod,mod2);// Test passed mod equals mod2
    }//end of testEquality method

    //Testing for object Identity
    @Test
    public void testIdentity(){
    //assertSame(mod,mod2);// Test passed mod == mod2
    assertSame(mod,mod1);//Test failed mod != mod1
    }//end of testIdentity method

    //Failing a test
    @Test
    public void falingTest(){
    fail("The following test will fail");//failing a test that returns true when tested
    assertSame(mod,mod2);
    }//end of falingTest method

    //Testing for timeouts
    @Test
    public void testTimeOuts(){
    assertTimeout(ofMillis(5000), () -> {
    assertEquals(mod, mod2);
        });
    }//end of TestTimeOuts method

     //Disabling a test
     @Test
     @Disabled("Disabled until a new feature is implemented")
    public void testSetNumber1() {
        System.out.println("setNumber1");
        int expected = 1;
        int result   = mod1.answer();
        assertEquals(expected, result);
    }//end of testSetNumber1 method

}//end of ModuloTest class
