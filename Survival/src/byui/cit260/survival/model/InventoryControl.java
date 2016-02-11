/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.model;

/**
 *
 * @author Tabitha
 */
public class InventoryControl {
    public double getSize(double length, double width){
            
    if (length < 0){
        return -1;
    }
if (width < 0) {
    return -1;
}
double area = length * width; 
if (area > 30){
    return -4;
}
if (area < 20) {
    return  -3;
    }
return area;

    }
}
