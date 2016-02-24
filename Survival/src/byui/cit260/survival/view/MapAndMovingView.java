/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

import byui.cit260.survival.control.MapControl;
import java.util.Scanner;

/**
 *
 * @author macds
 */
class MapAndMovingView {

    private String menu;
    private String promptMessage;

    public MapAndMovingView() {
        this.menu = ""
                + "\n|#################################################################################|"
                + "\n|##################################||         ||##################################|"
                + "\n|##################################||  enter  ||##################################|"
                + "\n|##################################||   exit  ||##################################|"
                + "\n|##################################||         ||##################################|"
                + "\n|##|---------||---------||---------||---   ---||---------||---------||---------|##|"
                + "\n|##|         ||         ||         ||         ||         ||         ||         |##|"
                + "\n|##|         <>  Room 4 ||  Room 1 <>         <> Room 14 || Room 15 <>         |##|"
                + "\n|##|         ||         ||         ||         ||         ||         ||         |##|"
                + "\n|##|         ||---------||---------||         ||---------||---------||         |##|"
                + "\n|##|  Hall 3 ||---------||---------||  Hall 1 ||---------||---------||  Hall 7 |##|"
                + "\n|##|         ||         ||         ||         ||         ||         ||         |##|"
                + "\n|##|         <>  Room 3 ||  Room 2 <>         <> Room 13 || Room 16 <>         |##|"
                + "\n|##|         ||         ||         ||         ||         ||         ||         |##|"
                + "\n|##|         ||---------||---------||         ||---------||---------||         |##|"
                + "\n|##|---------||---------||---------||---------||---------||---------||---------|##|"
                + "\n|##|                                                                           |##|"
                + "\n|##|                                   Hall 2                                  |##|"
                + "\n|##|                                                                           |##|"
                + "\n|##|---------||---------||---------||---------||---------||---------||---------|##|"
                + "\n|##|         ||---------||---------||         ||---------||---------||         |##|"
                + "\n|##|         ||         ||         ||         ||         ||         ||         |##|"
                + "\n|##|         <>  Room 8 ||  Room 5 <>         <>  Room 9 || Room 12 <>         |##|"
                + "\n|##|         ||         ||         ||         ||         ||         ||         |##|"
                + "\n|##|         ||---------||---------||         ||---------||---------||         |##|"
                + "\n|##|  Hall 4 ||---------||---------||  Hall 5 ||---------||---------||  Hall 6 |##|"
                + "\n|##|         ||         ||         ||         ||         ||         ||         |##|"
                + "\n|##|         <>  Room 7 ||  Room 6 <>         <> Room 10 || Room 11 <>         |##|"
                + "\n|##|         ||         ||         ||         ||         ||         ||         |##|"
                + "\n|##|         ||---------||---------||         ||---------||---------||---------|##|"
                + "\n|##|         ||---------||---------||         |###################################|"
                + "\n|##|         ||         ||         ||         |#              KEY                #|"
                + "\n|##|         <> Room 17 || Room 18 <>         |# M- Move Rooms                   #|"
                + "\n|##|         ||         ||         ||         |# How to Move-                    #|"
                + "\n|##|---------||---------||---------||---------|# Type M and then the hall that   #|"
                + "\n|############################################### you wish to move to, do so      #|"
                + "\n|############################################### you have reached desired room   #|"
                + "\n|############################################### EX. M HAll 1                    #|"
                + "\n|###############################################     M HAll 2                    #|"
                + "\n|###############################################     M HAll 3                    #|"
                + "\n|###############################################     M Room 4                    #|"
                + "\n|#################################################################################|";
    }

    public void displayMapAndMovingView() {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String mapMenuOption = this.getMapMenuOption();
            if (mapMenuOption.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(mapMenuOption);
        } while (!done);

    }

    private String getMapMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value returned
        boolean valid = false; // initialize to not valid

        while (!valid) {//loop while an invalid value is enter
            System.out.println("\n" + this.menu);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim();

            if (value.length() < 1) {//value is blank
                System.out.println("\nInvalid value: val ue can not be blank");
                continue;
            }
            break;
        }
        return value;
    }

    public boolean doAction(String choice) {
        return  this.move(choice);
    }
    
    private boolean move(String roomNumber) {
            
            // call control function to determine if valid room
            boolean result= MapControl.moveToRoom (roomNumber);
            // if invalid room display "You can not move to this room" and return false
            
            
            return true;
        
    }

    /*    private void roomOne() {
    System.out.println("/nMove to room 1 "
    + "Room 2");
    
    }
    
    private void roomTwo() {
    System.out.println("*** function called ***");
    }
    
    private void roomThree() {
    System.out.println("*** function called ***");
    }
    
    private void roomFour() {
    System.out.println("*** function called ***");
    }
    
    private void roomFive() {
    System.out.println("*** function called ***");
    }
    
    private void roomSix() {
    System.out.println("*** function called ***");
    }
    
    private void roomSeven() {
    System.out.println("*** function called ***");
    }
    
    private void roomEight() {
    System.out.println("*** function called ***");
    }
    
    private void roomNine() {
    System.out.println("*** function called ***");
    }
    
    private void roomTen() {
    System.out.println("*** function called ***");
    }
    
    private void roomEleven() {
    System.out.println("*** function called ***");
    }
    
    private void roomTwelve() {
    System.out.println("*** function called ***");
    }
    
    private void roomThirteen() {
    System.out.println("*** function called ***");
    }
    
    private void roomFourteen() {
    System.out.println("*** function called ***");
    }
    
    private void roomFifthteen() {
    System.out.println("*** function called ***");
    }
    
    private void roomSixteen() {
    System.out.println("*** function called ***");
    }
    
    private void roomSeventeen() {
    System.out.println("*** function called ***");
    }
    
    private void roomEighteen() {
    System.out.println("*** function called ***");
    }
    
    private void hallOne() {
    System.out.println("*** function called ***");
    }
    
    private void hallTwo() {
    System.out.println("*** function called ***");
    }
    
    private void hallThree() {
    System.out.println("*** function called ***");
    }
    
    private void hallFour() {
    System.out.println("*** function called ***");
    }
    
    private void hallFive() {
    System.out.println("*** function called ***");
    }
    
    private void hallSix() {
    System.out.println("*** function called ***");
    }
    
    private void hallSeven() {
    System.out.println("*** function called ***");
    }*/

}
