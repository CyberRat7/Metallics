package net.cyber2000.metallics.core.util.builder.item;

import net.cyber2000.metallics.core.util.builder.ObjectBuilder;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.cyber2000.metallics.core.registry.MetallicsItems.ITEMS;

public class ItemBuilder implements ObjectBuilder {
    protected static final Item.Properties ONE_STACKABLE_ITEM_PROPERTY = new Item.Properties().stacksTo(1);

    public static RegistryObject<Item> createDefaultItem(String name) {
        return createItem(name, () -> new Item(new Item.Properties()));
    }

    public static RegistryObject<Item> createItem(String name, Supplier<? extends Item> supplier) {
        return ITEMS.register(name, supplier);
    }
}
