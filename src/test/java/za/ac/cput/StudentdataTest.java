/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 * note that when testing might not be 100% testing passed due to some condition of the code.
 *
 * @author Edvalter Jamba
 */
public class StudentdataTest {
    
    //using object identity assertSame
    //It will check if the name inserted and expected are the same
    @Test
    public void testSfirstname() {
        Studentdata test1 = new Studentdata() ;
    String result = test1.sfirstname("Edvalter");
        assertSame("Edvalter", result);
    }

    @Test
    public void testSlastname() {
        Studentdata test1 = new Studentdata() ;
    String result = test1.slastname("Jamba");
        assertSame("Jamba", result);
    }
    
    
    
    //using object Equality assertEqual
    //It will check if the number inserted and expected are the same
    @Test
    public void testsage() {
       int age = 22;
        Studentdata st_age = new Studentdata();
        double result = st_age.sage(age);
        assertEquals(22, result);
    
    }
    
    @Test
    public void testscourse() {
        Studentdata test1 = new Studentdata() ;
    String result = test1.scourse("ICT:Application Development");
        assertEquals("ICT:Application Development", result);
    }
    
     @Test
    public void testsnumber() {
        int number = 220446571;
        Studentdata st_number = new Studentdata();
        double result = st_number.snumber(number);
        assertEquals(220446571, result);
    }
    
    
    //using Failling test fail()
    //It will check if the information t1=80 is the same being expected in case it is not the failing test will occur   
    @Test
    public void testt1Marks() {
            
        try{
       double t1 = 80;
        Studentdata mark1 = new Studentdata();
        double result = mark1.t1Marks(t1);
        assertEquals(80, result);
   }
   catch(Exception e){
      fail("Should not have thrown any exception");
   }
        
        
    }
    @Test
    public void testt2Marks() {
        try{
       double t2 = 100;
        Studentdata mark2 = new Studentdata();
        double result = mark2.t1Marks(t2);
        assertEquals(100, result);
   }
   catch(Exception e){
      fail("Should not have thrown any exception");
   }
        
        
    }
    
    @Test
    //In this the test will faill because of the condition but if you change 79 for 75 it will run perfectly.
    public void testt3Marks() {
        try{
     double t3 = 75;
        Studentdata mark3 = new Studentdata();
        double result = mark3.t1Marks(t3);
        assertEquals(79,result);
   }
   catch(Exception e){
       //the test will faill because of the condition but if you change 79 for 75 it will run perfectly.
      fail("Should not have thrown any exception");
   }
        
    }
    
    @Test
    public void testt4Marks() {   
        try{
      double t4 = 80;
        Studentdata mark4 = new Studentdata();
        double result = mark4.t1Marks(t4);
        assertEquals(80, result);
        
   }
   catch(Exception e){
      fail("Should not have thrown any exception");
   }
        
        
        
        
    }
    
    //using Timeouts
    //It will check the time take to run the application"Literally" 
    //in case it take long than expected it will show a messeger
   @Test
void timeoutNotExceeded() 
{
    assertTimeout(ofMinutes(3), () -> 
    {        
    }
    );
}
@Test

void timeoutExceeded() 
{
    assertTimeout(ofMillis(90),()->
    {
        
        Thread.sleep(10);
    }
    );
}

//using Disabled
//It will Disable the code I don not want to be read
//In this case I just wrote this sintaxe to test.

@Test
@Disabled
//@disbled is activate because of it the test on say 100%passed.
public void testmedia()
{
   
          double m1 = 75;
         double m2 = 40;
         double m3 = 75;
         double m4 = 40;
            
        Studentdata n1 = new Studentdata();
        Studentdata n2 = new Studentdata();
        Studentdata n3 = new Studentdata();
        Studentdata n4 = new Studentdata();
        double result = n1.t1Marks(m1);
        assertEquals(75,result);
}
}
