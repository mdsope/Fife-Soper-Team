/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import byui.cit260.survival.model.Game;
import byui.cit260.survival.model.Player;
import byui.cit260.survival.view.StartProgramView;



/**
 *
 * @author Tabitha
 */
public class Survival {
    
    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Survival.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Survival.player = player;
    }
    private static Player player = null;

    /**

     * @param args the command line arguments
     
     */

    
    //displays the start program view
     
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        /*
        // Create MainMenuView Object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        // Display the main menu view
        helpMenuView.displayHelpMenuView();
        */    
        
            
        }
        
        
        
     }


