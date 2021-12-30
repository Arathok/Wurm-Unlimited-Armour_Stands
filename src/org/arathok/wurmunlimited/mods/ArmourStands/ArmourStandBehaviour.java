package org.arathok.wurmunlimited.mods.ArmourStands;

import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;

public class ArmourStandBehaviour implements BehaviourProvider {

    private final List<ActionEntry> updateArmourStand;
    private final ArmourStandPerformer armourStandPerformer;

    public ArmourStandBehaviour() {
        this.armourStandPerformer = new ArmourStandPerformer();
        this.updateArmourStand = Collections.singletonList(armourStandPerformer.actionEntry);
        ModActions.registerActionPerformer(armourStandPerformer);

    }

    //, , , , ,
    //, , , , ;

    @Override
    public List<ActionEntry> getBehavioursFor(Creature performer, Item source, Item target) {

        if (source.getTemplateId() == ArmourStandItems.armourStandLeatherId) {
            if (ArmourStandPerformer.canUse(performer, source))
                return new ArrayList<>(updateArmourStand);
        }
        else if (source.getTemplateId() == ArmourStandItems.armourStandStuddedLeatherId) {
            if (ArmourStandPerformer.canUse(performer, source))
                return new ArrayList<>(updateArmourStand);
        }
        else if (source.getTemplateId() == ArmourStandItems.armourStandChainId) {
            if (ArmourStandPerformer.canUse(performer, source))
                return new ArrayList<>(updateArmourStand);
        }
        else if (source.getTemplateId() == ArmourStandItems.armourStandPlateId) {
            if (ArmourStandPerformer.canUse(performer, source))
                return new ArrayList<>(updateArmourStand);
        }
        else if (source.getTemplateId() == ArmourStandItems.armourStandDrakeId) {
            if (ArmourStandPerformer.canUse(performer, source))
                return new ArrayList<>(updateArmourStand);
        }
        else if (source.getTemplateId() == ArmourStandItems.armourStandDragonId) {
            if (ArmourStandPerformer.canUse(performer, source))
                return new ArrayList<>(updateArmourStand);
        }
         else
            return null;

        return null;
    }
}