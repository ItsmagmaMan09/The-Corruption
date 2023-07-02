
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruption.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.thecorruption.CorruptionMod;

public class CorruptionModItems {
	public static Item CORRUPTION;
	public static Item CORRUPTION_OLD;

	public static void load() {
		CORRUPTION = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CorruptionMod.MODID, "corruption"), new BlockItem(CorruptionModBlocks.CORRUPTION, new Item.Properties()));
		CORRUPTION_OLD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CorruptionMod.MODID, "corruption_old"), new BlockItem(CorruptionModBlocks.CORRUPTION_OLD, new Item.Properties()));
	}
}
