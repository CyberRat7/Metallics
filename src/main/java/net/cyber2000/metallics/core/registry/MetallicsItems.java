package net.cyber2000.metallics.core.registry;


import net.cyber2000.metallics.Metallics;
import net.cyber2000.metallics.core.util.builder.item.ArmorBuilder;
import net.cyber2000.metallics.core.util.builder.item.FoodBuilder;
import net.cyber2000.metallics.core.util.builder.item.ItemBuilder;
import net.cyber2000.metallics.core.util.builder.item.ToolBuilder;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MetallicsItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Metallics.MOD_ID);

    public static final RegistryObject<Item> TIN_CAN = ItemBuilder.createDefaultItem("tin_can");
    public static final RegistryObject<Item> TIN_INGOT = ItemBuilder.createDefaultItem("tin_ingot");
    public static final RegistryObject<Item> RAW_TIN = ItemBuilder.createDefaultItem("raw_tin");
    public static final RegistryObject<Item> TIN_NUGGET = ItemBuilder.createDefaultItem("tin_nugget");
    public static final RegistryObject<Item> CRUSHED_TIN_CAN = ItemBuilder.createDefaultItem("crushed_tin_can");
    public static final RegistryObject<Item> BRONZE_INGOT = ItemBuilder.createDefaultItem("bronze_ingot");

    public static final RegistryObject<Item> CANNED_CARROT = FoodBuilder.createDefaultFoodItem("canned_carrot", 8, 14f);
    public static final RegistryObject<Item> CANNED_BEETROOT = FoodBuilder.createDefaultFoodItem("canned_beetroot", 6, 14f);
    public static final RegistryObject<Item> CANNED_MELON = FoodBuilder.createDefaultFoodItem("canned_melon", 6, 14f);

    public static final RegistryObject<Item> BRONZE_PLATED_SWORD = ToolBuilder.createSwordItem("bronze_plated_sword", MetallicsTiers.BRONZE, 3, -2.2F);
    public static final RegistryObject<Item> BRONZE_PLATED_AXE = ToolBuilder.createAxeItem("bronze_plated_axe", MetallicsTiers.BRONZE, 6.0F, -2.8F);
    public static final RegistryObject<Item> BRONZE_PLATED_PICKAXE = ToolBuilder.createPickaxeItem("bronze_plated_pickaxe", MetallicsTiers.BRONZE, 1, -2.6F);
    public static final RegistryObject<Item> BRONZE_PLATED_HOE = ToolBuilder.createHoeItem("bronze_plated_hoe", MetallicsTiers.BRONZE, -2, -0.8F);
    public static final RegistryObject<Item> BRONZE_PLATED_SHOVEL = ToolBuilder.createShovelItem("bronze_plated_shovel", MetallicsTiers.BRONZE, 1.5F, -2.8F);

    public static final RegistryObject<Item> BRONZE_PLATED_HELMET = ArmorBuilder.createHelmetItem("bronze_plated_helmet", MetallicsArmorMaterials.BRONZE);
    public static final RegistryObject<Item> BRONZE_PLATED_CHESTPLATE = ArmorBuilder.createChestplateItem("bronze_plated_chestplate", MetallicsArmorMaterials.BRONZE);
    public static final RegistryObject<Item> BRONZE_PLATED_LEGGINGS = ArmorBuilder.createLeggingsItem("bronze_plated_leggings", MetallicsArmorMaterials.BRONZE);
    public static final RegistryObject<Item> BRONZE_PLATED_BOOTS = ArmorBuilder.createBootsItem("bronze_plated_boots", MetallicsArmorMaterials.BRONZE);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
