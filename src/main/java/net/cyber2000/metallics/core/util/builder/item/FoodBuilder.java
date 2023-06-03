package net.cyber2000.metallics.core.util.builder.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class FoodBuilder extends ItemBuilder {
    public static RegistryObject<Item> createDefaultFoodItem(String name, int nutrition, float saturation) {
        return createItem(name, () -> new Item(new Item.Properties().food(
                new FoodProperties.Builder().nutrition( nutrition).saturationMod(saturation).build())));
    }
}
