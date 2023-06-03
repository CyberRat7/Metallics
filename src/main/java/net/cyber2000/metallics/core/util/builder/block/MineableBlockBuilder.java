package net.cyber2000.metallics.core.util.builder.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public class MineableBlockBuilder extends BlockBuilder {
    public static RegistryObject<Block> createMineableBlock(String name, Material material, float strength, float blastResistance, SoundType sound) {
        return createBlock(name, () -> new Block(BlockBehaviour.Properties.of(material).strength(strength).explosionResistance(blastResistance).sound(sound)));
    }

    public static RegistryObject<Block> createMineableBlock(String name, Material material, float strength, SoundType sound) {
        return createBlock(name, () -> new Block(BlockBehaviour.Properties.of(material).strength(strength).sound(sound)));
    }

    public static RegistryObject<Block> createMineableBlockWithRequiredTool(String name, Material material, float strength, float blastResistance, SoundType sound) {
        return createBlock(name, () -> new Block(BlockBehaviour.Properties.of(material).strength(strength).explosionResistance(blastResistance).sound(sound).requiresCorrectToolForDrops()));
    }

    public static RegistryObject<Block> createMineableBlockWithRequiredTool(String name, Material material, float strength, SoundType sound) {
        return createBlock(name, () -> new Block(BlockBehaviour.Properties.of(material).strength(strength).sound(sound).requiresCorrectToolForDrops()));
    }
}
