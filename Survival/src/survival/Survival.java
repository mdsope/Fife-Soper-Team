/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import byui.cit260.survival.model.CheckOutItem;
import byui.cit260.survival.model.Game;
import byui.cit260.survival.model.NonPlayableCharacter;
import byui.cit260.survival.model.Player;
import byui.cit260.survival.model.Weapons;
import byui.cit260.survival.model.Enemy;

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
        
        NonPlayableCharacter nonPlayableCharacterOne = new NonPlayableCharacter();
        nonPlayableCharacterOne.setName ("steven");
        nonPlayableCharacterOne.setDescription("awesome");
        nonPlayableCharacterOne.setCoordinates(0);
        
        String nonPlayableCharacterInfo = nonPlayableCharacterOne.toString();
        System.out.println(playerInfo);
    
        Weapons weaponsOne = new Weapons();
        weaponsOne.setStrength(6.00);
        
        String weaponsInfo = weaponsOne.toString();
        System.out.println(playerInfo);
        
        CheckOutItem checkOutItemOne = new CheckOutItem();
        checkOutItemOne.setSize(4.0);
        
        String checkOutItemInfo = checkOutItemOne.toString();
        System.out.println(checkOutItemInfo);
        
        Enemy enemyOne = new Enemy(); 
        enemyOne.setStrength(0);
        enemyOne.setWeakness("hjfj");
        
        String enemyInfo = enemyOne.toString();
        System.out.println(enemyInfo);
       
        
        
    }

}
