package net.cyber2000.metallics.core.util.builder.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

public class MineableBlockBuilder extends BlockBuilder {
    public static RegistryObject<Block> createMineableBlock(String name, Block material, float strength, float blastResistance, SoundType sound) {
        return createBlock(name, () -> new Block(BlockBehaviour.Properties.copy(material).strength(strength).explosionResistance(blastResistance).sound(sound)));
    }

    public static RegistryObject<Block> createMineableBlock(String name, Block material, float strength, SoundType sound) {
        return createBlock(name, () -> new Block(BlockBehaviour.Properties.copy(material).strength(strength).sound(sound)));
    }

    public static RegistryObject<Block> createMineableBlockWithRequiredTool(String name, Block material, float strength, float blastResistance, SoundType sound) {
        return createBlock(name, () -> new Block(BlockBehaviour.Properties.copy(material).strength(strength).explosionResistance(blastResistance).sound(sound).requiresCorrectToolForDrops()));
    }

    public static RegistryObject<Block> createMineableBlockWithRequiredTool(String name, Block material, float strength, SoundType sound) {
        return createBlock(name, () -> new Block(BlockBehaviour.Properties.copy(material).strength(strength).sound(sound).requiresCorrectToolForDrops()));
    }

    public static RegistryObject<Block> createMineableBlockWithRequiredTool(String name, Block material, float strength) {
        return createBlock(name, () -> new Block(BlockBehaviour.Properties.copy(material).strength(strength).requiresCorrectToolForDrops()));
    }
}
