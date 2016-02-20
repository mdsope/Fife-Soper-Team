/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

/**
 *
 * @author macds
 */
public class MainMenuView {
    private String menu;
    public MainMenuView() {
    this.menu = "\n"
              + "\n-----------------------------------------"
              + "\n| Main Menu                             |"
              + "\n-----------------------------------------"
              + "\nN - Start new game"
              + "\nG - Get and start saved game"
              + "\nH - Get help on how to play the game"
              + "\nQ - Quit"
              + "\n-----------------------------------------";
    }
     public void displayMainMenuView() {
         boolean done = false; // set flag to not done
         do {
             // prompt for and get players name
             String menuOPtion = this.getMenuOPtion();
             if (menuOPtion.toUpperCase().equals("Q")) // user wants to quit
                 return; // exit the game
             
             // do the requested action and display the next view
             done = this.doAction(menuOPtion);
         } while (!done);
         
    }
    private String getMenuOption() {
        System.out.println("\n*** getMenuOPtion() function called ***");
        return "N";
        
    }
    private boolean doAction(String menuOPtion) {
        System.out.println("\n*** doAction() function called ***");
        return true;
        
    }
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "N": // create and start the new game
                this.startNewGame();
                break;
            case "G": // get and start existing game
                this.startExistingGame();
                break;
            case "H": // display help menu
                this.displayHelpMenu();
                break;
            case "S": // save game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return false;
        
        private void startNewGame() {
            GameControl.creatNewGame(Survival.getPlayer());
            
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMenu();
            System.out.println("*** startNewGame function called ***");
        }
        private void startExistingGame() {
            System.out.println("*** startExistingGame function called ***");
        }
        private void saveGame() {
            System.out.println("*** saveGame function called ***");
        }
        private void displayHelpMenu() {
            System.out.println("*** displayHelpMenu function called ***");
        }
    }
}
