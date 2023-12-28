package net.mcreator.thecorruption.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.thecorruption.init.CorruptionModMobEffects;

public class CorruptedRemainsPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(CorruptionModMobEffects.CORRUPTING, 200, 1, false, true));
	}
}
