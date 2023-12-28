/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruption.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.thecorruption.item.RestoreShardItem;
import net.mcreator.thecorruption.item.CorruptedRemainsItem;
import net.mcreator.thecorruption.CorruptionMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class CorruptionModItems {
	public static Item CORRUPTION;
	public static Item CORRUPTION_OLD;
	public static Item THE_RESTORE;
	public static Item CORRUPT_ZOMBIE_SPAWN_EGG;
	public static Item CORRUPT_SKELETON_SPAWN_EGG;
	public static Item CORRUPT_CREEPER_SPAWN_EGG;
	public static Item CORRUPT_SPIDER_SPAWN_EGG;
	public static Item RESTORE_SHARD;
	public static Item CORRUPTED_REMAINS;
	public static Item CORRUPTED_ENDERMAN_SPAWN_EGG;

	public static void load() {
		CORRUPTION = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CorruptionMod.MODID, "corruption"), new BlockItem(CorruptionModBlocks.CORRUPTION, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> content.accept(CORRUPTION));
		CORRUPTION_OLD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CorruptionMod.MODID, "corruption_old"), new BlockItem(CorruptionModBlocks.CORRUPTION_OLD, new Item.Properties()));
		THE_RESTORE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CorruptionMod.MODID, "the_restore"), new BlockItem(CorruptionModBlocks.THE_RESTORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> content.accept(THE_RESTORE));
		CORRUPT_ZOMBIE_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CorruptionMod.MODID, "corrupt_zombie_spawn_egg"), new SpawnEggItem(CorruptionModEntities.CORRUPT_ZOMBIE, -16777216, -6750208, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(CORRUPT_ZOMBIE_SPAWN_EGG));
		CORRUPT_SKELETON_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CorruptionMod.MODID, "corrupt_skeleton_spawn_egg"),
				new SpawnEggItem(CorruptionModEntities.CORRUPT_SKELETON, -16777216, -6750208, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(CORRUPT_SKELETON_SPAWN_EGG));
		CORRUPT_CREEPER_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CorruptionMod.MODID, "corrupt_creeper_spawn_egg"),
				new SpawnEggItem(CorruptionModEntities.CORRUPT_CREEPER, -16777216, -6750208, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(CORRUPT_CREEPER_SPAWN_EGG));
		CORRUPT_SPIDER_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CorruptionMod.MODID, "corrupt_spider_spawn_egg"), new SpawnEggItem(CorruptionModEntities.CORRUPT_SPIDER, -16777216, -6750208, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(CORRUPT_SPIDER_SPAWN_EGG));
		RESTORE_SHARD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CorruptionMod.MODID, "restore_shard"), new RestoreShardItem());
		CORRUPTED_REMAINS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CorruptionMod.MODID, "corrupted_remains"), new CorruptedRemainsItem());
		CORRUPTED_ENDERMAN_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CorruptionMod.MODID, "corrupted_enderman_spawn_egg"),
				new SpawnEggItem(CorruptionModEntities.CORRUPTED_ENDERMAN, -16777216, -6750208, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(CORRUPTED_ENDERMAN_SPAWN_EGG));
	}

	public static void clientLoad() {
	}
}
