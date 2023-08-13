package net.cyber2000.metallics.core.util.helper;

import net.cyber2000.metallics.core.registry.MetallicsBlocks;
import net.cyber2000.metallics.core.registry.MetallicsItems;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import java.util.function.Supplier;

public class CreativeModeTabHelper {
    private final BuildCreativeModeTabContentsEvent event;

    public CreativeModeTabHelper(BuildCreativeModeTabContentsEvent event) {
        this.event = event;
    }

    public void addToBuildingBlocksTab(Supplier<? extends ItemLike> item) {
        addToTab(CreativeModeTabs.BUILDING_BLOCKS, item);
    }

    public void addToColoredBlocksTab(Supplier<? extends ItemLike> item) {
        addToTab(CreativeModeTabs.COLORED_BLOCKS, item);
    }

    public void addToNaturalBlocksTab(Supplier<? extends ItemLike> item) {
        addToTab(CreativeModeTabs.NATURAL_BLOCKS, item);
    }

    public void addToFunctionalBlocksTab(Supplier<? extends ItemLike> item) {
        addToTab(CreativeModeTabs.FUNCTIONAL_BLOCKS, item);
    }

    public void addToRedstoneBlocksTab(Supplier<? extends ItemLike> item) {
        addToTab(CreativeModeTabs.REDSTONE_BLOCKS, item);
    }

    public void addToTools(Supplier<? extends ItemLike> item) {
        addToTab(CreativeModeTabs.TOOLS_AND_UTILITIES, item);
    }

    public void addToCombatTab(Supplier<? extends ItemLike> item) {
        addToTab(CreativeModeTabs.COMBAT, item);
    }

    public void addToFoodAndDrinksTab(Supplier<? extends ItemLike> item) {
        addToTab(CreativeModeTabs.FOOD_AND_DRINKS, item);
    }

    public void addToIngredientsTab(Supplier<? extends ItemLike> item) {
        addToTab(CreativeModeTabs.INGREDIENTS, item);
    }

    private void addToTab(ResourceKey<CreativeModeTab> creativeModeTab, Supplier<? extends ItemLike> item) {
        if (event.getTabKey() == creativeModeTab) {
            addItem(item);
        }
    }

    private void addItem(Supplier<? extends ItemLike> item) {
        event.accept(item);
    }
}
