/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.model;

import byui.cit260.survival.control.GameControl;
import byui.cit260.survival.control.MapControl;
import java.util.ArrayList;

/**
 *
 * @author Tabitha
 */
public class RegularScene {

    private String description;
    private double travelTime;
    private boolean blocked;
    private MapControl mapControl;
    private ArrayList <Item> items;
    private ArrayList <Location> Location;
    private GameControl gameControl;

    
    
    
    public RegularScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Location> getLocation() {
        return Location;
    }

    public void setLocation(ArrayList<Location> Location) {
        this.Location = Location;
    }

    public GameControl getGameControl() {
        return gameControl;
    }

    public void setGameControl(GameControl gameControl) {
        this.gameControl = gameControl;
    }

    public MapControl getMapControl() {
        return mapControl;
    }

    public void setMapControl(MapControl mapControl) {
        this.mapControl = mapControl;
    }
    

    @Override
    public String toString() {
        return "RegularScene{" + "description=" + description + ", travelTime=" + travelTime + ", blocked=" + blocked + '}';
    }

    public void setMapSymbol(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
