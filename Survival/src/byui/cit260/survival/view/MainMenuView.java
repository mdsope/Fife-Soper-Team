/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

import byui.cit260.survival.control.GameControl;
import java.util.Scanner;
import survival.Survival;

/**
 *
 * @author macds
 */
public class MainMenuView {
    private String menu;
    public MainMenuView() {
    this.menu = "\n"
              + "\n-----------------------------------------"
              + "\n| Main Menu                             |"
              + "\n-----------------------------------------"
              + "\nN - Start new game"
              + "\nG - Get and start saved game"
              + "\nH - Get help on how to play the game"
              + "\nQ - Quit"
              + "\n-----------------------------------------";
    }
     public void displayMainMenuView() {
         boolean done = false; // set flag to not done
         do {
             // prompt for and get players name
             String menuOption = this.getMenuOption();
             if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                 return; // exit the game
             
             // do the requested action and display the next view
             done = this.doAction(menuOption);
         } while (!done);
         
    }
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value returned
        boolean valid = false; // initialize to not valid
        
        while(!valid){//loop while an invalid value is enter
                System.out.println("\n" + this.menu);
                
                value = keyboard.nextLine(); // get next line typed on keyboard
                value = value.trim();
                
                if (value.length() <1){//value is blank
                    System.out.println("\nInvalid value: val ue can not be blank");
                    continue;
                }
                break;
        }
        return value;
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "N": // create and start the new game
                this.startNewGame();
                break;
            case "G": // get and start existing game
                this.startExistingGame();
                break;
            case "H": // display help menu
                this.displayHelpMenu();
                break;
            case "S": // save game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return false;
    }
        private void startNewGame() {
            System.out.println("*** startNewGame function called ***");
        }
        private void startExistingGame() {
            System.out.println("*** startExistingGame function called ***");
        }
        private void saveGame() {
            System.out.println("*** saveGame function called ***");
        }
        private void displayHelpMenu() {
                    // Create MainMenuView Object
            HelpMenuView helpMenuView = new HelpMenuView();
            
            // Display the main menu view
            helpMenuView.displayHelpMenuView();
        }
    }

