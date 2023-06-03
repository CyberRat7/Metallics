package net.cyber2000.metallics.core.util.helper;

import net.cyber2000.metallics.core.registry.MetallicsBlocks;
import net.cyber2000.metallics.core.registry.MetallicsItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;

public class CreativeModeTabHelper {
    private final CreativeModeTabEvent.BuildContents event;

    public CreativeModeTabHelper(CreativeModeTabEvent.BuildContents event) {
        this.event = event;
    }

    public void addToIngredientsTab() {
        if (event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept(MetallicsItems.TIN_CAN);
            event.accept(MetallicsItems.CRUSHED_TIN_CAN);
            event.accept(MetallicsItems.RAW_TIN);
            event.accept(MetallicsItems.TIN_INGOT);
            event.accept(MetallicsItems.BRONZE_INGOT);
            event.accept(MetallicsItems.TIN_NUGGET);
        }
    }

    public void addToCombatTab() {
        if (event.getTab() == CreativeModeTabs.COMBAT) {
            event.accept(MetallicsItems.BRONZE_PLATED_HELMET);
            event.accept(MetallicsItems.BRONZE_PLATED_BOOTS);
            event.accept(MetallicsItems.BRONZE_PLATED_CHESTPLATE);
            event.accept(MetallicsItems.BRONZE_PLATED_LEGGINGS);
            event.accept(MetallicsItems.BRONZE_PLATED_AXE);
            event.accept(MetallicsItems.BRONZE_PLATED_SHOVEL);
            event.accept(MetallicsItems.BRONZE_PLATED_PICKAXE);
            event.accept(MetallicsItems.BRONZE_PLATED_HOE);
            event.accept(MetallicsItems.BRONZE_PLATED_SWORD);
        }
    }

    public void addToBuildingBlocksTab() {
        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(MetallicsBlocks.TIN_ORE);
            event.accept(MetallicsBlocks.DEEPSLATE_TIN_ORE);
            event.accept(MetallicsBlocks.TIN_BLOCK);
            event.accept(MetallicsBlocks.RAW_TIN_BLOCK);
            event.accept(MetallicsBlocks.TIN_GLASS);
            event.accept(MetallicsBlocks.TIN_GLASS_PANE);
        }
    }

    public void addToFoodAndDrinksTab() {
        if (event.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(MetallicsItems.CANNED_BEETROOT);
            event.accept(MetallicsItems.CANNED_CARROT);
            event.accept(MetallicsItems.CANNED_MELON);
        }
    }
}
