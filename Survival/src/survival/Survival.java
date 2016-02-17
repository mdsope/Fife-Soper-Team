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
import byui.cit260.survival.model.Item;
import byui.cit260.survival.model.Location;
import byui.cit260.survival.model.Map;
import byui.cit260.survival.model.RegularScene;

/**
 *
 * @author Tabitha
 */
public class Survival {

    /**
     * @param args the command line arguments push junk again no
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        gameOne.setTotalTime(12.00);
        gameOne.setTimeLeft(6.00);

        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);

        Player playerOne = new Player();
        playerOne.setName("steve");

        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);

        NonPlayableCharacter nonPlayableCharacterOne = new NonPlayableCharacter();
        nonPlayableCharacterOne.setName("steven");
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

        RegularScene RegularSceneOne = new RegularScene();
        RegularSceneOne.setDescription("asdfasdf");
        RegularSceneOne.setTravelTime(30);
        RegularSceneOne.setBlocked("yes");

        String RegularSceneinfo = RegularSceneOne.toString();
        System.out.println(RegularSceneinfo);

        Item ItemOne = new Item();
        ItemOne.setType("asdfasdf");
        ItemOne.setAmount(30);
        ItemOne.setName("yes");
        ItemOne.setDescription("very shiny");
        ItemOne.setAttribute("sexiness");

        String Iteminfo = RegularSceneOne.toString();
        System.out.println(Iteminfo);

        Map MapOne = new Map();
        MapOne.setRowCount(50);
        MapOne.setColumnCount(30);

        String Mapinfo = MapOne.toString();
        System.out.println(Mapinfo);

        Location LocationOne = new Location();
        LocationOne.setRow(50);
        LocationOne.setColumn(30);
        LocationOne.setVisited("yes");

        String Locationinfo = LocationOne.toString();
        System.out.println(Locationinfo);

    }

}
