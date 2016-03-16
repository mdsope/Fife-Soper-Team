/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.control;

import byui.cit260.survival.model.Location;
import byui.cit260.survival.model.Map;
import byui.cit260.survival.model.RegularScene;

/**
 *
 * @author macds
 */
public class MapControl {

    public static boolean moveToRoom(String roomNumber) {
        roomNumber = roomNumber.toUpperCase(); // convert choice to upper case

        switch (roomNumber) {
            case "ENTER":
                System.out.println("\n move to room 1");
                break;
            case "EXIT":
                System.out.println("\n move to room 1");
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
            case "Room 6":
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
        Map map = new Map (5, 5);
    
        RegularScene[] scenes = createScenes();
        
        assignScenesToLocations(map, scenes);   
    return map;}

    static void moveActorsToStartingLocation(Map map) {
        System.out.println("\n Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static RegularScene[] createScenes() {
        System.out.println("\n Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;}

    private static void assignScenesToLocations(Map map, RegularScene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[GameControl.SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[GameControl.SceneType.finish.ordinal()]);
    }
    
}

