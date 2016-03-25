/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import byui.cit260.survival.model.Game;
import byui.cit260.survival.model.Player;
import byui.cit260.survival.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tabitha
 */
public class Survival {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
      private static BufferedReader inFile = null;
      
      private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Survival.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Survival.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Survival.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Survival.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Survival.logFile = logFile;
    }
    

    /**
     *
     * @param args the command line arguments
     *
     */
    //displays the start program view
    public static void main(String[] args) {
        

        
        try{
            // open character stream files for end user input and output
            Survival.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            Survival.outFile = new PrintWriter(System.out, true);
       
            // open log file
            String filePath = "log.txt";
            Survival.logFile = new PrintWriter(filePath);
            // create StartProgramView
            StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;
        
        }catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();;
           
        }
        finally{
            try {
                if (Survival.inFile != null)
                Survival.inFile.close();
                
                if (Survival.outFile != null)
            Survival.outFile.close();
                
                if (Survival.logFile != null)
                    Survival.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }

        /*
        // Create MainMenuView Object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        // Display the main menu view
        helpMenuView.displayHelpMenuView();
         */
    }

}
