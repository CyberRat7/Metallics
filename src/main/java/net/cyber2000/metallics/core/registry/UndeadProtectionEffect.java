package net.cyber2000.metallics.core.registry;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.player.Player;

public class UndeadProtectionEffect extends MobEffect {
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
            for (Entity nearbyEntity : player.level.getEntities(player, player.getBoundingBox().inflate(8.0))) {
                // Check if the nearby entity is an undead mob (e.g., Zombie, Skeleton, etc.)
                if (nearbyEntity instanceof Zombie || nearbyEntity instanceof Skeleton || nearbyEntity instanceof Spider || nearbyEntity instanceof Creeper) {
                    // Make the undead mob not notice the player
                    Monster undeadMob = (Monster) nearbyEntity;
                    undeadMob.setTarget(null);
                }
            }
        }
    }
}