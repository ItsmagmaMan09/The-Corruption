package net.mcreator.thecorruption.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.thecorruption.init.CorruptionModBlocks;
import net.mcreator.thecorruption.CorruptionMod;

import java.util.Map;

public class TheRestoreBlockIsPlacedByProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CorruptionMod.LOGGER.warn("Failed to load dependency entity for procedure TheRestoreBlockIsPlacedBy!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(CorruptionModBlocks.THE_RESTORE);
			_setstack.setCount(1);
			_player.getInventory().add(_setstack);
		}
	}
}
