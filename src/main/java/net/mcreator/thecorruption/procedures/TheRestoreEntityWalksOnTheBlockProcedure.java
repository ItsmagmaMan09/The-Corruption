package net.mcreator.thecorruption.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.thecorruption.CorruptionMod;

import java.util.Map;

public class TheRestoreEntityWalksOnTheBlockProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CorruptionMod.LOGGER.warn("Failed to load dependency entity for procedure TheRestoreEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("corruption:is_corrupted")))) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
