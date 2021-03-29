/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rause
 */
public class AdditionTest {
    
    public AdditionTest() {
    }
         @Test
   public void testAddPass() {//test for object equality here
      // assertEquals(String message, long expected, long actual)
      Addition instance = new Addition();
      assertEquals(3,instance.add(1, 2),   "error in add()");
      assertEquals( -3, instance.add(-1, -2),"error in add()");
      assertEquals( 9, instance.add(9, 0), "error in add()");
   }
 
   @Test
   public void testAddFail() {
       Addition instance = new Addition();
      // assertNotEquals(String message, long expected, long actual)
      assertNotEquals( 0, instance.add(1, 2),"error in add()");
   }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


    //public static void assertSame([String message,] Object expected, Object actual)
      // Same Object: expected == actual   
    // public static void fail();
    //public static void fail('failed');
    //public static void assertNotSame(.....)
    // public class TimeoutTest {
    //@Test(timeout=1000)  // milliseconds
    //public void test() {
    //  while (true) {}
    //}
   @Test(timeout=1000)
   public void testTimeout(){
       System.out.println("Addition JUnitTest :test add method - test WithTimeout()");
       final int addto =1+(int)(30000*Math.random());
        final int addthis =1+(int)(30000*Math.random());
        Addition instance = new Addition();
        System.out.println("addition of:"+String.valueOf(addto)+"+"+String.valueOf(addthis));
        System.out.println(String.valueOf(addto)+"+"+String.valueOf(addthis)+"="+instance.add(addto,addthis));
    }
    /**
     * Test of add method, of class Addition.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        Addition instance = new Addition();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
