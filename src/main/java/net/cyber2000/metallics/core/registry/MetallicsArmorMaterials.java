package net.cyber2000.metallics.core.registry;


import net.cyber2000.metallics.Metallics;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum MetallicsArmorMaterials implements ArmorMaterial {
    BRONZE("bronze", 25, Util.make(new EnumMap<>(ArmorItem.Type.class), (armor) -> {
        armor.put(ArmorItem.Type.BOOTS, 3);
        armor.put(ArmorItem.Type.LEGGINGS, 5);
        armor.put(ArmorItem.Type.CHESTPLATE, 6);
        armor.put(ArmorItem.Type.HELMET, 3);
    }), 11, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.05F, () -> Ingredient.of(MetallicsItems.BRONZE_INGOT.get()));

    public static final StringRepresentable.EnumCodec<ArmorMaterials> CODEC = StringRepresentable.fromEnum(ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (armor) -> {
        armor.put(ArmorItem.Type.BOOTS, 13);
        armor.put(ArmorItem.Type.LEGGINGS, 15);
        armor.put(ArmorItem.Type.CHESTPLATE, 16);
        armor.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    MetallicsArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionFunctionForType, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionFunctionForType = protectionFunctionForType;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public int getDurabilityForType(ArmorItem.Type armorType) {
        return HEALTH_FUNCTION_FOR_TYPE.get(armorType) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type armorType) {
        return this.protectionFunctionForType.get(armorType);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return Metallics.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
    public String getSerializedName() {
        return this.name;
    }
  }