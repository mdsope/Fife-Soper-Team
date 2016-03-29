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
    
    private static void assignScenesToLocations(Map map, RegularScene[] scenes) {
        Location[][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(scenes[GameControl.SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[GameControl.SceneType.finish.ordinal()]);
        locations[0][2].setScene(scenes[GameControl.SceneType.roomOne.ordinal()]);
        locations[0][3].setScene(scenes[GameControl.SceneType.roomTwo.ordinal()]);
        locations[0][4].setScene(scenes[GameControl.SceneType.roomThree.ordinal()]);
        locations[1][0].setScene(scenes[GameControl.SceneType.roomFour.ordinal()]);
        locations[2][0].setScene(scenes[GameControl.SceneType.roomFive.ordinal()]);
        locations[3][0].setScene(scenes[GameControl.SceneType.roomSix.ordinal()]);
        locations[4][0].setScene(scenes[GameControl.SceneType.roomSeven.ordinal()]);
        locations[1][0].setScene(scenes[GameControl.SceneType.roomEight.ordinal()]);
        locations[1][1].setScene(scenes[GameControl.SceneType.roomNine.ordinal()]);
        locations[1][2].setScene(scenes[GameControl.SceneType.roomTen.ordinal()]);
        locations[1][3].setScene(scenes[GameControl.SceneType.roomEleven.ordinal()]);
        locations[1][4].setScene(scenes[GameControl.SceneType.roomTwelve.ordinal()]);
        locations[2][0].setScene(scenes[GameControl.SceneType.roomThirteen.ordinal()]);
        locations[2][1].setScene(scenes[GameControl.SceneType.roomFourteen.ordinal()]);
        locations[2][2].setScene(scenes[GameControl.SceneType.roomFifteen.ordinal()]);
        locations[2][3].setScene(scenes[GameControl.SceneType.roomSixteen.ordinal()]);
        locations[2][4].setScene(scenes[GameControl.SceneType.roomSeventeen.ordinal()]);
        locations[3][0].setScene(scenes[GameControl.SceneType.roomEighteen.ordinal()]);
        locations[3][1].setScene(scenes[GameControl.SceneType.hallOne.ordinal()]);
        locations[3][2].setScene(scenes[GameControl.SceneType.hallTwo.ordinal()]);
        locations[3][3].setScene(scenes[GameControl.SceneType.hallThree.ordinal()]);
        locations[3][4].setScene(scenes[GameControl.SceneType.hallFour.ordinal()]);
        locations[4][0].setScene(scenes[GameControl.SceneType.hallFive.ordinal()]);
        locations[4][1].setScene(scenes[GameControl.SceneType.hallSix.ordinal()]);
        locations[4][2].setScene(scenes[GameControl.SceneType.hallSeven.ordinal()]);

        
    }

}
