
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruption.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.thecorruption.entity.CorruptZombieEntity;
import net.mcreator.thecorruption.entity.CorruptSpiderEntity;
import net.mcreator.thecorruption.entity.CorruptSkeletonEntity;
import net.mcreator.thecorruption.entity.CorruptCreeperEntity;
import net.mcreator.thecorruption.CorruptionMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class CorruptionModEntities {
	public static EntityType<CorruptZombieEntity> CORRUPT_ZOMBIE;
	public static EntityType<CorruptSkeletonEntity> CORRUPT_SKELETON;
	public static EntityType<CorruptCreeperEntity> CORRUPT_CREEPER;
	public static EntityType<CorruptSpiderEntity> CORRUPT_SPIDER;

	public static void load() {
		CORRUPT_ZOMBIE = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(CorruptionMod.MODID, "corrupt_zombie"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, CorruptZombieEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune().trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		CorruptZombieEntity.init();
		FabricDefaultAttributeRegistry.register(CORRUPT_ZOMBIE, CorruptZombieEntity.createAttributes());
		CORRUPT_SKELETON = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(CorruptionMod.MODID, "corrupt_skeleton"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, CorruptSkeletonEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune().trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		CorruptSkeletonEntity.init();
		FabricDefaultAttributeRegistry.register(CORRUPT_SKELETON, CorruptSkeletonEntity.createAttributes());
		CORRUPT_CREEPER = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(CorruptionMod.MODID, "corrupt_creeper"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, CorruptCreeperEntity::new).dimensions(new EntityDimensions(0.6f, 1.7f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		CorruptCreeperEntity.init();
		FabricDefaultAttributeRegistry.register(CORRUPT_CREEPER, CorruptCreeperEntity.createAttributes());
		CORRUPT_SPIDER = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(CorruptionMod.MODID, "corrupt_spider"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, CorruptSpiderEntity::new).dimensions(new EntityDimensions(1.4f, 0.9f, true)).fireImmune().trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		CorruptSpiderEntity.init();
		FabricDefaultAttributeRegistry.register(CORRUPT_SPIDER, CorruptSpiderEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
