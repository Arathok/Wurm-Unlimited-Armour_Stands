package org.arathaok.wurmunlimited.mods.ArmourStands;


import com.wurmonline.server.Items;
import com.wurmonline.server.NoSuchItemException;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.creatures.NoSuchCreatureException;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.zones.VirtualZone;

import java.util.Set;

public class ModelHandler {

    public static Set<Item> armourStands;

    public void ModelHandling() throws NoSuchCreatureException {
        try {
            armourStands= Items.getItemsWithDesc("A piece of furniture made to display various pieces of armor",false);
        } catch (NoSuchItemException e) {
            e.printStackTrace();
        }
    for (Item armourStand : armourStands)
    {
        Item[] itemsInArmourStand=armourStand.getItemsAsArray();
        if (itemsInArmourStand[0].getName().contains("leather")||itemsInArmourStand[0].getName().contains("Leather")&&(!itemsInArmourStand[0].getName().contains("studded")||!itemsInArmourStand[0].getName().contains("Studded")))
        {



        }

        if (itemsInArmourStand[0].getName().contains("studded")||itemsInArmourStand[0].getName().contains("Studded"))
        {

        }

        if (itemsInArmourStand[0].getName().contains("Drake")||itemsInArmourStand[0].getName().contains("drake"))
        {

        }

        if (itemsInArmourStand[0].getName().contains("plate")||itemsInArmourStand[0].getName().contains("Plate"))
        {

        }

        if (itemsInArmourStand[0].getName().contains("dragon")||itemsInArmourStand[0].getName().contains("Dragon"))
        {

        }

        if (itemsInArmourStand[0].getName().contains("Chain")||itemsInArmourStand[0].getName().contains("chain"))
        {

        }
    }

    }


}
