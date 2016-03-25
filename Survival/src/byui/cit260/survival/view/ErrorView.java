/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

import java.io.PrintWriter;
import survival.Survival;

/**
 *
 * @author Tabitha
 */
public class ErrorView {
    private static final PrintWriter errorFile = Survival.getOutFile();
    private static final PrintWriter logFile = Survival.getLogFile();
    
    public static void display(String className, String errorMessage) {
                 errorFile.println(
                 "-------------------------------------------------"
                         + "/n - YO SOMETHINGS WRONG +" + errorMessage
                         + "-------------------------------------------------");
                 // log error
                 logFile.println(className + " - " + errorMessage);
    }
}
