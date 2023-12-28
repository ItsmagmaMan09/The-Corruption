package net.mcreator.thecorruption.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.thecorruption.init.CorruptionModBlocks;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;

public class StartpProcedure {
	public StartpProcedure() {
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			execute(handler.getPlayer().level());
		});
	}

	public static void execute(LevelAccessor world) {
		world.setBlock(new BlockPos(0, -59, 0), CorruptionModBlocks.CORRUPTION.defaultBlockState(), 3);
	}
}
