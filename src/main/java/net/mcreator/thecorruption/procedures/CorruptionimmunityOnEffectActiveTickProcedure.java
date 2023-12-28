package net.mcreator.thecorruption.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.thecorruption.init.CorruptionModMobEffects;

public class CorruptionimmunityOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(CorruptionModMobEffects.CORRUPTING);
	}
}
