package net.cyber2000.metallics;

import com.mojang.logging.LogUtils;
import net.cyber2000.metallics.core.registry.MetallicsBlocks;
import net.cyber2000.metallics.core.registry.MetallicsEffects;
import net.cyber2000.metallics.core.registry.MetallicsItems;
import net.cyber2000.metallics.core.util.builder.block.BlockBuilder;
import net.cyber2000.metallics.core.util.builder.item.ItemBuilder;
import net.cyber2000.metallics.core.util.helper.CreativeModeTabHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Metallics.MOD_ID)
public class Metallics {
    public static final String MOD_ID = "metallics";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Metallics() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MetallicsEffects.register(modEventBus);
        MetallicsItems.register(modEventBus);
        MetallicsBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative); // Register the item to a creative tab
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        CreativeModeTabHelper tabHelper = new CreativeModeTabHelper(event);
        tabHelper.addToIngredientsTab();
        tabHelper.addToCombatTab();
        tabHelper.addToBuildingBlocksTab();
        tabHelper.addToFoodAndDrinksTab();
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
