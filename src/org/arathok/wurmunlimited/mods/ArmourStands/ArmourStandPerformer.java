package org.arathok.wurmunlimited.mods.ArmourStands;


import com.wurmonline.server.FailedException;
import com.wurmonline.server.behaviours.Action;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.items.ItemFactory;
import com.wurmonline.server.items.NoSuchTemplateException;
import org.gotti.wurmunlimited.modsupport.actions.ActionEntryBuilder;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.ActionPropagation;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;

import java.util.logging.Level;

public class ArmourStandPerformer implements ActionPerformer {

    public ActionEntry actionEntry;

    public ArmourStandPerformer() {

        actionEntry = new ActionEntryBuilder((short) ModActions.getNextActionId(), "update armour stand", "updating", new int[]{
                6 /* ACTION_TYPE_NOMOVE */,
                48 /* ACTION_TYPE_ENEMY_ALWAYS */,
                35 /* DONT CARE SOURCE/TARGET*/,

        }).range(4).build();

        ModActions.registerAction(actionEntry);
    }

    @Override
    public boolean action(Action action, Creature performer, Item source, Item target, short num, float counter) {
        return action(action, performer, target, num, counter);
    } // NEEDED OR THE ITEM WILL ONLY ACTIVATE IF YOU HAVE NO ITEM ACTIVE

    @Override
    public short getActionId() {
        return actionEntry.getNumber();
    }

    public static boolean canUse(Creature performer, Item source) {

        return performer.isPlayer() && (source.getOwnerId() == performer.getWurmId() || source.getLastOwnerId() == performer.getWurmId()) && !source.isTraded();
    }

    @Override
    public boolean action(Action action, Creature performer, Item target, short num, float counter) {
        if (target.getItemsAsArray().length >0) {
            Item[] stuffInArmourstand = target.getItemsAsArray();


            if (!canUse(performer, target)) {
                performer.getCommunicator().sendAlertServerMessage("You are not allowed to do that");
                return propagate(action,
                        ActionPropagation.FINISH_ACTION,
                        ActionPropagation.NO_SERVER_PROPAGATION,
                        ActionPropagation.NO_ACTION_PERFORMER_PROPAGATION);
            }
        

            if (stuffInArmourstand[0].getName().contains("leather")) {

                target.setTemplateId(ArmourStandItems.armourStandLeatherId);
                for (Item item : stuffInArmourstand) {
                    target.insertItem(item);
                }

            }
            if (stuffInArmourstand[0].getName().contains("chain")) {

                target.setTemplateId(ArmourStandItems.armourStandChainId);
                for (Item item : stuffInArmourstand) {
                    target.insertItem(item);
                }

            }

            if (stuffInArmourstand[0].getName().contains("plate")) {

                target.setTemplateId(ArmourStandItems.armourStandPlateId);
                for (Item item : stuffInArmourstand) {
                    target.insertItem(item);
                }

            }

            if (stuffInArmourstand[0].getName().contains("studded")) {

                target.setTemplateId(ArmourStandItems.armourStandStuddedLeatherId);
                for (Item item : stuffInArmourstand) {
                    target.insertItem(item);
                }

            }

            if (stuffInArmourstand[0].getName().contains("drake")) {

                target.setTemplateId(ArmourStandItems.armourStandDrakeId);
                for (Item item : stuffInArmourstand) {
                    target.insertItem(item);
                }

            }

            if (stuffInArmourstand[0].getName().contains("dragon")) {

                target.setTemplateId(ArmourStandItems.armourStandDragonId);
                for (Item item : stuffInArmourstand) {
                    target.insertItem(item);
                }

            }


        }
        else
            performer.getCommunicator().sendAlertServerMessage("The armour stand is empty and can not update!");
        return propagate(action,
                ActionPropagation.FINISH_ACTION,
                ActionPropagation.NO_SERVER_PROPAGATION,
                ActionPropagation.NO_ACTION_PERFORMER_PROPAGATION);
    }
}




