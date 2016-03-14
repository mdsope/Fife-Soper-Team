/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.model;

import java.util.ArrayList;

/**
 *
 * @author Tabitha
 */
public class RegularScene {

    private String description;
    private double travelTime;
    private String blocked;
    private ArrayList <Item> items;
    private ArrayList <Location> Location;

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

    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
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
    

    @Override
    public String toString() {
        return "RegularScene{" + "description=" + description + ", travelTime=" + travelTime + ", blocked=" + blocked + '}';
    }

}
