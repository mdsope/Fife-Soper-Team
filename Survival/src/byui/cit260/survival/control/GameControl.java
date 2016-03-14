/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.control;

import byui.cit260.survival.model.Game;
import byui.cit260.survival.model.Item;
import byui.cit260.survival.model.Map;
import byui.cit260.survival.model.Player;
import survival.Survival;

/**
 *
 * @author Tabitha
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);

        Survival.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game(); //create new game
        Survival.setCurrentGame(game); // save in Survival.
        
        game.setPlayer(player);
        
        //create the inventory list and save in the game
        Item[] inventoryList = GameControl.createItemList();
        game.setItem(inventoryList);
       
        Map map = MapControl.createMap(); // create and initalize new map
        game.setMap(map); // save map in game
        
        //move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }
    
    public static boolean saveGameControl(String filelocation) {
        System.out.println ("\n** save game Called** ");
        return true;
    }

    private static Item[] createItemList() {
        Item[] itemList = new Item[25];
        
        Item steveW = new Item(); //1
        steveW.setName("Steve the warrior");
        steveW.setAmount(0);
        steveW.setDescription("This is a guy named Steve with a baseball bat");
        steveW.setAttribute("");
        //To change body of generated methods, choose Tools | Templates.
        
        Item pakichu = new Item(); //2
        pakichu.setName("Pakichu");
        pakichu.setAmount(0);
        pakichu.setDescription("Its like Pikachu its just not a Pokemon (electric type)");
        pakichu.setAttribute("");
        //To change body of generated methods, choose Tools | Templates.
        
        Item limpB = new Item(); //3
        limpB.setName("Limp Buscuit");
        limpB.setAmount(0);
        limpB.setDescription("Rocks hate these");
        limpB.setAttribute("");
        
        Item lawnM = new Item(); //4
        lawnM.setName("lawn mower seed sower dart blower");
        lawnM.setAmount(0);
        lawnM.setDescription("Yes they are all one weapon use on a jungle creature");
        lawnM.setAttribute("");
        
        Item can = new Item(); //5
        can.setName("Can-a-blistic zombie");
        can.setAmount(0);
        can.setDescription("Dont use unless you wish to get ate");
        can.setAttribute("");
        
        Item hotG = new Item(); //6
        hotG.setName("hot glue gun");
        hotG.setAmount(0);
        hotG.setDescription("This is a hot glue gun");
        hotG.setAttribute("");
        
        Item coldG = new Item(); //7
        coldG.setName("cold glue gun");
        coldG.setAmount(0);
        coldG.setDescription("Its a cold glue gun?");
        coldG.setAttribute("");
        
        Item exploding = new Item(); //8
        exploding.setName("Exploding Chewing Gum");
        exploding.setAmount(0);
        exploding.setDescription("Chew then throw and it will explode (use on Evil Cashier)");
        exploding.setAttribute("");
        
        Item cat = new Item(); //9
        cat.setName("Cat");
        cat.setAmount(0);
        cat.setDescription("This is a very pampered dog named Cat");
        cat.setAttribute("");
        
        Item fifle = new Item(); //10
        fifle.setName("Fifle");
        fifle.setAmount(0);
        fifle.setDescription("Fifle he has only ever desired to go West of New York");
        fifle.setAttribute("");
        
        Item chair = new Item(); //11
        chair.setName("The Chair");
        chair.setAmount(0);
        chair.setDescription("You remembering watching pro wrestling as you pick up your favorite wresting item");
        chair.setAttribute("");
        
        Item packieB = new Item(); //12
        packieB.setName("PackieBalls");
        packieB.setAmount(0);
        packieB.setDescription("They are like pokeballs just balls that you use on packs");
        packieB.setAttribute("");
        
        Item ferrari = new Item(); //13
        ferrari.setName("Ferrari");
        ferrari.setAmount(0);
        ferrari.setDescription("You found the keys to a nice Ferrari Red Ferrari");
        ferrari.setAttribute("");
        
        Item bow = new Item(); //14
        bow.setName("Bow and Arrow");
        bow.setAmount(0);
        bow.setDescription("Instead of hitting the Apple you hit the Man whos head it was hanging out on, he falls over and dies the apple topples to the ground and with a brusied outer shell and ego it rolls home.");
        bow.setAttribute("");
        
        Item java = new Item(); //15
        java.setName("Java TextBook");
        java.setAmount(0);
        java.setDescription("This is a book teaching the skill of Java coding to the reader");
        java.setAttribute("");
        
        Item savings = new Item(); //16
        savings.setName("Day light Savings Time");
        savings.setAmount(0);
        savings.setDescription("The is the time of year where you fall forward");
        savings.setAttribute("");
        
        Item trash = new Item(); //17
        trash.setName("Trash");
        trash.setAmount(0);
        trash.setDescription("Racoons love this stuff");
        trash.setAttribute("");
        
        Item lotion = new Item(); //18
        lotion.setName("Lotion");
        lotion.setAmount(0);
        lotion.setDescription("cracked skin is now healed + 5 health");
        lotion.setAttribute("");
        
        Item SteveH = new Item(); //19
        SteveH.setName("Steve the Healer");
        SteveH.setAmount(0);
        SteveH.setDescription("+5 health this is a good guy named Steve");
        SteveH.setAttribute("");
        
        return itemList;//To change body of generated methods, choose Tools | Templates.
    }
     
/**
* 
* Item: #
* (pick up:  
* Use: 
* Enemy: )
* 
* Steve the Warrior: 1
* (pick up: This is a guy named Steve with a baseball bat 
* Use: Steve ran up to zombie and died sneak around 
* Enemy: Zombie the warrior)
* 
* Pakichu: 2
* (description: Its like Pikachu its just not a pokemon (electric type)
* use: The water type died... yeah you feel bad about that 
* enemy: that one water type pokemon you like... yeah that one)
* 
* Limp Biscuit: 3
* (pick up: rocks hate these 
* Use: Destroys rock
* Enemy: Rock)
* 
* lawn mower seed sower dart blower: 4
* (pick up: yes they are all one weapon use on a jungle creature
* use: Monkey lion tiger gets hit by the blow dart and falls asleep
* Enemy: Monkey lion tiger)
* 
*  hot glue gun: 6
* (pick up: this is a hot glue gun
* Use: The ice cube is now water and feels sticky, it does not like this
* Enemy: Ice Cube)
* 
* cold glue gun: 7
* (pick up: Its a cold glue gun?
* Use: Hot Brick is now a Cold Brick it catches pneumonia and dies
* Enemy: Hot Brick)
* 
* Exploding Chewing Gum:8 
* (pick up: Chew then throw and it will explode (use on Evil Cashier)  
* Use: Evil Cashier dodges the gum turns around laughs at you and then has a heart attack and dies... you wasted the gum... the explosion was cool though
* Enemy: Evil Cashier)
* 
*
* Cat: 9
* (pick up: this is a very pampered dog named Cat
* Use: Ball of Yarn gets scared and rolls away when you tell Cat to sick it. Cat looks around confused and walks away
* Enemy: Ball of Yarn)
* 
* Fifle: 10
* (pick up: Fifle he has only ever desired to go West of New York
* Use: he went west it was super effective
* Enemy: New York)
* 
* The Chair 11
* (pick up: You remembering watching pro wrestling as you pick up your favorite wresting item 
* Use: As a fan stands screaming "give him" the chair you give him the Chair
* Enemy: Pro wrestler)
* 
* PackieBalls: 11
* (pick up: They are like pokeballs just balls that you use on packs
* Use: You caught the Angry Backpack dont you miss the original 150
* Enemy: Angry Backpack)
* 
* Ferrari: 12
* (pick up: You found the keys to a nice Ferrari Red Ferrari 
* Use: You crash your Ferrari into the Prius it no longer exists and your Ferrari is fine
* Enemy: Prius)
* 
* Bow and Arrow: 13
* (pick up: The apples worst enemy
* Use: Instead of hitting the Apple you hit the Man whos head it was hanging out on, he falls over and dies the apple topples to the ground and with a brusied outer shell and ego it rolls home.
* Enemy: Apple)
* 
* Java TextBook: 14
* (pick up: This is a book teaching the skill of Java coding to the reader
* Use: The student finishes the java class that the book belongs to and sells it back to the school. He walks away with 5 cents
* Enemy: CIT Major Student)
* 
*  Day light Savings Time: 15
* (pick up: The is the time of year where you fall forward
* Use: You destroy the idea of getting 8 Hours of Sleep and turn it into 7 hours (whos idea was this)
* Enemy: 8 Hours of Sleep)
* 
* Trash: 16
* (pick up: Racoons love this stuff
* Use: The racoon loves this stuff and forgets that you exist
* Enemy: Racoon it loves trash)
* 
* Items
* lotions (cracked skin is now healed + 5 health)
* Steve the Healer (+5 health this is a good guy named Steve)
* 
 */
}
