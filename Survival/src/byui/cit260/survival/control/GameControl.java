/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.control;

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

    public static void creatNewGame(Player player) {
        System.out.println("\n*** createNewGame Stub Function called ***");
    }

}
