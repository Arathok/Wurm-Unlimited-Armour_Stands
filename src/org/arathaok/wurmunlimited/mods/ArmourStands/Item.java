package org.arathaok.wurmunlimited.mods.ArmourStands;

import com.wurmonline.server.items.*;
import com.wurmonline.server.skills.SkillList;
import com.wurmonline.shared.constants.IconConstants;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class Item {
    public static int armourStandId;

    public static ItemTemplate armourStand;

    public static void registerArmourStand() throws IOException {
        armourStand = new ItemTemplateBuilder("arathok.armourstands.armourstand")
                .name ("Armour Stand (changing model)","Armour Stands ","A piece of furniture made to display various pieces of armor")
                .modelName("model.arathok.ArmourStand.leather")
                .imageNumber((short) IconConstants.ICON_DECO_PRACTICEDOLL)
                .itemTypes(new short[] {
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_TURNABLE,
                        ItemTypes.ITEM_TYPE_PLANTABLE,
                        ItemTypes.ITEM_TYPE_BULKCONTAINER,

                })
                .decayTime(90720000L)
                .dimensions( 80,80,100)
                .weightGrams(20000).material(Materials.MATERIAL_WOOD_FIR)
                .behaviourType((short)1)
                .primarySkill(SkillList.CARPENTRY_FINE)
                .difficulty (30)
                .build();
        armourStandId = armourStand.getTemplateId();
        CreationEntryCreator
                .createAdvancedEntry(SkillList.ALCHEMY_NATURAL, ItemList.nailsIronSmall, ItemList.plank, armourStandId, true, true,0.0f, true, false,0,5, CreationCategories.DECORATION)
                .addRequirement(new CreationRequirement(1, ItemList.plank, 12, true))
                .addRequirement(new CreationRequirement(2, ItemList.pegWood, 7, true))
                .addRequirement(new CreationRequirement(3, ItemList.shaft, 6, true));
    }
    public static void register() throws IOException {
        registerArmourStand();
    }
}
