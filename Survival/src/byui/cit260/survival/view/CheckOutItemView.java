/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

import byui.cit260.survival.control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author Tabitha
 */
public class CheckOutItemView {
    private String promptMessage;
    
    public CheckOutItemView() {
        this.promptMessage = "\n"
                + "\n-------------------------------------------------"
                + "\n Congratulations please select a checkout item"
                + "\n-------------------------------------------------"
                + "\n T - Tiara"
                + "\n D - Dress"
                + "\n B - Boots"
                + "\n-------------------------------------------------";
    }
    
    public void displayCheckOutItemView() {
        boolean done = false; // set flag to not done
           do {
               // prompt for players response
               String checkOutOption = this.getInput();
               if (checkOutOption.toUpperCase().equals("Q"))
                   return;
               done = this.doAction(checkOutOption);
           } while (!done);
    }
    private String getInput(){
               Scanner keyboard = new Scanner(System.in); // get infile for keyboard
               String value = ""; // value returned
               boolean valid = false; // initalize to not valid
               
               while(!valid){// loop while an invalid is entered
                   System.out.println("\n"+this.promptMessage);
                   
                   value = keyboard.nextLine(); // get next line in keyboard
                  value = value.trim();
                  
                  if (value.length() <1){// value is blank
                      System.out.println("Invalid value: value cannot be blank");
                      continue;
                  } 
                  break;
               }
               return value;
                  
               }
               public boolean doAction(String choice){
               
                   choice = choice.toUpperCase(); // converts to upper case
               
                   switch (choice){
                       case "T": // gets tiara 
                            this.getTiara();
                            break;
                       case "D": // gets dress
                            this.getDress();
                            break;
                       case "B": // display boots
                            this.getBoots();
                            break;
                       default:
                           System.out.println("\n*** Wrong Button Dummy!! *** do it again");
                           break;
                   }
                   return false;
               }
               private void getTiara(){
                       this.promptMessage = "Enter your height";
                       // calln getInput to get value
                       String value = this.getInput();
                       // covert value entererd to integer
                       double height = Double.parseDouble(value);
                       
                       
                       // set promptMessage = "Enter the width"
                       this.promptMessage = "Enter your base";
                       // calln getInput to get value
                       value = this.getInput();
                       // covert value entererd to integer
                       double base = Double.parseDouble(value);
                       // covert value to integer
                       // call control function to do whatever
                       InventoryControl inventoryControl = new InventoryControl();
        double tiara = inventoryControl.getTiara(base, height);
                       
                     
                       // if unsuccessful then display error and return
                       if (tiara == -1)
                       {
                       this.promptMessage = "Base or Height is below 0";
                       }
                       else if (tiara == -4)
                       {
                       this.promptMessage = "Area is not within 80 or 90";
                       }
                       // if successful then display succes message
                       else if (tiara > 0)
                       {
                       this.promptMessage = "Congrats";
                       }
                       // if something crazy happens
                       else
                       {
                           this.promptMessage = "uuuuuhhh somethings wrong";
                                   }
              }
               private void getDress(){
                       System.out.println("\n getDress function called");
                               }
               private void getBoots(){
                       System.out.println("\n getBoots function called");
                               }
    }


