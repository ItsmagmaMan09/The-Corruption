package net.mcreator.thecorruption.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.thecorruption.init.CorruptionModBlocks;
import net.mcreator.thecorruption.CorruptionMod;

import java.util.Map;

public class CorruptionSpreadProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CorruptionMod.LOGGER.warn("Failed to load dependency world for procedure CorruptionSpread!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CorruptionMod.LOGGER.warn("Failed to load dependency x for procedure CorruptionSpread!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CorruptionMod.LOGGER.warn("Failed to load dependency y for procedure CorruptionSpread!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CorruptionMod.LOGGER.warn("Failed to load dependency z for procedure CorruptionSpread!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		for (int index0 = 0; index0 < 100; index0++) {
			if (Math.random() < 0.1) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER || world.isEmptyBlock(BlockPos.containing(x, y, z - 1)) || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CorruptionModBlocks.CORRUPTION_OLD || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CorruptionModBlocks.THE_RESTORE)) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z - 1);
						BlockState _bs = CorruptionModBlocks.CORRUPTION.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
			if (Math.random() < 0.1) {
				if (!((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER || world.isEmptyBlock(BlockPos.containing(x - 1, y, z)) || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CorruptionModBlocks.CORRUPTION_OLD || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CorruptionModBlocks.THE_RESTORE)) {
					{
						BlockPos _bp = BlockPos.containing(x - 1, y, z);
						BlockState _bs = CorruptionModBlocks.CORRUPTION.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
			if (Math.random() < 0.1) {
				if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER || world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CorruptionModBlocks.CORRUPTION_OLD || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CorruptionModBlocks.THE_RESTORE)) {
					{
						BlockPos _bp = BlockPos.containing(x, y - 1, z);
						BlockState _bs = CorruptionModBlocks.CORRUPTION.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
			if (Math.random() < 0.1) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER || world.isEmptyBlock(BlockPos.containing(x, y, z + 1)) || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CorruptionModBlocks.CORRUPTION_OLD || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CorruptionModBlocks.THE_RESTORE)) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z + 1);
						BlockState _bs = CorruptionModBlocks.CORRUPTION.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
			if (Math.random() < 0.1) {
				if (!((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER || world.isEmptyBlock(BlockPos.containing(x + 1, y, z)) || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CorruptionModBlocks.CORRUPTION_OLD || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CorruptionModBlocks.THE_RESTORE)) {
					{
						BlockPos _bp = BlockPos.containing(x + 1, y, z);
						BlockState _bs = CorruptionModBlocks.CORRUPTION.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
			if (Math.random() < 0.1) {
				if (!((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER || world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CorruptionModBlocks.CORRUPTION_OLD || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CorruptionModBlocks.THE_RESTORE)) {
					{
						BlockPos _bp = BlockPos.containing(x, y + 1, z);
						BlockState _bs = CorruptionModBlocks.CORRUPTION.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), CorruptionModBlocks.CORRUPTION_OLD.defaultBlockState(), 3);
		if (Math.random() < 0.0001) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("corruption", "restoreshard"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		}
	}
}
