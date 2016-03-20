/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.control;

import byui.cit260.survival.model.CheckOutItem;
import byui.cit260.survival.model.Game;
import byui.cit260.survival.model.Item;
import byui.cit260.survival.model.Location;
import byui.cit260.survival.model.Map;
import byui.cit260.survival.model.Player;
import byui.cit260.survival.model.RegularScene;
import byui.cit260.survival.model.Weapons;
import survival.Survival;

/**
 *
 * @author Tabitha
 */
public class GameControl {

  

    private Location[][] locations = new Location[5][5];

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

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
        System.out.println("\n** save game Called** ");
        return true;
    }

    private static void createScenes() {
        Game game = Survival.getCurrentGame();
        RegularScene[] scenes = new RegularScene[SceneType.values().length];

        RegularScene startingScene = new RegularScene();
        startingScene.setDescription(
                "\nBlah Blah BLAH");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;

        RegularScene finishScene = new RegularScene();
        finishScene.setDescription(
                "\n blah blah blah.");
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;

    }

    public enum SceneType {
        start,
        finish;
    }

    private static Item[] createItemList() {
        Item[] itemList = new Item[19];

        Item lotion = new Item(); //18
        lotion.setName("Lotion");
        lotion.setAmount(0);
        lotion.setDescription("cracked skin is now healed + 5 health");
        lotion.setAttribute("");
        itemList[17] = lotion;

        Item steveH = new Item(); //19
        steveH.setName("Steve the Healer");
        steveH.setAmount(0);
        steveH.setDescription("+5 health this is a good guy named Steve");
        steveH.setAttribute("");
        itemList[18] = steveH;

        return itemList;//To change body of generated methods, choose Tools | Templates.
    }
public static Item[] getSortedItemList(Item[] itemList) {

        for (int i = 0; i < itemList.length - 1; i++) {

            for (int j = i + 1; j < itemList.length - 1; j++) {
                if (itemList[i].getName().compareTo(itemList[j].getName()) < 0) {
                    Item lowerAlpha = itemList[j];
                    itemList[j] = itemList[i];
                    itemList[i] = lowerAlpha;
                    
                            
                }
            }

        }

        return itemList;
    }

    public static Item[] getSortedItemList() {
        System.out.println("\n *** getSortedInventoryLIst stub function called ***");
        return null;
    }

    private static CheckOutItem[] createCheckOutList() {
        CheckOutItem[] checkOutList = new CheckOutItem[3];

        CheckOutItem Tiara = new CheckOutItem(); //1
        Tiara.setName("Tiara");
        Tiara.setAmount(0);
        Tiara.setDescription("A pretty princess tiara for your pretty princess.");
        Tiara.setAttribute("You could try to wear this but it makes you feel girly");

        //To change body of generated methods, choose Tools | Templates.
        CheckOutItem Dress = new CheckOutItem(); //1
        Dress.setName("Dress");
        Dress.setAmount(0);
        Dress.setDescription("A pretty princess Dress for your pretty princess.");
        Dress.setAttribute("Your Bodacious Thunder Thighs are too much for this dress to handle");
        //To change body of generated methods, choose Tools | Templates.

        CheckOutItem Boots = new CheckOutItem(); //1
        Boots.setName("Dress");
        Boots.setAmount(0);
        Boots.setDescription("Some Rugged blue Army boots for you little princess");
        Boots.setAttribute("There is not room in these dainty boots for your monsorous feet ");
        return checkOutList;
    }

    public static CheckOutItem[] getSortedCheckOutList(CheckOutItem[] checkOutList) {

        for (int i = 0; i < checkOutList.length - 1; i++) {

            for (int j = i + 1; j < checkOutList.length - 1; j++) {
                if (checkOutList[i].getName().compareTo(checkOutList[j].getName()) < 0) {
                    CheckOutItem lowerAlpha = checkOutList[j];
                    checkOutList[j] = checkOutList[i];
                    checkOutList[i] = lowerAlpha;
                    
                            
                }
            }

        }

        return checkOutList;
    }

    private static Weapons[] createWeaponList() {
        Weapons[] weaponList = new Weapons[19];

        Item steveW = new Weapons(); //1
        steveW.setName("Steve the warrior");
        steveW.setAmount(1);
        steveW.setDescription("This is a guy named Steve with a baseball bat");
        steveW.setAttribute("");
        weaponList[0] = (Weapons) steveW;
        //To change body of generated methods, choose Tools | Templates.

        Item pakichu = new Weapons(); //2
        pakichu.setName("Pakichu");
        pakichu.setAmount(1);
        pakichu.setDescription("Its like Pikachu its just not a Pokemon (electric type)");
        pakichu.setAttribute("");
        weaponList[1] = (Weapons) pakichu;
        //To change body of generated methods, choose Tools | Templates.

        Item limpB = new Weapons(); //3
        limpB.setName("Limp Buscuit");
        limpB.setAmount(1);
        limpB.setDescription("Rocks hate these");
        limpB.setAttribute("");
        weaponList[2] = (Weapons) limpB;

        Item lawnM = new Weapons(); //4
        lawnM.setName("lawn mower seed sower dart blower");
        lawnM.setAmount(1);
        lawnM.setDescription("Yes they are all one weapon use on a jungle creature");
        lawnM.setAttribute("");
        weaponList[3] = (Weapons) lawnM;

        Item can = new Weapons(); //5
        can.setName("Can-a-blistic zombie");
        can.setAmount(1);
        can.setDescription("Dont use unless you wish to get ate");
        can.setAttribute("");
        weaponList[4] = (Weapons) can;

        Item hotG = new Weapons(); //6
        hotG.setName("hot glue gun");
        hotG.setAmount(1);
        hotG.setDescription("This is a hot glue gun");
        hotG.setAttribute("");
        weaponList[5] = (Weapons) hotG;

        Item coldG = new Weapons(); //7
        coldG.setName("cold glue gun");
        coldG.setAmount(1);
        coldG.setDescription("Its a cold glue gun?");
        coldG.setAttribute("");
        weaponList[6] = (Weapons) coldG;

        Item exploding = new Weapons(); //8
        exploding.setName("Exploding Chewing Gum");
        exploding.setAmount(1);
        exploding.setDescription("Chew then throw and it will explode (use on Evil Cashier)");
        exploding.setAttribute("");
        weaponList[7] = (Weapons) exploding;

        Item cat = new Weapons(); //9
        cat.setName("Cat");
        cat.setAmount(1);
        cat.setDescription("This is a very pampered dog named Cat");
        cat.setAttribute("");
        weaponList[8] = (Weapons) cat;

        Item fifle = new Weapons(); //10
        fifle.setName("Fifle");
        fifle.setAmount(1);
        fifle.setDescription("Fifle he has only ever desired to go West of New York");
        fifle.setAttribute("");
        weaponList[9] = (Weapons) fifle;

        Item chair = new Weapons(); //11
        chair.setName("The Chair");
        chair.setAmount(1);
        chair.setDescription("You remembering watching pro wrestling as you pick up your favorite wresting item");
        chair.setAttribute("");
        weaponList[10] = (Weapons) chair;

        Item packieB = new Weapons(); //12
        packieB.setName("PackieBalls");
        packieB.setAmount(1);
        packieB.setDescription("They are like pokeballs just balls that you use on packs");
        packieB.setAttribute("");
        weaponList[11] = (Weapons) packieB;

        Item ferrari = new Weapons(); //13
        ferrari.setName("Ferrari");
        ferrari.setAmount(1);
        ferrari.setDescription("You found the keys to a nice Ferrari Red Ferrari");
        ferrari.setAttribute("");
        weaponList[12] = (Weapons) ferrari;

        Item bow = new Weapons(); //14
        bow.setName("Bow and Arrow");
        bow.setAmount(1);
        bow.setDescription("Instead of hitting the Apple you hit the Man whos head it was hanging out on, he falls over and dies the apple topples to the ground and with a brusied outer shell and ego it rolls home.");
        bow.setAttribute("");
        weaponList[13] = (Weapons) bow;

        Item java = new Weapons(); //15
        java.setName("Java TextBook");
        java.setAmount(1);
        java.setDescription("This is a book teaching the skill of Java coding to the reader");
        java.setAttribute("");
        weaponList[14] = (Weapons) java;

        Item savings = new Weapons(); //16
        savings.setName("Day light Savings Time");
        savings.setAmount(1);
        savings.setDescription("The is the time of year where you fall forward");
        savings.setAttribute("");
        weaponList[15] = (Weapons) savings;

        Item trash = new Weapons(); //17
        trash.setName("Trash");
        trash.setAmount(1);
        trash.setDescription("Racoons love this stuff");
        trash.setAttribute("");
        weaponList[16] = (Weapons) trash;

        return weaponList;//To change body of generated methods, choose Tools | Templates.
    }
       public static Weapons[] getSortedWeaponList(Weapons[] weaponList) {

        for (int i = 0; i < weaponList.length - 1; i++) {

            for (int j = i + 1; j < weaponList.length - 1; j++) {
                if (weaponList[i].getName().compareTo(weaponList[j].getName()) < 0) {
                    Weapons lowerAlpha = weaponList[j];
                    weaponList[j] = weaponList[i];
                    weaponList[i] = lowerAlpha;
                    
                            
                }
            }

        }

        return weaponList;
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
     * Day light Savings Time: 15 (pick up: The is the time of year where you
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
}
