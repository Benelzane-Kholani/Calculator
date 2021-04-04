/*
 * 216234107
 * Mogammad-Redar Behardien
 */
package za.ac.cput.calculator;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Redar
 */
public class TestAddition {
    private Addition instance;
    private Addition instance2;
    private Addition instance3;
    
    /**
     *Before Each : set up some instances of the class we are testing
     */
    @BeforeEach
    public void setUp() {
        instance= new Addition();
        instance2= new Addition();
        instance3=instance;}
    
    /**
     *Before All
     */
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    /**
     *After All
     */
    @AfterAll
    public static void tearDownClass() {
    }
    
    /**
     *after each
     */
    @AfterEach
    public void tearDown() {
    }
    /**
     * 1) Test of Equality of objects 
     */
    @Test
    public void testEqual() {//test for object equality here
        instance = new Addition();
        assertEquals(5,instance.add(3, 2),   "error in add()");
        assertEquals( -3, instance.add(-1, -2),"error in add()");
        assertEquals( 9, instance.add(9, 0), "error in add()");
    }
 
    /**
     *Test not equal
     */
    @Test
    public void testNotEqual() {
                instance = new Addition();
        assertNotEquals( 0, instance.add(1, 2),"error in add()");
    }
    /**
    * 2) Test of Identity of objects
    */
    @Test
    void testIdentity(){
    assertSame(instance,instance2);
    assertNotSame(instance,instance3);}
    
   /**
   *5) Test of Disabled
   *@throws java.lang.Exception
   */
    @Disabled("Disabled test")
    @Test
    void testCustomerServiceGet() {
        System.out.println("Addition JUnit5 Test:test- disabling");
        assertEquals(2, instance.add(2,2));
    }
    @Test
    void test3Plus3() {
        assertEquals(6, instance.add(3,3));
    }
    
    
    /**
     * 3) Test of Fail
     */
  // @fail
   @Test
    void failingTest() {
       fail("a failing test");
   }         
   @Test
   void abortedTest() {
       assumeTrue("abc".contains("Z"));
       fail("test should have been aborted");
  }    
   
   
    /**
     * 4) Test of Timeout
     */
   @Test
   @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
   public void testTimeout(){
       instance = new Addition();
       System.out.println("Addition JUnitTest :test add method - test WithTimeout()");
       final int addto =1+(int)(30000*Math.random());
       final int addthis =1+(int)(30000*Math.random());
       System.out.println("addition of:"+String.valueOf(addto)+"+"+String.valueOf(addthis));
       System.out.println(String.valueOf(addto)+"+"+String.valueOf(addthis)+"="+instance.add(addto,addthis));
    }
    /**
     * Test of add method, of class Addition. An over all test
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        instance = new Addition();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
   
    
}
