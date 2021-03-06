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


public class StartProgramView extends View {

    public StartProgramView() {
        super( "\n*********************************************************"
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
                + "+\n\n Please Enter your name:");
        
        

    }

    

    @Override
    public boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\n Invalid players name:"
                    + "The Name must be greater than one character in length");
            return false;
        }
        Player player = GameControl.createPlayer(playersName);

        if (player == null) {// if unsuccesful
            System.out.println("\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n==========================================="
                + "\n Welcome to the game " + player.getName()
                + "\n we hope you hava a lot of fun!"
                + "\n==========================================="
        );

        // Create MainMenuView Object
        MainMenuView mainMenuView = new MainMenuView();

        // Display the main menu view
        mainMenuView.display();

    }

}
