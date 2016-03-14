/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.control;

import byui.cit260.survival.model.Game;
import byui.cit260.survival.model.Item;
import byui.cit260.survival.model.Map;
import byui.cit260.survival.model.Player;
import survival.Survival;

/**
 *
 * @author Tabitha
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);

        Survival.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game(); //create new game
        Survival.setCurrentGame(game); // save in Survival.
        
        game.setPlayer(player);
        
        //create the inventory list and save in the game
        Item[] inventoryList = GameControl.createItemList();
        game.setItem(inventoryList);
       
        Map map = MapControl.createMap(); // create and initalize new map
        game.setMap(map); // save map in game
        
        //move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }
    
    public static boolean saveGameControl(String filelocation) {
        System.out.println ("\n** save game Called** ");
        return true;
    }

    private static Item[] createItemList() {
        Item[] itemList = new Item[25];
        Item stevew = new Item();
        stevew.setName("Steve the warrior");
        stevew.setAmount(0);
        stevew.setDescription("");
        stevew.setAttribute("");
        return itemList;//To change body of generated methods, choose Tools | Templates.
    }

}
