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
        game.setItems(inventoryList);

        Map map = MapControl.createMap(); // create and initalize new map
        game.setMap(map); // save map in game

        //move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }

    public static boolean saveGameControl(String filelocation) {
        System.out.println("\n** save game Called** ");
        return true;
    }


    public static RegularScene[] createScenes() {
        RegularScene[] sceneList = new RegularScene[27];

        RegularScene startingScene = new RegularScene();
        startingScene.setDescription(
                "\nYou look at the map. Where do you wish to go to find the"
                           + "things that you are looking for? Choose wisely Good"
                           + "Luck!");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        sceneList[SceneType.start.ordinal()] = startingScene;

        RegularScene finishScene = new RegularScene();
        finishScene.setDescription(
                "\n Do you have everything that you came here to find? "
                          + "If so Please try and exit if not prepare for the"
                          + "wrath of your Wonderful daughter.");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        sceneList[SceneType.finish.ordinal()] = finishScene;
        
        RegularScene room1 = new RegularScene(); //1
        room1.setDescription("You are now in a store called Bed Bath and Other Stuff"
                           + "you see Zombie the Warrior. What do you wish to do?");
        room1.setTravelTime(0);
        room1.setBlocked(false);
        sceneList[0] = (RegularScene) room1;
        sceneList[SceneType.roomOne.ordinal()] = room1;
        
        RegularScene room2 = new RegularScene(); //1
        room2.setDescription("You are now in a store called Macrosoft inc."
                           + "you see, that one water type Pokemon you like... yeah that one. What do you wish to do?");
        room2.setTravelTime(0);
        room2.setBlocked(false);
        sceneList[0] = (RegularScene) room2;
        sceneList[SceneType.roomTwo.ordinal()] = room1;
        
        RegularScene room3 = new RegularScene(); //1
        room3.setDescription("You are now in a store called Clothes and Things"
                           + "you see a Rock. What do you wish to do?");
        room3.setTravelTime(0);
        room3.setBlocked(false);
        sceneList[0] = (RegularScene) room3;
        sceneList[SceneType.roomThree.ordinal()] = room1;
        
        RegularScene room4 = new RegularScene(); //1
        room4.setDescription("You are now in a store called Store Name"
                           + "you see a Monkey Lion Tiger. What do you wish to do?");
        room4.setTravelTime(0);
        room4.setBlocked(false);
        sceneList[0] = (RegularScene) room4;
        sceneList[SceneType.roomFour.ordinal()] = room1;
        
        RegularScene room5 = new RegularScene(); //1
        room5.setDescription("You are now in a store called Yogurt is Yummy"
                           + "you see a Ice Cube. What do you wish to do?");
        room5.setTravelTime(0);
        room5.setBlocked(false);
        sceneList[0] = (RegularScene) room5;
        sceneList[SceneType.roomFive.ordinal()] = room1;
        
        RegularScene room6 = new RegularScene(); //1
        room6.setDescription("You are now in a store called Knots and Kites"
                           + "you see a Hot Brick. What do you wish to do?");
        room6.setTravelTime(0);
        room6.setBlocked(false);
        sceneList[0] = (RegularScene) room6;
        sceneList[SceneType.roomSix.ordinal()] = room1;
        
        RegularScene room7 = new RegularScene(); //1
        room7.setDescription("You are now in a store called Clocks For Flava"
                           + "you see a Evil Cashier. What do you wish to do?");
        room7.setTravelTime(0);
        room7.setBlocked(false);
        sceneList[0] = (RegularScene) room7;
        sceneList[SceneType.roomSeven.ordinal()] = room1;
        
        RegularScene room8 = new RegularScene(); //1
        room8.setDescription("You are now in a store called Squaty Potty's are Us"
                           + "you see a Ball of Yarn. What do you wish to do?");
        room8.setTravelTime(0);
        room8.setBlocked(false);
        sceneList[0] = (RegularScene) room8;
        sceneList[SceneType.roomEight.ordinal()] = room1;
        
        RegularScene room9 = new RegularScene(); //1
        room9.setDescription("You are now in a store called Salamander Slogan"
                           + "you see New York. What do you wish to do?");
        room9.setTravelTime(0);
        room9.setBlocked(false);
        sceneList[0] = (RegularScene) room9;
        sceneList[SceneType.roomNine.ordinal()] = room1;
        
        RegularScene room10 = new RegularScene(); //1
        room10.setDescription("You are now in a store called Whatever You Like"
                           + "you see a Pro Wrestler. What do you wish to do?");
        room10.setTravelTime(0);
        room10.setBlocked(false);
        sceneList[0] = (RegularScene) room10;
        sceneList[SceneType.roomTen.ordinal()] = room1;
        
        RegularScene room11 = new RegularScene(); //1
        room11.setDescription("You are now in a store called Fife for Days"
                           + "you see a Angry Backpack. What do you wish to do?");
        room11.setTravelTime(0);
        room11.setBlocked(false);
        sceneList[0] = (RegularScene) room11;
        sceneList[SceneType.roomEleven.ordinal()] = room1;
        
        RegularScene room12 = new RegularScene(); //1
        room12.setDescription("You are now in a store called Im Tired Beds"
                           + "you see a Prius. What do you wish to do?");
        room12.setTravelTime(0);
        room12.setBlocked(false);
        sceneList[0] = (RegularScene) room12;
        sceneList[SceneType.roomTwelve.ordinal()] = room1;
        
        RegularScene room13 = new RegularScene(); //1
        room13.setDescription("You are now in a store called Names for Sale"
                           + "you see a Apple. What do you wish to do?");
        room13.setTravelTime(0);
        room13.setBlocked(false);
        sceneList[0] = (RegularScene) room13;
        sceneList[SceneType.roomThirteen.ordinal()] = room1;
        
        RegularScene room14 = new RegularScene(); //1
        room14.setDescription("You are now in a store called Roll Over and Lie"
                           + "you see a CIT Major Student. What do you wish to do?");
        room14.setTravelTime(0);
        room14.setBlocked(false);
        sceneList[0] = (RegularScene) room14;
        sceneList[SceneType.roomFourteen.ordinal()] = room1;
        
        RegularScene room15 = new RegularScene(); //1
        room15.setDescription("You are now in a store called Detevtives for Hire"
                           + "you see 8 Hours of Sleep. What do you wish to do?");
        room15.setTravelTime(0);
        room15.setBlocked(false);
        sceneList[0] = (RegularScene) room15;
        sceneList[SceneType.roomFifteen.ordinal()] = room1;
        
        RegularScene room16 = new RegularScene(); //1
        room16.setDescription("You are now in a store called Computers Shop"
                           + "you see a Racoon. What do you wish to do?");
        room16.setTravelTime(0);
        room16.setBlocked(false);
        sceneList[0] = (RegularScene) room16;
        sceneList[SceneType.roomSixteen.ordinal()] = room1;
        
        RegularScene room17 = new RegularScene(); //1
        room17.setDescription("You are now in a store called Cows for Mays"
                           + "you see a Regular guy who likes you. What do you wish to do?");
        room17.setTravelTime(0);
        room17.setBlocked(false);
        sceneList[0] = (RegularScene) room17;
        sceneList[SceneType.roomSeventeen.ordinal()] = room1;
        
        RegularScene room18 = new RegularScene(); //1
        room18.setDescription("You are now in a store called Billy Mays Store"
                           + "you see another Regular guy who likes you. What do you wish to do?");
        room18.setTravelTime(0);
        room18.setBlocked(false);
        sceneList[0] = (RegularScene) room18;
        sceneList[SceneType.roomEighteen.ordinal()] = room1;
        
        RegularScene hall1 = new RegularScene(); //1
        hall1.setDescription("Great now you are in a hall"
                           + "what do you wish to do now");
        hall1.setTravelTime(0);
        hall1.setBlocked(false);
        sceneList[0] = (RegularScene) hall1;
        sceneList[SceneType.hallOne.ordinal()] = room1;
        
        RegularScene hall2 = new RegularScene(); //1
        hall2.setDescription("Great now you are in a hall"
                           + "what do you wish to do now");
        hall2.setTravelTime(0);
        hall2.setBlocked(false);
        sceneList[0] = (RegularScene) hall2;
        sceneList[SceneType.hallTwo.ordinal()] = room1;
        
        RegularScene hall3 = new RegularScene(); //1
        hall3.setDescription("Great now you are in a hall"
                           + "What do you wish to do now?");
        hall3.setTravelTime(0);
        hall3.setBlocked(false);
        sceneList[0] = (RegularScene) hall3;
        sceneList[SceneType.hallThree.ordinal()] = room1;
        
        RegularScene hall4 = new RegularScene(); //1
        hall4.setDescription("Great now you are in a hall"
                           + "What do you wish to do now?");
        hall4.setTravelTime(0);
        hall4.setBlocked(false);
        sceneList[0] = (RegularScene) hall4;
        sceneList[SceneType.hallFour.ordinal()] = room1;
        
        RegularScene hall5 = new RegularScene(); //1
        hall5.setDescription("Great now you are in a hall"
                           + "What do you wish to do now?");
        hall5.setTravelTime(0);
        hall5.setBlocked(false);
        sceneList[0] = (RegularScene) hall5;
        sceneList[SceneType.hallFive.ordinal()] = room1;
        
        RegularScene hall6 = new RegularScene(); //1
        hall6.setDescription("Great now you are in a hall"
                           + "What do you wish to do now?");
        hall6.setTravelTime(0);
        hall6.setBlocked(false);
        sceneList[0] = (RegularScene) hall6;
        sceneList[SceneType.hallSix.ordinal()] = room1;
        
        RegularScene hall7 = new RegularScene(); //1
        hall7.setDescription("Great now you are in a hall"
                           + "What do you wish to do now?");
        hall7.setTravelTime(0);
        hall7.setBlocked(false);
        sceneList[0] = (RegularScene) hall7;
        sceneList[SceneType.hallSeven.ordinal()] = room1;
        
        RegularScene enter = new RegularScene(); //1
        enter.setDescription("You look at the map. Where do you wish to go to find the"
                           + "things that you are looking for? Choose wisely Good"
                           + "Luck!");
        enter.setTravelTime(0);
        enter.setBlocked(false);
        sceneList[0] = (RegularScene) enter;
        sceneList[SceneType.roomOne.ordinal()] = room1;
        
        RegularScene exit = new RegularScene(); //1
        exit.setDescription("Do you have everything that you came here to find? "
                          + "If so Please try and exit if not prepare for the"
                          + "wrath of your Wonderful daughter.");
        exit.setTravelTime(0);
        exit.setBlocked(false);
        sceneList[0] = (RegularScene) exit;
        sceneList[SceneType.roomOne.ordinal()] = room1;
      
        return sceneList;
    }
public static RegularScene[] getSortedWeaponList(RegularScene[] sceneList) {

        return sceneList;
    }
    public enum SceneType {
        start,
        finish,
        roomOne,
        roomTwo,
        roomThree,
        roomFour,
        roomFive,
        roomSix,
        roomSeven,
        roomEight,
        roomNine,
        roomTen,
        roomEleven,
        roomTwelve,
        roomThirteen,
        roomFourteen,
        roomFifteen,
        roomSixteen,
        roomSeventeen,
        roomEighteen,
        hallOne,
        hallTwo,
        hallThree,
        hallFour,
        hallFive,
        hallSix,
        hallSeven;
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
