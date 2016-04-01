/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

import byui.cit260.survival.control.GameControl;
import byui.cit260.survival.model.CheckOutItem;
import byui.cit260.survival.model.Item;
import byui.cit260.survival.model.Weapons;
import survival.Survival;

/**
 *
 * @author Tabitha
 */
public class GameView extends View {

    private String menu;

    public GameView() {
        super("\n"
                + "\n-----------------------------------------"
                + "\n|        Play Time!!!                   |"
                + "\n-----------------------------------------"
                + "\nE - Explore a location"
                + "\nN - Engage NPC"
                + "\nM - Map and Moving"
                + "\nC - Check out List"
                + "\nW - Weapon list"
                + "\nO - Obtain Item"
                + "\nZ - Check Out"
                + "\nS - Save the Game"
                + "\nI  - View Inventory"
                + "\nQ - Quit"
                + "\n-----------------------------------------");
    }

    /**
     *
     * @param choice
     * @return
     */
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "E": // create and start the new game
                this.goalOfGame();
                break;
            case "N": // get and start existing game
                this.mapAndMoving();
                break;
            case "M": // display help menu
                this.fightingEnemies();
                break;
            case "C": // pick up items
                this.viewCheckOutList();
                break;
            case "W": // view weapons list
                this.viewWeaponsList();
                break;
            case "O": // save game
                this.pickingUpItems();
                break;
            case "Z": // save game
                this.checkOutNow();
                break;
            case "S": // save game
                this.saveGame();
                break;
            case "I": // save game
                this.viewInventory();
                break;
            case "Q": // quit
                return true;

            default:
                this.console.println(this.promptMessage);
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

    private void viewWeaponsList() {
        Weapons[] inventory = GameControl.getSortedWeaponList(Survival.getCurrentGame().getWeapons());
        System.out.println("\n List of Inventory Items");
        System.out.println("Name" + "\t                " + "Description" + "\t                " + "Amount owned" + "\t                 ");

        // for each inventory item
        for (Weapons weapons : inventory) {
            // Display the stuff.
            System.out.println(weapons.getName() + "\t "
                    + weapons.getDescription() + "\t  "
                    + weapons.getAttribute() + "\t "
                    + weapons.getAmount());
        }
    }

    private void viewCheckOutList() {
        System.out.println("*** viewCheckOutList() function called ***");
    }

    private void checkOutNow() {
        System.out.println("*** endGame() function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame() function called ***");
    }

    private void viewInventory() {
        Item[] inventory = GameControl.getSortedItemList(Survival.getCurrentGame().getItems());
        System.out.println("\n List of Inventory Items");
        System.out.println("Name" + "\t                " + "Description" + "\t                " + "Amount owned" + "\t                 ");

        // for each inventory item
        for (Item item : inventory) {
            // Display the stuff.
            System.out.println(item.getName() + "\t "
                    + item.getDescription() + "\t  "
                    + item.getAttribute() + "\t "
                    + item.getAmount());
        }
    }
}
