/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

;

import byui.cit260.survival.control.GameControl;
import byui.cit260.survival.model.Player;
import java.util.Scanner;

/**
 *
 * @author Tabitha
 */
public class StartProgramView {
    private String promptMessage;
    public StartProgramView(){
this.promptMessage = "\nPlease enter your name:"; 
this.displayBanner();

        }

    private void displayBanner() {
        System.out.println(
                "\n*********************************************************"
                + " \n*                                                       *"
                + " \n*                                                       *"
                + " \n* Welcome to Survival as the protagonist,               *"
                + " \n* you will be searching for a few very important items  *"
                + " \n* that you must obtain                                  *"
                + " \n* for your daughters third Birthday party.              *"
                + " \n* While looking for these items                         *"
                + " \n* you will will encounter various enemies               *"
                + " \n* These enemies may range                               *"
                + " \n* from the worlds most unintelligent Zombies            *"
                + " \n* to the most intelligent spooky department store       *"
                + " \n* employees                                             *"
                + " \n* The world seems bleak as time goes on                 *"
                + " \n* because you need to get back home before 6            *"
                + " \n* to turn off the crock pot,                            *"
                + " \n* so that your roast doesnt go bad                      *"
                + " \n* Your character is kind of at top physical fitness     *"
                + " \n* for a middle aged man or woman                        *"
                + " \n* so it will be easy to overcome a weak enemy           *"
                + " \n* they have to be weak.                                 *"
                + " \n*********************************************************"
                         );
    }

    public void displayStartProgramView() {
         boolean done = false; // set flag to not done
            do{ 
                //prompt for and get players name
                String playersName = this.getPlayersName();
                if (playersName.toUpperCase().equals("Q")) //user wants to quit
                    return; //exit the game
                
                // do the requsted action and display the next view
                done = this.doAction(playersName);
                
            }while (!done);
            
            private boolean doAction(String playersName){
                if (playersName.length() < 2){
                    System.out.println("\n Invalid players name:"
                    + "The Name must be greater than one character in length");
                return false;
            }
        Player player = GameControl.createPlayer(playersName);
        
        if (player==null){// if unsuccesful
            System.out.println("\nError creating the player.");
            return false;
        }
        
   }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value returned
        boolean valid = false; // initialize to not valid
        
        while(!valid){//loop while an invalid value is enter
                System.out.println("\n" + this.promptMessage);
                
                value = keyboard.nextLine(); // get next line typed on keyboard
                value = value.trim();
                
                if (value.length() <1){//value is blank
                    System.out.println("\nInvalid value: value can not be blank");
                    continue;
                }
                break;
        }
        return value;
    }

    private boolean doAction(String playersName) {
         System.out.println("\n*** doAction() called ***");
                 return true;
    }
}

    



