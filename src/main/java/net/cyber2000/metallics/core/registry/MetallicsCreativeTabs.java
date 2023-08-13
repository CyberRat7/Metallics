package net.cyber2000.metallics.core.registry;

import net.cyber2000.metallics.core.util.helper.CreativeModeTabHelper;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

public class MetallicsCreativeTabs {
    public static void init(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTabHelper tabHelper = new CreativeModeTabHelper(event);

        tabHelper.addToBuildingBlocksTab(MetallicsBlocks.TIN_BLOCK);

        tabHelper.addToColoredBlocksTab(MetallicsBlocks.TIN_GLASS);
        tabHelper.addToColoredBlocksTab(MetallicsBlocks.TIN_GLASS_PANE);

        tabHelper.addToNaturalBlocksTab(MetallicsBlocks.TIN_ORE);
        tabHelper.addToNaturalBlocksTab(MetallicsBlocks.DEEPSLATE_TIN_ORE);
        tabHelper.addToNaturalBlocksTab(MetallicsBlocks.RAW_TIN_BLOCK);

        tabHelper.addToTools(MetallicsItems.BRONZE_PLATED_SHOVEL);
        tabHelper.addToTools(MetallicsItems.BRONZE_PLATED_PICKAXE);
        tabHelper.addToTools(MetallicsItems.BRONZE_PLATED_AXE);
        tabHelper.addToTools(MetallicsItems.BRONZE_PLATED_HOE);

        tabHelper.addToCombatTab(MetallicsItems.BRONZE_PLATED_SWORD);
        tabHelper.addToCombatTab(MetallicsItems.BRONZE_PLATED_HELMET);
        tabHelper.addToCombatTab(MetallicsItems.BRONZE_PLATED_CHESTPLATE);
        tabHelper.addToCombatTab(MetallicsItems.BRONZE_PLATED_LEGGINGS);
        tabHelper.addToCombatTab(MetallicsItems.BRONZE_PLATED_BOOTS);

        tabHelper.addToFoodAndDrinksTab(MetallicsItems.CANNED_BEETROOT);
        tabHelper.addToFoodAndDrinksTab(MetallicsItems.CANNED_CARROT);
        tabHelper.addToFoodAndDrinksTab(MetallicsItems.CANNED_MELON);

        tabHelper.addToIngredientsTab(MetallicsItems.TIN_CAN);
        tabHelper.addToIngredientsTab(MetallicsItems.CRUSHED_TIN_CAN);
        tabHelper.addToIngredientsTab(MetallicsItems.RAW_TIN);
        tabHelper.addToIngredientsTab(MetallicsItems.TIN_INGOT);
        tabHelper.addToIngredientsTab(MetallicsItems.BRONZE_INGOT);
        tabHelper.addToIngredientsTab(MetallicsItems.TIN_NUGGET);
    }
}
