package net.cyber2000.metallics.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.monster.Monster;
import org.jetbrains.annotations.NotNull;

public class WardingEffect extends MobEffect {

    public WardingEffect(MobEffectCategory category, int color){
        super(category, color);
    }



    @Override
    public void applyEffectTick(@NotNull LivingEntity livingEntity, int amplifier) {
        if(livingEntity instanceof Monster monster && livingEntity.getMobType() == MobType.UNDEAD)
            monster.setNoAi(false);
        super.applyEffectTick(livingEntity, amplifier);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier){
        return super.isDurationEffectTick(duration, amplifier);
    }


}
