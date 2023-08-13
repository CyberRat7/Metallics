package net.cyber2000.metallics.core.util.builder.block;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

public class GlassBlockBuilder extends BlockBuilder {
    public static RegistryObject<Block> createDefaultGlassBlock(String name, float strength, SoundType sound) {
        return createBlock(name, () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(strength).noOcclusion().sound(sound)));
    }

    public static RegistryObject<Block> createDefaultGlassBlock(String name, float strength) {
        return createBlock(name, () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(strength).noOcclusion()));
    }

    public static RegistryObject<Block> createDefaultGlassPaneBlock(String name, float strength, SoundType sound) {
        return createBlock(name, () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(strength).noOcclusion().sound(sound)));
    }

    public static RegistryObject<Block> createDefaultGlassPaneBlock(String name, float strength) {
        return createBlock(name, () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(strength).noOcclusion()));
    }
}
