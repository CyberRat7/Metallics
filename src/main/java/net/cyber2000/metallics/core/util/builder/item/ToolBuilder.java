package net.cyber2000.metallics.core.util.builder.item;

import net.minecraft.world.item.*;
import net.minecraftforge.registries.RegistryObject;

public class ToolBuilder extends ItemBuilder {
    public static RegistryObject<Item> createSwordItem(String name, Tier tier, int damageMultiplier, float speed) {
        return createItem(name, () -> new SwordItem(tier, damageMultiplier, speed, ONE_STACKABLE_ITEM_PROPERTY));
    }

    public static RegistryObject<Item> createPickaxeItem(String name, Tier tier, int damageMultiplier, float speed) {
        return createItem(name, () -> new PickaxeItem(tier, damageMultiplier, speed, ONE_STACKABLE_ITEM_PROPERTY));
    }

    public static RegistryObject<Item> createShovelItem(String name, Tier tier, float damageMultiplier, float speed) {
        return createItem(name, () -> new ShovelItem(tier, damageMultiplier, speed, ONE_STACKABLE_ITEM_PROPERTY));
    }

    public static RegistryObject<Item> createAxeItem(String name, Tier tier, float damageMultiplier, float speed) {
        return createItem(name, () -> new AxeItem(tier, damageMultiplier, speed, ONE_STACKABLE_ITEM_PROPERTY));
    }

    public static RegistryObject<Item> createHoeItem(String name, Tier tier, int damageMultiplier, float speed) {
        return createItem(name, () -> new HoeItem(tier, damageMultiplier, speed, ONE_STACKABLE_ITEM_PROPERTY));
    }
}
