/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Tabitha
 */
public class Item implements Serializable{

    private String type;
    private double amount;
    private String name;
    private String Description;
    private String attribute;
    private Game game;
    private RegularScene scene;

    public Item() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public RegularScene getScene() {
        return scene;
    }

    public void setScene(RegularScene scene) {
        this.scene = scene;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.Description);
        hash = 97 * hash + Objects.hashCode(this.attribute);
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
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "type=" + type + ", amount=" + amount + ", name=" + name + ", Description=" + Description + ", attribute=" + attribute + '}';
    }

}
/**
* weapon/item list
* weapons
* 
* hot glue gun
* cold glue gun
* exploding chewing gum
* cat
* Fifle (he went west it was super effective)
* the chair (You gave them the Chair!!)
* PakeBalls
* Car
* 
* Pakichu:
* (description: Its like Pikachu its just not a pokemon
* use: The water type died... yeah feel bad about that 
* enemy: that one water type pokemon you like... yeah that one)
* 
* lawn mower seed sower dart blower 
* (pick up: yes they are all one weapon use on a jungle creature
* use: Monkey lion tiger gets hit by the blow dart and falls asleep
* Enemy: Monkey lion tiger)
* 
* Steve the warrior 
* (pick up: This is a guy named Steve with a baseball bat 
* Use: Steve ran up to zombie and died sneak around 
* Enemy: Zombie the warrior)
* 
* Cannablistic zombie- 
* (pick up: dont use unless you wish to get ate 
* Use: you get ate son... or daughter 
* Enemy: Player)
* 
* Limp Biscuit (pick up: rocks hate these 
* Use:)
* 
* 
* Items
* potions (replenish 5 health)
* motions of oceans (full heal plus you feel sea sick -2 to next)
* lotion (cracked skin is now healed + 5 health)
* Steve the Healer (+5 health this is a good guy named Steve)
* 
*/