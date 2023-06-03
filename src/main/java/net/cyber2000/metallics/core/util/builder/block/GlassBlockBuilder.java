package net.cyber2000.metallics.core.util.builder.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public class GlassBlockBuilder extends BlockBuilder {
    public static RegistryObject<Block> createDefaultGlassBlock(String name, float strength, SoundType sound) {
        return createBlock(name, () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(strength).noOcclusion().sound(sound)));
    }

    public static RegistryObject<Block> createDefaultGlassPaneBlock(String name, float strength, SoundType sound) {
        return createBlock(name, () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(strength).noOcclusion().sound(sound)));
    }
}
