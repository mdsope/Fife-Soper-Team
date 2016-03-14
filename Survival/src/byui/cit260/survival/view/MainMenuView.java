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
public class MainMenuView extends View {

    

    public MainMenuView() {
        super("\n"
                + "\n-----------------------------------------"
                + "\n| Main Menu                             |"
                + "\n-----------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nQ - Quit"
                + "\n-----------------------------------------");
    }
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "N": // create and start the new game
                GameControl.createNewGame(Survival.getPlayer());
                GameView gameView = new GameView();
                gameView.display();
                break;
            case "G": // get and start existing game
                this.startExistingGame();
                break;
            case "H": // display help menu
                this.displayHelpMenu();
                break;
            case "S": // save game
                this.saveGameMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;

        }
        return false;
    }

   private void displayGameView() {
        // Create MainMenuView Object
        GameView gameView = new GameView();

        // Display the main menu view
        gameView.display();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void saveGameMenu() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }

    private void displayHelpMenu() {
        // Create MainMenuView Object
        HelpMenuView helpMenuView = new HelpMenuView();

        // Display the main menu view
        helpMenuView.display();
    }
}
