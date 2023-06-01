package net.cyber2000.metallics.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class MetallicsTiers {
    public static final ForgeTier BRONZE = new ForgeTier(2, 750, 6.0F, 2.0F, 11, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(MetallicsItems.BRONZE_INGOT.get()));
}
