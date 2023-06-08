package net.cyber2000.metallics.core.registry;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.player.Player;

import java.util.UUID;

public class UndeadProtectionEffect extends MobEffect {
    private static final UUID FOLLOW_RANGE_MODIFIER_UUID = UUID.fromString("e244d621-024e-4f9e-9250-8f5e229cac39");
    private static final AttributeModifier FOLLOW_RANGE_MODIFIER = new AttributeModifier(FOLLOW_RANGE_MODIFIER_UUID, "UndeadProtectionEffect modifier", -1.0, AttributeModifier.Operation.MULTIPLY_TOTAL);

    public UndeadProtectionEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    // This method is called when the effect is applied to an entity
    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        // Check if the entity is a player
        if (entity instanceof Player) {
            // Get the player
            Player player = (Player) entity;

            // Loop through nearby entities
            for (Monster nearbyEntity : player.level.getEntitiesOfClass(Monster.class, player.getBoundingBox().inflate(8.0))) {
                // Check if the nearby entity is an undead mob (e.g., Zombie, Skeleton, etc.)
                if (nearbyEntity instanceof Zombie || nearbyEntity instanceof Skeleton || nearbyEntity instanceof Spider || nearbyEntity instanceof Creeper) {
                    // Reduce the follow range of the undead mob
                    AttributeInstance followRangeAttribute = nearbyEntity.getAttribute(Attributes.FOLLOW_RANGE);
                    if (followRangeAttribute != null) {
                        followRangeAttribute.addTransientModifier(FOLLOW_RANGE_MODIFIER);
                    }
                }
            }
        }
    }
}