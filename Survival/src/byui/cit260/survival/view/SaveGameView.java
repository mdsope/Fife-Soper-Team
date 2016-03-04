/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

import byui.cit260.survival.control.GameControl;

/**
 *
 * @author macds
 */
public class SaveGameView extends View {

    public SaveGameView() {
        super("\n"
                + "\n-----------------------------------------"
                + "\n| Save Game                             |"
                + "\n-----------------------------------------"
                + "\nEnter the location of where the game is"
                + "\nto be saved."
                + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String filelocation) {
        boolean success = GameControl.saveGameControl(filelocation);
        
        if (success == true) {
            System.out.println ("\n**save game Called** ");
            return true;   
        }
        else{
            System.out.println ("\n**failled to save game** ");
            return false;
        }
              
    }
    

}
