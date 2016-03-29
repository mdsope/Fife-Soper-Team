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
 * @author macds
 */
public class Enemy extends NonPlayableCharacter  {

    private String weakness;
    private double strength;

    public Enemy() {
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.weakness);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
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
        final Enemy other = (Enemy) obj;
        if (Double.doubleToLongBits(this.strength) != Double.doubleToLongBits(other.strength)) {
            return false;
        }
        if (!Objects.equals(this.weakness, other.weakness)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enemy{" + "weakness=" + weakness + ", strength=" + strength + '}';
    }

}
 /**
     *
     * Item: # (pick up: Use: Enemy: )
     *
     * Steve the Warrior: 1 (pick up: This is a guy named Steve with a baseball
     * bat Use: Steve ran up to zombie and died sneak around Enemy: Zombie the
     * warrior)
     *
     * Pakichu: 2 (description: Its like Pikachu its just not a pokemon
     * (electric type) use: The water type died... yeah you feel bad about that
     * enemy: that one water type pokemon you like... yeah that one)
     *
     * Limp Biscuit: 3 (pick up: rocks hate these Use: Destroys rock Enemy:
     * Rock)
     *
     * lawn mower seed sower dart blower: 4 (pick up: yes they are all one
     * weapon use on a jungle creature use: Monkey lion tiger gets hit by the
     * blow dart and falls asleep Enemy: Monkey lion tiger)
     *
     * hot glue gun: 6 (pick up: this is a hot glue gun Use: The ice cube is now
     * water and feels sticky, it does not like this Enemy: Ice Cube)
     *
     * cold glue gun: 7 (pick up: Its a cold glue gun? Use: Hot Brick is now a
     * Cold Brick it catches pneumonia and dies Enemy: Hot Brick)
     *
     * Exploding Chewing Gum:8 (pick up: Chew then throw and it will explode
     * (use on Evil Cashier) Use: Evil Cashier dodges the gum turns around
     * laughs at you and then has a heart attack and dies... you wasted the
     * gum... the explosion was cool though Enemy: Evil Cashier)
     *
     *
     * Cat: 9 (pick up: this is a very pampered dog named Cat Use: Ball of Yarn
     * gets scared and rolls away when you tell Cat to sick it. Cat looks around
     * confused and walks away Enemy: Ball of Yarn)
     *
     * Fifle: 10 (pick up: Fifle he has only ever desired to go West of New York
     * Use: he went west it was super effective Enemy: New York)
     *
     * The Chair 11 (pick up: You remembering watching pro wrestling as you pick
     * up your favorite wresting item Use: As a fan stands screaming "give him"
     * the chair you give him the Chair Enemy: Pro wrestler)
     *
     * PackieBalls: 11 (pick up: They are like pokeballs just balls that you use
     * on packs Use: You caught the Angry Backpack dont you miss the original
     * 150 Enemy: Angry Backpack)
     *
     * Ferrari: 12 (pick up: You found the keys to a nice Ferrari Red Ferrari
     * Use: You crash your Ferrari into the Prius it no longer exists and your
     * Ferrari is fine Enemy: Prius)
     *
     * Bow and Arrow: 13 (pick up: The apples worst enemy Use: Instead of
     * hitting the Apple you hit the Man whos head it was hanging out on, he
     * falls over and dies the apple topples to the ground and with a brusied
     * outer shell and ego it rolls home. Enemy: Apple)
     *
     * Java TextBook: 14 (pick up: This is a book teaching the skill of Java
     * coding to the reader Use: The student finishes the java class that the
     * book belongs to and sells it back to the school. He walks away with 5
     * cents Enemy: CIT Major Student)
     *
     * r: 15 (pick up: The is the time of year where you
     * fall forward Use: You destroy the idea of getting 8 Hours of Sleep and
     * turn it into 7 hours (whos idea was this) Enemy: 8 Hours of Sleep)
     *
     * Trash: 16 (pick up: Racoons love this stuff Use: The racoon loves this
     * stuff and forgets that you exist Enemy: Racoon it loves trash)
     *
     * Items lotions (cracked skin is now healed + 5 health) Steve the Healer
     * (+5 health this is a good guy named Steve)
     *
     */