
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruption.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.thecorruption.block.TheRestoreBlock;
import net.mcreator.thecorruption.block.CorruptionOldBlock;
import net.mcreator.thecorruption.block.CorruptionBlock;
import net.mcreator.thecorruption.CorruptionMod;

public class CorruptionModBlocks {
	public static Block CORRUPTION;
	public static Block CORRUPTION_OLD;
	public static Block THE_RESTORE;

	public static void load() {
		CORRUPTION = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(CorruptionMod.MODID, "corruption"), new CorruptionBlock());
		CORRUPTION_OLD = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(CorruptionMod.MODID, "corruption_old"), new CorruptionOldBlock());
		THE_RESTORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(CorruptionMod.MODID, "the_restore"), new TheRestoreBlock());
	}

	public static void clientLoad() {
		CorruptionBlock.clientInit();
		CorruptionOldBlock.clientInit();
		TheRestoreBlock.clientInit();
	}
}
