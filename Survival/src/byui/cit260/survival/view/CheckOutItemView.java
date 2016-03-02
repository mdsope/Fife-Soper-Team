/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

import byui.cit260.survival.control.InventoryControl;
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
                this.getDress();
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
        // covert value entererd to integer
        double height = Double.parseDouble(value);

        // set promptMessage = "Enter the width"
        this.promptMessage = "Enter your base";
        // calln getInput to get value
        value = this.getInput();
        // covert value entererd to integer
        double base = Double.parseDouble(value);
        // covert value to integer
        // call control function to do whatever
        InventoryControl inventoryControl = new InventoryControl();
        double tiara = inventoryControl.getTiara(base, height);

        // if unsuccessful then display error and return
        if (tiara == -1) {
            this.promptMessage = "Base or Height is below 0";
        } else if (tiara == -4) {
            this.promptMessage = "Area is not within 80 or 90";
        } // if successful then display succes message
        else if (tiara > 0) {
            this.promptMessage = "Congrats";
        } // if something crazy happens
        else {
            this.promptMessage = "uuuuuhhh somethings wrong";
        }
    }

    private void getDress() {
        System.out.println("\n getDress function called");
    }

    private void getBoots() {
        System.out.println("\n getBoots function called");
    }
}
