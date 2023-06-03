package net.cyber2000.metallics.core.util.builder.block;

import net.cyber2000.metallics.core.util.builder.ObjectBuilder;
import net.cyber2000.metallics.core.util.builder.item.ItemBuilder;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.cyber2000.metallics.core.registry.MetallicsBlocks.BLOCKS;

public class BlockBuilder implements ObjectBuilder {
    protected static <T extends Block> RegistryObject<T> createBlock(String name, Supplier<T> block) {
        RegistryObject<T> blockRegistry = BLOCKS.register(name, block);
        createBlockItem(name, blockRegistry);
        return blockRegistry;
    }

    private static <T extends Block> void createBlockItem(String name, RegistryObject<T> block) {
        ItemBuilder.createItem(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
