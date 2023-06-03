package net.cyber2000.metallics.core.gen.datagen;



import net.cyber2000.metallics.Metallics;
import net.cyber2000.metallics.core.gen.worldgen.MetallicsConfiguredFeatures;
import net.cyber2000.metallics.core.gen.worldgen.MetallicsPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class MetallicsWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, MetallicsConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, MetallicsPlacedFeatures::bootstrap);

    public MetallicsWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Metallics.MOD_ID));
    }
}