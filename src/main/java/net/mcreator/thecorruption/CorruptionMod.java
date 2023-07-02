/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.thecorruption;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.thecorruption.init.CorruptionModProcedures;
import net.mcreator.thecorruption.init.CorruptionModPotions;
import net.mcreator.thecorruption.init.CorruptionModMobEffects;
import net.mcreator.thecorruption.init.CorruptionModItems;
import net.mcreator.thecorruption.init.CorruptionModBlocks;

import net.fabricmc.api.ModInitializer;

public class CorruptionMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "corruption";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing CorruptionMod");

		CorruptionModMobEffects.load();
		CorruptionModPotions.load();

		CorruptionModBlocks.load();
		CorruptionModItems.load();

		CorruptionModProcedures.load();

	}
}
