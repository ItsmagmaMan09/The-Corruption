
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruption.init;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.thecorruption.CorruptionMod;

public class CorruptionModPotions {
	public static Potion CORRUPTION_IMMUNITY_POTION;

	public static void load() {
		CORRUPTION_IMMUNITY_POTION = Registry.register(BuiltInRegistries.POTION, new ResourceLocation(CorruptionMod.MODID, "corruption_immunity_potion"),
				new Potion(new MobEffectInstance(CorruptionModMobEffects.CORRUPTIONIMMUNITY, 9600, 0, false, true)));
	}
}
