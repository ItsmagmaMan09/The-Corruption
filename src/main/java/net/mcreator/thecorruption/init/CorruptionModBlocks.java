
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruption.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.thecorruption.block.CorruptionBlock;
import net.mcreator.thecorruption.CorruptionMod;

public class CorruptionModBlocks {
	public static Block CORRUPTION;

	public static void load() {
		CORRUPTION = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(CorruptionMod.MODID, "corruption"), new CorruptionBlock());
	}

	public static void clientLoad() {
		CorruptionBlock.clientInit();
	}
}
