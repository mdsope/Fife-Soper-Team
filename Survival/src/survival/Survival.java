/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import byui.cit260.survival.model.Game;

/**
 *
 * @author Tabitha
 */
public class Survival {

    /**
     * @param args the command line arguments
     * push junk again
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        gameOne.setTotalTime(12.00);
        gameOne.setTimeLeft(6.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
    }
    
}
