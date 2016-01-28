/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import byui.cit260.survival.model.Game;
import byui.cit260.survival.model.Player;

/**
 *
 * @author Tabitha
 */
public class Survival {

    /**
     * @param args the command line arguments
     * push junk again no
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        gameOne.setTotalTime(12.00);
        gameOne.setTimeLeft(6.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Player playerOne = new Player();
        playerOne.setName ("steve");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
    }

}
