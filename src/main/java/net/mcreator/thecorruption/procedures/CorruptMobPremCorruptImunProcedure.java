package net.mcreator.thecorruption.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.thecorruption.init.CorruptionModMobEffects;
import net.mcreator.thecorruption.CorruptionMod;

import java.util.Map;

public class CorruptMobPremCorruptImunProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CorruptionMod.LOGGER.warn("Failed to load dependency entity for procedure CorruptMobPremCorruptImun!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(CorruptionModMobEffects.CORRUPTIONIMMUNITY, 99999999, 1, false, false));
	}
}
