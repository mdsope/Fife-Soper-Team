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
public class HelpMenuView extends View{

    private String menu;

    public HelpMenuView() {
        super("\n"
                + "\n-----------------------------------------"
                + "\n| Getting help                          |"
                + "\n-----------------------------------------"
                + "\nG - What is the goal of the game"
                + "\nM - How to Move"
                + "\nF - Fighting enemies"
                + "\nP - Picking up Items"
                + "\nE - End Game"
                + "\nQ - Quit"
                + "\n-----------------------------------------");
    }


    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "G": // create and start the new game
                this.goalOfGame();
                break;
            case "M": // get and start existing game
                this.mapAndMoving();
                break;
            case "F": // display help menu
                this.fightingEnemies();
                break;
            case "P": // save game
                this.pickingUpItems();
                break;
            case "E": // save game
                this.endGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;

        }
        return false;
    }

    private void goalOfGame() {

        System.out.println("*** goalOfGame() function called ***");
    }

    private void mapAndMoving() {
        MapAndMovingView mapAndMovingView = new MapAndMovingView();

        // Display the main menu view
        mapAndMovingView.display();
    }

    private void fightingEnemies() {
        System.out.println("*** fightingEnemies() function called ***");
    }

    private void pickingUpItems() {
        System.out.println("*** pickingUpItems() function called ***");
    }

    private void endGame() {
        System.out.println("*** endGame() function called ***");
    }
}
