/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tabitha
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of getSize method, of class InventoryControl.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        System.out.println("\tTest case #1'");
        double length = 4.0;
        double width = 6.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 24.0;
        double result = instance.getSize(length, width);
        assertEquals(expResult, result, 0.4);
       
        
                System.out.println("\tTest case #2'");
         length = -1.0;
         width = 6.0;
         expResult = -1.0;
         result = instance.getSize(length, width);
        assertEquals(expResult, result, 0.4);
        
            System.out.println("\tTest case #3'");
         length = 4.0;
         width = -1.0;
         expResult = -1.0;
         result = instance.getSize(length, width);
        assertEquals(expResult, result, 0.4);
        
            System.out.println("\tTest case #4'");
         length = 4.0;
         width = 4.0;
         expResult = -3.0;
         result = instance.getSize(length, width);
        assertEquals(expResult, result, 0.4);
        
            System.out.println("\tTest case #5'");
         length = 8.0;
         width = 4.0;
         expResult = -4.0;
         result = instance.getSize(length, width);
        assertEquals(expResult, result, 0.4);
    }
    
}