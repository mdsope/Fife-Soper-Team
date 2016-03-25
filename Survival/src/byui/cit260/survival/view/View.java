/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import survival.Survival;

/**
 *
 * @author Tabitha
 */
public abstract class View implements ViewInterface {
    protected String promptMessage;
    
    protected final BufferedReader keyboard = Survival.getInFile();
    protected final PrintWriter console = Survival.getOutFile();
    
    public View(){
    }
    
    public View(String message) {
        this.promptMessage = message;
    }
    @Override
    public void display() {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(value);
        } while (!done);

    }
    @Override
    public String getInput() {
        boolean valid = false; // initialize to not valid
        String selection = null;
        try {
        while (!valid) {//loop while an invalid value is enter
            // get the value entered in the keyboard
             selection = this.keyboard.readLine(); //get infile for keyboard
             selection = selection.trim();
            System.out.println("\n" + this.promptMessage);

           

            if (selection.length() < 1) {//value is blank
                System.out.println("\nInvalid value: val ue can not be blank");
                continue;
            }
            break;
        }
        } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
                }
        return selection;
    }
    
    
}
