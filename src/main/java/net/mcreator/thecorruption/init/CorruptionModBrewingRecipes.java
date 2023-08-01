/*
* MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.thecorruption.init;

import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.Items;

public class CorruptionModBrewingRecipes {
	public static void load() {
		PotionBrewing.addMix(Potions.STRENGTH, Items.DIAMOND, CorruptionModPotions.CORRUPTION_IMMUNITY_POTION);
	}
}
