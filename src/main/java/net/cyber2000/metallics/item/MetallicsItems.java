package net.cyber2000.metallics.item;


import net.cyber2000.metallics.Metallics;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MetallicsItems {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Metallics.MOD_ID);

    public static final RegistryObject<Item> TIN_CAN = ITEMS.register("tin_can",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CANNED_CARROT = ITEMS.register("canned_carrot",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition( 8).saturationMod(14f).build())));

    public static final RegistryObject<Item> CANNED_BEETROOT = ITEMS.register("canned_beetroot",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition( 6).saturationMod(14f).build())));

    public static final RegistryObject<Item> CRUSHED_TIN_CAN = ITEMS.register("crushed_tin_can",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CANNED_MELON = ITEMS.register("canned_melon",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition( 6).saturationMod(14f).build())));


    public static final RegistryObject<Item> BRONZE_PLATED_SWORD = ITEMS.register("bronze_plated_sword",
            () -> new SwordItem(MetallicsTiers.BRONZE,3, -2.2F, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_PLATED_AXE = ITEMS.register("bronze_plated_axe",
            () -> new AxeItem(MetallicsTiers.BRONZE,6.0F, -2.8F, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_PLATED_PICKAXE = ITEMS.register("bronze_plated_pickaxe",
            () -> new PickaxeItem(MetallicsTiers.BRONZE,1, -2.6F, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_PLATED_HOE = ITEMS.register("bronze_plated_hoe",
            () -> new HoeItem(MetallicsTiers.BRONZE,-2, -0.8F, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_PLATED_SHOVEL = ITEMS.register("bronze_plated_shovel",
            () -> new ShovelItem(MetallicsTiers.BRONZE,1.5F, -2.8F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> BRONZE_PLATED_HELMET = ITEMS.register("bronze_plated_helmet",
            () -> new ArmorItem(MetallicsArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_PLATED_BOOTS = ITEMS.register("bronze_plated_boots",
            () -> new ArmorItem(MetallicsArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_PLATED_CHESTPLATE = ITEMS.register("bronze_plated_chestplate",
            () -> new ArmorItem(MetallicsArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> BRONZE_PLATED_LEGGINGS = ITEMS.register("bronze_plated_leggings",
            () -> new ArmorItem(MetallicsArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));











    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
