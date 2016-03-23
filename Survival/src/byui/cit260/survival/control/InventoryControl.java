/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.control;

import citbyui.cit260.survival.exceptions.GetTiaraException;
import citbyui.cit260.survival.exceptions.InventoryControlException;

/**
 *
 * @author Tabitha
 */
public class InventoryControl {

    public void getSize(double length, double width) throws InventoryControlException {

        if (length < 0) {
            throw new InventoryControlException("The length that you have Chosen"
                                              + "is less than zero so you got it"
                                              + "Wrong! Try Again.");
        }
        if (width < 0) {
            throw new InventoryControlException("The width that you have Chosen"
                                              + "is less than zero so you got it"
                                              + "Wrong! Try Again.");
        }
        double area = length * width;
        if (area > 30) {
            throw new InventoryControlException("The length and width that you have Chosen"
                                              + "makes the area greater than 30 so you got it"
                                              + "Wrong! Try Again.");
        }
        if (area < 20) {
            throw new InventoryControlException("The length and width that you have Chosen"
                                              + "makes the area less than 20 so you got it"
                                              + "Wrong! Try Again.");
        }
        

    }

    public void getTiara(double base, double height) throws GetTiaraException {

        if (base < 0) {
            throw new GetTiaraException("The base that you have Chosen"
                                              + "is less than zero so you got it"
                                              + "Wrong! Try Again.");
        }
        if (height < 0) {

            throw new GetTiaraException("The height that you have Chosen"
                                              + "is less than zero so you got it"
                                              + "Wrong! Try Again.");
        }

        double area = (6 * base * height) + (3 * Math.sqrt(3 * Math.pow(base, 2)));
        if (area > 90 || area < 80) {
            throw new GetTiaraException("The radius and height that you have Chosen"
                                              + "makes the volume less than 70 or"
                                              + "greater than 80 so you got it Wrong! Try Again.");
        }

        
    }

    public void getBoots(double radius, double height) throws InventoryControlException {
        if (radius < 0) {
            throw new InventoryControlException("The radius that you have Chosen"
                                              + "is less than zero so you got it"
                                              + "Wrong! Try Again.");
        }
        if (height < 0) {
            throw new InventoryControlException("The height that you have Chosen"
                                              + "is less than zero so you got it"
                                              + "Wrong! Try Again.");
        }
        double volume = Math.PI * Math.pow(radius, 2) * (height);

        if (volume > 80) {
            throw new InventoryControlException("The radius and height that you have Chosen"
                                              + "makes the volume greater than 80 so you got it"
                                              + "Wrong! Try Again.");
        }
        if (volume < 70) {
            throw new InventoryControlException("The radius and height that you have Chosen"
                                              + "makes the volume less than 70 so you got it"
                                              + "Wrong! Try Again.");
        }
        

    }
}
