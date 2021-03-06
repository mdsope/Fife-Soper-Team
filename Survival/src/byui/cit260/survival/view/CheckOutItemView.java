/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

import byui.cit260.survival.control.InventoryControl;
import citbyui.cit260.survival.exceptions.GetTiaraException;
import citbyui.cit260.survival.exceptions.GetBootsException;
import citbyui.cit260.survival.exceptions.InventoryControlException;
import java.util.Scanner;

/**
 *
 * @author Tabitha
 */
public class CheckOutItemView extends View {

    public CheckOutItemView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n Congratulations please select a checkout item"
                + "\n-------------------------------------------------"
                + "\n T - Tiara"
                + "\n D - Dress"
                + "\n B - Boots"
                + "\n-------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // converts to upper case

        switch (choice) {
            case "T": // gets tiara 
                this.getTiara();
                break;
            case "D": // gets dress
                this.getSize();
                break;
            case "B": // display boots
                this.getBoots();
                break;
            default:
                System.out.println("\n*** Wrong Button Dummy!! *** do it again");
                break;
        }
        return false;
    }

    private void getTiara() {
        this.promptMessage = "Enter your height";
        // calln getInput to get value
        String value = this.getInput();
        double height = 0;
        double base = 0;
        // covert value entererd to integer
        try {
            height = Double.parseDouble(value);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number."
                    + "Try again or enter Q to quit.");
            return;
        }

        // set promptMessage = "Enter the width"
        this.promptMessage = "Enter your base";
        // calln getInput to get value
        value = this.getInput();
        // covert value entererd to integer
        try {
            base = Double.parseDouble(value);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number."
                    + "Try again or enter Q to quit.");
            return;
        }
        // covert value to integer
        // call control function to do whatever
        InventoryControl inventoryControl = new InventoryControl();
        try {
            inventoryControl.getTiara(base, height);
        } catch (GetTiaraException me) {
            System.out.println(me.getMessage());
            return;
        }

        this.promptMessage = "Congrats";

    }

    private void getSize() {
         this.promptMessage = "Enter your height";
        // calln getInput to get value
        String value = this.getInput();
        double length= 0;
        double width= 0;
        // covert value entererd to integer
        try{
            length = Double.parseDouble(value);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number."
                              +"Try again or enter Q to quit.");
            return;
        }

        // set promptMessage = "Enter the width"
        this.promptMessage = "Enter your base";
        // calln getInput to get value
        value = this.getInput();
        // covert value entererd to integer
        try{
        width = Double.parseDouble(value);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number."
                             +"Try again or enter Q to quit.");
            return;
        }
        // covert value to integer
        // call control function to do whatever
        InventoryControl inventoryControl = new InventoryControl();
        try {
            inventoryControl.getSize(width, length);
        } catch (InventoryControlException me) {
            System.out.println(me.getMessage());
            return;
        }

        this.promptMessage = "Congrats";
    }

    private void getBoots() {
        this.promptMessage = "Enter your height";
        // calln getInput to get value
        String value = this.getInput();
        double radius = 0;
        double height = 0;
        // covert value entererd to integer
        try {
            height = Double.parseDouble(value);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number."
                    + "Try again or enter Q to quit.");
            return;
        }

        // set promptMessage = "Enter the width"
        this.promptMessage = "Enter your radius";
        // calln getInput to get value
        value = this.getInput();
        // covert value entererd to integer
        try {
            radius = Double.parseDouble(value);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number."
                    + "Try again or enter Q to quit.");
            return;
        }
        // covert value to integer
        // call control function to do whatever
        InventoryControl inventoryControl = new InventoryControl();
        try {
            inventoryControl.getBoots(radius, height);
        } catch (GetBootsException me) {
            System.out.println(me.getMessage());
            return;
        }

        this.promptMessage = "Congrats";
    }
}
