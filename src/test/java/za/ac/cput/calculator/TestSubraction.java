/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.calculator;
import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
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
 * @author zaihd
 */
public class TestSubraction 
{    
   private String instance1;
   private String instance2;
   private String instance3;


                //Idenetity of object
                @Test
                void testIdentity()
                {
                assertSame(instance1,instance3);
                assertNotSame(instance1,instance2);
                }
                 
                @Test
                void failTest() 
                            {
                                fail("a failing test");
                            }         

                void abortTest() 
                            {
                                assumeTrue("424".contains("4"));
                                fail("aborted");
                            }    
                
                
                //Test of Disabled
                @Disabled("Disabled test")
                @Test
                void test()
                    {
                    System.out.println("Sub JUnit5:test- disbled");
                    Equals(2, instance1.subtract(3,3));
                    }
                
                @Test
                void testSub()
                    {
                    Equals(7, instance1.subtract(6,3));
                    }
                
                
                
                //Timeout
                @Test
                @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
                            public void testTimeout()
                                {
                                    instance1 = new String();
                                    System.out.println("Subtracting JUnitTest :test sub method - test Timeout()");
                                    final double subto =1+(int)(1452*Math.random());
                                    final double subthis =1+(int)(1452*Math.random());
                                    System.out.println("Subraction :"+String.valueOf(subto)+"+"+String.valueOf(subthis));
                                    System.out.println(String.valueOf(subto)+"+"+String.valueOf(subthis)+"="+instance1.sub(subto,subthis));
                                }        


        

 
}




        
        
        
        

