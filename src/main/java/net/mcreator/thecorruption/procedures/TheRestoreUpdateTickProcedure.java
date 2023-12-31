package net.mcreator.thecorruption.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.thecorruption.init.CorruptionModBlocks;

import java.util.Map;

public class TheRestoreUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 20; index0++) {
			if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CorruptionModBlocks.CORRUPTION || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CorruptionModBlocks.CORRUPTION_OLD) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z - 1);
					BlockState _bs = CorruptionModBlocks.THE_RESTORE.defaultBlockState();
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
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CorruptionModBlocks.CORRUPTION || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CorruptionModBlocks.CORRUPTION_OLD) {
				{
					BlockPos _bp = BlockPos.containing(x - 1, y, z);
					BlockState _bs = CorruptionModBlocks.THE_RESTORE.defaultBlockState();
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
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CorruptionModBlocks.CORRUPTION || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CorruptionModBlocks.CORRUPTION_OLD) {
				{
					BlockPos _bp = BlockPos.containing(x, y - 1, z);
					BlockState _bs = CorruptionModBlocks.THE_RESTORE.defaultBlockState();
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
			if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CorruptionModBlocks.CORRUPTION || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CorruptionModBlocks.CORRUPTION_OLD) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z + 1);
					BlockState _bs = CorruptionModBlocks.THE_RESTORE.defaultBlockState();
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
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CorruptionModBlocks.CORRUPTION || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CorruptionModBlocks.CORRUPTION_OLD) {
				{
					BlockPos _bp = BlockPos.containing(x + 1, y, z);
					BlockState _bs = CorruptionModBlocks.THE_RESTORE.defaultBlockState();
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
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CorruptionModBlocks.CORRUPTION || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CorruptionModBlocks.CORRUPTION_OLD) {
				{
					BlockPos _bp = BlockPos.containing(x, y + 1, z);
					BlockState _bs = CorruptionModBlocks.THE_RESTORE.defaultBlockState();
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
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
			if (Mth.nextInt(RandomSource.create(), 0, 100) > 97) {
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE.defaultBlockState(), 3);
		}
	}
}
