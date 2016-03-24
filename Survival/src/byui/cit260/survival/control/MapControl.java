/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.control;

import byui.cit260.survival.model.Location;
import byui.cit260.survival.model.Map;
import byui.cit260.survival.model.RegularScene;
import java.util.ArrayList;

/**
 *
 * @author macds
 */
public class MapControl {

    private ArrayList<RegularScene> regularScene;

    public ArrayList<RegularScene> getRegularScene() {
        return regularScene;
    }

    public void setRegularScene(ArrayList<RegularScene> regularScene) {
        this.regularScene = regularScene;
    }

    public static boolean moveToRoom(String roomNumber) {
        roomNumber = roomNumber.toUpperCase(); // convert choice to upper case

        switch (roomNumber) {
            case "ENTER":
                System.out.println("\n move to Enter");
                break;
            case "EXIT":
                System.out.println("\n move to Exit");
                break;
            case "ROOM 1":
                System.out.println("\n move to room 1");
                break;
            case "ROOM 2":
                System.out.println("\n move to room 2");
                break;
            case "ROOM 3":
                System.out.println("\n move to room 3");
                break;
            case "ROOM 4":
                System.out.println("\n move to room 4");
                break;
            case "ROOM 5":
                System.out.println("\n move to room 5");
                break;
            case "ROOM 6":
                System.out.println("\n move to room 6");
                break;
            case "ROOM 7":
                System.out.println("\n move to room 7");
                break;
            case "ROOM 8":
                System.out.println("\n move to room 8");
                break;
            case "ROOM 9":
                System.out.println("\n move to room 9");
                break;
            case "ROOM 10":
                System.out.println("\n move to room 10");
                break;
            case "ROOM 11":
                System.out.println("\n move to room 11");
                break;
            case "ROOM 12":
                System.out.println("\n move to room 12");
                break;
            case "ROOM 13":
                System.out.println("\n move to room 13");
                break;
            case "ROOM 14":
                System.out.println("\n move to room 14");
                break;
            case "ROOM 15":
                System.out.println("\n move to room 15");
                break;
            case "ROOM 16":
                System.out.println("\n move to room 16");
                break;
            case "ROOM 17":
                System.out.println("\n move to room 17");
                break;
            case "ROOM 18":
                System.out.println("\n move to room 18");
                break;
            case "HALL 1":
                System.out.println("\n move to Hall 1");
                break;
            case "HALL 2":
                System.out.println("\n move to Hall 2");
                break;
            case "HALL 3":
                System.out.println("\n move to Hall 3");
                break;
            case "HALL 4":
                System.out.println("\n move to Hall 4");
                break;
            case "HALL 5":
                System.out.println("\n move to hall 5");
                break;
            case "HALL 6":
                System.out.println("\n move to hall 6");
                break;
            case "HALL 7":
                System.out.println("\n move to Hall 7");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;

        }
        return true;

    }

    static Map createMap() {
        // createMap
        Map map = new Map(5, 5);

        RegularScene[] scenes = GameControl.createScenes();

        assignScenesToLocations(map, scenes);
        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        System.out.println("\n Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**private static RegularScene[] createScenes() {
        RegularScene[] sceneList = new RegularScene[27];

        RegularScene room1 = new RegularScene(); //1

        room1.setDescription("You are now in a store called Bed Bath and Other Stuff"
                           + "you see Zombie the Warrior. What do you wish to do?");
        room1.setTravelTime(0);
        room1.setBlocked(false);
        sceneList[0] = (RegularScene) room1;
        
        RegularScene room2 = new RegularScene(); //1

        room2.setDescription("You are now in a store called Macrosoft inc."
                           + "you see, that one water type Pokemon you like... yeah that one. What do you wish to do?");
        room2.setTravelTime(0);
        room2.setBlocked(false);
        sceneList[0] = (RegularScene) room2;
        
        RegularScene room3 = new RegularScene(); //1

        room3.setDescription("You are now in a store called Clothes and Things"
                           + "you see a Rock. What do you wish to do?");
        room3.setTravelTime(0);
        room3.setBlocked(false);
        sceneList[0] = (RegularScene) room3;
        
        RegularScene room4 = new RegularScene(); //1

        room4.setDescription("You are now in a store called Store Name"
                           + "you see a Monkey Lion Tiger. What do you wish to do?");
        room4.setTravelTime(0);
        room4.setBlocked(false);
        sceneList[0] = (RegularScene) room4;
        
        RegularScene room5 = new RegularScene(); //1

        room5.setDescription("You are now in a store called Yogurt is Yummy"
                           + "you see a Ice Cube. What do you wish to do?");
        room5.setTravelTime(0);
        room5.setBlocked(false);
        sceneList[0] = (RegularScene) room5;
        
        RegularScene room6 = new RegularScene(); //1

        room6.setDescription("You are now in a store called Knots and Kites"
                           + "you see a Hot Brick. What do you wish to do?");
        room6.setTravelTime(0);
        room6.setBlocked(false);
        sceneList[0] = (RegularScene) room6;
        
        RegularScene room7 = new RegularScene(); //1

        room7.setDescription("You are now in a store called Clocks For Flava"
                           + "you see a Evil Cashier. What do you wish to do?");
        room7.setTravelTime(0);
        room7.setBlocked(false);
        sceneList[0] = (RegularScene) room7;
        
        RegularScene room8 = new RegularScene(); //1

        room8.setDescription("You are now in a store called Squaty Potty's are Us"
                           + "you see a Ball of Yarn. What do you wish to do?");
        room8.setTravelTime(0);
        room8.setBlocked(false);
        sceneList[0] = (RegularScene) room8;
        
        RegularScene room9 = new RegularScene(); //1

        room9.setDescription("You are now in a store called Salamander Slogan"
                           + "you see New York. What do you wish to do?");
        room9.setTravelTime(0);
        room9.setBlocked(false);
        sceneList[0] = (RegularScene) room9;
        
        RegularScene room10 = new RegularScene(); //1

        room10.setDescription("You are now in a store called Whatever You Like"
                           + "you see a Pro Wrestler. What do you wish to do?");
        room10.setTravelTime(0);
        room10.setBlocked(false);
        sceneList[0] = (RegularScene) room10;
        
        RegularScene room11 = new RegularScene(); //1

        room11.setDescription("You are now in a store called Fife for Days"
                           + "you see a Angry Backpack. What do you wish to do?");
        room11.setTravelTime(0);
        room11.setBlocked(false);
        sceneList[0] = (RegularScene) room11;
        
        RegularScene room12 = new RegularScene(); //1

        room12.setDescription("You are now in a store called Im Tired Beds"
                           + "you see a Prius. What do you wish to do?");
        room12.setTravelTime(0);
        room12.setBlocked(false);
        sceneList[0] = (RegularScene) room12;
        
        RegularScene room13 = new RegularScene(); //1

        room13.setDescription("You are now in a store called Names for Sale"
                           + "you see a Apple. What do you wish to do?");
        room13.setTravelTime(0);
        room13.setBlocked(false);
        sceneList[0] = (RegularScene) room13;
        
        RegularScene room14 = new RegularScene(); //1

        room14.setDescription("You are now in a store called Roll Over and Lie"
                           + "you see a CIT Major Student. What do you wish to do?");
        room14.setTravelTime(0);
        room14.setBlocked(false);
        sceneList[0] = (RegularScene) room14;
        
        RegularScene room15 = new RegularScene(); //1

        room15.setDescription("You are now in a store called Detevtives for Hire"
                           + "you see 8 Hours of Sleep. What do you wish to do?");
        room15.setTravelTime(0);
        room15.setBlocked(false);
        sceneList[0] = (RegularScene) room15;
        
        RegularScene room16 = new RegularScene(); //1

        room16.setDescription("You are now in a store called Computers Shop"
                           + "you see a Racoon. What do you wish to do?");
        room16.setTravelTime(0);
        room16.setBlocked(false);
        sceneList[0] = (RegularScene) room16;
        
        RegularScene room17 = new RegularScene(); //1

        room17.setDescription("You are now in a store called Cows for Mays"
                           + "you see a Regular guy who likes you. What do you wish to do?");
        room17.setTravelTime(0);
        room17.setBlocked(false);
        sceneList[0] = (RegularScene) room17;
        
        RegularScene room18 = new RegularScene(); //1

        room18.setDescription("You are now in a store called Billy Mays Store"
                           + "you see another Regular guy who likes you. What do you wish to do?");
        room18.setTravelTime(0);
        room18.setBlocked(false);
        sceneList[0] = (RegularScene) room18;
        
        RegularScene hall1 = new RegularScene(); //1

        hall1.setDescription("Great now you are in a hall"
                           + "what do you wish to do now");
        hall1.setTravelTime(0);
        hall1.setBlocked(false);
        sceneList[0] = (RegularScene) hall1;
        
        RegularScene hall2 = new RegularScene(); //1

        hall2.setDescription("Great now you are in a hall"
                           + "what do you wish to do now");
        hall2.setTravelTime(0);
        hall2.setBlocked(false);
        sceneList[0] = (RegularScene) hall2;
        
        RegularScene hall3 = new RegularScene(); //1

        hall3.setDescription("Great now you are in a hall"
                           + "What do you wish to do now?");
        hall3.setTravelTime(0);
        hall3.setBlocked(false);
        sceneList[0] = (RegularScene) hall3;
        
        RegularScene hall4 = new RegularScene(); //1

        hall4.setDescription("Great now you are in a hall"
                           + "What do you wish to do now?");
        hall4.setTravelTime(0);
        hall4.setBlocked(false);
        sceneList[0] = (RegularScene) hall4;
        
        RegularScene hall5 = new RegularScene(); //1

        hall5.setDescription("Great now you are in a hall"
                           + "What do you wish to do now?");
        hall5.setTravelTime(0);
        hall5.setBlocked(false);
        sceneList[0] = (RegularScene) hall5;
        
        RegularScene hall6 = new RegularScene(); //1

        hall6.setDescription("Great now you are in a hall"
                           + "What do you wish to do now?");
        hall6.setTravelTime(0);
        hall6.setBlocked(false);
        sceneList[0] = (RegularScene) hall6;
        
        RegularScene hall7 = new RegularScene(); //1

        hall7.setDescription("Great now you are in a hall"
                           + "What do you wish to do now?");
        hall7.setTravelTime(0);
        hall7.setBlocked(false);
        sceneList[0] = (RegularScene) hall7;
        
        RegularScene enter = new RegularScene(); //1

        enter.setDescription("You look at the map. Where do you wish to go to find the"
                           + "things that you are looking for? Choose wisely Good"
                           + "Luck!");
        enter.setTravelTime(0);
        enter.setBlocked(false);
        sceneList[0] = (RegularScene) enter;
        
        
        RegularScene exit = new RegularScene(); //1

        exit.setDescription("Do you have everything that you came here to find? "
                          + "If so Please try and exit if not prepare for the"
                          + "wrath of your Wonderful daughter.");
        exit.setTravelTime(0);
        exit.setBlocked(false);
        sceneList[0] = (RegularScene) exit;
        //To change body of generated methods, choose Tools | Templates.

        return sceneList;//To change body of generated methods, choose Tools | Templates.
    }

    public static RegularScene[] getSortedWeaponList(RegularScene[] sceneList) {

        return sceneList;
    }*/

    private static void assignScenesToLocations(Map map, RegularScene[] scenes) {
        Location[][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(scenes[GameControl.SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[GameControl.SceneType.finish.ordinal()]);
        locations[0][2].setScene(scenes[GameControl.SceneType.roomOne.ordinal()]);
        locations[0][3].setScene(scenes[GameControl.SceneType.roomTwo.ordinal()]);
        locations[0][4].setScene(scenes[GameControl.SceneType.roomThree.ordinal()]);
        locations[0][5].setScene(scenes[GameControl.SceneType.roomFour.ordinal()]);
        locations[0][6].setScene(scenes[GameControl.SceneType.roomFive.ordinal()]);
        locations[0][7].setScene(scenes[GameControl.SceneType.roomSix.ordinal()]);
        locations[0][8].setScene(scenes[GameControl.SceneType.roomSeven.ordinal()]);
        locations[0][9].setScene(scenes[GameControl.SceneType.roomEight.ordinal()]);
        locations[1][0].setScene(scenes[GameControl.SceneType.roomNine.ordinal()]);
        locations[1][1].setScene(scenes[GameControl.SceneType.roomTen.ordinal()]);
        locations[1][2].setScene(scenes[GameControl.SceneType.roomEleven.ordinal()]);
        locations[1][3].setScene(scenes[GameControl.SceneType.roomTwelve.ordinal()]);
        locations[1][4].setScene(scenes[GameControl.SceneType.roomThirteen.ordinal()]);
        locations[1][5].setScene(scenes[GameControl.SceneType.roomFourteen.ordinal()]);
        locations[1][6].setScene(scenes[GameControl.SceneType.roomFifteen.ordinal()]);
        locations[1][7].setScene(scenes[GameControl.SceneType.roomSixteen.ordinal()]);
        locations[1][8].setScene(scenes[GameControl.SceneType.roomSeventeen.ordinal()]);
        locations[1][9].setScene(scenes[GameControl.SceneType.roomEighteen.ordinal()]);
        locations[2][0].setScene(scenes[GameControl.SceneType.hallOne.ordinal()]);
        locations[2][1].setScene(scenes[GameControl.SceneType.hallTwo.ordinal()]);
        locations[2][2].setScene(scenes[GameControl.SceneType.hallThree.ordinal()]);
        locations[2][3].setScene(scenes[GameControl.SceneType.hallFour.ordinal()]);
        locations[2][4].setScene(scenes[GameControl.SceneType.hallFive.ordinal()]);
        locations[2][5].setScene(scenes[GameControl.SceneType.hallSix.ordinal()]);
        locations[2][6].setScene(scenes[GameControl.SceneType.hallSeven.ordinal()]);

        
    }

}
