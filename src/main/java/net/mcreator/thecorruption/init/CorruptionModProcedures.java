
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruption.init;

import net.mcreator.thecorruption.procedures.TheRestoreUpdateTickProcedure;
import net.mcreator.thecorruption.procedures.TheRestoreEntityWalksOnTheBlockProcedure;
import net.mcreator.thecorruption.procedures.TheRestoreBlockIsPlacedByProcedure;
import net.mcreator.thecorruption.procedures.TestOnEffectActiveTickProcedure;
import net.mcreator.thecorruption.procedures.StartpProcedure;
import net.mcreator.thecorruption.procedures.CorruptionSpreadProcedure;
import net.mcreator.thecorruption.procedures.CorruptionEntityWalksOnTheBlockProcedure;
import net.mcreator.thecorruption.procedures.CorruptMobPremCorruptImunProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class CorruptionModProcedures {
	public static void load() {
		new CorruptionEntityWalksOnTheBlockProcedure();
		new CorruptionSpreadProcedure();
		new StartpProcedure();
		new TestOnEffectActiveTickProcedure();
		new TheRestoreUpdateTickProcedure();
		new CorruptMobPremCorruptImunProcedure();
		new TheRestoreBlockIsPlacedByProcedure();
		new TheRestoreEntityWalksOnTheBlockProcedure();
	}
}
