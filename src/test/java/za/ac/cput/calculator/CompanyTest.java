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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author HP
 */
public class CompanyTest {
    
    private Company  Secretary;
    private Company  Manager;
    private Company  Employee;
    
    @BeforeEach
    public void setUp()
    {
        Secretary=new Company();
        Manager=Employee;
    }
   
    @Test
    public void testEquality() 
    {
        assertEquals(Manager,Employee);
    }
      @Test
    public void testIdentity() 
    {
        assertSame(Manager,Employee);
    }
    @Test
    public void FailingTest() 
    {
        int num=2,num1=3;
        int total=75;
        fail("deliberately made the test fail");
        
    }
    
  @Disabled
  @Test
  public void testDisabled()
  {
      System.out.println("the test is Disable"); 
         
  }
  
  @Test
  @Timeout(1000)
  public void timeoutTest()
  {
      while (true);
  }
}
