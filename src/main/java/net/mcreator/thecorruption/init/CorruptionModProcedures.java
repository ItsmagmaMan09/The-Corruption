
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruption.init;

import net.mcreator.thecorruption.procedures.TestOnEffectActiveTickProcedure;
import net.mcreator.thecorruption.procedures.StartpProcedure;
import net.mcreator.thecorruption.procedures.CorruptionimmunityOnEffectActiveTickProcedure;
import net.mcreator.thecorruption.procedures.CorruptionSpreadProcedure;
import net.mcreator.thecorruption.procedures.CorruptionEntityWalksOnTheBlockProcedure;
import net.mcreator.thecorruption.procedures.CorruptionClientDisplayRandomTickProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class CorruptionModProcedures {
	public static void load() {
		new CorruptionEntityWalksOnTheBlockProcedure();
		new CorruptionSpreadProcedure();
		new StartpProcedure();
		new CorruptionClientDisplayRandomTickProcedure();
		new TestOnEffectActiveTickProcedure();
		new CorruptionimmunityOnEffectActiveTickProcedure();
	}
}
