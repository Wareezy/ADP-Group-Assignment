/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;


/**
 *
 * @author Ameer Ismail
 * 218216033
 */
public class SalesTest 
{
    
    private SalesTest sale1;
    private SalesTest sale2;
    private SalesTest sale4;
    
    
    @BeforeEach
    public void setUp() 
    {
        sale1 = new SalesTest();
        sale2 = new SalesTest();
        sale4 = sale2;
    }
    
    
    @Test
    public void testIdentity()
    {
        assertSame(sale4, sale2);  // test identity
    }
    
    
    @Test
    public void testEquality()
    {
        assertEquals(sale2, sale4); // test equality
    }  
    
    
    @Test
    public void testSetBeds()
    {
        fail("this will fail on purpose");  // test failure
    }    
 
    
    @Test
    @Timeout(9000)
    public void Mirrors()           // testing tiemout
    {
    }
  
    
    @Disabled
    @Test
    public void testGetDoors()
    {
        System.out.println("Door maintanence"); // deliberately Ignore Test
    }
    
  }
   
