/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

import java.util.Scanner;

/**
 *
 * @author macds
 */
class MapAndMovingView {

    private String menu;

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

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "Room 1": // create and start the new game
                this.roomOne();
                break;
            case "Room 2": // create and start the new game
                this.roomTwo();
                break;
            case "Room 3": // create and start the new game
                this.roomThree();
                break;
            case "Room 4": // create and start the new game
                this.roomFour();
                break;
            case "Room 5": // create and start the new game
                this.roomFive();
                break;
            case "Room 6": // create and start the new game
                this.roomSix();
                break;
            case "Room 7": // create and start the new game
                this.roomSeven();
                break;
            case "Room 8": // create and start the new game
                this.roomEight();
                break;
            case "Room 9": // create and start the new game
                this.roomNine();
                break;
            case "Room 10": // create and start the new game
                this.roomTen();
                break;
            case "Room 11": // create and start the new game
                this.roomEleven();
                break;
            case "Room 12": // create and start the new game
                this.roomTwelve();
                break;
            case "Room 13": // create and start the new game
                this.roomThirteen();
                break;
            case "Room 14": // create and start the new game
                this.roomFourteen();
                break;
            case "Room 15": // create and start the new game
                this.roomFifthteen();
                break;
            case "Room 16": // create and start the new game
                this.roomSixteen();
                break;
            case "Room 17": // create and start the new game
                this.roomSeventeen();
                break;
            case "Room 18": // create and start the new game
                this.roomEighteen();
                break;
            case "Hall 1": // create and start the new game
                this.hallOne();
                break;
            case "Hall 2": // create and start the new game
                this.hallTwo();
                break;
            case "Hall 3": // create and start the new game
                this.hallThree();
                break;
            case "Hall 4": // create and start the new game
                this.hallFour();
                break;
            case "Hall 5": // create and start the new game
                this.hallFive();
                break;
            case "Hall 6": // create and start the new game
                this.hallSix();
                break;
            case "Hall 7": // create and start the new game
                this.hallSeven();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;

        }
        return false;
    }

    private void roomOne() {
        System.out.println("*** function called ***");
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
    }

}
