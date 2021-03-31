/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

219005303
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.adp.group.assignment.Employee;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author warre
 */
public class EmployeeTest {
    private Employee employee1;
    private Employee employee2;
    private Employee employee3;
   
 
    
    @BeforeEach
    public void setUp() {
          employee1= new Employee();
        employee2= new Employee();
        employee3=employee1;
    }
    @Test
           /*This will test the Identity*/
   void testIdentity()
   {
       assertSame(employee1,employee3);
   }
   @Test
                 /*This will test the Equality*/
   void testEquality()
   {
       assertEquals(employee1,employee3);
   }
   @Test
   /*This will perform  a timeoutFunction*/
   @Timeout(10)
   public void testTimeOut()throws InterruptedException
   {
       while(true)
       {
           Thread.sleep(300);
       }
   }
   @Test
           /*This will deliberatly fail a test*/
   void FailingTest()
   {
       fail("This test will be deliberatly failed");
   }
   @Test
   /*This will disable the test*/
   @Disabled("Purposely disabling this test")
   public void testDisabled()
   {}
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
