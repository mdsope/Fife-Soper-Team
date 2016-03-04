/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

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
            case "C": // save game
                this.pickingUpItems();
                break;
            case "W": // save game
                this.endGame();
                break;
            case "O": // save game
                this.endGame();
                break;
            case "Z": // save game
                this.endGame();
                break;
            case "S": // save game
                this.endGame();
                break;
            case "Q": // save game
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

    

