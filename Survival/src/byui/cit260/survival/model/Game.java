/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Tabitha
 */
public class Game implements Serializable {

    //class variables
    private double totalTime;
    private double timeLeft;
    private Player player;
    private Map map;
    private RegularScene[] scene;
    private Item[] items;
    private NonPlayableCharacter[] nonPlayableCharacter;
    private Weapons[] weapons;

    public NonPlayableCharacter[] getNonPlayableCharacter() {
        return nonPlayableCharacter;
    }

    public void setNonPlayableCharacter(NonPlayableCharacter[] nonPlayableCharacter) {
        this.nonPlayableCharacter = nonPlayableCharacter;
    }


    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.timeLeft) ^ (Double.doubleToLongBits(this.timeLeft) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", timeLeft=" + timeLeft + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timeLeft) != Double.doubleToLongBits(other.timeLeft)) {
            return false;
        }
        return true;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(double timeLeft) {
        this.timeLeft = timeLeft;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public RegularScene[] getScene() {
        return scene;
    }

    public void setScene(RegularScene[] scene) {
        this.scene = scene;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Weapons[] getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons[] weapons) {
        this.weapons = weapons;
    }
    
    

   
    
}
