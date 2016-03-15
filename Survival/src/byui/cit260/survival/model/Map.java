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
public class Map {

    private double rowCount;
    private double columnCount;
    private ArrayList <Game> game;
    private Location[][] locations = new Location[5][5];


    public Map() {
    }

    public Map(int rowCount, int columnCount) {
        if (rowCount < 1 || columnCount < 1){
        System.out.println( "\n Your rows and coulmns gots to be greater than 1 silly");
    return;
        }
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        //create 2d array fro location objects
        
        this.locations = new Location[rowCount][columnCount];
        for (int row = 0; row < rowCount; row++){
          for (int column = 0; column < columnCount; column++){
              Location location = new Location();
              location.setColumn(column);
              location.setRow(row);
              location.setVisited(false);
              
              // assign the location object to the current position in array
              
              locations[row][column] = location;
              }
        }
    }
        
    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;

    }


    public ArrayList<Game> getGame() {
        return game;
    }

    public void setGame(ArrayList<Game> game) {
        this.game = game;
    }
    
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;

    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        return hash;
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

}
