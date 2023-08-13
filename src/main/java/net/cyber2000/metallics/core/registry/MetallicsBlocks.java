package net.cyber2000.metallics.core.registry;

import net.cyber2000.metallics.Metallics;
import net.cyber2000.metallics.core.util.builder.block.GlassBlockBuilder;
import net.cyber2000.metallics.core.util.builder.block.MineableBlockBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MetallicsBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Metallics.MOD_ID);

    public static final RegistryObject<Block> TIN_BLOCK = MineableBlockBuilder.createMineableBlockWithRequiredTool("tin_block", Blocks.IRON_BLOCK, 1.0f);
    public static final RegistryObject<Block> RAW_TIN_BLOCK = MineableBlockBuilder.createMineableBlockWithRequiredTool("raw_tin_block", Blocks.RAW_IRON_BLOCK, 1.0f);
    public static final RegistryObject<Block> TIN_ORE = MineableBlockBuilder.createMineableBlockWithRequiredTool("tin_ore", Blocks.IRON_ORE, 3.0f);
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = MineableBlockBuilder.createMineableBlockWithRequiredTool("deepslate_tin_ore", Blocks.DEEPSLATE_IRON_ORE, 3.0f);

    public static final RegistryObject<Block> TIN_GLASS = GlassBlockBuilder.createDefaultGlassBlock("tin_glass", 0.6f);
    public static final RegistryObject<Block> TIN_GLASS_PANE = GlassBlockBuilder.createDefaultGlassPaneBlock("tin_glass_pane", 0.6f);

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}


