package org.arathok.wurmunlimited.mods.ArmourStands;

import com.wurmonline.server.items.*;
import com.wurmonline.server.skills.SkillList;
import com.wurmonline.shared.constants.IconConstants;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;

public class ArmourStandItems {
    public static int armourStandLeatherId,armourStandChainId,armourStandDrakeId,armourStandDragonId,armourStandStuddedLeatherId,armourStandPlateId;

    public static ItemTemplate armourStandLeather,armourStandChain,armourStandDrake,armourStandDragon,armourStandStuddedLeather,armourStandPlate;

    public static void registerArmourStandLeather() throws IOException {
        armourStandLeather = new ItemTemplateBuilder("arathok.armourstands.armourstandleather")
                .name ("Armour Stand Leather(changing model)","Armour Stands ","A piece of furniture made to display various pieces of armor")
                .modelName("model.arathok.ArmourStand.leather")
                .imageNumber((short) IconConstants.ICON_DECO_PRACTICEDOLL)
                .itemTypes(new short[] {
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_TURNABLE,
                        ItemTypes.ITEM_TYPE_PLANTABLE,
                        ItemTypes.ITEM_TYPE_BULKCONTAINER,
                        ItemTypes.ITEM_TYPE_HOLLOW,

                })
                .decayTime(90720000L)
                .dimensions( 80,80,100)
                .weightGrams(20000)
                .behaviourType((short)1)
                .primarySkill(SkillList.CARPENTRY_FINE)
                .difficulty (30)
                .build();
        armourStandLeatherId = armourStandLeather.getTemplateId();
        CreationEntryCreator
                .createAdvancedEntry(SkillList.ALCHEMY_NATURAL, ItemList.nailsIronSmall, ItemList.plank, armourStandLeatherId, true, true,0.0f, true, false,0,5, CreationCategories.DECORATION)
                .addRequirement(new CreationRequirement(1, ItemList.plank, 12, true))
                .addRequirement(new CreationRequirement(2, ItemList.pegWood, 7, true))
                .addRequirement(new CreationRequirement(3, ItemList.shaft, 6, true));
    }

    public static void registerArmourStandChain() throws IOException {
        armourStandChain = new ItemTemplateBuilder("arathok.armourstands.armourstandchain")
                .name ("Armour Stand Chain (changing model)","Armour Stands ","A piece of furniture made to display various pieces of armor")
                .modelName("model.arathok.ArmourStand.plate")
                .imageNumber((short) IconConstants.ICON_DECO_PRACTICEDOLL)
                .itemTypes(new short[] {
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_TURNABLE,
                        ItemTypes.ITEM_TYPE_PLANTABLE,
                        ItemTypes.ITEM_TYPE_BULKCONTAINER,
                        ItemTypes.ITEM_TYPE_HOLLOW,

                })
                .decayTime(90720000L)
                .dimensions( 80,80,100)
                .weightGrams(20000).material(Materials.MATERIAL_WOOD_FIR)
                .behaviourType((short)1)
                .primarySkill(SkillList.CARPENTRY_FINE)
                .difficulty (30)
                .build();
        armourStandChainId = armourStandChain.getTemplateId();

    }

    public static void registerArmourStandPlate() throws IOException {
        armourStandPlate = new ItemTemplateBuilder("arathok.armourstands.armourstandplate")
                .name ("Armour Stand Plate(changing model)","Armour Stands ","A piece of furniture made to display various pieces of armor")
                .modelName("model.arathok.ArmourStand.plate")
                .imageNumber((short) IconConstants.ICON_DECO_PRACTICEDOLL)
                .itemTypes(new short[] {
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_TURNABLE,
                        ItemTypes.ITEM_TYPE_PLANTABLE,
                        ItemTypes.ITEM_TYPE_BULKCONTAINER,
                        ItemTypes.ITEM_TYPE_HOLLOW,

                })
                .decayTime(90720000L)
                .dimensions( 80,80,100)
                .weightGrams(20000).material(Materials.MATERIAL_WOOD_FIR)
                .behaviourType((short)1)
                .primarySkill(SkillList.CARPENTRY_FINE)
                .difficulty (30)
                .build();
        armourStandPlateId = armourStandPlate.getTemplateId();

    }

    public static void registerArmourStandDrake() throws IOException {
        armourStandDrake = new ItemTemplateBuilder("arathok.armourstands.armourstanddrake")
                .name ("Armour Stand Drake(changing model)","Armour Stands ","A piece of furniture made to display various pieces of armor")
                .modelName("model.arathok.ArmourStand.drake")
                .imageNumber((short) IconConstants.ICON_DECO_PRACTICEDOLL)
                .itemTypes(new short[] {
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_TURNABLE,
                        ItemTypes.ITEM_TYPE_PLANTABLE,
                        ItemTypes.ITEM_TYPE_BULKCONTAINER,
                        ItemTypes.ITEM_TYPE_HOLLOW,

                })
                .decayTime(90720000L)
                .dimensions( 80,80,100)
                .weightGrams(20000).material(Materials.MATERIAL_WOOD_FIR)
                .behaviourType((short)1)
                .primarySkill(SkillList.CARPENTRY_FINE)
                .difficulty (30)
                .build();
        armourStandDrakeId = armourStandDrake.getTemplateId();

    }

    public static void registerArmourStandDragon() throws IOException {
        armourStandDragon = new ItemTemplateBuilder("arathok.armourstands.armourstanddragon")
                .name ("Armour Stand Dragon(changing model)","Armour Stands ","A piece of furniture made to display various pieces of armor")
                .modelName("model.arathok.ArmourStand.dragon")
                .imageNumber((short) IconConstants.ICON_DECO_PRACTICEDOLL)
                .itemTypes(new short[] {
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_TURNABLE,
                        ItemTypes.ITEM_TYPE_PLANTABLE,
                        ItemTypes.ITEM_TYPE_BULKCONTAINER,
                        ItemTypes.ITEM_TYPE_HOLLOW,

                })
                .decayTime(90720000L)
                .dimensions( 80,80,100)
                .weightGrams(20000).material(Materials.MATERIAL_WOOD_FIR)
                .behaviourType((short)1)
                .primarySkill(SkillList.CARPENTRY_FINE)
                .difficulty (30)
                .build();
        armourStandDragonId = armourStandDragon.getTemplateId();

    }

    public static void registerArmourStandStuddedLeather() throws IOException {
        armourStandStuddedLeather = new ItemTemplateBuilder("arathok.armourstands.armourstandstuddedleather")
                .name ("Armour Stand Studded(changing model)","Armour Stands ","A piece of furniture made to display various pieces of armor")
                .modelName("model.arathok.ArmourStand.studdedleather")
                .imageNumber((short) IconConstants.ICON_DECO_PRACTICEDOLL)
                .itemTypes(new short[] {
                        ItemTypes.ITEM_TYPE_DECORATION,
                        ItemTypes.ITEM_TYPE_TURNABLE,
                        ItemTypes.ITEM_TYPE_PLANTABLE,
                        ItemTypes.ITEM_TYPE_BULKCONTAINER,
                        ItemTypes.ITEM_TYPE_HOLLOW,

                })
                .decayTime(90720000L)
                .dimensions( 80,80,100)
                .weightGrams(20000).material(Materials.MATERIAL_WOOD_FIR)
                .behaviourType((short)1)
                .primarySkill(SkillList.CARPENTRY_FINE)
                .difficulty (30)
                .build();
        armourStandStuddedLeatherId = armourStandStuddedLeather.getTemplateId();

    }

    public static void register() throws IOException {
        registerArmourStandLeather();
        registerArmourStandStuddedLeather();
        registerArmourStandChain();
        registerArmourStandPlate();
        registerArmourStandDrake();
        registerArmourStandDragon();
    }
}
