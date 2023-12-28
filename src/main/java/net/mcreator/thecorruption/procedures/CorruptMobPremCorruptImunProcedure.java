package net.mcreator.thecorruption.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.thecorruption.init.CorruptionModMobEffects;

public class CorruptMobPremCorruptImunProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(CorruptionModMobEffects.CORRUPTIONIMMUNITY, 99999999, 1, false, false));
	}
}
