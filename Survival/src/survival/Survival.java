/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import byui.cit260.survival.model.Game;
import byui.cit260.survival.model.Map;

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
    Map aMap = new Map();
    
    aMap.setRowCount(6);
    aMap.setColumnCount(5);
    String mapInfo = aMap.toString();
        System.out.println(mapInfo);
    }
    
    
    
}
