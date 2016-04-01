/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.survival.view;

import byui.cit260.survival.control.GameControl;
import byui.cit260.survival.model.Item;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import survival.Survival;

/**
 *
 * @author Tabitha
 */
public class StreamView extends View {

    public StreamView(Item[] inventory, String outputLocation) {
        super("/n Please enter the desired file location"
              );
    }

    @Override
    public boolean doAction(String outputLocation) {
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            Item[] inventory = GameControl.getSortedItemList(Survival.getCurrentGame().getItems());
            System.out.println("\n List of Inventory Items");
            System.out.println("Name" + "\t                " + "Description" + "\t                " + "Amount owned" + "\t                 ");

            // for each inventory item
            for (Item item : inventory) {
                // Display the stuff.
                System.out.println(item.getName() + "\t "
                        + item.getDescription() + "\t  "
                        + item.getAttribute() + "\t "
                        + item.getAmount());
            }
        } catch (IOException ex) {
            System.out.println("I/O error" + ex.getMessage());
            return false;
        }

        return true;
    }

}
