package net.cyber2000.metallics.core.util.builder.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ArmorBuilder extends ItemBuilder {
    public static RegistryObject<Item> createHelmetItem(String name, ArmorMaterial armorMaterial) {
        return createArmorItem(name, armorMaterial, ArmorItem.Type.HELMET);
    }

    public static RegistryObject<Item> createChestplateItem(String name, ArmorMaterial armorMaterial) {
        return createArmorItem(name, armorMaterial, ArmorItem.Type.CHESTPLATE);
    }

    public static RegistryObject<Item> createLeggingsItem(String name, ArmorMaterial armorMaterial) {
        return createArmorItem(name, armorMaterial, ArmorItem.Type.LEGGINGS);
    }

    public static RegistryObject<Item> createBootsItem(String name, ArmorMaterial armorMaterial) {
        return createArmorItem(name, armorMaterial, ArmorItem.Type.BOOTS);
    }

    private static RegistryObject<Item> createArmorItem(String name, ArmorMaterial armorMaterial, ArmorItem.Type type) {
        return createItem(name, () -> new ArmorItem(armorMaterial, type, ONE_STACKABLE_ITEM_PROPERTY));
    }
}
