
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruption.init;

import net.mcreator.thecorruption.procedures.StartpProcedure;
import net.mcreator.thecorruption.procedures.CorruptionSpreadProcedure;
import net.mcreator.thecorruption.procedures.CorruptionEntityWalksOnTheBlockProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class CorruptionModProcedures {
	public static void load() {
		new CorruptionEntityWalksOnTheBlockProcedure();
		new CorruptionSpreadProcedure();
		new StartpProcedure();
	}
}
