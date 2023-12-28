package net.mcreator.thecorruption.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.thecorruption.init.CorruptionModBlocks;

public class TheRestoreBlockIsPlacedByProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(CorruptionModBlocks.THE_RESTORE);
			_setstack.setCount(1);
			_player.getInventory().add(_setstack);
		}
	}
}
