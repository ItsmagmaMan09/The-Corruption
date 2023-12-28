
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruption.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.thecorruption.potion.CorruptionimmunityMobEffect;
import net.mcreator.thecorruption.potion.CorruptingMobEffect;
import net.mcreator.thecorruption.CorruptionMod;

public class CorruptionModMobEffects {
	public static MobEffect CORRUPTIONIMMUNITY;
	public static MobEffect CORRUPTING;

	public static void load() {
		CORRUPTIONIMMUNITY = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(CorruptionMod.MODID, "corruptionimmunity"), new CorruptionimmunityMobEffect());
		CORRUPTING = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(CorruptionMod.MODID, "corrupting"), new CorruptingMobEffect());
	}
}
